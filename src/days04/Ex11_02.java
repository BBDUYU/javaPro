package days04;

import java.util.Scanner;

public class Ex11_02 {

	public static void main(String[] args) {
		//[문제] 점수 입력(0~100)
		//		수/우/미/양/가
		//		90<=수<=100
		//		80<=우<=89
		//			...
		//		0<=가<59
		//출력형식)
		//	95점은 '수'입니다.
		Scanner scanner=new Scanner(System.in);
		int score;
		System.out.print("점수를 입력해주세요 : ");
		score=scanner.nextInt();
		
		if(score<0 || score>100) {
			System.out.print("범위를 벗어났습니다. 점수를 다시입력해주세요 : ");
			score=scanner.nextInt();
		}
		
		if(score>=90 && score<=100) {
			System.out.printf("%d점은 '수'입니다",score);
		}else if(score>=80 && score<=89) {
			System.out.printf("%d점은 '우'입니다",score);
		}else if(score>=70 && score<=79) {
			System.out.printf("%d점은 '미'입니다",score);
		}else if(score>=60 && score<=69) {
			System.out.printf("%d점은 '양'입니다",score);
		}else {
			System.out.printf("%d점은 '가'입니다",score);
		}
			
}

}
