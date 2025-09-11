package days19;

import java.util.Arrays;

/**
 * @author Osj  
 * @date   2025. 9. 11. 오전 11:28:10
 * @subject 
 * @content 
 */
public class Ex03_02 {

	public static void main(String[] args) {
		String [] s = { "kbs", "sbs", "mbc", "jtbc" };
		//오름차순
		System.out.println(Arrays.toString(s));
		//Arrays.sort(s);
		
		//내림차순
		Arrays.sort(s);
		String temp[]=new String[s.length];
		//
		int len=s.length-1;
		for (int i = 0; i <s.length; i++) {
			temp[len-i]=s[i];
		}
		
		System.out.println(Arrays.toString(temp));
		/*
		for (int i = s.length-1; i >= 0; i--) {
			System.out.print(s[i]);
		}
		*/
		
	}

}
