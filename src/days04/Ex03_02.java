package days04;

/**
 * @author Osj  
 * @date   2025. 8. 21. 오전 10:17:21
 * @subject 93p 논리연산자 
 * @content 
 * 				
 * 			비트 논리 연산자
 * 			비트 논리 AND연산	   &
 * 			비트 논리 OR연산	   |
 * 			베타적 논리합(XOR)연산자 ^
 * 			틸드 연산자			   ~	각 비트를 반전시키는 연산 0->1 1->0
 */
public class Ex03_02 {

	public static void main(String[] args) {
		System.out.println(10&3); //2
		System.out.println(10^3); //9 베타적연산자
		System.out.println(10|3); //11
		System.out.println(~10);
		

	}

}
