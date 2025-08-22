package days05;

import java.util.Scanner;

/**
 * @author Osj  
 * @date   2025. 8. 22. 오전 10:11:22
 * @subject 제어문 
 * @content 
 * 			
 * 			1) 조건문 : if, if else
 * 			2) 분기문 : switch
 */
public class Ex01 {

	public static void main(String[] args) {
		
		int n;
		
		@SuppressWarnings("resource")//컴파일러 경고를 억제하기위해 사용
		Scanner scanner=new Scanner(System.in);

		System.out.print("정수 입력 : ");
		n=scanner.nextInt();
		String result;
		
		//jdk11
		switch (n%2) {//key -- 주어진변수, 수식
		case 0: //변수 사용불가 | 상수 사용가능
			result="짝수";
			break;

		default:
			result="홀수";
			break;
		}
		System.out.printf("%d는 %s",n,result);
		
		//jdk14 이상
//		result = switch (n%2) {
//	    	case 0 -> "짝수";
//	    	default -> "알 수 없는 요일";
//		};
	}

}
