package days16;

import java.util.Arrays;

public class Ex01_02 {

	public static void main(String[] args) {
		/*
		int m[]= {3,5,2,4,1};
		Arrays.sort(m);
		System.out.println(Arrays.toString(m));
		*/
		// 1. n문자열을 대문자 변환 -> n문자열 변수에 저장
		String n="keNik";
		String m="kKnie";
		n=n.toLowerCase();
		m=m.toLowerCase();
		//System.out.println(n);
		// 2. 문자열 n을 char 배열 nArr로 변환
		char nArr[]=n.toCharArray();
		char mArr[]=m.toCharArray();
//		int length=n.length();
//		char nArr[]=new char[length];
//		for (int i = 0; i < length; i++) {
//			nArr[i]=n.charAt(i);
//		}
		Arrays.sort(mArr);
		Arrays.sort(nArr);
		
		n=String.valueOf(nArr);
		m=String.valueOf(mArr);
		
		System.out.printf("%s %s 문자열은 %s",n,m,n.equals(m)?"같다":"다르다");
		
		
	}

}
