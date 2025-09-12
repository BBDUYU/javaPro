package days20;

import days15.Point;
import days16.Person;

public class Ex02 {

	public static void main(String[] args) {
		Value v1=new Value();
		Value v2=new Value();
		Value v3=v2;
		//1.hashCode() 객체 자신의 고유한 코드값
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		System.out.println(v3.hashCode());


		//    ==     -> 값을 비교
		//2.equals() -> 같은 객체의 주소를 비교한다 - 같은 인스턴스를 참조
		// ex) v1, v2 처럼 인스턴스는 다르지만 age가 같으면 같은 객체라고 처리 하려면
		//
		System.out.println(v1.equals(v2)); // f
		System.out.println(v2.equals(v3)); // t

		//Person p=new Person();
		//v1.equals(p);
		
		Point p1=new Point(10,20);
		Point p2=new Point(10,20);
		System.out.println(p1.equals(p2));
		//days15 Point클래스 equals() 오버라이딩해서 x,y좌표가 같으면 같다고 출력
		
		//3. Object.toString() : v1 객체의 정보를 문자열로 반환하는 메서드
		//						 패키지명.클래스명@16진수코드
		//							fullName
		System.out.println(v1.toString());
		System.out.println(v1);
		//Point 클래스의 toString() 오버라이딩 x,y 좌표를 출력하도록 재정의
		System.out.println(p1.toString());
		System.out.println(p1);
		
		
		//4. getClass() : 객체의 클래스 정보를 Class 타입으로 반환하는 메서드
		Class classInfo=p1.getClass();
		String fullName=classInfo.getName();
		System.out.println(fullName);

	}

}


class Value{
	int age;

	public Value() {}
	public Value(int age) {
		this.age=age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Value && obj != null) {
			Value v =(Value)obj;
			return v.age==this.age;
		}
		return super.equals(obj);
	}
	
	
}















