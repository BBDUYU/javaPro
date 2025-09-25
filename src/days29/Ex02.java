package days29;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 * 함수형 인터페이스
		 * 	ㄴ 람다식 == 메서드를 식으로 나타낸것
		 *  ㄴ 자바에서 하나의 메서드는 반드시 클래스 내에 선언됨
		 *  ㄴ (a,b) -> a>b?a:b 람다식은 어떤 클래스에 선언 ?
		 *  					->	익명 클래스
		 *  클래스 선언 + 객체를 생성
		 *  new 부모클래스명(){
		 *  	오버라이딩된 메서드만 구현
		 *  }
		 *  
		 *  new 인터페이스명{
		 *  	오버라이딩된 메서드만 구현
		 *  }
		 *  
		 *  ㄴ 타입? 변수 = 람다식 ;
		 *  
		 *  예) 인터페이스 선언
		 *  1) MyFunction 인터페이스는 하나의 메서드만 선언된 인터페이스
		 *  2) 람다식으로 다룰 수 있도록
		 *  3) 정리 : 람다식을 다룰 수 있는 1개의 메서드 만을 가진
		 *  		 인터페이스를 '함수형 인터페이스'
		 *  
		 *  @FunctionalInterface
		 *  interface MyFunction{
		 *  	//public abstract
		 *  	int max(int a, int b);
		 *  	//static, default 메서드를 선언 할 수 있음
		 *  }
		 *  
		 *  int a=10,b=20;
		 *  int max;
		 *  //익명 클래스
		 *  //MyFunction 인터페이스 -> 익명 객체
		 *  MyFunction mf=new MyFunction(){
		 *  	int max(int a, int b){
		 *  	return a>b?a:b;
		 *  	}
		 *  }; 
		 *  
		 *  람다식으로 수정
		 *  MyFunction mf=(a,b)=>a>b?a:b;
		 *  
		 *  
		 *  max= mf.max(a,b);
		 *  
		 *  
		 * */
	}

}
