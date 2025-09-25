package days29;

/**
 * @author Osj  
 * @date   2025. 9. 25. 오전 10:02:45
 * @subject 함수형 인터페이스 타입을 매개변수, 리턴타입 
 * @content 
 */
public class Ex02_03 {
	//1. 매개변수로 함수형 인터페이스를 사용할 경우
	public static void execute(MyFunction f) {
		f.run();
	}
	//2. 리턴값(타입)으로 함수형 인터페이스를 사용할 경우
	public static MyFunction getMyFunction() {
		return ()->System.out.println("> f.run() 처리 ..."); 
	}
	public static void main(String[] args) {
		execute(()->System.out.println("> FI 매개변수 ..."));
		
		MyFunction f =getMyFunction();
		f.run();
	}

}


// 함수형 인터페이스 -> 1개 추상메서드 선언 -> 람다 사용
@FunctionalInterface
interface MyFunction{
	void run();
}