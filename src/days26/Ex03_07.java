package days26;

import java.util.ArrayList;

/**
 * @author Osj  
 * @date   2025. 9. 22. 오후 12:07:32
 * @subject ? 와일드카드 설명
 * @content <?>	== <? extends Object> 제한 없다
 * 			<? extends T> T와 그 자식들만 가능
 * 			<? super T> T와 그 부모들만 가능
 * 
 * 			매개변수로 과일상자를 대입하면 주스를 만들어서 반환하는
 * 			Juicer 클래스 선언 + makeJuice() 메서드 선언
 */
public class Ex03_07 {

	public static void main(String[] args) {
		//1
		FruitBox<Fruit> fruitBox=new FruitBox<>();
		Juice juice = Juicer.makeJuice(fruitBox);
		//		System.out.println(juice);

		FruitBox<Apple> appleBox=new FruitBox<>();
		//		juice = Juicer.makeJuice(appleBox);
		System.out.println(juice);
	}	

}

class Juice{

}

//과일상자 -> 주스
class Juicer{
	//[1]
	// 제네릭타입 T 다르다고 해서 오버로딩 성립 X
	/*
	static Juice makeJuice(FruitBox<Fruit> box) {

		return new Juice();
	}
	static Juice makeJuice(FruitBox<Apple> box) {

		return new Juice();
	}
	*/
	/* [2]
	static Juice makeJuice(FruitBox<? extends Fruit> box) {

		return new Juice();
	}
	*/
	//[3] 위에 [2]를 제네릭 메서드로 변환해서 선언
	// 제네릭 메서드 ? 
	// 메서드의 선언부에 제네릭 타입이 선언된 메서드
	// 리턴 자료형 바로 앞에 
	// 제네릭 클래스의 <T>와는 별개이다
	static <T extends Fruit>Juice makeJuice(FruitBox<T> box) {

		return new Juice();
	}
}

class FruitBox<T extends Fruit>{//제한된 제네릭클래스
	//과일만 제한

}
class Box5<T>{
	ArrayList<T> list=new ArrayList<>();
	void add(T item) {
		this.list.add(item);
	}
	T get(int index) {
		return this.list.get(index);
	}
	int size() {
		return this.list.size();
	}
	public String toString() {
		return this.toString();
	}
}

class Fruit{
	public String toString() {
		return "Fruit";
	}
}

class Apple extends Fruit{
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit{
	public String toString() {
		return "Grape";
	}
}

