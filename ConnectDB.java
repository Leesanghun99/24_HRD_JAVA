package day10;
import java.sql.*;
import java.io.*;


public class ConnectDB {
	
	static Connection con = null;
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			String url = "jdbc:mysql://localhost:3306/contacts";
			String id = "root";
			String pwd = "1234";
			con= DriverManager.getConnection(url,id,pwd);
			System.out.println("DB 연결 성공!");
					
		}catch(Exception en) {
			
		}
		
		
	}

	Connection getCon() {
		return con;
	}
	
	
	

}
