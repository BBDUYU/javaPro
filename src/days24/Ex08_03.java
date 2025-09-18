package days24;

import java.util.Comparator;
import java.util.TreeSet;


public class Ex08_03 {

	public static void main(String[] args) {
		TreeSet<Person> ts=
				new TreeSet<>((o1,o2) -> o1.name.compareTo(o2.name));	


		ts.add(new Person("이나영",23));
		ts.add(new Person("김수진",23));
		ts.add(new Person("이나영",23));

		System.out.println(ts);

	}

}

//class Person implements Comparable<Person>{
class Person {
	String name;
	int age;

	public Person() {}
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	/*
	@Override
	public int compareTo(Person o) {
		return this.name.compareTo( o.name );	
	}
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}



}