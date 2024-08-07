package day02;
import java.util.Scanner;

public class IfExam2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("## 로그인 (admin 혹은 임의 아이디) ##");
		System.out.println("# 로그인 아이디 : ");
		
		
		
		int jumsu = sc.nextInt();
		
		String hakjum = "kang";
		
		if(jumsu ==2) {
		hakjum = "kang";
		}else if(jumsu ==1) {
			hakjum = "admin";
		}
		
		System.out.println(hakjum + "로그인!!");
		
		System.out.println("## 메뉴를 선택하세요(1~2) ##");
		System.out.println("# 메뉴선택 :");

	
		
		if(jumsu ==2) {
			hakjum = "kang";
			}else if(jumsu ==1) {
				hakjum = "admin";
			}
		System.out.println(hakjum +"번 선택함!!");
		
		
		
		
	}
	}


