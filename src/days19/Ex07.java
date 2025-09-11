package days19;

import java.io.IOException;

/**
 * @author Osj  
 * @date   2025. 9. 11. 오후 3:21:03
 * @subject  
 * @content 
 * 			1. unchecked 예외
 * 				ㄴ 컴파일러가 예외처리를 체크를 하지 않음
 * 				ㄴ RuntimeException 및 자식예외클래스
 * 			2. checked 예외
 * 				ㄴ 컴파일러가 예외처리를 체크함 
 * 				ㄴ RuntimeException를 제외한 모든 예외클래스
 * 				   IOException
 * 			
 * 		
 */
public class Ex07 {

	public static void main(String[] args) {
		//Unhandled exception type IOException
		int b;
		try {
			b = System.in.read();
			System.out.println(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
