package days20;

import days15.Point;

public class Ex02_02 {

	public static void main(String[] args) {
		Point p1=new Point(10,20);
		Point p2=new Point(10,20);
		//p1 객체를 복제해서 p3객체를 생성
//1		Point p3=new Point();
//		p3.x=p1.x;
//		p3.y=p1.y;
//2		Point p3=new Point(p1.x,p1.y);
		//The constructor Point(Point) is undefined
//3		Point p3=new Point(p1);
		
//		Object.clone()
		//Type mismatch: cannot convert from Object to Point
		
		//checked 예외
		try {
			Point p3 = p1.clone();
			System.out.println(p3.toString());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}
