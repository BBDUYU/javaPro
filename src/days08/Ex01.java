package days08;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author Osj  
 * @date   2025. 8. 27. 오전 9:04:37
 * @subject 
 * @content 
 */
public class Ex01 {

	public static void main(String[] args) {
		//순서도

		/*
		 * [1]
		int index=0;
		int n=(int)(Math.random()*100)+1;
		int m[]= new int[10];
		m[index++]=n;
		boolean flag=false;
		while (index<m.length) {
			flag=false;
			n=(int)(Math.random()*100)+1;
			for(int i=0;i<index;i++) {
				if(m[i]==n) {
					flag=true;
					break;
				}
			}
			if(!flag) m[index++]=n;
		}
		System.out.println(Arrays.toString(m));
		 */
		//			랜덤			1~100		중복없이	10개			배열로
		int m[]=new Random().ints(1,101).distinct().limit(10).toArray();//toArray() 배열
		System.out.println(Arrays.toString(m));

		//1. 가장 큰 값, 작은 값을 찾아서 출력

		
		//stream max,min
		/*
		System.out.println(Arrays.stream(m).max().getAsInt());
		System.out.println(Arrays.stream(m).min().getAsInt());
		*/
		
		//OptionalInt max=IntStream.of(m).max();
		//System.out.println(max);
		/*
		int max=m[0];
		int min=m[0];
		int max_index=0;
		int min_index=0;
		for(int i=1;i<m.length;i++) {
			if(max<m[i]) {
				max=m[i];
				max_index=i;
			}
			else if(min>m[i]) {
				min=m[i];
				min_index=i;
			}
		}
		System.out.printf("max : %d[%d] min : %d[%d]",max,max_index,min,min_index);
		*/


	}

	/*
	public static void main(String[] args) {
		//순서도
		int m[]= new int[10];
		Random rnd=(Random) new Random().ints(1,101).distinct().limit(10);


	}
	 */
}
