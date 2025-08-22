package days05;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int score;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("> 국어 점수(score) 입력 ? ");

		if ( !scanner.hasNextInt() ) { //hasNextInt() 데이터 타입이 int인지 확인
			System.out.println("[알림] 숫자를 입력해주세요"); 
			return ;
		}

		score = scanner.nextInt();

		char grade = '가';

		switch (0<=score && score <=100?1:0) {
		case 1:
			switch (score/10) {
			case 10:            
			case 9:
				grade = '수';
			case 8:            
				grade = '우';
			case 7:
				grade = '미';
			case 6:
				grade = '양';
			default:
				grade = '가';
			}
			System.out.printf("%d점은 '%c'입니다.", score, grade);
			break; 
		default:
			System.out.println("[알림] 점수 0~100 !!!");
			break;
		}



	}

	//	public static void main(String[] args) {
	//		
	//		Scanner scanner=new Scanner(System.in);
	//		
	//		System.out.print("점수를 입력하세요 : ");
	//		
	//		int score;
	//		char grade = 0;
	//		score = scanner.nextInt();
	//		
	//		switch (0<=score && score <=100?1:0) {
	//		case 1:
		//		switch (score/10) {
		//		case 10:
		//			grade='수';
		//			break;
		//		case 9:
		//			grade='수';
		//			break;
		//		case 8:
		//			grade='우';
		//			break;
		//		case 7:
		//			grade='미';
		//			break;
		//		case 6:
		//			grade='양';
		//			break;
		//		default:
		//			grade='가';
		//			return;
		//		}
	//			System.out.printf("%d점은 '%c'입니다.", score, grade);
	//		    break; 
	//		default:
		//	    System.out.println("[알림] 점수 0~100 !!!");
		//	    break;
	// 		}
	//	}

}
