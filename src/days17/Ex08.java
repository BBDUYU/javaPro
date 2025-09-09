package days17;

/**
 * @author Osj  
 * @date   2025. 9. 9. 오후 3:34:08
 * @subject 클래스 간의 형변환 - 상속관계 필수
 * @content 	1) 업캐스팅
 * 				2) 다운캐스팅
 */				
public class Ex08 {

	public static void main(String[] args) {
		//자동 업캐스팅
		Parent2 p = new Child2(); //부모 객체에 자식 업캐스팅
		p.disp(); //부모 객체 호출했지만
		
		//다운캐스팅은 강제형변환이 필요 자동X
		Child2 c=(Child2)p;
	}

}
class Parent2 {
	public void disp() {
	      System.out.println("> parent.disp()...");
	   }
	   
}

class Child2 extends Parent2{ // 업캐스팅된 자식 클래스 호출

	@Override
	public void disp() {
	      System.out.println("> child.disp()...");

	}
	
}













