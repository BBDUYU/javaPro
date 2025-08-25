package days06;

import java.util.Arrays;
import java.util.Random;

public class Ex05_03 {

	public static void main(String[] args) {
		//[문제] 100개의 정수 중에 가장 큰값, 작은값
		//int [] m = {10, 31, 98, 38, 68, 91, 95, 76, 27, 29};
		//System.out.println(m.length);
		
		
		//1~100임의의 정수
		int m[]=new int[20];
		Random num=new Random();
		
		
		
		for(int i=0;i<m.length;i++) {
			m[i]=num.nextInt(100)+1;
		}
		
		System.out.println(Arrays.toString(m));
		//
		int max=m[0];
		int min=m[0];
		for(int i=0;i<m.length;i++) {
			max=Math.max(max, m[i]);
			min=Math.min(min, m[i]);
		}
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		
		
		
		
		
	}//main

}//class
