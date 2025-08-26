package days07;

/**
 * @author Osj  
 * @date   2025. 8. 26. 오후 4:34:10
 * @subject 
 * @content 
 */
public class Ex08 {

	public static void main(String[] args) {
		
		//foreach==확장for문
		/*
		for (자료형 변수명 : 배열 또는 컬렉션) {
			
		}*/
		
		String input="이나영,김수진,장소예,최현아";
		String regex="\\s*,\\s*";
		String nameArr[]=input.split(regex);
		
		for (String name : nameArr) {
			System.out.println(name);
		}
		
		
	}

}
