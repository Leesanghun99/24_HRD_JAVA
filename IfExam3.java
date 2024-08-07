package day02;
import java.util.Scanner;

public class IfExam3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("## 메뉴 선택 ##");
		System.out.println("[1]구매자 [2]판매자");
		System.out.println("## 메뉴를 선택 하세요->");
		
		
		
		int jumsu = sc.nextInt();
		
		String hakjum = "";
		
		if(jumsu ==2) {
		hakjum = "판매자";
		}else if(jumsu ==1) {
			hakjum = "구매자";
		}
		
		System.out.println("환영합니다!" + hakjum + "로 로그인하셨습니다");

		
		
		
		
	}
	}


