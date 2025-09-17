package days23;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * @author Osj  
 * @date   2025. 9. 17. 오전 9:01:47
 * @subject Period 클래스 : 날짜 - 날짜 간격 
 * @content Duration : 시간 - 시간
 * 				between() 		==		until()
 * 				static메서드	 			인스턴스 메서드
 * 				Period.between()		p.until()
 * 				Duration.between()		d.until()
 */
public class Ex01 {

	public static void main(String[] args) {
		
		LocalTime st = LocalTime.of(9, 0, 0);
		LocalTime nt = LocalTime.now();
		
		Duration d = Duration.between(st, nt);

		//System.out.println(d.get(ChronoUnit.HOURS)); //예외발생
		
		/*
		System.out.println(d.getSeconds()/60); //분
		System.out.println(d.getSeconds()); 
		System.out.println(d.getNano());
		*/
		System.out.println(d.toHours());
		System.out.println(d.toMinutes());
		/*
		// 개강일 - 오늘까지 날짜 간격
		LocalDate sd = LocalDate.of(2025,8,18);
		LocalDate td = LocalDate.now();
		
		//Period 클래스 between() 메서드를 사용 - 날짜간의 간격
		//		sd <=		<=td
		Period p = Period.between(sd, td);
		System.out.println(p.getYears());
		System.out.println(p.getMonths());
		System.out.println(p.getDays()); 
		System.out.println("-".repeat(70));
		
		System.out.println(p.get(ChronoUnit.YEARS));
		System.out.println(p.get(ChronoUnit.MONTHS));
		System.out.println(p.get(ChronoUnit.DAYS));
		System.out.println("-".repeat(70));
		*/

	}

}
