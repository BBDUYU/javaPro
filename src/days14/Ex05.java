package days14;

public class Ex05 {

	public static void main(String[] args) {
		int m[]=null;
		//java.lang.NullPointerException
//		Car myCar=null; //인스턴스 X
		Car myCar=new Car(); //인스턴스화
		myCar.name="k9";
		
		//클래스 필드를 초기화하지않으면 그 필드의 자료형의 기본값으로 설정
		System.out.println(myCar.wheelCount);
	}

}
