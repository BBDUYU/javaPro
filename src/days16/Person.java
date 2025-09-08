package days16;


public class Person {
	//필드
	String name;
	private int age;
	private boolean gender;
	//생성자
	public Person(String name, int age, boolean gender) {
		this(name,age);//name,age 매개변수를 가진 생성자 호출
		System.out.println("> Person Constructor 3");
		//Constructor call must be the first statement in a constructor
		this.gender = gender;
	}
	public Person(String name, int age ) {
		//this();//매개변수가 없는 생성자 호출
		System.out.println("> Person Constructor 2");
		this.name=name;
		this.age=age;
	}
	public Person() {
		this("익명",0,false);
		System.out.println("> Person Constructor ");
	}
	
	
	//나이를 매개변수 만큼 증/감 시키는 메서드
	public Person changeAge(int n) {//this=p1의 자료형 Person
		this.age+=n;
		return this;//this의 3 용도 - 리턴값
	}
	
	//메서드
	public void dispPerson() {
		System.out.printf("> name:%s, age:%d, gender:%b\n",name,age,gender);
	}
	//get set
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age>=0) {
			this.age=age;
		}else {
			//강제 에러발생
			throw new RuntimeException("> Age Err");
		}
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
}
