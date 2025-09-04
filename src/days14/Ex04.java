package days14;

public class Ex04 {

	public static void main(String[] args) {
		
		//변수, 지역변수, 참조변수, 배열명
		int m[]=new int[5];
		
		//변수, 지역변수, 참조변수
		//객체 : Car클래스로 선언된 참조 변수
		Car myCar=new Car();
		//			ㄴ 인스턴스화
		//클래스 : 객체 설계도
		//객체 : 클래스로 선언된 참조변수
		//인스턴스 : new연산자에 의해 실제객체가 생성된것
		//인스턴스화 : new Car();
		
		//myCar의 이름설정
		//객체명.필드명
		
		//myCar 객체의 필드값 설정
		myCar.name="k9";
		myCar.speed=100;
		myCar.wheelCount=4;
		System.out.println(myCar.name);
		System.out.println(myCar.speed);
		System.out.println(myCar.wheelCount);
	}

}
