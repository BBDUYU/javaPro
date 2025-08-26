package days07;

import java.util.Random;

public class Ex01_02 {

	public static void main(String[] args) {
		new Random()
			.ints(1, 46)
			.distinct()
			.limit(6)
			.forEach(System.out::println);;//랜덤.1~45.중복제거.6개
	}

}
