package days19;

/**
 * @author Osj  
 * @date   2025. 9. 11. 오전 10:25:34
 * @subject 내부클래스 선언후 사용하는 방법
 * @content 외부클래스에서 내부클래스 멤버 접근하는방법
 */
public class Ex02_03 {//외부클래스 사용
	class InstanceInner{}//1
	static class StaticInner{}//2
	
	//외부의 인스턴스 멤버 간에 서로 직접 접근 가능
	InstanceInner iiObj=new InstanceInner();
	static StaticInner siObj=new StaticInner();
	
	void method1() {
		class LocalInner{}//3
		
		LocalInner liObj=new LocalInner();
		
		//메서드 안에서도 인스턴스 클래스, 정적 클래스 객체를 사용할 수 있다
		InstanceInner iiObj2=new InstanceInner();
		StaticInner siObj2=new StaticInner();
	}
	static void method2() {
		//LocalInner 지역클래스는 해당지역을 벗어나면 사용 X
		
		//static 메서드 안에서 인스턴스 클래스를 사용 X
		//InstanceInner iiObj=new InstanceInner(); 
		//인스턴스 클래스를 static 메서드에서 사용하려면
		Ex02_03 outer=new Ex02_03();
		InstanceInner iiObj=outer.new InstanceInner();
		
		//static 메서드 안에서 정적클래스
		StaticInner siObj=new StaticInner();

	}
	
	public static void main(String[] args) {
		
	}

}
