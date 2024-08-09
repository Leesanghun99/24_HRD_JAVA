package day04;

public class Phone {
	
	//필드선언
	public String model;
	public String color;

	//메소드 선언
	public Phone(String model, String color){
		this.model = model;
		this.color = color;
		System.out.println("부모 클래스 생성자 실행입니다.");
	}
	
	public void bell() {
		
	}
	
	public void sendVoice(String message) {
		
		System.out.println("자기: "+ message);
	}
	public void receiveVoice(String message) {
		System.out.println("상대방: " + message);
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다. ");
	}
	
}
