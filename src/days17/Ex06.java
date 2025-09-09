package days17;

public class Ex06 {

	public static void main(String[] args) {
		/*
        [ 상속 계층도 ]
           Object
             ↑  
	           Employee  사원클래스 
	      ↑                  ↑
	  Regular 정규직         Temp 임시직 
	      ↑
	  SalesMan 영업직
	
	  1. 상속성 정리
	  2. 다형성 / 인터페이스
	  3. 업캐스팅 - 자식개체를 부모에게 참조 / 다운캐스팅 
	  4. 추상화
	  5. this, super 키워드 설명
	  6. final 키워드 설명
	  등등
			 * */
		//사원 객체 생성 후 사원정보 출력
		//Employee emp1=new Employee("홍길동","서울시 강남구","010-1234-5678","2000.01.01");
		//emp1.dispEmpInfo();
		
		//2. 정규직 사원 객체생성, 호출
		/*
		Regular emp2=new Regular("홍길동","서울시 강남구","010-1234-5678","2000.01.01",3000000);
		
		emp2.dispEmpInfo();
		System.out.println(emp2.getPay());
		*/
		
		//3
		/*
		 * Employee emp == new Regular();
		 * 가능 : 클래스의 타입이 다름
		 * 		부모타입 <--참조-- 자식객체를 생성
		 * 		클래스 간의 형변환 - 자동 업캐스팅
		 *
		Employee emp3=new Regular("홍길동","서울시 강남구","010-1234-5678","2000.01.01",3000000);
		emp3.dispEmpInfo();
		//emp3.getPay();
		/// */
		
		/*
		//4. 임시직 개체
		Employee emp4=new Temp("홍길동","서울시 강남구","010-1234-5678","2000.01.01",15,200000);
		emp4.dispEmpInfo();
		*/
		
		//5.
		/*
		Employee emp5=new SalesMan("홍길동","서울시 강남구","010-1234-5678","2000.01.01",500000,20,1000000);
		emp5.dispEmpInfo();
		*/
	}

}
