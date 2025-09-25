package days29;

/**
 * @author Osj  
 * @date   2025. 9. 25. 오전 9:03:01
 * @subject 람다식과 스트림 
 * @content 
 */
public class Ex01 {

	public static void main(String[] args) {
		/*
		 * [람다식]
		 * 1. 자바 두번의 큰 변화
		 * 		jdk 1.5 : 제네릭
		 * 		jdk 1.8 : 람다식
		 * 2. 자바 - 객체지향적 프로그래밍 언어 + 함수형 언어
		 * 		= 객체 + 객체 + ...
		 * 		= 클래스 + 클래스 + ...
		 * 			ㄴ 멤버함수 == 메서드
		 * 3. 함수형 언어 ? 독립적인 함수
		 * 4. 람다식 ? 메서드를 하나의 식으로 표현한 것
		 * 		int max(int a,int b){
		 * 			return a>b?a:b;
		 * 		}
		 * 		
		 * 		(a,b)->a>b?a:b
		 * 
		 * 		규칙) 리턴자료형 삭제, 메서드명 삭제
		 * 			 매개변수()의 자료형 삭제
		 * 		규칙) 메서드 원형 -> 몸체 {}
		 * 
		 * 		(a,b)->{
		 * 					return a>b?a:b;
		 * 				}
		 * 		규칙) 반환값이 있는 경우에 return문 대신 수식을 대신할 수 있다
		 * 		(a,b)->{
		 * 					
		 * 					return a>b?a:b;
		 * 				}
		 * 		규칙) return문 외에 다른 명령코딩이 없는경우 {}생략가능
		 * 		(a,b)-> return a>b?a:b;
		 * 		(a,b)-> a>b?a:b;
		 * 
		 * 		규칙) 매개변수의 타입을 유추할 수 있는 경우 생략가능
		 * 		(int a, int b) -> a>b?a:b;
		 * 			하나만 생략할 수는 없다
		 * 
		 * 		규칙) 
		 * 
		 * 
		 * */
	}

}
