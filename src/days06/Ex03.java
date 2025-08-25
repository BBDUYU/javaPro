package days06;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex03 {

	public static void main(String[] args) {
		//1~10 정수의 합 출력
		//		int sum=0;
		//		for(int i=1;i<=10;i++) {
		//			System.out.printf("%d+",i);
		//			sum+=i;
		//		}
		//		System.out.printf("\b=%d",sum);

		/*	람다와 스트림
		 * int sum=IntStream.rangeClosed(1,10).sum();
		 * System.out.print(sum);
		 * 
		 * 
		 * 1~10 홀수의 합
		 * 
		 * */
		//		int sum=IntStream
		//				.rangeClosed(1,10)//1~10
		//				.filter(n->n%2!=0)//거름망
		//				.sum();
		//		System.out.print(sum);

		//1~n 정수의 합 출력
		int sum=0;
		for(int i=1;i<=10;i++) {
			System.out.printf("%d+",i);
			sum+=i;
		}
		System.out.printf("\b=%d",sum);
	}

}
