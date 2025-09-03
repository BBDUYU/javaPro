package days13;

import java.util.Arrays;
import java.util.Iterator;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 * 1차원 배열
		int m[]=new int[8];
		dispM(m);
		*/
		//
		int m[][]=new int[4][2];//2차원 배열 - 4행 2열
		System.out.println("배열크기= "+m.length);//행 크기
		System.out.println("배열크기= "+m[0].length);//열 크기
		
		m[0][0]=1;
		m[0][1]=2;
		m[1][0]=3;
		
		dispM(m);
		
		
		//2차원 배열의 크기
		//2차원 배열 출력하는 dispM()선언+호출
	}

	private static void dispM(int[][] m) {
		/*
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("m[%d][%d]=%d ",i,j,m[i][j]);
			}
			System.out.println();
		}
	}

	private static void dispM(int[] m) {
		System.out.println(Arrays.toString(m));
		for(int i=0;i<m.length;i++) {
			System.out.printf("m[%d]=%d",i,m[i]);
		}
	}

}
