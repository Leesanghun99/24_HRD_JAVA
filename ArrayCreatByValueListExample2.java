package day03;

public class ArrayCreatByValueListExample2 {

	public static void main(String[] args) {
	
		// 문자열 데이터 4개를 저장할 배열 선언
		String [] season = { "Spring", "Summer", "Fall", "Winter"} ;
		for(int i = 0; i<4; i++) {
		System.out.println(season[i]);
		}
		season[1] = "여름";
		
		for(int i =0; i<4; i++) {
			
			System.out.println(season[i]);
		}
		
		
		//이름 문자열 3개를 저장할 배열 선언 및 초기화
		String[] names = null;
		
		names = new String[] {"이이이","김김김","박박박"};
		
	}

}
