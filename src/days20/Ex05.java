package days20;

/**
 * @author Osj  
 * @date   2025. 9. 12. 오후 4:20:43
 * @subject 문자열을 다루는 클래스 : String 클래스
 * 								불변
 * @content 문자열 잘라내기, 삽입, 삭제, 추가 (문제점)
 * 			StringBuilder 또는 StringBuffer 클래스사용
 */
public class Ex05 {

	public static void main(String[] args) {
		//s 문자열에서 's' -> "에스" 수정
		String s = "public static void main(String[] args) {";
		String word="main";
		//main 삭제
		int index=s.indexOf(word);
		
		System.out.println(s.substring(0,index));
		index +=word.length();
		System.out.println(s.substring(index));
		//main 문자열 뒤에 "안녕" 문자열 삽입
		
	}

}
