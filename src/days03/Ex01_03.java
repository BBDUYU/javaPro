package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Osj  
 * @date   2025. 8. 20. 오전 9:03:42
 * @subject 
 * @content 1. 이름, 국어, 영어, 수학을 키보드로 입력받아서
			  총점, 평균을 계산하고 출력.
			  
			  입력형식)
			  > 이름 입력: _
			  > 국어 입력: _
			  > 영어 입력: _
			  > 수학 입력: _
			  
			  출력형식)
			  이름: "홍길동"
			  국어: 89
			  영어: 76
			  수학: 92
			  총점: 257
			  평균: 86.67	  
 */
public class Ex01_03 {

	public static void main(String[] args) throws IOException {
		//변수 선언
		String name;
		
//		byte kor=0,eng=0,math=0;
		byte kor,eng,math;
		kor=eng=math=0;
		
		short total=0;
		
		double avg=0;
		
		Scanner scanner=new Scanner(System.in);
		
		//이름
	    System.out.print("  > 이름 국어 영어 수학 입력: ");

		name=scanner.next();
		//국
		kor=Byte.parseByte(scanner.next()); 

		//영
		eng=Byte.parseByte(scanner.next());
		//수
		math=Byte.parseByte(scanner.next());
		//총점, 평균 계산
		total=(short) (kor+eng+math);
		avg=(double)total/3;
		//출력
		System.out.printf("이름: \"%s\"\n"
				+ "국어: %d\n"
				+ "영어: %d\n"
				+ "수학: %d\n"	
				+ "총점: %d\n"
				+ "평균: %.2f	",name,kor,eng,math,total,avg);
		
	}

}
