package day07;
import java.net.InetAddress;
import java.io.IOException;
public class InetAddressExam {

	public static void main(String[] args) {
		try {
			
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("나의 컴퓨터 IP주소: " + local);
			
			InetAddress[] locals = InetAddress.getAllByName("www.dju.ac.kr");
			for(InetAddress in: locals) {
				System.out.println("www.dju.ac.kr IP 주소: " + in.getHostAddress());
				
			}
			
					
		}catch(IOException en) {
			
		}

	}

}
