package day02;
import java.util.Random;
import java.util.Scanner;
public class Game {

	public static void main(String[] args) {
	    // 가위 바위 보 게임 만들기
		// 1~3까지의 난수를 생성하여 1:가위, 2:바위, 3:보
		// 컴퓨터와 유저간 게임을하여 승 패를 출력하시오.
		// 변수, 자료형, 조건문, 반복문, Scanner, Random 클래스 사용하기
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
		System.out.println("--가위바위보게임--");
		System.out.println("하나를 선택하세요. 가위[1] 바위[2] 보[3] 종료[0]");
		System.out.println("===================");
		System.out.println("입력하세요 ->");
		
		int user = scan.nextInt();
		int computer = random.nextInt(3)+1;
		if(user == 0) break;
		System.out.println("유저측: " + user);
		System.out.println("CPU측: " + computer);
		
		if(user ==0) System.exit(0);
		if(user ==computer) {
			System.out.println("비겼어요");
		}else if((user == 1) && (computer == 3) ||
		(user == 2) && (computer == 1) ||
		(user == 3) && (computer == 2)){
			System.out.println("유저 승");
		}else {
			System.out.println("유저 패");
		}
			
		System.out.println("프로그램 종료는 0번을 눌러주세요");
		
		}
	 }
	}


