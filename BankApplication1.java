package day04;
import java.util.Scanner;

public class BankApplication1 {
	public static Account[] accountarray = new Account[100];
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			
			System.out.println("------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scan.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
			}
			
			
		}
		System.out.println("프로그램 종료");	
	}
	//계좌 생성
	public static void createAccount() {
		System.out.println("---------------------------------");
		System.out.println("계좌 생성");
		System.out.println("---------------------------------");
		
		System.out.println("계좌번호: ");
		String ano = scan.next();
		
		System.out.println("계좌 주인: ");
		String owner = scan.next();	
		
		System.out.println("초기입금액: ");
		int balance = scan.nextInt();		
	
		Account account = new account(ano, owner, balance);
		
		for(int i =0; i < accountarray.length; i++) {
			if(accountarray[i] ==null) {
				accountarray[i] = account;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
			
		}
		
	}
	
	//계좌 목록
	public static void accountList() {
		System.out.println("---------------------------------");
		System.out.println("계좌 목록");
		System.out.println("---------------------------------");
		
		
	}
	//예금
	public static void deposit() {
		System.out.println("---------------------------------");
		System.out.println("입금");
		System.out.println("---------------------------------");
	}
	
	//출금
	public static void withdraw() {
		System.out.println("---------------------------------");
		System.out.println("출금");
		System.out.println("---------------------------------");
	}
	

}
