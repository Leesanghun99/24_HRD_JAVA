package day04;

public class Person {
	
	
	int age;
	String name;
	char gender;
	String tel;
	
	//기본 생성자
	public Person() {
		
	}
	
	//메소드 getInfo()
	void getInfo() {
		System.out.println(this.name + "님 정보------");
		System.out.println("나이:" + this.age);
		System.out.println("성별: " + this.gender);
		System.out.println("전화번호: " + this.tel);
	}

	
	
}
