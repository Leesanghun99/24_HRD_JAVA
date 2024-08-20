package day10;

import java.sql.SQLException;
import java.util.Scanner;

public class BoardExample {
	
	
	
	Scanner scan = new Scanner(System.in);
	DataModel dm = null;
	
	
	public BoardExample() {
		dm = new DataModel();
		
	}
	
	// mainmenu() 메소드 정의
	public void mainmenu() throws SQLException {
		
		System.out.println();
		System.out.println("----------");
		System.out.println("메인 메뉴: 1.Creat | 2.Read | 3.Clear | 4.Exit");
		System.out.println("메뉴 선택: ");
		String menuNo = scan.nextLine();
		System.out.println();
		
		
		switch(menuNo) {
		case "1":
			dm.create();
			break;
		case "2":
			break;
		case "3":
			break;
		case "4":
			break;
		
		}
		
	}
	

	public static void main(String[] args) {
		

	}

}
