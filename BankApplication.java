package day04;

public class BankApplication {

	public static void main(String[] args) {
		
		Account gookminAccount = new Account();
		gookminAccount.setBalance(10000);
		System.out.println("현재 잔고:" + gookminAccount.getBalance());
		
		gookminAccount.setBalance(-5000);
		System.out.println("현재 잔고:" + gookminAccount.getBalance());
		
		gookminAccount.setBalance(-5000);
		System.out.println("현재 잔고:" + gookminAccount.getBalance());

		gookminAccount.setBalance(3000000);
		System.out.println("현재 잔고:" + gookminAccount.getBalance());

		
		
		
	}
	
}
