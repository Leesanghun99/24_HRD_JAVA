package day02;
import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성적을 입력하세요.");
		
		
		
		int jumsu = sc.nextInt();
		
		String hakjum = "";
		
		if(jumsu >=95) {
			hakjum = "";
		}else if(jumsu >=90){
			hakjum = "A0";
		}else if(jumsu >=85) {
			hakjum = "B+";
		}else if(jumsu >=80) {
			hakjum = "B0";
		}else if(jumsu >=75) {
			hakjum = "C+";
		}else if(jumsu >=70) {
			hakjum = "C0";
		}else if(jumsu >=65) {
			hakjum = "D";
		}else if(jumsu >=60) {
			hakjum = "D0";
		}else {
			hakjum = "F";
		}
		
		System.out.println("귀하의 성적등급은: " + hakjum + "입니다");

		
		
		
		
	}
	}


