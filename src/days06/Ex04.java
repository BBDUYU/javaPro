package days06;

import java.util.Scanner;

/**
 * @author osj  
 * @date 2025. 8. 25. 오후 4:17:37 
 * @subject   
 * @content 
 */ 
public class Ex04 {

   public static void main(String[] args) {
      // 두 정수 n, m 입력받아서 
      // 두 정수 사이의 홀수 의 합을 출력.
      // ( while 문 사용 )
      
      Scanner scanner = new Scanner(System.in);
      int n, m, sum = 0; 
      System.out.print("> n, m 입력 ? ");
      n = scanner.nextInt();  
      m = scanner.nextInt(); 
      
      int start = Math.min(n, m);
      int end = Math.max(n, m);
      
      int i = start%2==0?start+1: start; // n 1, m  10작은 값 
      while( i<=end ) {
         //if( i%2 == 1) {
            System.out.printf("%d+", i);
            sum += i;
         //}
         i+=2;
      }
      
      System.out.printf("\b=%d\n", sum);

   } // main

} // class





