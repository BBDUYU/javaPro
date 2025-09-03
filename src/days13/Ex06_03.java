package days13;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Osj  
 * @date   2025. 9. 3. 오후 4:12:38
 * @subject 검색(Search) 
 * 				항목들의 집합에서 특정 항목을 찾아내는것
 * 				1) 순차검색(Sequence Search)
 * 					n값이 있는 모든 index값을 출력
 * 				2) 이진검색(Binary Search)
 * @content 
 */
public class Ex06_03 {

	   public static void main(String[] args) {

	      int [] m = { 0, 2, 12, 16, 7, 9, 2, 9, 0, 13, 7, 13, 3, 14, 10
	            , 15, 11, 6, 19, 5, 2, 0, 16, 18, 15, 18, 0, 9, 13, 16 };

	      Scanner scanner = new Scanner(System.in);
	      System.out.print("> 배열에서 찾을 정수 입력 ? ");
	      int n = scanner.nextInt();
	      
	      int fromIndex = 0;
	      int index = -1;
	      
	      while ( (index = sequenceSearch(m, n, fromIndex) ) != -1 ) {
	         System.out.println( index);
	         fromIndex = index + 1;
	      }
	      
	      /*
	      int fromIndex = 0;
	      int index = -1;
	      index = sequenceSearch(m, n, fromIndex);
	      if (index == -1) {
	         System.out.println("X");
	      } else {
	         System.out.println( index);
	      }
	      //
	      fromIndex = index + 1;
	      index = sequenceSearch(m, n, fromIndex);
	      if (index == -1) {
	         System.out.println("X");
	      } else {
	         System.out.println( index);
	      }
	      //
	      fromIndex = index + 1;
	      index = sequenceSearch(m, n, fromIndex);
	      if (index == -1) {
	         System.out.println("X");
	      } else {
	         System.out.println( index);
	      }
	      //
	      fromIndex = index + 1;
	      index = sequenceSearch(m, n, fromIndex);
	      if (index == -1) {
	         System.out.println("X");
	      } else {
	         System.out.println( index);
	      }
	      */
	      
	      

	       

	   } // main
	 

	   private static int sequenceSearch(int[] m, int n, int fromIndex ) {
	      int pos=-1;
	      for (int i = fromIndex; i < m.length; i++) {
	         if( n == m[i] )         return i;
	      }
	      return pos;
	   } 
	   
	   private static int sequenceSearch(int[] m, int n ) {
	      int pos=-1;
	      for (int i = 0; i < m.length; i++) {
	         if( n == m[i] )         return i;
	      }
	      return pos;
	   } 
	    

	} // class
