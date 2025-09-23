package days27;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Osj  
 * @date   2025. 9. 23. 오전 10:26:36
 * @subject 
 * @content 
 */
public class Ex01_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int bars[]=new int[n];
		for (int i = 0; i < bars.length; i++) {
			bars[i]=scanner.nextInt();
			Arrays.sort(bars); 
			System.out.println(Arrays.toString(bars));
			
			System.out.println(n);
			int value = bars[0];
			for (int j = 1; j < bars.length; j++) {
				if (value!=bars[i]) {
					System.out.println(n-i);
					value=bars[i]; 
				}
			}
			
		}
	}

}
