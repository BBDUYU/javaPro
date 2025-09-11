package days19;

import days18.Engine;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 * 내부(INNER) 클래스
		 * 1. 중첩 클래스
		 * 2. 윈도우 애플리케이션 이벤트 처리할 목적으로 자주사용
		 * 		(AWT, Swing)
		 * 3. 사용 빈도는 거의없다 - 개념정도만 익혀두자
		 * 4. 내부 클래스의 종류와 특징
		 * 	- 선언 위치
		 * 		인스턴스 클래스 - 외부 클래스의 필드 위치에 선언
		 * 		정적(static) 클래스 - 외부 클래스의 필드 위치에 선언
		 * 		지역(local) 클래스 - 외부 클래스 메서드 안, 초기화 블럭 안 선언
		 * 		무명 == 익명 클래스
		 * 		 ㄴ 클래스의 선언 + 객체 생성 - 합쳐진 이름없는 클래스
		 * 		 ㄴ 일회용
		 * */
	}

}


class Car{ //외부
	
	//Engine engine;
	static class Engine{//내부
		
	}
}

/*
 *  class Engine{
		
	}
 * */
 
class Outer{ //외부클래스
	//필드 선언 위치	
	int iv=0;	//인스턴스 변수
	static int ic=0; //클래스변수, static변수,정적변수, 공유변수
	
	//인스턴스 클래스
	class InstanceClass{
		//주로 외부 클래스의 인스턴스멤버들과 관련된 작업을 더 용이하기 위한 목적
	}
	// 스태틱 클래스
	static class StaticClass{
		//주로 외부 클래스의 스태틱 멤버들과 관련된 작업을 더 용이하기 위한 목적
	}
	{
		class LocalClass{
			
		}
	}
	
	//메서드
	public void disp() {
		
		//지역변수
		Engine engine;
		//지역클래스
		class LocalClass2{
			//지역변수처럼
			//해당 지역에서만 사용됨
		}
	}
}





















