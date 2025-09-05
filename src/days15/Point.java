package days15;

//좌표를 다루는 속성, 기능이 구현된 클래스
public class Point {
	//필드
	public int x;
	public int y;
	
	//생성자
	public Point(){
		System.out.println("> Default Constructor");
	}
	public Point(int n){
		System.out.println("> Constructor 1 ");
		y=x=n;
	}
	
	public Point(int i, int j) {
		System.out.println("> Constructor 2 ");
		x=i;
		y=j;
	}
	//메서드
	public void dispPoint() {
		System.out.printf("> x=%d, y=%d\n",x,y);
	}
	
	//매개변수 - 기본
	public void offsetPoint(int n) { 
		x+=n;
		y+=n;
	}
	//매개변수 - 참조
	public void plusPoint(Point p) {
		x+=p.x;
		y+=p.y;
	}
	
	//x좌표를 반환하는 메서드 선언 - 리턴자료형 - 기본형
	public int getX() {
		return x;
	}
	
	//리턴자료형이 참조형인 메서드 선언
	public Point offsetPoint(Point p) {
		Point result=new Point();
		result.x=x+p.x;
		result.y=y+p.y;
		return result;
	}
}
