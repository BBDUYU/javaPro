package days19;

import java.io.IOException;

/**
 * @author Osj  
 * @date   2025. 9. 11. 오후 2:48:08
 * @subject try catch finally 
 * @content 
 */
public class Ex06 {

	public static void main(String[] args) {
		System.out.println("1. DB - open");
		
		try {
			//crud
			System.out.println("2. select");
			System.out.println("3. insert");
			System.out.println("4. update"+(10/0));
			System.out.println("5. delete");
		} catch (ArithmeticException e) {
			System.out.println("6. ArithmeticException");
		}catch (Exception e) {
			System.out.println("7. Exception");
		}finally {
			System.out.println("8. Fianlly");
			System.out.println("10. DB - close");

			//예외발생 유무에 상관없이 무조건 실행
		}
		
		
		System.out.println(" end ");
		
	}

}
