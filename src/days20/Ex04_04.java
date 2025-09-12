package days20;

/**
 * @author Osj  
 * @date   2025. 9. 12. 오후 2:31:28
 * @subject 
 * @content 
 */
public class Ex04_04 {

	public static void main(String[] args) {
//		String s="public static void main(String[] args)";
//		System.out.println(s.contains("main"));
//		System.out.println(s.indexOf("main"));
		
		//join
//		String sArr[]=s.split("\\s");
//		System.out.println(String.join("*", sArr));
		String s="publi11한1글c joi2ㅎ22n {yy}[xx]";
		// s 문자열 속에서 한글만 출력
		String t="";
		t=s.replaceAll("[^가-힣 ㅏ-ㅣ ㄱ-ㅎ]", "");// 한글이 아니 정규표현식
		/*
		char [] sArr = s.toCharArray();
	      for (int i = 0; i < sArr.length; i++) {
	         char one = sArr[i];
	         if( (one >= '가' && one <= '힣')
	               || (one >= 'ㄱ' && one <= 'ㅎ') 
	               || (one >= 'ㅏ' && one <= 'ㅣ'))   t += sArr[i];
	      }
		*/
		System.out.println(t);
		
	}

}
