package days16;

/**
 * @author Osj  
 * @date   2025. 9. 8. 오후 2:30:22
 * @subject static 키워드 247p 
 * @content ex)
 * 			기업은행 1층에 모두가 보통예금 가입
 * 			저축과 관련된 Save 클래스 선언
 * 			(이자율은 모두 동일하다)
 * 			
 */
public class Ex05 {

	public static void main(String[] args) {
		//클래스명.static 필드명 접근
		//Save.setRate()
		
		//객체명.static 필드명
		//s[4].setRate()

		//클래스 로더에 의해서 static 필드는 메모리에 올라간다


		//[2] 클래스 배열을 사용해서 코딩수정 + 배열초기화

		Save s[]={
				new Save("이나영",10000,0.04),
				new Save("김수진",2300,0.04),
				new Save("김수진",2300,0.04),
				new Save("이지혜",34000,0.04),
				new Save("지영주",1000,0.04)
		};
		//Save.setRate(0.08);
		s[2].setRate(0.09);

		for (int i = 0; i < s.length; i++) {
			s[i].printSave();
		}



		/* [1]
		Save s1=new Save("이나영",10000,0.04);
		Save s2=new Save("김수진",2300,0.04);
		Save s3=new Save("장소예",5000,0.04);
		Save s4=new Save("이지혜",34000,0.04);
		Save s5=new Save("지영주",1000,0.04);

		s1.printSave();
		s2.printSave();
		s3.printSave();
		s4.printSave();
		s5.printSave();
		 */
	}

}
