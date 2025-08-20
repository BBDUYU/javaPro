package days03;

/**
 * @author Osj  
 * @date   2025. 8. 20. 오전 11:41:49
 * @subject 대문자 <-> 소문자 변환
 * @content  +- 32
 */
public class Ex03 {

	public static void main(String[] args) {
		
		//'A' - 문자코드표 65(10진수) - 0000 0000 0100 0001 2진수 변환
		// char 정수계열 포함
		
		//대문자 + 32 = 소문자 변환
		//소문자 - 32 = 대문자 변환
		System.out.println('A'+32);
		System.out.println('a'-32);
		
	}

}
