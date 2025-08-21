package days04;

import java.util.Scanner;

/**
 * @author Osj  
 * @date   2025. 8. 21. 오후 3:11:48
 * @subject 
 * @content 
 */
public class Ex09_02 {

	public static void main(String[] args) {
		//두 문자열 비교
		String a = "kenik";
		String b;       

		Scanner scanner = new Scanner(System.in);
		System.out.print("> b 입력 ? ");
		b = scanner.next();

		//System.out.println( a == b ?"같다":"다르다" );
		
		//문자열비교할때는 equals()
		//System.out.println( a.equals(b) ?"같다":"다르다" );
		System.out.println( a.equalsIgnoreCase(b) ?"같다":"다르다" ); //대소문자 구분 X
	}

}
