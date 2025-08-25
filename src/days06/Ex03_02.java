package days06;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Ex03_02 {

	public static void main(String[] args) {
		/*
		 * [문제]
		 * 두 정수 n,m 을 입력받아
		 * 두 정수 사이의 합을 출력
		 * 입력 형식)
		 * > n, m 입력 ? 2 5
		 * 출력 형식)
		 * 2+3+4+5=14
		 * */
		
		// [2]
	      /*
	      if (n > m) {
	         int temp = n;
	         n = m;
	         m = temp;
	      }
	      for (int i = n; i <= m; i++) {
	         System.out.printf("%d+", i);
	         sum += i;
	      }
	      */
	      /* [1]
	      if (n > m) {
	         for (int i = n; i >= m; i--) {
	            System.out.printf("%d+", i);
	            sum += i;
	         }
	      } else {
	         for (int i = n; i <= m; i++) {
	            System.out.printf("%d+", i);
	            sum += i;
	         }
	      }
	      */
		
		int n,m;
		Scanner scanner=new Scanner(System.in);
		System.out.print("> n, m 입력 ? ");
		n=scanner.nextInt();
		m=scanner.nextInt();
		
		
		//큰값에서 작은값 계산시 오류 -> Math.min, Math.max를 이용해 최소값,최대값 고정
		int start=Math.min(n, m); 
		int end=Math.max(n, m);
		
		int sum=IntStream.rangeClosed(start, end).sum();
		for(;start<=end;start++) {
			System.out.printf("%d+",start);
		}
		System.out.printf("\b=%d",sum);
	}

}
