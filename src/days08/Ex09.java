package days08;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
String name;
		
//		byte kor=0,eng=0,math=0;
		byte kor,eng,math;
		kor=eng=math=0;
		
		short total=0;
		
		double avg=0;
		
		Scanner scanner=new Scanner(System.in);
		
		//이름
	    System.out.print("  > 이름 국어 영어 수학 입력: ");

		name=getName(scanner);
		//국
		kor=getScore(scanner,"국어");

		//영
		eng=getScore(scanner,"영어");
		//수
		math=getScore(scanner,"수학");
		//총점, 평균 계산
		total=getTotal(kor,eng,math);//(short) (kor+eng+math);
		avg=getAvg(total,3);//(double)total/3;
		//출력
		
		printScore(name,kor,eng,math,total,avg);
		
		
	}

	private static void printScore(String name, byte kor, byte eng, byte math, short total, double avg) {
		System.out.printf("이름: \"%s\"\n"
				+ "국어: %d\n"
				+ "영어: %d\n"
				+ "수학: %d\n"	
				+ "총점: %d\n"
				+ "평균: %.2f	",name,kor,eng,math,total,avg);		
	}

	private static double getAvg(short total, int subjectCnt) {
		return (double)total/subjectCnt;
	}

	private static short getTotal(byte kor, byte eng, byte math) {
		return (short) (kor+eng+math);
	}

	private static byte getScore(Scanner scanner,String subject) {
		String regex="^([1-9]?[0-9]|100)$";//10의자리 1~9 가 올수도있고 안올수도있음 1의자리 0~9  [0-9]==\\d
		String input;
		boolean is;
		do {
			System.out.printf("%s 점수 입력 : ",subject);
			input=scanner.next();
			if(!(is=input.matches(regex)))System.out.println("점수를 잘못입력했습니다(0~100)");
			
		} while (!is);
		
		
		byte score=Byte.parseByte(input);
		
		return score;
	}

	private static String getName(Scanner scanner) {
		System.out.print("이름입력 : ");
		String name=scanner.next();
		return name;
	}

}
