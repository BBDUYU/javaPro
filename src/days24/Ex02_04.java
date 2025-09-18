package days24;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author Osj  
 * @date   2025. 9. 18. 오전 10:04:59
 * @subject 큐 구조 - Priority[Queue] 컬렉션 클래스
 * 					ㄴ FIFO X
 * 					ㄴ 저장된 순서에 상관없이 우선 순위가 높은것부터 꺼내는 구조
 * 					ㄴ null 저장할 수 없다 
 * @content 
 */
public class Ex02_04 {
	public static void main(String[] args) {
		Queue q=new PriorityQueue();
		
		q.offer(3);
		q.offer(5);
		q.offer(2);
		q.offer(4);
		q.offer(1);
		System.out.println(q);
		//숫자인 경우 작은숫자가 우선순위가 높다
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}
}
