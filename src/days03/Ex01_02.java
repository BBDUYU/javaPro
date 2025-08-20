package days03;

import java.util.Calendar;

public class Ex01_02 {

	public static void main(String[] args) {
		
//		[1]
		
//		Calendar c = Calendar.getInstance();
//		String s = String.format("Duke's Birthday: %1$tm %1$te,%1$tY", c);
//		System.out.println(s);
		
//		[2]
//		Calendar c = Calendar.getInstance();
//		System.out.printf("Duke's Birthday: %1$tm %1$te,%1$tY", c);

		
		//%[argument_index$][flags][width][.precision]conversion
		String name="osj";
		char grade='a';
		int score=10;
		
		int no=1;
	
		//precision
		double avg=23.33633333333;
		
		//
		long money=89100433;
		System.out.printf("%,d\n",money);
		
		System.out.println("-".repeat(50)); //구분선

		System.out.printf("%d\n",100); 
		System.out.printf("%(d\n",-100); 
		System.out.println("-".repeat(50)); //구분선

		System.out.printf("[%f]\n",avg); 
		System.out.printf("[%20f]\n",avg); 
		System.out.printf("[%20.2f]\n",avg); //소수점 두자리까지 출력, 세번째자리에서 반올림
		System.out.printf("[%e]\n",avg); 
		System.out.printf("[%E]\n",avg); 
		System.out.printf("[%g]\n",avg); 
		System.out.printf("[%G]\n",avg); 
		
		System.out.println("-".repeat(50)); //구분선
		System.out.printf("[%04d]\n",no); //우측 정렬 width == 너비
		
		System.out.println("-".repeat(50)); //구분선
		System.out.printf("[%d]\n",score);
		System.out.printf("[%10d]\n",score); //우측 정렬 width == 너비
		System.out.printf("[%010d]\n",score); //우측 정렬 width == 너비
		System.out.printf("[%-10d]\n",score);//좌측 정렬
		System.out.println("-".repeat(50)); //구분선

		
		System.out.printf("%1$s(%1$S)\n",name);
		System.out.printf("%1$c(%1$C)\n",grade);
		System.out.println("-".repeat(50)); //구분선

		System.out.printf("%d\n",score);
		System.out.printf("%#o\n",score);
		System.out.printf("%1$#x(%1$#X)\n",score);
		
	}

}
