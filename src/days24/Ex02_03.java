package days24;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author Osj  
 * @date   2025. 9. 18. 오전 9:33:03
 * @subject 
 * @content 스택활용 - 수식계산, 수식괄호검사, 
 * 			큐 활용 - 최근사용문서, 인쇄작업대기목록 
 */
public class Ex02_03 {

	public static void main(String[] args) {
		//수식괄호검사
		if(args.length != 1) {
			System.out.println("Usage : java ExpValidCheck \"EXPRESSION\"");
			System.out.println("Example : java ExpValidCheck \"((2+3)*1)+3\"");
			System.exit(0);
		}
		Stack st = new Stack();
		//수식 검사할 문자열
		String expression = args[0];
		System.out.println("expression : "+expression);
		
		char exprArr[] = expression.toCharArray();
		try {
			for (int i = 0; i < exprArr.length; i++) {
				char ch = exprArr[i];
				if (ch == '(') {
					st.push(ch);
				}else if(ch==')') {
					st.pop();
				}
				if(st.isEmpty()) {
					System.out.println("괄호 일치한다");
				}else {
					System.out.println("괄호가 일치하지 않다");
				}
			}
		} catch (EmptyStackException e) {
			System.out.println("괄호 일치하지 않다");
		} catch (Exception e) {			
			System.out.println("괄호 일치하지 않다");
		}
		
		System.out.println("end");
	}

}
