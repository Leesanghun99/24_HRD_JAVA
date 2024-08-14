package day07;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedInputStream;
import java.io.BufferedReader;

public class ConsolChatServer implements Runnable {
	
	private static ServerSocket serverSocket = null;
	static Socket sock = null;
	
	public ConsolChatServer()throws Exception {
		
		serverSocket = new ServerSocket(50001);
		System.out.println("[서버] 시작됨");
		Socket socket = serverSocket.accept();
		System.out.println("클라이언트 접속 성공");
		//클라이언트에게 메세지 전송할 스트림 생성
		BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
		
		PrintWriter pout = new PrintWriter(socket.getOutputStream());
		//클에게 키보드로 메세지 전송---
		Thread tr = new Thread(this);
		tr.start();
		String msg="";
		
		while((msg=key.readLine())!=null) {
			pout.println(msg);
		}
		
		
	}
	
	
	
	

	public static void main(String[] args) throws IOException {
		try {
			
			new ConsolChatServer();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		

	@Override
	public void run() {
		try {
			InputStream is = socket.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String clientMsg="";
			while(true) {
				clientMsg=br.readLine();
				System.out.println("From Client>>" + clientMsg);
			}
		}catch (Exception e) {
			System.out.println("예외: " + e.getMessage());
		}
		
	}
	
	
	
	
	
	
	
	}






	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
