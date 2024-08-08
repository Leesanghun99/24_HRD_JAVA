package day03;

public class Car {

	int maxspeed ;
	String model;
	String color;
	String company;
	String material;
	
	int rpm;
	int speed;
	
	public Car() {
		
	}
	
	//인자 생성자
	public Car(String company,String model, String color, String material, int maxspeed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.material = material;
		this.maxspeed = maxspeed;
	}
	
	public Car(String company, String model, String color) {
		
		this.(company, model, color) =
	}

	
	
	
	
	void CarInfo() {
		System.out.println("====================");
		System.out.println("제조회사 : " + company);
		System.out.println("모    델 : " + model);
		System.out.println("색    깔 : " + color);
		System.out.println("최고속도 : " + maxspeed);
		System.out.println("기    종 : " + material);
		
	}
	
}
