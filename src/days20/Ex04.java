package days20;

/**
 * @author Osj  
 * @date   2025. 9. 12. 오전 11:31:48
 * @subject 문자열 다루는 클래스
 * @content 1. String
 * 				ㄴ ***** 변경 불가능한(immutable) 클래스 *****
 * 			2. StringBuilder / StringBuffer
 * 			3. StringTokenizer
 * 			4. StringJoiner
 */
public class Ex04 {

	public static void main(String[] args) {
		String name1="홍길동";
		String name2="홍길동";
		System.out.println(name1==name2);
		
		String n1=new String("AAA");
		String n2=new String("AAA");
		System.out.println(n1==n2);//f
		System.out.println(n1.equals(n2));//t
	}

}
