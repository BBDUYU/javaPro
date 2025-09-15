package days21;

import java.math.RoundingMode;
import java.util.Arrays;

/**
 * @author Osj  
 * @date   2025. 9. 15. 오전 10:21:33
 * @subject Ch 12 수학클래스 
 * @content 
 */
public class Ex04 {

	public static void main(String[] args) {
		
//		System.out.println(Math.sqrt(4));
		
//		System.out.println(Math.abs(-100));
//		System.out.println(Math.abs(100));
		
		
//		System.out.println(Math.pow(2.1, 3.3));
		
		
//		System.out.println(Math.PI);
		
		
//		System.out.println(Math.max(2, 3));
//		System.out.println(Math.min(2, 3));
		
		
//		0.0 <= double Math.random(); <1.0
//		long Math.round(double) 반올림 소수점 첫번째 자리에서 반올림
		
//		Math.floor(3.2); 절삭 - 버림 double
//		Math.ceil(3.2);  절상 - 올림 double
		
		//게시판
		/*
		int totalCount=245;
		int pageCount=10;
		int pageTotalCount=0;
		pageTotalCount=(int) Math.ceil((double)totalCount/pageCount);
		System.out.println(pageTotalCount);
		*/
		
		
	
		
		
		//문제 소수점 셋째자리에서 반올림을해서 소수점 2자리까지 출력
		/*
		double d=3.141592;
		/*
		String strd=String.format("%.2f", d);
		d=Double.parseDouble(strd);
		System.out.println(d);
		*/
		//[3]
		/*
		long ld=Math.round(d*100);
		System.out.println(ld/100D);
		*/
//		String.valueOf(3.141592);
		
//		System.out.printf("%.2f",Math.round(d));

	}

}



/*
//1. 소수 -> String 으로 변환
String strD=3.141592+"";
System.out.println(strD);

//2. String -> char[]로 변환

char dArr[]=strD.toCharArray();

//3. 소수점 3째자리가 5보다크다면 -> 소수점 자리 찾기

int index=Arrays.binarySearch(dArr,'.');
index+=3;
System.out.println(dArr[index]);
*/
/*
int point=strD.indexOf(".");
System.out.println(point);
*/
