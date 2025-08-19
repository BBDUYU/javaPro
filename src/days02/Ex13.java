package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Osj  
 * @date   2025. 8. 19. 오후 5:19:56
 * @subject  [문제] 키보드로부터
 * @content 	   이름, 국어, 영어, 수학 점수 입력
 * 				   총점 계산, 평균계산 -> 변수선언
 * 				   출력형식)
 * 				   홍길동 90 80 100 270 90
 * 				   (조건 국 영 수 byte로 선언, 총점 short)
 */
public class Ex13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름을 입력하세요 : ");
		String name=br.readLine();
		
		System.out.print("국어 점수를 입력하세요 : ");
		byte kor=Byte.parseByte(br.readLine());
		
		System.out.print("영어 점수를 입력하세요 : ");
		byte eng=Byte.parseByte(br.readLine());
		
		System.out.print("수학 점수를 입력하세요");
		byte math=Byte.parseByte(br.readLine());
		
		short total=(short) (kor+eng+math);
		double avg=(double) (total/3);
		
		System.out.printf("이름 : %s \n국어 : %d\n영어 : %d\n수학 : %d\n총점 : %d\n평균 : %.2f",name,kor,eng,math,total,avg);
	}

}
