package days21;

import java.util.Date;
import java.util.Scanner;

/**
 * @author Osj  
 * @date   2025. 9. 15. 오후 4:47:33
 * @subject Date 
 * @content days09 Ex03
 */
public class Ex11_02 {

	public static void main(String[] args) {
		//달력 그리기
		//1. 년 월 1일 무슨요일인지


		Scanner scanner = new Scanner(System.in);
		int year, month;

		System.out.printf("> year, month input ? ");
		year = scanner.nextInt();  // 2000 ~2010
		month = scanner.nextInt(); // 1~12

		int dayOfWeek = getDayOfWeek(year, month, 1);
		System.out.println("요일 : "+dayOfWeek);
		//2. 년 월 마지막 날짜 몇일인지
		int lastDay = getLastDay(year, month);
		System.out.println("날짜 : "+lastDay);

		System.out.println("=".repeat(70));

		for (int i = 1; i <= 30; i++) {
			System.out.printf("%d.%2d.%2d(%b)\n", year, month, i
					, isToday(year, month, i));
		}
	}

	private static int getDayOfWeek(int year, int month, int date) {

		Date d=new Date(year -1900,month-1,date);

		return d.getDay();
	}
	private static int getLastDay(int year, int month) {
		Date d=new Date(year -1900,month,1);
		//System.out.println("1: "+d.toLocaleString());
		d.setDate(d.getDate()-1);
		//System.out.println("2: "+d.toLocaleString());
		return d.getDate();
	}

	public static boolean isToday(int year, int month, int date) {
		// return true 오늘날짜와  year,  month,  day
		Date today = new Date(); 
		today.setHours(0);
		today.setMinutes(0);
		today.setSeconds(0);
		//Date 날짜 객체를 생성해서 equals, compareTo, before, after
		Date d=new Date(year-1900,month-1,date);
		

		return today.equals(d);
	}
}
