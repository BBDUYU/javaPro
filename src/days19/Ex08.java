package days19;

import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Osj  
 * @date   2025. 9. 11. 오후 3:41:20
 * @subject 국어점수를 입력받아서 출력하는 코딩 
 * @content 1) getScore 메서드
 * 				- 입력 잘못했을 때 IOException 발생 X
 * 				  사용자가 정의한 예외를 발생시키도록 수정
 */
public class Ex08 {

	public static void main(String[] args) {
		int kor=0;
		try {
			kor=getScore();
			System.out.println("> kor : "+kor);
		} catch (ScoreOutOfBoundException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
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
			throw new ScoreOutOfBoundException(1005,"> 점수입력잘못");
			//throw new RuntimeException("> 점수입력잘못");
		}
		
		//return score;
	}

}

class ScoreOutOfBoundException extends RuntimeException{

	private static final long serialVersionUID = -8500808734962896007L; 
	
	//예외코드번호
	private final int EXCEPTION_CODE;

	public int getEXCEPTION_CODE() {
		return EXCEPTION_CODE;
	}

	

	public ScoreOutOfBoundException(String message) {
		this(1001,message);
	}

	public ScoreOutOfBoundException(int exception_code,String message) {
		super(message);
		this.EXCEPTION_CODE=exception_code;
	}
	
	
	
	
}



