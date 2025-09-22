package days26;

/**
 * @author Osj  
 * @date   2025. 9. 22. 오전 11:16:57
 * @subject 제네릭 제한 
 * @content 
 */
public class Ex03_04 {

	public static void main(String[] args) {
		//T타입 배열 선언 가능
		//제네릭 기능 - 객체별로 다른 타입으로 지정해서 동작하도록 만든 기능
		//때문에 static 필드는 선언할 수 없다
		//static 메서드의 매개변수 타입 T를 사용할 수 없다
		
	}
}

class Box2<T>{
	T itemArr[];
	//Cannot make a static reference to the non-static type T
	
	//static T sitem;
}