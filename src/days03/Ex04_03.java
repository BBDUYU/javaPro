package days03;

import java.util.Scanner;

/**
 * @author Osj  
 * @date   2025. 8. 20. 오전 11:43:57
 * @subject 키보드 입력처리 2
 * @content BufferedRead br -> Scanner
 */
public class Ex04_03 {

	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	      
	      String name;
	      int kor,eng,math;
	      
	      System.out.print("  > 이름 국어 영어 수학 입력: ");
	      
	      name=scanner.next();
	      kor=scanner.nextInt();
	      eng=scanner.nextInt();
	      math=scanner.nextInt();
	      
	      System.out.printf("이름: \"%s\"\n"
	            + "  국어: %d\n"
	            + "  영어: %d\n"
	            + "  수학: %d\n" , name, kor, eng, math);
	}

}
