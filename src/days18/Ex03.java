package days18;

import days17.Employee;
import days17.Regular;
import days17.SalesMan;
import days17.Temp;

/**
 * @author Osj  
 * @date   2025. 9. 10. 오전 10:38:53
 * @subject instanceof 연산자 
 * @content 
 */
public class Ex03 {

	public static void main(String[] args) {
		Employee emps[]= {
				new Regular("홍길동2","서울시 강남구","010-1234-5678","2000.01.01",3000000),
				new Temp("홍길동3","서울시 강남구","010-1234-5678","2000.01.01",15,200000),
				new SalesMan("홍길동4","서울시 강남구","010-1234-5678","2000.01.01",500000,20,1000000)
		};
		/*
		for (int i = 0; i < emps.length; i++) {
			사원판단메서드(emps[i]);
		}*/
		사원판단메서드(emps[2]);
	}

	//instanceof 연산
	private static void 사원판단메서드(Employee emp) {
		//정규직사원
		//임시직사원
		//영업직사원
		if (emp instanceof SalesMan) {
			System.out.println("영업직");
		}else if (emp instanceof Regular) {
			System.out.println("정규직");
		}else if (emp instanceof Temp) {
			System.out.println("임시직");
		}
		
	}

}
