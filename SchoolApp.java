package day05;
import java.util.ArrayList;

public class SchoolApp {
	
	
	
	public static void main(String[] args) {
		
		Person person;		
		ArrayList<Person> personList = new ArrayList<Person>();
		person = new Student("202401", "자바", "홍길동", 20);
		personList.add(person);
		personList.add(new Staff("201010", "HRD 사업단", "김사업", 30));
		personList.add(new Teacher("199901", "네트워크", "이교사", 35));

		//person.inputPerson();
		
		for(Person p : personList) {
			if (p instanceof Student)
				//p.printAll();
				if(p instanceof Student) 
					System.out.println(((Student) p).getId());
				else if(p instanceof Teacher) {
					System.out.println(((Teacher) p).getId());
				}else if(p instanceof Staff) {
					System.out.println(((Staff) p).getId());
				}
		}
		
		
		
		
		
		
		
		
	}

}
