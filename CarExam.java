package day03;

public class CarExam {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		myCar.color = "하얀색";
		myCar.company = "현대";
		myCar.maxspeed = 220;
		myCar.model = "산타페";
		myCar.material = "SUV";
		
		
		
		
		
		
		//메소드 호출
		myCar.CarInfo();
		
		Car myCar2 = new Car("기아","K7","검정",200,"세단");
		
		myCar2.CarInfo();
		
		

	}

}
