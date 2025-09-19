package days25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * @author Osj  
 * @date   2025. 9. 19. 오후 3:49:22
 * @subject Arrays 클래스 - 배열을 사용하기 쉽도록 기능이 구현된 클래스
 * 			sort, toString, fill, binarySearch
 * 
 * 		
 * 			Collections 클래스 - 컬렉션 클래스를 사용하기 쉽도록 기능이 구현된 클래스
 * @content 
 */
public class Ex09 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();

		System.out.println(list);
		/* [1]
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		 */
		//[2]
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list);

		//[3] 전광판
		/*
		while (true) {
			Collections.rotate(list, 1);
			System.out.println(list);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		 */
		//0번째 2번째 교환
		/*
		Collections.swap(list, 0, 2);
		System.out.println(list);
		 */

		// shuffle
		/*
		Random rnd = new Random();
		int idx1 = 0, idx2;
		for (int i = 0; i < 10; i++) {			 
			idx2 = rnd.nextInt(list.size()-1)+1; // 0<=   <10			
			int temp = list.get(idx1);
			list.set(0,list.get(idx2));
			list.set(idx2,temp);
		}
		System.out.println(list);
*/
		Collections.shuffle(list);
		System.out.println(list);
		
		//오름차순 정렬
		Collections.sort(list);
		System.out.println(list);
		//내림차순 정렬 - Collections.reverseOrder() -> Comparator 반환
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
//		list.indexOf(30);
		Collections.sort(list); //정렬 필수
		int index = Collections.binarySearch(list, 4);
		System.out.println(index);
		
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		Collections.fill(list, 0);
		System.out.println(list);

		Collections.replaceAll(list,0, -1);
		System.out.println(list);
		
		//컬렉션 클래스를 사용하기 쉽도록 기능이 구현된 클래스
		//Collections
		
		
	}
	

}
