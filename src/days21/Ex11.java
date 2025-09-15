package days21;

import java.util.Date;

/**
 * @author Osj  
 * @date   2025. 9. 15. 오후 4:32:22
 * @subject 날짜와 시간을 다루는 클래스 
 * @content 형식화 클래스
 * 
 * 			1. jdk 1.0 - java.util.Date		-	폐기예정
 * 			2. jdk 1.1 - java.util.Calendar	
 * 			3. jdk 1.8 - java.time 
 * 							ㄴ 하위 패키지
 * 							ㄴ 날짜/시간 클래스
 * 			
 */
public class Ex11 {

	public static void main(String[] args) {
		//생성자가 8가지, 3개정도만 폐기안됨
		Date d = new Date();
		//Mon Sep 15 16:35:30 GMT+09:00 2025
		System.out.println(d);
		System.out.println(d.toLocaleString());
		
		//년
		System.out.println(d.getYear()+1900);
		//월
		System.out.println(d.getMonth()+1);
		//일
		System.out.println(d.getDate());
		//시간
		System.out.println(d.getHours());
		//분
		System.out.println(d.getMinutes());
		//초
		System.out.println(d.getSeconds());
		//밀리초 X
		//요일
		System.out.println(d.getDay()); //0:일 1:월 ... 6:토
		long ms=d.getTime(); //1970년 1월 1일 00:00:00 계산된 밀리초 반환
		System.out.println(ms);
		
	}

}
