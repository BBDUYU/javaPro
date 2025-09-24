package days28;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Osj  
 * @date   2025. 9. 24. 오전 9:38:59
 * @subject 
 * @content 
 */
public class Ex03 {

	public static void main(String[] args) {
		/* 테스트 2
		 * 부모클래스는 직렬화가 가능하지않은 클래스이고
		 * 상속받은 자식클래스는 직렬화가 가능한 클래스일 경우
		 */
	
		// 파일에 저장
		String name=".\\src\\days28\\Child.ser";
		try (FileOutputStream fos=new FileOutputStream(name);
				ObjectOutputStream oos=new ObjectOutputStream(fos)){
//			Parent p = new Parent();
//			p.name = "홍길동";
			Child c = new Child();
			c.name = "서영학";
			c.age=20;
//			oos.writeObject(p);
			oos.writeObject(c);
			
			oos.flush(); // 저장후 스트림 비우기
			System.out.println("c 객체를 직렬화해서 파일 저장완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" end ");
	}

}

class Parent {
	String name;
	@Override
	public String toString() {
		return "Parent [name=" + name + "]";
	}
	 
}

//우리가 직접 부모클래스의 Parent필드 name을 직렬화 코딩에 추가
class Child extends Parent implements Serializable{
	int age;
	
	@Override
	public String toString() {
		return "Child [age=" + age + ", name=" + name + "]";
	}
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(name);
		out.defaultWriteObject();
		
	}
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		name= in.readUTF();
		in.defaultReadObject();
	}

	
}