package days29;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * @author Osj  
 * @date   2025. 9. 25. 오전 10:16:57
 * @subject 컬렉션 클래스 + 메서드 중에 함수형 인터페이스를 매개변수
 * @content 
 */
public class Ex03_02 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		//		System.out.println(list);
		/*
		Consumer<Integer> c = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.printf("[%d]",t);
			}
		 *       (1) Runnable   void run()   매개변수X, 리턴값X
		 *       (2) Supplier   T get()      매개변수X, 리턴값O
		 *       (3) Consumer   T accept(T)  매개변수O, 리턴값X
		 *       (4) Function   T apply(T)   매개변수O, 리턴값O
		 *       (5) Predicate  T test(T)    매개변수O, 리턴값(b)
		};
				 - 매개변수가 2개인 함수형 인터페이스
				   앞에 함수형 인터페이스의 이름이 'Bi'로 시작
		 *       (1) BiConsumer
		 *       (2) BiPredicate
		 *       (3) BiFunction
		 *       
		 *       - 매개변수가 2개 초과인 함수형 인터페이스
		 *       @FunctionalInterface
		 *       interface TriFunction<T,U,S,R>{
		 *       	R apply(T t, U u, S s);
		 *       }
		 *       
		 *       - Function 함수형 인터페이스의 특징
		 *          UnaryOperator
		 *       	R (T t)
		 *       - BiFunction 함수형 인터페이스의 특징
		 *       	BinaryOperator
		 *       	R (T t, S s)
		 *       
		 */
		Consumer<Integer> c = (t) ->System.out.printf("[%d]",t);

		list.forEach(null);




	}
}