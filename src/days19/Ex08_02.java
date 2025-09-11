package days19;

import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Osj  
 * @date   2025. 9. 11. 오후 3:41:20
 * @subject 국어점수를 입력받아서 출력하는 코딩 
 * @content 1) getScore 메서드
 */
public class Ex08_02 {

	public static void main(String[] args) {
		int kor=0;
		try {
			kor=getScore();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("> kor : "+kor);
		
		System.out.println(" end ");
	}

	private static int getScore() throws IOException {
		Scanner scanner = new Scanner(System.in);
		int score=0;
		
		System.out.println("> 점수입력 ? ");
		String input = scanner.next();
		
		String regex="^(\\d|[1-9]\\d|100)$";//0~100 정규표현식
		
		if (input.matches(regex)) {
			score=Integer.parseInt(input);
			return score;
		} else {
			//강제예외발생
			//throw문 예외를 강제로 발생시킴 
			throw new IOException("> 점수입력잘못");
			//throw new RuntimeException("> 점수입력잘못");
		}
		
		//return score;
	}

}
