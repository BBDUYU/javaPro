package days06;

import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {

		Random n = new Random();
		for(int i=1;i<=6;i++) {
			System.out.println(n.nextInt(45)+1); //0+1<=n<45+1
			
		}
	}
}
