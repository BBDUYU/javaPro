package days07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex07 {

	public static void main(String[] args) throws IOException {
		String name;

		byte kor,eng,math;
		kor=eng=math=0;

		short total=0;

		double avg=0;

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		// 홍길동,78,99,66     엔터
		System.out.print("  > 이름, 국어, 영어, 수학 입력: ");
		String input = br.readLine(); // "홍길동,78,99,66"

		// String [] xArr = 문자열.split(구분자) 메서드
		String [] xArr = input.split(",");
		// "홍길동"  xArr[0]
		name = xArr[0];
		// "78" xArr[1]   String->byte
		kor = Byte.parseByte(xArr[1]);
		// "99" xArr[2]
		eng = Byte.parseByte(xArr[2]);
		// "66" xArr[3]
		math = Byte.parseByte(xArr[3]);
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
