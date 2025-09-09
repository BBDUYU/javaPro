package days17;

/**
 * @author Osj  
 * @date   2025. 9. 9. 오전 11:21:07
 * @subject Point2D - x,y 
 * @content Point3D - x,y,z
 * 			-> 상속을 사용해서 Point2D -> Point3D 구현
 * 
 * 
 * 				Super 클래스 -> super 키워드
 * 			Point2D 부모(parent) 클래스, 기초(base) 클래스, 상위 클래스
 * 			
 * 				Sub 클래스
 * 			Point3D 자식(child) 클래스, 파생(derived) 클래스, 하위 클래스 
 */
public class Ex03_03 {

	public static void main(String[] args) {
		Point3D p1=new Point3D(1,2,3);
		p1.setX(100);
		p1.offsetPoint(5);
		p1.dispPoint3D();
	}

}
