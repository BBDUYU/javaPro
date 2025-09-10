package days18;

/**
 * @author Osj  
 * @date   2025. 9. 10. 오전 11:46:27
 * @subject 오버라이딩 조건
 * @content 
 */
public class Ex05 {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.test();
		
	}

}

class Parent{
	protected void test() {
		System.out.println("> Parent.test()...");
	}
}
class Child extends Parent{
	//Cannot reduce the visibility of the inherited method from Parent -> 접근지정자가 protected -> default로 작아짐
	//public > protected > default > private - 범위
	@Override
	public void test() {
		System.out.println("> Child.test()...Overriding");
	}
}

/*
 * ✅ 오버라이딩 조건 (자바 기준)
조건   설명
1. 메서드 이름 동일   부모 클래스의 메서드 이름과 정확히 같아야 함
2. 매개변수(파라미터) 동일   개수, 순서, 타입이 모두 같아야 함
3. 반환 타입 동일 (또는 하위 타입)   Java 5부터는 반환 타입이 부모 메서드보다 하위 타입이면 허용 (covariant return type)
4. 접근 제어자 제한 없음 or 더 넓어야 함   부모보다 더 좁은 범위(private → default → protected → public)는 불가
5. 예외는 같거나 더 좁은 범위의 예외만 throws 가능   (checked exception일 경우)
6. static, final, private 메서드는 오버라이딩 불가
 * 
 * */
 */