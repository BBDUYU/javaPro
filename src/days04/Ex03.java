package days04;

/**
 * @author Osj  
 * @date   2025. 8. 21. 오전 10:17:21
 * @subject 93p 논리연산자 
 * @content 
 * 			일반 논리 연산자
 * 				&& AND연산자 논리곱
 * 				|| OR 연산자 논리합
 * 				!  부정연산자
 * 			    ! > && > || 우선순위
 * 				
 * 			비트 논리 연산자
 */
public class Ex03 {

	public static void main(String[] args) {
		// 논리곱
		System.out.println(4>2 && 10<12);
		System.out.println(4>2 && 10>12);
		System.out.println(4<2 && 10<12);
		System.out.println(4<2 && 10>12);
		
		// 논리합
		System.out.println(4>2 || 10<12);
		System.out.println(4>2 || 10>12);
		System.out.println(4<2 || 10<12);
		System.out.println(4<2 || 10>12);
		
		// 부정연산자
		System.out.println(!true);
		boolean b=false;
		System.out.println(!b);

	}

}
