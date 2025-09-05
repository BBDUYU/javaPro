package days15;

import java.util.Date;

public class Ex07 {

	public static void main(String[] args) {
		
		//2
		Date now=new Date(2025-1900, 8-1, 18,9,0,0);
		System.out.println(now);
		System.out.println(now.toGMTString());
		
		System.out.println(now.toLocaleString());
		
		
		
		
		
		
		
		/*
		 * [1]
		//The constructor Time() is undefined
		Time t=new Time();
		t.hour=12;
		t.minute=20;
		t.second=30;
		
		System.out.println("end");
		*/
	}

}
