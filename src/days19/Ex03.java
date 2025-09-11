package days19;

/**
 * @author Osj  
 * @date   2025. 9. 11. 오전 11:05:57
 * @subject 익명클래스 Annonymous 
 * @content 	ㄴ 이름이 없는 클래스
 * 				ㄴ 일회용
 * 				ㄴ 클래스 선언 + 객체 생성 일체형
 * 				ㄴ 선언 형식
 * 					- new 부모클래스(){
 * 						필드,메서드 선언 X
 * 						부모의 메서드만을 오버라이딩
 * 					  }
 * 					- new 인터페이스(){
 * 						필드,메서드 선언 X
 * 						인터페이스의 메서드만 오버라이딩
 * 				 	  }
 */
public class Ex03 {

	public static void main(String[] args) { 
		/*
		Engine engine = new Engine(){
			

			@Override
			public void moreFuel(int fuel) {
				System.out.println("> 익명 클래스로 구현1");
			}

			@Override
			public void lessFuel(int fuel) {
				System.out.println("> 익명 클래스로 구현2");

			}

			@Override
			public void stop() {
				System.out.println("> 익명 클래스로 구현3");

			}
		};
		Car myCar=new Car(new Engine(){

			@Override
			public void moreFuel(int fuel) {
				System.out.println("> 익명 클래스로 구현1");
			}

			@Override
			public void lessFuel(int fuel) {
				System.out.println("> 익명 클래스로 구현2");

			}

			@Override
			public void stop() {
				System.out.println("> 익명 클래스로 구현3");

			}
		};
		//10년
		myCar.setEngine(new Engine() {

			@Override
			public void moreFuel(int fuel) {
				// TODO Auto-generated method stub

			}

			@Override
			public void lessFuel(int fuel) {
				// TODO Auto-generated method stub

			}

			@Override
			public void stop() {
				// TODO Auto-generated method stub

			}

		});

		System.out.println("end");
	}

}

interface Engine{
	void moreFuel(int fuel) ;	
	void lessFuel(int fuel);	
	void stop() ;
}

/*
class H_Engine implements Engine{
	int speed;

	@Override
	public void moreFuel(int fuel) {
		this.speed += fuel * 0.05;
	}

	@Override
	public void lessFuel(int fuel) {
		this.speed += fuel * 0.05;
	}

	@Override
	public void stop() {
		this.speed = 0;
	}
}
class S_Engine implements Engine{
	int speed;

	@Override
	public void moreFuel(int fuel) {
		this.speed += fuel * 0.12;
	}

	@Override
	public void lessFuel(int fuel) {
		this.speed += fuel * 0.12;
	}

	@Override
	public void stop() {
		this.speed = 0;
	}
}
 */
		/*
class Car{
	// 필드
	String name;
	String gearType;
	int door;
	// DI( 의존성 주입 )
	private Engine engine = null;

	// 생성자
	Car(){		
	}

	public Car(Engine engine) {
		this.engine = engine;
	}

	// Getter, Setter	
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	// 메서드 
	void speedUp( int fuel ) {
		this.engine.moreFuel(fuel);
	}
	void speedDown(int fule) {
		this.engine.lessFuel(fule);
	}
	void stop() {
		this.engine.stop();
	}
*/

	}}







