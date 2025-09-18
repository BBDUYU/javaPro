package days24;

import java.util.HashSet;

/**
 * @author Osj  
 * @date   2025. 9. 18. 오후 2:14:47
 * @subject C-S-HashSet 컬렉션 클래스
 * @content	 			- 순서유지 X 중복 X
 * 
 * 			문제점 파악 -> 해결
 * 			Student 클래스 선언 -> 학생객체를 HashSet저장
 * 			같은학번이 두번 저장 -> 해결
 * 			Object.hashCode() 객체를 구별하기위한 고유한 값 
 * 			equals()		  객체가 같은지 체크할 때 학번을 사용하도록 오버라이딩
 */		
public class Ex06 {

	public static void main(String[] args) {
		HashSet<Student> hs = new HashSet<>();
		hs.add(new Student("202501001","홍길동",25));
		hs.add(new Student("202501002","이나영",25));
		hs.add(new Student("202501003","김수진",25));
		hs.add(new Student("202501004","장소예",25));
		hs.add(new Student("202501001","홍길동",25));
		System.out.println(hs);
	}

}

class Student{
	String name;
	int age;
	String no; //학번
	
	public Student() {
		super();
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Student(String no,String name, int age ) {
		super();
		this.name = name;
		this.age = age;
		this.no = no;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", no=" + no + "]\n";
	}

	//학생객체를 HashSet 저장할때 중복여부를 학번을 사용해서 체크
	@Override
	public int hashCode() {
		
		return this.no.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student && obj != null) {
			//Object obj -> 다운캐스팅
			Student s = (Student) obj;
			return this.no.equals(s.no);
		}
		return false;
	}
	
	
	
	
}