package days18;

import days17.Employee;
import days17.Regular;
import days17.SalesMan;
import days17.Temp;

/**
 * @author Osj  
 * @date   2025. 9. 10. 오전 10:02:07
 * @subject  
 * @content 
 */
public class Ex02 {

	public static void main(String[] args) {
		//추상화
		//Employee emp1=new Employee("홍길동1","서울시 강남구","010-1234-5678","2000.01.01");

		Employee emp2=new Regular("홍길동2","서울시 강남구","010-1234-5678","2000.01.01",3000000);


		Employee emp3=new Temp("홍길동3","서울시 강남구","010-1234-5678","2000.01.01",15,200000);

		Employee emp4=new SalesMan("홍길동4","서울시 강남구","010-1234-5678","2000.01.01",500000,20,1000000);

	}

}
