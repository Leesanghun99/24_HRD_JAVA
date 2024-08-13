package day06;

public abstract class Product {

	
	String pname;
	int price;
	
	public void prontDetail() {
		
		System.out.println("상품명: " + pname + " , ");
		System.out.println("가격: " + price + " , ");
		printExtra();
	}
	
	//추상 메소드
	public abstract void printExtra();
	
}
