package days20;

import java.util.Arrays;

/**
 * @author Osj  
 * @date   2025. 9. 12. 오전 11:47:43
 * @subject String 메서드, 필드 이해+활용
 * @content 
 */
public class Ex04_02 {

	public static void main(String[] args) {
		String s="public static void main(String[] args)";
		//[1]
		System.out.println(s.length());
		//[2]
		System.out.println(s.charAt(0));
		//[2-2] 가장 마지막한문자
		System.out.println(s.charAt(s.length()-1));

		//[3] 대소문자변환
		//String S=s.toUpperCase();
		String S=s.toLowerCase();
		System.out.println(S);
		
		//[4] 문자열을 어떤 구분자로 잘라내기
		String regex=" ";
		int limit=4;
		String sArr[]=s.split(regex,limit);
		System.out.println(Arrays.toString(sArr));
		
		//[5] trim() 앞뒤 공백을 제거한 후 문자열 반환 메서드
		System.out.printf("[%s]\n","   홍  길동  ");
		System.out.printf("[%s]\n","   홍  길동  ".trim());
		
		//[6] valueOf() //char[] -> String 변환
//		char nArr[]= {'s','b','s'};
		char nArr[]="sbs".toCharArray(); //String -> char[] 변환
//		String name = nArr[0]+nArr[1]+nArr[2];
//		String name=new String(nArr);
		String name=String.valueOf(nArr);
		System.out.println(name);
		
	}

}
