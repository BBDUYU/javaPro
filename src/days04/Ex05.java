package days04;

public class Ex05 {

	public static void main(String[] args) {
		int x=30,y;
//		y=x>5?100:200;
//		y=x>5?100+x:200-x;
		y = ( x > 5 ? ( x < 10 ? 1 : 2 ) : 200 );
		System.out.println(y);
	}

}
