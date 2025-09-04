package days14;

public class Ex09 {

	public static void main(String[] args) {
		Tv t1=new Tv();
		System.out.println(t1.power);
		t1.power();
		System.out.println(t1.power);
		System.out.println(t1.channel);
		t1.channelUp();
		t1.channelUp();
		t1.channelUp();
		System.out.println(t1.channel);
		t1.power();		
		System.out.println(t1.power);
	} 

}


//클래스의 구성요소 = 필드 + 메서드
//The public type Tv must be defined in its own file
class Tv{ //public class 클래스명 = 클래스명.java
	// 멤버
	// 속성 - 멤버변수 - 필드(field)
	// 필드선언형식
	// 접근지정자 기타제어자 자료형 필드명
	public String color=null; //명시적 초기화
	boolean power=false;
	public int channel=10;
	// 지역변수선언형식
	// 자료형 변수명[=초기값];
	public void power() {
		power=!power;
	}
	public void channelUp() {
		channel++;
	}
	public void channelDown() {
		channel--;
	}
	// 기능 - 멤버함수 - 메서드(method)
}