package days24;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

/**
 * @author Osj  
 * @date   2025. 9. 18. 오전 10:21:27
 * @subject 로또 관련 예제 
 * @content 
 */
public class Ex03_02 {

	public static void main(String[] args) {

		Random rnd=new Random();
		int n;
		
		HashSet lotto = new HashSet(6);		//중복허용X
		
		while (lotto.size()<6) {
			n=rnd.nextInt(45)+1;
			lotto.add(n);
		}//while
		System.out.println(lotto);
		//반복자 사용 Iterator ?

	}

}
