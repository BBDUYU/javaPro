package days30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Osj  
 * @date   2025. 9. 26. 오전 9:38:34
 * @subject 
 * @content 
 */
public class Ex03 {

	public static void main(String[] args) {
		/*
		 * 	자바의 IO
		 * 	 ㄴ 자바의 모든 입출력은 스트림으로 이루어진다
		 * 	
		 *  람다식과 스트림
		 *   ㄴ 많은 수의 데이터 for/iterator 처리
		 *      배열 		  for/foreach 반복문으로 처리
		 *      컬렉션 클래스 iterator, enumerator 처리
		 *      -> 배열 처리 코딩과 컬렉션 클래스 처리 코딩 다르다
		 *      -> 다양한 데이터 소스에 따라 처리코딩이 모두 다름
		 *   	-> 표준화해서 처리
		 *   
		 *   	-> 다양한 데이터소스(배열,컬렉션클래스) -> 스트림 생성
		 *   ㄴ 다양한 데이터 소스(배열, 컬렉션, 파일, DB 등)가
		 *      무엇이던지 간에 스트림으로 생성하면
		 *      같은 방식으로 처리할 수 있다 (표준화)
		 *   ㄴ 스트림으로 생성해도 데이터 소스는 변경되지 않음
		 *   ㄴ 스트림은 일회용이다
		 *   ㄴ 스트림은 내부적으로 반복 처리한다
		 *   ㄴ 스트림은 미리 데이터를 다루는 메서드를 정의해 놓았다
		 *  
		 * */
		
		//1. 배열 -> 스트림
		String strArr[]= {"aaa","bbb","ccc"};
		
		
		//2. 컬렉션 클래스 -> 스트림
		List<String> list=new ArrayList<String>();
		list.add("xxx");
		list.add("yyy");
		list.add("zzz");
		
		Stream<String> s1 = Arrays.stream(strArr);
//		Collectors.
		Stream<String> s2 = list.stream();
		
		s1.sorted().forEach(System.out::println);
		s2.sorted().forEach(System.out::println);
		
		
	}

}
