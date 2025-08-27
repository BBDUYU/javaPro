package days08;

public class Ex06 {

	public static void main(String[] args) {
		//피보나치수열
		//1+1+2+3+5+8+13...
		//a b sum
		//	a b sum
		//항의 갯수가 10개가 될때 그 합을 출력
		
		
		/*
		int a=1; //첫 항 
		int b=1; //두번째 항
		int sum=a+b;
		System.out.print(a+"+"+b);
		for(int i=3;i<=10;i++) {
			int c=a+b;
			System.out.print("+"+c);
			sum+=c;
			a=b;
			b=c;
		}
		System.out.printf("=%d",sum);
		*/
		int firstTerm = 1;
	      int secondTerm = 1;
	      int nextTerm ;
	      int sum = firstTerm + secondTerm;
	      System.out.printf("1+1+");
	      int termLength = 2;
	      
	      // for (int i = 2; i <= 9; i++) {
	      //       m[i]= m[i-1]+m[i-2];
	      // }
	      // int [] m = [1][1][2][??][][][][][][]
	                    
	      while(termLength<10) {
	         nextTerm = firstTerm + secondTerm;
	         System.out.printf("%d+", nextTerm);
	         sum += nextTerm;
	         
	         firstTerm = secondTerm;
	         secondTerm = nextTerm;
	         termLength++;
	      } // while
	         System.out.printf("=%d", sum);
		
		
	}

}
