package days24;

import java.util.HashMap;

/**
 * @author Osj  
 * @date   2025. 9. 18. 오후 5:06:38
 * @subject Map 
 * @content 키-값 한쌍으로 데이터를 저장하는 구조
 * 			엔트리(Entry)
 * 			키는 중복 X
 * 
 * 			1. [Hash]Map		신규
 * 			2. [Hash]table	구
 * 				Hash ? 해싱기법을 사용해서 데이터 저장 - 검색 기능이 뛰어남
 * 
 * 				해싱기법 ? 해시함수를 이용해서 데이터를 해시테이블에 저장하고 검색
 * 				해시함수 ? 데이터가 저장되는 곳을 알려주는 함수
 * 						 다량의 데이터 중에 원하는 데이터를 빠르게 검색할 수 있음
 * 			3. TreeMap - 정렬, 검색, 부분 검색 기능이 뛰어남
 * 			4. LinkedHashMap - 순서유지맵
 * 			
 * 			
 */
public class Ex09 {

	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<>();
		// 맵안에 엔트리 추가 : put,putAll
		hm.put("kenik", "이창익");
		hm.put("admin", "관리자");
		hm.put("hong", "홍길동");
		hm.put("hong", "홍길동2");
		hm.put(null, null);
		
		System.out.println(hm);
		
		//엔트리의 키/값 검색
		System.out.println(hm.containsKey("hong"));
		System.out.println(hm.containsValue("관리자"));
		
//		hm.replace("hong", "홍길동2","홍길동");
		hm.replace("hong","홍길동");
		System.out.println(hm);
		
		hm.remove("hong");
		System.out.println(hm);
		
		
		
		
	}

}
