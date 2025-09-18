package days24;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Osj  
 * @date   2025. 9. 18. 오전 9:14:44
 * @subject  
 * @content 
 */
public class Ex02 {

	public static void main(String[] args) {
		/*
		 * [큐 구조]					[스택 구조]
		 * 	ㄴ FIFO구조				LIFO
		 * 	ㄴ offer(), poll()		push(), pop()
		 * */
		
		Queue q = new LinkedList(); //FIFO
		q.offer("이나영");
		q.offer("김수진");
		q.offer("장소예");
		System.out.println(q.offer("이지혜"));//true
		
		while (!q.isEmpty()) {
			String name=(String) q.poll();
			System.out.println(name);
			
		}
	}

}
