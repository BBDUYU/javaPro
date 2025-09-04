package days14;

/**
 * @author Osj  
 * @date   2025. 9. 4. 오후 4:10:57
 * @subject 클래스 배열
 * @content 
 */
public class Ex12 {
	public static void main(String[] args) {
		//5명의 사람 객체를 생성 -> 일
		Person p1=new Person();
		p1.name="김다원";
		Person p2=new Person();
		p2.name="김민배";
		Person p3=new Person();
		p3.name="김수진";		
		Person p4=new Person();
		p4.name="김유진";		
		Person p5=new Person();
		p5.name="김호연";
		
		p1.work();
		p2.work();
		p3.work();
		p4.work();
		p5.work();
	}
}
