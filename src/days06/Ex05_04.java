package days06;

import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

public class Ex05_04 {

	public static void main(String[] args) {
		Random rnd = new Random();
	      /*
	      int [] m = IntStream
	                 .generate(()-> rnd.nextInt(100)+1)
	                 .limit(20)
	                 .toArray();
	      */
	      OptionalInt  maxOptionInt =  IntStream
	              .generate(()-> rnd.nextInt(100)+1) //랜덤값 100가지 생성
	              .limit(20)//20개 제한
	              .max();//제일큰값 하나
	      
	      System.out.println( maxOptionInt.getAsInt());	
	      }//main
	
}//class
