package days28;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Osj  
 * @date   2025. 9. 24. 오전 9:38:59
 * @subject 
 * @content 
 */
public class Ex02 {

	public static void main(String[] args) {
		/* 테스트 1
		 * 부모클래스가 직렬화가 가능한 클래스면
		 * 상속받은 자식클래스는 어떻게될까
		 */
	
		// 파일에 저장
		String name=".\\src\\days28\\Child.ser";
		try (FileOutputStream fos=new FileOutputStream(name);
				ObjectOutputStream oos=new ObjectOutputStream(fos)){
			Parent p = new Parent();
			p.name = "홍길동";
			Child c = new Child();
			c.name = "서영학";
			c.age=20;
			oos.writeObject(p);
			oos.writeObject(c);
			
			oos.flush(); // 저장후 스트림 비우기
			System.out.println("u1, u2객체를 직렬화해서 파일 저장완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" end ");
	}

}
/*
class Parent implements Serializable{
	String name;
	private static final long serialVersionUID = -4339070112451541890L;
	@Override
	public String toString() {
		return "Parent [name=" + name + "]";
	}
	 
}

class Child extends Parent{
	int age;

	@Override
	public String toString() {
		return "Child [age=" + age + ", name=" + name + "]";
	}
	
}
*/