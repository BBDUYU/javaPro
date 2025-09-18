package days24;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Osj  
 * @date   2025. 9. 18. 오전 9:25:54
 * @subject 
 * @content 
 */
public class Ex02_02 {

	public static void main(String[] args) {
		/*
		Queue 인터페이스 <-상속- Deque 인터페이스
		- Double Enabled Queue
		- 양쪽으로 입출력이 가능한 Queue
		*/
		Deque q= new LinkedList();
		q.offerFirst("A");
		q.offerFirst("B");
		q.offerLast("C");
		
		System.out.println(q);
		System.out.println(q.pollFirst());
		System.out.println(q.pollLast());
	}

}
