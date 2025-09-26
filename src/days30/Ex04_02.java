package days30;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Osj  
 * @date   2025. 9. 26. 오전 10:39:57
 * @subject 다양한 데이터 소스로부터 스트림 생성해서 중간연산/최종연산 처리예제
 * @content 
 */
public class Ex04_02 {

	public static void main(String[] args) {
		/*
		 * Stream<Integer>와 IntStream의 차이점
		 * Stream<T>
		 * 
		 * Stream<Integer> 형태의 스트림은 형변환 작업을 해야함
		 * -> 비효율 X -> 기본형을 다루는 스트림은 IntStream,
		 * LongStream, DoubleStream이 제공됨
		 * */
		int [] iArr = {34, 64, 22, 54, 11, 9 , 89, 13, 22, 34, 100};
		/* [1]
		// 첫번째 방법 : Arrays.stream(iArr);
		// 두번째 방법 : <int[]> s1=Stream.of(iArr);
		IntStream s1=Arrays.stream(iArr);
		//int -> Integer 스트림 변환
		Stream<Integer> s2=s1.boxed();
		*/
		
		/*
		// [2] int[]->List변환
		List<Integer> list=
				Arrays.stream(iArr).boxed().collect(Collectors.toList());
		*/
		
		// [3] 
		IntStream
		.of(iArr)
		.filter((v)-> v >=50)
		.sorted()
		.forEach(System.out::println);
		
		
	}

}
