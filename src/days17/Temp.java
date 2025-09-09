package days17;
//임시직 사원
public class Temp extends Employee{
	//필드 - 사원명,주소,연락처,입사일자
	//메서드 - dispEmpInfo
	
	private int days;		//근무일수
	private int payOfDay;	//하루일당
	
	public Temp() {
		super();
		System.out.println("> Temp 디폴트 생성자 호출");
	}
	public Temp(String name, String addr, String tel, String hiredate,int days,int payOfDay) {
		super(name, addr, tel, hiredate);
		this.days=days;
		this.payOfDay=payOfDay;
		System.out.println("> Temp 6 생성자 호출");
	}
	
	//급여계산 후 반환
	public int getPay() {
		return this.days*this.payOfDay;
	}
	
	
}
