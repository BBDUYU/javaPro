package days17;

public class Ex07 {

	public static void main(String[] args) {
		Employee emp1=new Employee("홍길동1","서울시 강남구","010-1234-5678","2000.01.01");
		
		Employee emp2=new Regular("홍길동2","서울시 강남구","010-1234-5678","2000.01.01",3000000);

		
		Employee emp3=new Temp("홍길동3","서울시 강남구","010-1234-5678","2000.01.01",15,200000);

		Employee emp4=new SalesMan("홍길동4","서울시 강남구","010-1234-5678","2000.01.01",500000,20,1000000);

		dispTest(emp1);
		dispTest(emp2);
		dispTest(emp3);
		dispTest(emp4);
		
		//NewTypeEmp emp5=new NewTypeEmp();
		//dispTest(emp5);
	}
	private static void dispTest(Employee emp) { //매개변수 다형성
		emp.dispEmpInfo();
	}
	/*
	private static void dispTest(Employee emp) {
		emp.dispEmpInfo();
	}
	private static void dispTest(Regular emp) {
		emp.dispEmpInfo();
	}
	private static void dispTest(Temp emp) {
		emp.dispEmpInfo();
	}
	private static void dispTest(SalesMan emp) {
		emp.dispEmpInfo();
	}
*/
}
