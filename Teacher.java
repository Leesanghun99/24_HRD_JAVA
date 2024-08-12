package day05;

public class Teacher extends Person {

	//
	private String id;
	private String subject;
	
	
	//생성자
	
	public Teacher(String id, String subject, String n, int age) {
		super(n, age);
		this.id = id;
		this.subject = subject;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject() {
		this.subject = subject;
	}
	
	
	//getter, setter
	
	
}
