package days23;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Osj  
 * @date   2025. 9. 17. 오전 9:18:01
 * @subject Date, Calendar -> 형식화 클래스 - DF, SDF, CF, MF  
 * @content format 패키지 - 형식화 클래스 - DateTimeFormatter 클래스
 * 			DateTimeFormatter pattern="패턴기호" dtf.format()
 * 			LocalDateTime
 */
public class Ex02 {

	public static void main(String[] args) {
		
		LocalDateTime dt = LocalDateTime.now();
		//System.out.println(dt);
		
		System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
		
		String pattern="yyyy/MM/dd E요일 hh:mm:ss.S";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		String ft=dtf.format(dt);
		System.out.println(ft);
		
		
		
	}

}
