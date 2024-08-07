package day02;

public class WhileExam4 {

	public static void main(String[] args) {
		
		

		
			int i=20; //초기식
			
			while (i > 10) {  //조건식
				System.out.println(i--);
			}
			
			boolean flag = true;
			while(flag) {
				i--;
			if(i ==3) {
				System.out.println("num==3 종료");
				break;
			}
				
			}i++;  //증감식
			
			
			System.out.println("num==3 종료");
		}
	}


