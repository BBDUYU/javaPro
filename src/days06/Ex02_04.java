package days06;

import java.util.Scanner;

public class Ex02_04 {

	public static void main(String[] args) {
		int com,user;	
		com = (int)(Math.random()*3)+1; // 1~3 랜덤 숫자
		String input;	//입력값
		Scanner scanner = new Scanner(System.in); //입력
		String regex = "[1-3]"; //1~3의 수
		String rsp[]={"","가위","바위","보"}; 
		boolean is;	//
		int tryCount=1; //입력횟수
		do {
			System.out.printf("> [%d번째 입력] user 가위(1)/바위(2)/보(3) 선택 ? ",tryCount);
			input = scanner.next();
			tryCount++;
			if(!(is=input.matches(regex))) System.out.println("잘못입력");
			if(tryCount>3) {
				System.out.println("입력 3회실패");
				scanner.close();
				return;
			}

		} while (!is);
	
		user = Integer.parseInt(input);		
		
		System.out.printf("> com=%s(%d), user=%s(%d)\n", rsp[com],com,rsp[user],user); 
		//입력값은 1,2,3 하지만 배열값은 0,1,2 라서 배열에 빈값을 추가
		switch (  com - user ) {
		case 0:
			System.out.println("무승부");
			break;
		case 1: case -2:
			System.out.println("컴퓨터 승리");
			break;
		case -1: case 2:
			System.out.println("사용자 승리");
			break; 
		}
		//System.out.println("입력잘못!!");
	}

}
