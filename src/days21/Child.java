package days21;

public class Child extends Parent{
	public void modifierAcessTest() {
		this.pub=100; //패키지 내부,외부 어디서든 접근가능
		this.pro=90;  //패키지 내부 접근가능 + 상속접근가능
		this.def=80;  //패키지 내부 접근 가능
		
		//this.pri (X) Parent클래스 내부에서만 접근 가능
		//				상속관계가 있어도 Child클래스에서는 접근 불가능
		
		
	}
}
