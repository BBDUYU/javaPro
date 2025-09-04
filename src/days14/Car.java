package days14;

// 신형 자동차 설계
//클래스선언
public class Car {

	//멤버
	//속성=멤버변수
	String name; //자동차 이름
	int speed;//속도
	int wheelCount;//바퀴수
	//기능=멤버함수=메서드
	public void dispCarInfo() {
		System.out.printf("이름:%s, 속도:%d",name,speed);
	}
}
