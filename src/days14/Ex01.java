package days14;

import days15.Time;

public class Ex01 {
	public static void main(String[] args) {
		//다른 패키지
		Time t = new Time();
		t.hour=12;
		//The field Time.minute is not visible - 접근지정자와 관련된 에러메시지
		//t.minute=30;
		
	}
}
