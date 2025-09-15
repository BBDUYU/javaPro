package days21;

import java.util.Arrays;

/**
 * @author Osj  
 * @date   2025. 9. 15. 오전 11:48:43
 * @subject java.util패키지 
 * @content 	ㄴ 자주사용되는 유용한 유틸리티
 * 					Arrays
 * 					Random
 */
public class EX06 {

	public static void main(String[] args) {
		int m[]= {3,5,2,4,1,15};
		System.out.println(Arrays.toString(m));
		Arrays.sort(m);
		System.out.println(Arrays.toString(m));
		int index=Arrays.binarySearch(m, 4);
		//이진검색 필수 조건 - 정렬
		System.out.println(index);
		
		//Arrays.asList(null) int[] -> List 변환
		//배열과 배열을 비교하는 메서드
//		Arrays.compare(null, null)
		
		//배열을 지정한 값으로 채우는 메서드
//		Arrays.fill(m,-1);
//		System.out.println(Arrays.toString(m));
		
		
		
	}

}
