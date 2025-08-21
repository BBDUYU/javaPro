package days04;

import java.util.Scanner;

/**
 * @author Osj  
 * @date   2025. 8. 21. 오전 9:33:23
 * @subject Scanner 예제 
 * @content 
 */
public class Ex01_03 {

	public static void main(String[] args) {
		
		//Date now = new Date();

		//String input = "1 fish 2 fish red fish blue fish";
		String input = "1 , 2 , red , blue ,";
		//구분자로 사용할 패턴은 정규표현식으로 표현
		Scanner s = new Scanner(input).useDelimiter("\\s*,\\s*");
		System.out.println(s.nextInt());
		System.out.println(s.nextInt());
		System.out.println(s.next());
		System.out.println(s.next());
		s.close();
	}

}
