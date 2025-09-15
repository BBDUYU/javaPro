package days21;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author Osj  
 * @date   2025. 9. 15. 오전 10:10:43
 * @subject StringJoiner - String.join() 권장
 * @content 
 */
public class Ex03 {

	public static void main(String[] args) {
		String team="이나영,김수진,장소예";

		String teamArr[]=team.split(",");
		System.out.println(Arrays.toString(teamArr));
		
		StringJoiner sj=new StringJoiner("</li>\n<li>","<ol>\n<li>","</li>\n</ol>");
		for (int i = 0; i < teamArr.length; i++) {
			sj.add(teamArr[i]);
		}
		System.out.println(sj.toString());
		
		
		
		/* [1]
		//String.join 기억
		String content = "<ol>\n<li>";
		content+=String.join("</li>\n<li>", teamArr);
		content+="</li>\n</ol>";
		System.out.println(content);
		*/
	}

}
