package days26;

import java.util.ArrayList;

/**
 * @author Osj  
 * @date   2025. 9. 22. 오전 11:22:49
 * @subject 제네릭 클래스의 개체 생성과 사용
 * @content 
 */
public class Ex03_05 {

	public static void main(String[] args) {
		/*
//		Box3<Apple> appleBox=new Box3<Apple>();
		Box3<Apple> appleBox=new Box3<>();
		appleBox.add(new Apple());
		appleBox.add(new Apple());
//		appleBox.add(new Grape()); 에러
//		Box3<Fruit> fruitBox=new Box3<Apple>();
		Box3<Fruit> fruitBox=new Box3<>();
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
//		fruitBox.add(new Toy()); 에러
	}
		 */
	}

	//제네릭클래스
	class Box3<T>{
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
	class Toy{
		public String toString() {
			return "Toy";
		}
	}
}