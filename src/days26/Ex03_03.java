package days26;

public class Ex03_03 {

	public static void main(String[] args) {
		Box<String> b1=new Box();
		b1.setItem("문자열");
		String str=b1.getItem(); // 다운캐스팅할 필요가 없음
		
		Box<Integer>b2=new Box<>();
		b2.setItem(100);
		int i=b2.getItem();
	}

}

// 제네릭클래스
/*	클래스명 뒤에 <T> 를 붙이면 됨
 *  Type, Key, Value, Element
 *  T 타입 파라미터
 *  Box 원시타입
 *  Box<T> 제네릭클래스, T의 Box
 * */
class Box<T>{
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
}