package days24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Ex04 {

	public static void main(String[] args) {
//		HashSet<Integer> lotto = new HashSet<Integer>(6); //제네릭은 기본형 사용불가 int -> Integer
		
		//기본적인 set계열은 순서유지X 중복허용X
		//순서가유지되는 set계열 클래스 - LinkedHashSet 컬렉션 클래스
		HashSet<Integer> lotto = new HashSet<Integer>(6); //제네릭은 기본형 사용불가 int -> Integer
		lotto.add(42);
		lotto.add(36);
		lotto.add(21);
		lotto.add(38);
		lotto.add(6);
		lotto.add(26);

//		ArrayList<Integer> lotto2=new ArrayList<Integer>(lotto);
//		Arrays.sort(null);
//		Collections.sort(lotto); list계열이 들어가야함 
		List<Integer> x = new ArrayList<Integer>(lotto);
		Collections.sort(x);
		
		Iterator<Integer> ir =x.iterator();
		while (ir.hasNext()) {
			int n=ir.next();
			System.out.printf("[%d]",n);
		}
	}

}
