package days15;

/**
 * @author Osj  
 * @date   2025. 9. 5. 오후 3:05:24
 * @subject 
 * @content 1. 매개변수 - 기본, 참조형
 * 			2. 리턴자료형 - 기본형, 참조형
 * 
 *  		Point클래스
 */
public class Ex05 {

	public static void main(String[] args) {
		/*
		힙					스택
		[10][0][0x1번지]		[0x2번지]
		x 	y				p1(객체)
		0x2
		
		[20][0][0x1번지]		[0x3번지]
		x 	y				p2(객체)
		0x3
		
		메서드
		[]
		dispPoint()
		0x1번지
		
		 * */
		Point p1;
		p1=new Point();//인스턴스화,객체생성
		//객체명.필드명
		p1.x=10;
		p1.y=1;
		//객체명.메서드명();
		Point p2=new Point();
		p2.x=20;
		p2.y=2;
		
		//p1.dispPoint();
		//p2.dispPoint();
		
		p1.dispPoint();
		p1.plusPoint(p2);
		p1.dispPoint();
		
	}

}
