package days24;

import java.util.Stack;

/**
 * @author Osj  
 * @date   2025. 9. 18. 오전 9:01:51
 * @subject  
 * @content 
 */
public class Ex01 {

	public static void main(String[] args) {
		/*
		 * [스택(stack) 큐(queue) 구조]
		 * 1. 스택 구조
		 * 		ㄴ LIFO 자료구조
		 * 			ㄴ push()
		 * 			   pop()
		 * 			
		 * 				peek(), isEmpty(), search()
		 * 
		 * 2. Vector 클래스의 자식클래스
		 * */
		
		Stack s = new Stack();//LIFO
		s.push("이나영");
		s.push("김수진");
		s.push("장소예");
		s.push("이지혜");
		/*
		System.out.println(s.size());
//		String name=(String) s.pop(); //가져오는순간 제거
		String name=(String) s.peek();//가져오기만함
		System.out.println(name);
		System.out.println(s.size());
		*/
		
		// 모든 스택에 있는 요소를 얻어와서 출력
		while (!s.isEmpty()) {
			String name=(String) s.pop();
			System.out.println(name);

		}
		
		
	}

}
