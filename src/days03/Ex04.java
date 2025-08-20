package days03;

import java.util.Scanner;

/**
 * @author Osj  
 * @date   2025. 8. 20. 오전 11:43:57
 * @subject 키보드 입력처리 2
 * @content BufferedRead br -> Scanner
 */
public class Ex04 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name=scanner.nextLine();
		System.out.printf("이름 : %s\n",name);
	}

}
