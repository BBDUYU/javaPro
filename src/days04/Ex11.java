package days04;

import java.util.Scanner;

/**
 * @author Osj  
 * @date   2025. 8. 21. 오후 3:45:50
 * @subject [제어문] 
 * @content  ㄴ 정의 : 프로그램의 실행순서를 제어하는문
 * 				ㄴ종류
 * 					-조건문 : if
 * 					-분기문 : switch
 * 					-반복문 : for, foreach(확장for문)
 * 					-조건반복문 : while, do~while문
 * 					-기타 : break, continue
 * 					
 */
public class Ex11 {

	public static void main(String[] args) {
		//정수를 입력받아
		// 짝수 -> "짝수" 출력
		// 홀수 -> "홀수" 출력
		int n;
		
		@SuppressWarnings("resource")//컴파일러 경고를 억제하기위해 사용
		Scanner scanner=new Scanner(System.in);

		System.out.print("정수 입력 : ");
		n=scanner.nextInt();

		if (n%2==0) {
			System.out.println("짝수(Even Number)");
		}else {
			System.out.println("홀수(Odd Number)");
		}
		

		System.out.printf("n=%d\n",n);

		

	}

}
