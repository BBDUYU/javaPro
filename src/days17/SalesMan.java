package days17;

//영업직 사원
public class SalesMan extends Regular{
	// 필드 : name,addr,tel,hiredate,basepay
	// 메서드 : get, set, dispEmpInfo(), getPay()
	
	private int sales; //판매량
	private int comm;  //커미션
	
	public SalesMan() {
		super();
		System.out.println("> SalesMan 디폴트 생성자 호출");

	}


	public SalesMan(String name, String addr, String tel, String hiredate, 
			int basePay,int sales,int comm) {
		super(name, addr, tel, hiredate, basePay);
		this.sales=sales;
		this.comm=comm;
		System.out.println("> SalesMan 7 생성자 호출");
	}
	
	
	@Override
	public int getPay() {
		return super.getPay()+this.sales*this.comm;
	}
	@Override
	public void dispEmpInfo() {
		super.dispEmpInfo();// Employee.java에 있는  dispEmpInfo

		System.out.printf(//추가할내용
	            "기본급:%d"
	                  + " 판매량=%d, 커미션=%d\n"
	                  ,this.getBasePay()
	                  , this.sales, this.comm );		
	}



	
}
