package days03;

import java.util.Scanner;

/**
 * @author Osj  
 * @date   2025. 8. 20. 오전 11:43:57
 * @subject 키보드 입력처리 2
 * @content BufferedRead br -> Scanner
 */
public class Ex04_02 {

	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	      
	      System.out.print("  > 이름 입력: ");
	      String name = scanner.nextLine();
	      
	      System.out.print("  > 국어 입력: ");
	      int kor = Integer.parseInt(scanner.nextLine());
	      
	      System.out.print("  > 영어 입력: ");
	      int eng = Integer.parseInt(scanner.nextLine());
	      
	      System.out.print("  > 수학 입력: ");
	      int mat = Integer.parseInt(scanner.nextLine());
	      
	      System.out.printf("이름: \"%s\"\n"
	            + "  국어: %d\n"
	            + "  영어: %d\n"
	            + "  수학: %d\n" , name, kor, eng, mat);
	}

}
