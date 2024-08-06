package day01;
/*
 *  사칙연산과 나머지 연산을 하는 간단한 계산기 예제
 */
import java.util.Scanner;
public class VarTest5 {
	
	

	public static void main(String[] args) {
		
		
		//1. 사칙 연산을 입력받아 저장하는 변수 선언
		String dd;
		
		//2. 2개 정수 입력 받아 저장하는 변수 선언
		int x, y;
		
		
		
		
		
		
		
		//3. "+" 덧셈, "-"빼기면 뺄셈, "*"곱셈, "/" 나누기, "%" 나머지 연산
		
		//4. 결과 출력(result)
		int result = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("다음 연산자중 하나 입력(+,-,*,/,%)");
		dd = scan.next();
		
		
		System.out.println("첫번째 값을 입력하세요:");
		
		x = scan.nextInt();
		
		System.out.println("두번째 값을 입력하세요:");
		
		y = scan.nextInt();
		
		if(dd.equals("+")) {
			result = x + y;
		}else if(dd.equals("-")) {
			result = x - y;
		}else if(dd.equals("*")) {
			result = x * y;
		}else if(dd.equals("/")) {
			result = x / y;
		}else if(dd.equals("%")) {
			result = x % y;
		}
		
		System.out.println("연산결과:" +x +dd +y +"=" + result);
		
		
		// TODO Auto-generated method stub

	}

}
