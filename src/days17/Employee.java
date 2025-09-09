package days17;

//사원
//공통적으로 가지고있는 멤버들을 선언
public class Employee {
	private String name;		//사원명
	private String addr;		//주소
	private String tel;			//연락처
	private String hiredate;	//입사일자
	
	
	//get set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	public Employee() {
		super();
		System.out.println("> Employee 디폴트 생성자 호출");
	}
	
	public Employee(String name, String addr, String tel, String hiredate) {
		super();
		this.name = name;
		this.addr = addr;
		this.tel = tel;
		this.hiredate = hiredate;
		System.out.println("> Employee 4 생성자 호출");
	}
	
	public void dispEmpInfo() {
		System.out.printf("사원명:%s ,주소:%s ,연락처:%s ,입사일자:%s\n"
				,this.name,this.addr,this.tel,this.hiredate);
	}
	
	
	
}
