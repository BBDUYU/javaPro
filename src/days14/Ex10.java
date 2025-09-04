package days14;

public class Ex10 {

	public static void main(String[] args) {
		Tv t1=new Tv();
		dispTv(t1);
		System.out.println(t1.color);
		//클래스 복사
		/*
		Tv t2=t1;
		t1.color="red";
		System.out.println(t2.color);
		*/
		
	}

	private static void dispTv(Tv t) {
		t.color="blue";
	}

}
