package days16;

import java.util.Arrays;

import days15.Student;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * 		복습
		 * 			1. 접근 지정자 설명
		 * 				1) 클래스 앞
		 * 					public
		 * 				2) 멤버(필드, 메서드 생성자) 앞
		 * 					public, private, protected, default 
		 * 			2. 생성자 설명
		 * 				1) 객체 생성동시에 필드 초기화
		 * 				2) 클래스명으로 선언
		 * 				3) 객체를 생성할 때 호출됨
		 * 				4) 매개변수가 없는 생성자 - 디폴트 생성자
		 * 				5) 오버로딩 가능
		 * 				6) 상속 X
		 * 				7) 일종의 메서드
		 * 				8) 생성자를 선언하지 않으면 컴파일 시 default 생성자를 자동으로 생성
		 * 			3. 클래스 복사와 클래스 복제 설명
		 * 				1) 클래스 복사
		 * 					객체의 index값을 복사
		 * 				2) 클래스 복제
		 * 					객체의 value만을 복사
		 * 			4. 클래스 배열 초기화를 Student 클래스를 사용해서 3명의 학생정보를 처리하는 코딩
		 * 				(클래스 배열 초기화)
		 * 						final int STUDENT_COUNT = 3 ;      

								Student student[]={
								new Student();
								new Student();
								new Student();
								}
								
					5. 자바의 변수 종류 및 설명
		 *   			1)	지역변수 - 메서드, 블럭, 생성자 
		 *   			2) 	인스턴스 변수 - 필드
		 *   			3)  클래스 변수 - 필드
		 * 			6. 오버로딩(overloading) 설명
		 * 				중복함수-매개변수가 다른
		 * 			7. 아래 두 문자열의 대소문자 구분 없이, 순서 상관 없이 같은 문자여부를 체크하는 코딩을 하세요. 
            			String n = "keNik";   
            			String m= "kKnie";      
		 * */
		String n="keNik";
		//순서 ?
		String m="kKnie";
		//System.out.println(n.equalsIgnoreCase(m));//대소문자 구분
		//배열
		char N[]=n.toLowerCase().toCharArray();
		char M[]=m.toLowerCase().toCharArray();
		
		Arrays.sort(N);
		Arrays.sort(M);
		
		boolean s=Arrays.equals(N,M);
		System.out.println(s);

	}

}
