package days30;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author Osj  
 * @date   2025. 9. 26. 오전 10:40:37
 * @subject 특정범위의 정수 -> 스트림 -> 처리 
 * @content 
 */
public class Ex04_03 {

	public static void main(String[] args) {
//		IntStream.range(1, 5).forEach(System.out::println);
//		IntStream.rangeClosed(1, 5).forEach(System.out::println);
		
		IntStream s1= new Random().ints();
		LongStream s2= new Random().longs();
		DoubleStream s3= new Random().doubles();
		
		new Random().ints(1,46).distinct().limit(6).sorted().forEach(System.out::println);
		IntStream lotto = new Random().ints(1,46).distinct().limit(6).sorted();
		
		Stream<String> sLotto = lotto.mapToObj(i->"["+i+"]");
		sLotto.forEach(System.out::println);
	}

}
