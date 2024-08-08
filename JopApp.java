package day03;

public class JopApp {
	
	public static void main(String[] args) {
		
		// person 객체 생성
		
		Person lee = new Person();
		lee.age = 25;
		lee.name = "이상헌";
		lee.먹는다();
		lee.웃다();
		
		System.out.println(lee.age);
		System.out.println(lee.name);
		
		
	}

}
