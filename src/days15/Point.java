package days15;


//좌표를 다루는 속성, 기능이 구현된 클래스
public class Point implements Cloneable{
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
	public Point(Point p) {//day20.Ex02_02.java
		this.x=p.x;
		this.y=p.y;
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
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point && obj != null) {
			Point p =(Point)obj;
			return (p.x==this.x &&p.y==this.y);
		}
		return false;
	}
	@Override
	public String toString() {
		
		return String.format("[x=%d, y=%d]", this.x,this.y);
	}
	
	// 오버라이딩 조건 
	// jdk1.5 ~ 
	// 공변 반환 타입 추가
	// Object -> Point 변경
	@Override
	public Point clone() throws CloneNotSupportedException {
		Point obj=null;
		obj= (Point) super.clone();
		return obj;
	}
	
	
	
}
