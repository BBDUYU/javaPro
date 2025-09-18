package days24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Osj  
 * @date   2025. 9. 18. 오후 2:36:38
 * @subject 두 집합 선언
 * @content 합집합, 교집합, 차집합
 */
public class Ex07 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {4,5,6,7,8};
		
		//int a[] -> ArrayList로 변환
		ArrayList<Integer> alist = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			alist.add(a[i]);
		}
		
		//int b[] -> ArrayList로 변환
		List<Integer> list= Arrays.stream(b)	//IntStream
				.boxed()	//Stream<Integer>
				.collect(Collectors.toList());
	
		ArrayList<Integer> blist=new ArrayList<Integer>(list);
		
		//합집합
		HashSet<Integer> union=new HashSet<>();
		union.addAll(alist);
		union.addAll(blist);
		System.out.println(union);
		
		//a-b 차집합
		ArrayList<Integer> alistClone=(ArrayList<Integer>) alist.clone();

		
		alistClone.removeAll(blist);
	
		System.out.println(blist);
		alistClone=(ArrayList<Integer>) alist.clone();
		alistClone.retainAll(blist); //중복되는 요소를 유지 - 교집합
		System.out.println(alistClone); //교집합
		
		/* 컬렉션을 사용하지않고 구현한다면


		int numberOfDuplicate=0;
		for (int i = 0; i < b.length; i++) {
			int m=a[i];
			for (int j = 0; j < b.length; j++) {
				int n=b[j];
				if(a[i]==b[j]) {
					numberOfDuplicate++;
				}
			}
			
		}
		System.out.println(numberOfDuplicate);
//		int abunion[]=new int[a.length+b.length-numberOfDuplicate];
//		Arrays.copyOf();
//		System.arraycopy();
		int size=a.length+b.length-numberOfDuplicate;
		int abunion[]=Arrays.copyOf(a, size);
		System.out.println(Arrays.toString(abunion));
		for (int i = 0; i < abunion.length; i++) {
			if() {
				
			}
		}
		*/
		
		/*
		HashSet<Integer> union = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			union.add(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			union.add(b[i]);
		}
		System.out.println(union.size());
		System.out.println(union);
		 */
		
		
		
	}

}
