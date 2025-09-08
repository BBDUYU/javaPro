package days16;

/**
 * @author Osj  
 * @date   2025. 9. 8. 오전 11:30:27
 * @subject p225, 245 
 * @content  this
 *  1. 정의 : 클래스 자기 자신의 주소값을 갖는 참조 변수
 *  2. this 용도
 *  	1) 멤버를 가리킬 때 this
 *  	2) 생성자에서 또 다른 생성자를 호출할 때의 this
 *  	3) 단독으로 사용될 때의 this - 리턴값, 매개변수
 */
public class Ex03 {

	public static void main(String[] args) {
		//Person p1=new Person();
		Person p1=new Person("홍길동",20,true);
		p1.dispPerson();
		p1.changeAge(5).dispPerson();;
	}

}
