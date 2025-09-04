package days14;

public class Ex07 {

	
	private class Sample{
		
	}
	
	
	//중첩클래스
	//protected
	private class Test{
		
	}
	
	public static void main(String[] args) {
		/*
		 * 1. 클래스 선언시 앞에붙는 접근지정자 설명
		 * 	1) public - 패키지 내부/외부 어디서든지 사용가능
		 * 	3) default == package - 패키지 내부에서만 어디서든지 사용가능
		 * 
		 * 	2) protected	비활성화
		 * 		- default(package) 접지 기능 + 패키지 외부에서도 상속 가능
		 * 	4) private		비활성화
		 * 		- 같은 파일 내에서만 사용가능
		 * 		중첩 클래스를 선언할 때만 2,4 접근지정자를 사용할 수 있다
		 * 		(내부클래스)
		 * 		4가지 종류가 있다
		 * 2. Person 클래스 선언
		 * 	days14.Ex07 클래스 같은 패키지 내부이다
		 * 	days14.Person 클래스
		 * */
		Person p1=new Person();
		System.out.println("default");
	}

}

class Ex08{
	abstract class InnerEx08{
		
	}
	final class InnerEx08_02{
		
	}
	static class InnerEx08_03{
		
	}
	//클래스앞에붙는 기타제어자 설명
	//1) abstract - 추상클래스
	//2) final - 최종클래스
	//3) static 비활성화 - 중첩클래스 선언시에만 사용가능 - 정적클래스
	
}
