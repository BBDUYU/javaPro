package days08;

import java.util.Scanner;

/**
 * @author Osj  
 * @date   2025. 8. 27. 오후 4:12:54
 * @subject 두 정수를 입력받아서 합을 출력하는 코딩 
 * @content 
 */
public class Ex08 {

	public static void main(String[] args) {
		int a,b,result=0;
		Scanner scanner=new Scanner(System.in);
		System.out.printf("> a b input : ");
		a=scanner.nextInt();
		b=scanner.nextInt();
		
		result= sum(a,b);
		
		System.out.printf("%d + %d = %d",a,b,result);
		
	}
	
	public static int sum(int a, int b) {
		int result=a+b;
		return result;
	}
	
}
