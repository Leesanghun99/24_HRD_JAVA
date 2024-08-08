package day03;

public class Calculator {
	
	//필드 선언
	int x, y;
	static double pi = 3.141592;
	
	//기본생성자 선언
	public Calculator() {
		
	}
	
	

	//사용자 정의 메소드 정의 연습
	// 1. 반환 타입도 있고, 매개변수도 있는 메소드 정의
	
	int add(int x, int y) {
		return x + y;
	}
	
	// 2. 반환 타입은 없고, 매개변수는 있는 메소드 정의
	void minus(int x, int y) {
		System.out.println(x - y);
		
	}
	
	// 3. 반환 타입은 있고, 매개변수는 없는 메소드 정의
	int multi() {
		return x * y;
	}
	
	
	
	// 4. 반환 타입과 매개변수가 없는 메소드 정의
	
	void div() {
		System.out.println(x/y);
	}
	
	
	// 정사각형의 넓이 구하는 메소드 정의
	double areaRect(double width) {
		return width * width;
	}
	
	
	// 직사각형의 넓이 구하는 메소드 정의
	double areaRect(double width, double height) {
return width * height;
	}
	
}
