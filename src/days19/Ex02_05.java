package days19;

public class Ex02_05 {

	public static void main(String[] args) {
		Outer2 out=new Outer2();
		Outer2.InstanceInner iiObj=outer.new InstanceInner();
		iiObj.a=200;
		System.out.println(iiObj.a);
		
		System.out.println(Outer2.StaticInner.c);
		Outer2.StaticInner siObj= new Outer2.StaticInner();
		siObj.b=300;
	}

}

class Outer2{
	int y=10;
	static int x =100;
	class InstanceInner{
		int a =10;
		
	}
	static class StaticInner{
		int b =20;
		static int c=30;
	}
	void method1() {
		class LocalInner{
			int d=40;
		}
	}
}