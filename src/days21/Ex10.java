package days21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Osj  
 * @date   2025. 9. 15. 오후 3:07:45
 * @subject [정규표현식 Regular Experssion] 
 * @content 	ㄴ 문자열 속에 원하는 패턴과 일치하는 문자열 찾기위해서 사용하는 식
 * 				ㄴ 미리 정의된 기호와 문자
 * 				ㄴ java.util.regex 패키지
 * 					1) Pattern 클래스 - 정규식을 정의
 * 					2) Matcher 클래스 - 데이터와 정규식(패턴객체)을 비교
 * 				ㄴ boolean String.matches(regex)
 */
public class Ex10 {

	public static void main(String[] args) {
		String[] data = { "bat", "baby", "bonus", "cA", "ca"
				, "co", "c.", "c0", "car", "combat", "count", "date",
				"disc", "fx" , "c"};
		// 소문자 c로 시작하는 문자열 검색
		//		String regex="c[a-z]*";
		//		String regex="c[a-zA-Z]*";
		//		String regex="c[a-zA-Z0-9]*";
		//String regex="c\\w";
		// String regex = "c.*t";	c로시작하는 모든문자 단 t 로끝남
		// String regex = "(b|c)";  b 또는 c  
		// String regex = "[bc]";   b 또는 c
		// String regex = "[b-c].*"; b에서 c까지
		// String regex = "[^bc].*"; //
		// String regex = ".*a.*";   a가 포함된 아무문자
		// String regex = "[^bcd].*"; 

		// String regex = "[a-zA-Z].*"; 
		// String regex = "[ae-zA-Z].*"; a,e~z,A~Z 
		// String regex = "[a-zA-Z&&[^b-d]].*"; 소문자,대문자, b~d 제외
		
		
		String regex = "(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*_])[A-Za-z\\d!@#$%^&*_]{8,15}";
		
		Pattern pattern = Pattern.compile(regex);

		for (int i = 0; i < data.length; i++) {
			Matcher matcher = pattern.matcher(data[i]);
			if (matcher.matches()) {//true, false
				System.out.println(data[i]);
			}
		}
	}

}
