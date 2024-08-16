package day08;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProductServer<JSONObject> {
    private int pk;
    private TreeMap<Integer, Product> products;
    private ExecutorService es;

    public static void main(String[] args) {
        ProductServer productServer = new ProductServer();
        try {
            productServer.start();
        } catch (IOException ignored) {
        }
    }


    public void start() throws IOException {
        try (ServerSocket ss = new ServerSocket(50001)) {
            es = Executors.newFixedThreadPool(100);
            products = new TreeMap<>();
            System.out.println("[서버] 시작됨");
            while (true) {
                try {
                    new SocketClient(ss.accept());
                } catch (IOException e) {
                    break;
                }
            }
        }
    }

    public class SocketClient {
        private Socket sc;
        private DataInputStream dis;
        private DataOutputStream dos;

        public SocketClient(Socket sc) {
            try {
                this.sc = sc;
                this.dis = new DataInputStream(sc.getInputStream());
                this.dos = new DataOutputStream(sc.getOutputStream());
                receive();
            } catch (IOException e) {
                try {
                    sc.close();
                } catch (IOException ignored) {
                }
            }
        }

        public void receive() {
            es.execute(() -> {
                while (true) {
                    try {
                        JSONObject requestJson = new JSONObject(dis.readUTF());
                        int menu = requestJson.getInt("menu");
                        switch (menu) {
                            case 0 -> getProductList();
                            case 1 -> createProduct(requestJson);
                            case 2 -> updateProduct(requestJson);
                            case 3 -> deleteProduct(requestJson);
                        }
                    } catch (IOException e) {
                        break;
                    }
                }

                try {
                    sc.close();
                } catch (IOException ignored) {
                }
            });
        }

        public void getProductList() throws IOException {
            JSONArray productList = new JSONArray();
            JSONObject product;
            JSONObject jsonResponse = new JSONObject();

            for (Product p : products.values()) {
                product = new JSONObject();
                product.put("no", p.getNo());
                product.put("name", p.getName());
                product.put("price", p.getPrice());
                product.put("stock", p.getStock());
                productList.put(product);
            }

            jsonResponse.put("status", "success");
            jsonResponse.put("data", productList);
            dos.writeUTF(jsonResponse.toString());
            dos.flush();
        }

        public void createProduct(JSONObject request) throws IOException {
            JSONObject jsonRequest = request.getJSONObject("data");
            JSONObject jsonResponse = new JSONObject();
            Product product = new Product();

            product.setNo(++pk);
            product.setName(jsonRequest.getString("name"));
            product.setPrice(jsonRequest.getInt("price"));
            product.setStock(jsonRequest.getInt("stock"));
            products.put(pk, product);

            jsonResponse.put("status", "success");
            jsonResponse.put("data", new JSONObject());
            dos.writeUTF(jsonResponse.toString());
            dos.flush();
        }

        public void updateProduct(JSONObject request) throws IOException {
            JSONObject jsonRequest = request.getJSONObject("data");
            JSONObject jsonResponse = new JSONObject();

            Product product = products.get(jsonRequest.getInt("no"));
            product.setName(jsonRequest.getString("name"));
            product.setPrice(jsonRequest.getInt("price"));
            product.setStock(jsonRequest.getInt("stock"));

            jsonResponse.put("status", "success");
            jsonResponse.put("jsonRequest", new JSONObject());
            dos.writeUTF(jsonResponse.toString());
            dos.flush();
        }

        public void deleteProduct(JSONObject request) throws IOException {
            JSONObject jsonRequest = request.getJSONObject("data");
            JSONObject jsonResponse = new JSONObject();
            products.remove(jsonRequest.getInt("no"));

            jsonResponse.put("status", "success");
            jsonResponse.put("data", new JSONObject());
            dos.writeUTF(jsonResponse.toString());
            dos.flush();
        }
    }
}
