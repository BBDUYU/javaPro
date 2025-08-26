package days07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Osj  
 * @date   2025. 8. 26. 오후 4:21:02
 * @subject 반복 입력
 * @content 
 */
public class Ex07_02 {

	public static void main(String[] args) throws IOException {
		String name;

		byte kor,eng,math;
		kor=eng=math=0;

		short total=0;

		double avg=0;

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		
		char cont='y';
		int count=0;
		
		do {
			System.out.printf("  > [%d]번째 이름, 국어, 영어, 수학 입력: ",++count);
			String input = br.readLine(); // "홍길동,78,99,66"

			String [] xArr = input.split(",");
			name = xArr[0];
			kor = Byte.parseByte(xArr[1]);
			eng = Byte.parseByte(xArr[2]);
			math = Byte.parseByte(xArr[3]);
			total=(short) (kor+eng+math);
			avg=(double)total/3;
			//출력
			System.out.printf("이름: \"%s\"\n"
					+ "국어: %d\n"
					+ "영어: %d\n"
					+ "수학: %d\n"	
					+ "총점: %d\n"
					+ "평균: %.2f	",name,kor,eng,math,total,avg);
			System.out.printf("\n\n 입력을 계속하시겠습니까?");
			cont=br.readLine().charAt(0);
		} while (cont=='Y'||cont=='y');
		System.out.print("End");



	}

}
