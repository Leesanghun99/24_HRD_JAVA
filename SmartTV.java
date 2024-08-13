package day06;

public class SmartTV extends Product{
	
	String resolution;
	
	public SmartTV(String pname, int price, String carrier) {
		super.pname = pname;
		super.price = price;
		this.resolution = carrier;
	}

	@Override
	public void printExtra() {
		System.out.println("통신사: " + resolution);
		
	}

	
	
}
