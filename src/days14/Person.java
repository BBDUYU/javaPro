package days14;

//default - 패키지내부에서만 사용(참조, 상속)가능
//public - 패키지 내부/외부 어디서든지 접근 가능
public class Person {
	//필드
	public String name;
	public int age;
	//메서드
	public void work() {
		System.out.println(name+"이/가 일한다");
	}

	public void run() {
		System.out.println(name+"이/가 달린다");
	}
}
