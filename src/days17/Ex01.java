package days17;

/**
 * @author Osj  
 * @date   2025. 9. 9. 오전 9:02:21
 * @subject [변수의 초기화] 
 * @content 	1. 변수
 * 				2. 변수종료3가지
 * 				3. 변수초기화 - 변수선언 + 처음으로 값을 할당
 * 				4. 초기화 방법
 * 					- 명시적 초기화
 * 					- 
 */
public class Ex01 {

	public static void main(String[] args) {
		//초기화 순서
		//명시적초기화 -> 인스턴스초기화 -> 생성자 초기화
		//클래스초기화블럭
		System.out.println(Member.rate);
		Member m1=new Member();
		//System.out.println(m1.name);
		Member m2=new Member();

		Member m3=new Member();
		System.out.println("end");

	}

}

class Member{
	
	//필드
	String name="홍길동";
	int age=20;
	int count;
	int serialNumber;
	static double rate=0.04;
	
	//인스턴스 초기화 블럭
	//생성자가 오버로딩되어 있을때
	{
		System.out.println(">인스턴스 초기화블럭");
	}
	
	static{ //클래스 초기화블럭
			//일괄적으로 클래스 변수들을 초기화 하기위한 목적
		rate=0.07;
		System.out.println(">클래스 초기화블럭");
	}
	//생성자
	Member(){
		count++;
		serialNumber=count;
		this.name="익명";
		System.out.println("> Member 디폴트생성자 호출");
	}
	Member(String name){
		count++;
		serialNumber=count;
		this.name=name;
		System.out.println("> Member 1 디폴트생성자 호출");
	}
	//메서드
}