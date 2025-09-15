package days21;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Osj  
 * @date   2025. 9. 15. 오후 4:14:32
 * @subject days20 Ex04_03 
 * @content 
 */
public class Ex10_04 {

	public static void main(String[] args) {
		String source = "안녕하세요. 홍길동입니다. 이름은 홍길동입니다. 별명도 홍길동입니다.";
		String regex="홍길동";

		// 두 번째 홍길동을 XXX로 변경후 저장할 문자열 객체
		StringBuffer sb=new StringBuffer();
		
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(source);
		int count=0;
		while (matcher.find()) {
			count++;
			System.out.printf("start:%d ~ end:%d\n"
					,matcher.start(),matcher.end());
			if(count==2)matcher.appendReplacement(sb, "XXX");
		}
		matcher.appendTail(sb);
		System.out.println(sb.toString());
		
		
		
		
	}

}
