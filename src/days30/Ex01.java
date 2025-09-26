package days30;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Osj  
 * @date   2025. 9. 26. 오전 9:03:02
 * @subject Function 합성과 Predicate의 결합 
 * @content 			  boolean 1 조건
 * 		
 * 			andThen()		and(), or(), negate(), isEquals()	
 * 			compose()
 * 			identity()
 * 	
 * 			함수형 인터페이스	 -> 람다식 표현
 * 				1개의 추상 메서드	오버라이딩 타입 유추
 * 				디폴트, static 메서드의 정의
 */
public class Ex01 {

	public static void main(String[] args) {
		/* [1] 합성
		//f String -> 16진수 Integer(int) 변환해서 반환하는 람다식
		Function<String, Integer> f = (t) -> Integer.parseInt(t,16); 
		//g Integer(int) -> 2진수 형식의 문자열로 변환해서 반환하는 람다식
		Function<Integer, String> g = (t) -> Integer.toBinaryString(t); 
		//	f + 합성 + g
		// andThen() 합성 : 문자열 FF -> 16진수 숫자로 변화(f) -> Integer -> 2진수 문자열 (g)
		//							 f         g
//		Function<String, String> h = f.andThen(g);
//		System.out.println(h.apply("FF"));
		
		//								g       f
		Function<Integer, Integer> h = f.compose(g);
		System.out.println(h.apply(2));
		*/
		
		// [2] 조건 결합
		/*
		Predicate<Integer> p =t -> t<100;	//100보다작나? 조건식 
		Predicate<Integer> q =t -> t<200;   //200보다작나? 조건식
		Predicate<Integer> r =t -> t%2==0;  //짝수 조건식
		Predicate<Integer> notP = p.negate();  //부정
		// 100<=t<200
		Predicate<Integer> all= notP.and(q); // 조건 결합 and() 
		System.out.println(all.test(150));//t
		System.out.println(all.test(250));//f
		*/
		
		//[3]
		String s1="abc";
		String s2="abc";
		Predicate.isEqual(s1);
		
		
	}

}
