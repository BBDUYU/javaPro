package days21;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Osj  
 * @date   2025. 9. 15. 오전 9:45:17
 * @subject String 
 * @content StringBuffer, StringBuilder
 * 			StringTokenizer 클래스
 */
public class Ex02 {

	public static void main(String[] args) {
		//Token
		
		String team="이나영,김수진,장소예";
		StringTokenizer st = new StringTokenizer(team,",");
		
		System.out.println(st.countTokens());
		while (st.hasMoreElements()) {
			String name=st.nextToken();
			System.out.println(name);
		}
		
		/*
		String teamArr[]=team.split(",");
		System.out.println(Arrays.toString(teamArr));
		*/
	}

}
