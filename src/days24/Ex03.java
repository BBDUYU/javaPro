package days24;

import java.util.HashSet;

/**
 * @author Osj  
 * @date   2025. 9. 18. 오전 10:14:30
 * @subject HashSet 
 * @content 
 */
public class Ex03 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(9);
		hs.add(1);
		hs.add(15);
		hs.add(3);
		hs.add(3);
		hs.add(3);
		hs.add(null);
		
		
		//순서유지 X, 중복 X, null 허용
		System.out.println(hs);
	}

}
