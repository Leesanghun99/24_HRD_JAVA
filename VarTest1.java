package day01;
import java.util.Scanner;

public class VarTest1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		// TODO Auto-generated method stub

		// 1. 정수 변수
		
		int x;
		//변수 초기화
		x = 5;
		System.out.print("첫번째 정수 입력:");
		
		x = scan.nextInt();
				
				
				
				
				
				
				
				
				
				
		int y = 8;
        System.out.print("두번째 정수 입력:");
		
		y = scan.nextInt();
		
		
		int result = x + y;
		
		System.out.println(result);
		
		// 2. 실수변수
		//float(4byte), double(8byte)
		double height = 176.7;
		
		System.out.println("나의 몸무게는:");
		
		height = scan.nextDouble(); 
		
		
		float weight = 65.3f;
	
		System.out.println("나의 키는: ");
		
		weight = scan.nextFloat();
		//3. 문자형 변수
		// char
		
		char blood = 'O';
		
		// 4. 문자열 변수
		// String
		String name = "이상헌";
		System.out.println("이름을 입력하세요.: ");
		name = scan.next();
		
		System.out.print("키:"+height+"\n몸무게:"+weight+"\n");
		
		System.out.println("혈액형:"+ blood +"형 입니다.");
		
		System.out.println("이름:" + name + " 입니다." );
		
		
		// 5. 논리형 변수
		
		//boolean형
		
		boolean stop = true; 
		
		if (stop == true) {
			System.out.println("중지합니다.");
			
			
		}else {
			System.out.println("시작합니다.");
		}
	}

}
