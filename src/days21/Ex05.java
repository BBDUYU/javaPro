package days21;

import days17.Employee;
import days17.Regular;

/**
 * @author Osj  
 * @date   2025. 9. 15. 오전 11:31:57
 * @subject 포장 클래스 - Wrapper 
 * @content 		Integer
 * 
 * 			기본형을 사용하기쉽도록 여러기능을 구현한 클래스를
 * 			래퍼클래스
 * 				
 * 					박싱과 언박싱
 * 				
 * 			
 * 
 */
public class Ex05 {

	public static void main(String[] args) {
		
		Employee emp=new Regular();
		disp(emp);
		
		
		
		
		
		
		
		
		//int의 표현값중에 가장 큰값
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
		
		//String -> int
//		String s="100";
//		int i=Integer.parseInt(s);
//		System.out.println(i);
		int i=100;
		disp(i);
		//기본형 int i를 래퍼클래스 Integer에 참조시켜도된다
		// 기본형 -> 래퍼클래스 자동변환 - 오토박싱
		//Integer <- int
		Integer j=i;
		System.out.println(j.intValue());
		
		// 래퍼클래스 -> 기본형 - 오토언박싱
		int l=j;
		
	}

	private static void disp(Object obj) { // 매개변수 다형성 (업캐스팅)
		System.out.println(obj.toString());
	}

}
