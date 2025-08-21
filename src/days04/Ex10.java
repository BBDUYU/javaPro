package days04;

/**
 * @author Osj  
 * @date   2025. 8. 21. 오후 3:30:59
 * @subject 
 * @content 
 */
public class Ex10 {

	public static void main(String[] args) {
		int x=10,y=20;
		System.out.printf("1. x=%d, y=%d\n",x,y);
		{ //temp를 지역변수로 지정					  (2)
			int temp=x;				//x=10	    <-(20)--   	y=20 -> 10
			x=y;					// (1)ㄴ-(10)->	temp=10 (3)↗
			y=temp;
		}
		System.out.printf("2. x=%d, y=%d\n",x,y);
	}

}
