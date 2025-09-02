package days12;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

/**
 * @author kenik  
 * @date 2025. 9. 2. 오후 3:13:44 
 * @subject   
 * @content 
 */ 
public class Ex06 {

	public static void main(String[] args) {
		// 0~9 정수를 랜덤하게 m 배열에 채워넣기.
		int [] m = new int[100];
		Random rand = new Random();
		for (int i = 0; i < m.length; i++) {
			m[i] = rand.nextInt(10);
		}
		
		// [0, 9, 9, 7, 1, 6, 2, 4, 1, 5, 8, 2, 9, 9, 2, 7, 6, 3, 6, 4, 9, 3, 3, 0, 6, 3, 7, 1, 6, 3, 9, 4, 7, 9, 7, 0, 6, 5, 0, 4, 6, 3, 0, 0, 9, 5, 4, 2, 3, 9, 9, 8, 0, 3, 0, 0, 9, 4, 5, 5, 6, 0, 0, 4, 1, 6, 0, 9, 6, 6, 3, 4, 7, 1, 6, 4, 2, 3, 2, 3, 1, 4, 9, 5, 1, 9, 3, 4, 9, 8, 5, 3, 6, 4, 4, 6, 5, 3, 8, 0]
		System.out.println(Arrays.toString(m));
		
		int count = 0;
		String s = "";
		for (int i = 0; i <= 9; i++) {
			count = 0;
			s = "";			
			for (int j = 0; j < m.length; j++) {
				if( m[j] == i) {
					count++;
					s +=  j +", ";
				}
			}
			System.out.printf("%d - %d개(%s)\n", i,  count, s);
		}
		
		/*
		for (int i = 0; i < m.length; i++) {
			if( m[i] == 0) count++;
		}
		System.out.printf("0 - %d개\n", count);
		
		count = 0;
		for (int i = 0; i < m.length; i++) {
			if( m[i] == 1) count++;
		}
		System.out.printf("1 - %d개\n", count);
		
		count = 0;
		for (int i = 0; i < m.length; i++) {
			if( m[i] == 2) count++;
		}
		System.out.printf("2 - %d개\n", count);
		// :
		count = 0;
		for (int i = 0; i < m.length; i++) {
			if( m[i] == 9) count++;
		}
		System.out.printf("9 - %d개\n", count);
		*/
		
		// [결과]
		// 0 - 5개
		// 1 - 7개
		// 2 - 30개
		// :
		// 9 - 23개
		

	} // main

} // class







