package days13;

import java.util.Scanner;

import days14.Person;

public class Ex01 {

	public static void main(String[] args) {
		//1차원배열선언-이름,국,영,수,총합,평균,등수 처리입력+등수처리+출력
		//학생 성적 처리 10명
		/*
		int STUDENT_COUNT=10; //고정값 final 추가 권장
		
		//배열변수
		String names[]=new String [STUDENT_COUNT];
		int kors[]=new int [STUDENT_COUNT];
		int engs[]=new int [STUDENT_COUNT];
		int maths[]=new int [STUDENT_COUNT];
		int totals[]=new int[STUDENT_COUNT];
		int avgs[]=new int[STUDENT_COUNT];
		int ranks[]=new int[STUDENT_COUNT];
		
		//입력변수
		String name;
		int kor,eng,math;
		int total;
		int avg;
				
		int count=0; //입력 횟수 & 배열 index
		
		do { //반복
			System.out.print("이름 국 영 수 : ");	
			Scanner scanner=new Scanner(System.in);
			name=scanner.next();
			kor=scanner.nextInt();
			eng=scanner.nextInt();
			math=scanner.nextInt();
			total=kor+eng+math; //초기화
			avg=total/3; //초기화
			
			
			//배열명[index]=입력값;
			names[count]=name;
			kors[count]=kor;
			engs[count]=eng;
			maths[count]=math;
			
			
			count++;
		} while (count<10);
		
		*/
		
		//days14 Person 클래스
		//days13.Ex01 클래스
		Person p1=new Person();
		System.out.println("public");
		
		
	}

}
