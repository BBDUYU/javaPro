package days19;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Osj  
 * @date   2025. 9. 11. 오전 11:28:10
 * @subject 
 * @content 
 */
public class Ex03_03 {

	public static void main(String[] args) {
		String [] s = { "kbs", "sbs", "mbc", "jtbc" };
		System.out.println(Arrays.toString(s));	
		//내림차순
		/* 1
		Comparator<String>c=new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);//
			}
		};
		 */
		/*2 
		Arrays.sort(s, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);// o1 - o2 = 양수,0,음수
			}
		});
		//
		StringCompartor c = new StringCompartor();
		Arrays.sort(s,c);
		 */

		//3
		//Arrays.sort(s,Collections.reverseOrder());

		//4
		/*
		Arrays.sort(s, ( o1,  o2)-> {
			return o1.compareTo(o2);
		}
				);
				*/
		//5 -> 람다
		Arrays.sort(s,(o1, o2)->o1.compareTo(o2));
				
		System.out.println(Arrays.toString(s));


	}

}


class StringCompartor implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);// o1 - o2 = 양수,0,음수
	}
}












