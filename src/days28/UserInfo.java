package days28;

import java.io.Serializable;

public class UserInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3368506331876513342L;
	String name;
	int age;
	transient String password; // 직렬화할 때 포함시키지 않겠다
	
	public UserInfo() {
		this("Unknown",0,"1234");
	}
	
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + ", password=" + password + "]";
	}
	
	public UserInfo(String name, int age, String password) {
		super();
		this.name = name;
		this.age = age;
		this.password = password;
	}
	
	
	
}
