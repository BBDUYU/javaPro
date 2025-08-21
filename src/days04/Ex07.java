package days04;

import java.util.Arrays;

/**
 * @author Osj  
 * @date   2025. 8. 21. 오후 2:01:06
 * @subject 
 * @content 
 */
public class Ex07 {

	public static void main(String[] args) {
		//모든 지역변수는 초기화하지 않으면 사용할 수 없다
		/*
		int kor;// 지역변수(local variable)
		
		System.out.println(kor);
		*/
		
		int []iArr = null;
		iArr=new int[10];
		
//		Arrays 클래스
		System.out.println(Arrays.toString(iArr)); // 배열에 있는 모든 값
		
//		iArr[0]=100;
		
//		System.out.println(iArr[0]); //lowerbound 아랫첨자값
//		System.out.println(iArr[1]);
//		System.out.println(iArr[2]); //upperbound 윗첨자값
		
		System.out.println(iArr.length);
		
		// java.lang.ArrayIndexOutOfBoundsException
		// System.out.println(iArr[3]);
	}

}
