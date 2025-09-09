package days17;

/**
 * @author Osj  
 * @date   2025. 9. 9. 오전 9:36:41
 * @subject [클래스들간의 2가지 관계] 
 * @content 1. has-a 관계 (소속 관계)
 * 				ex) 자동차 클래스		Car
 * 					 ㄴ 엔진 클래스		Engine
 * 					결합력이 강한 코딩은 좋지않음
 * 					1) DI
 * 					2) 인터페이스 사용
 * 			2. is-a 관계  (상속 관계)
 * 
 */
public class Ex02 {

	public static void main(String[] args) {
		
		Engine engine=new Engine();
		Car myCar=new Car();
		myCar.setEngine(engine);
		//의존성 주입(DI)
		//1) 생성자를 통한 의존성 주입
		//2) setter를 통한 의존성 주입
		
		myCar.speedUp(20);
		System.out.println(myCar.getEngine().speed);
		
		Engine 중고engine=new Engine();
		myCar.setEngine(중고engine);
		
		System.out.println();
	}

}
