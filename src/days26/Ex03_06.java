package days26;

import java.util.ArrayList;


/**
 * @author Osj  
 * @date   2025. 9. 22. 오전 11:36:27
 * @subject 제한된 제네릭 클래스 
 * @content  ㄴ Box<T> T라는 타입 파라미터에 지정할 수 있는 타입의 종류를 제한
 */
public class Ex03_06 {

	public static void main(String[] args) {
		//Box4 제네릭 클래스의 T에는 모든 자료형을 사용가능
//		Box4<Fruit> b1=new Box4<>();
//		Box4<Apple> b2=new Box4<>();
//		Box4<Grape> b3=new Box4<>();
//		Box4<Toy> b4=new Box4<>();
//		Box4<String> b5=new Box4<>();
//		Box4<Integer> b6=new Box4<>();
//
//		FruitBox<Apple> b7=new FruitBox<>();
//		FruitBox<Grape> b8=new FruitBox<>();
//		FruitBox<Toy> b9=new FruitBox<>();
	}
	// 먹을 수 있는 클래스일 경우 Eatable 인터페이스를 구현
	

}
interface Eatable{
	
}

// 타입 T를 Fruit 클래스를 상속받고, Eatable 인터페이스를 구현한 타입으로 제한 
/*
class SampleBox<T extends Fruit & Eatable>{
	
}

class EatBox<T extends Eatable>{
	
}

class FruitBox<T extends Fruit>{//제한된 제네릭클래스
	//과일만 제한
	
}
class Box4<T>{
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

class Fruit implements Eatable{
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
class Toy{
	public String toString() {
		return "Toy";
	}
}
*/
