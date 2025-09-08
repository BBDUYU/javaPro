package days16;

/**
 * @author Osj  
 * @date   2025. 9. 8. 오전 10:43:24
 * @subject private 접근지정자로 필드를 선언한 후 접근
 * @content 	getter setter
 * 			Person 클래스 선언
 */
public class Ex02 {

	public static void main(String[] args) {
		Person p1=new Person("홍길동",20,true);
		//p1.name="홍길동";
		//p1.age=20;
		
		p1.setAge(-30);
		System.out.println(p1.getAge());
		
		p1.dispPerson();
	}

}
