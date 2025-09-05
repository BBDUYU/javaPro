package days15;

//좌표를 다루는 속성, 기능이 구현된 클래스
public class Point {
	//필드
	public int x;
	public int y;
	
	//메서드
	public void dispPoint() {
		System.out.printf("> x=%d, y=%d\n",x,y);
	}
	
	public void offsetPoint(int n) { 
		x+=n;
		y+=n;
	}
	
	public void plusPoint(Point p) {
		x+=p.x;
		y+=p.y;
	}
}
