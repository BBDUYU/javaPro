package days02;

/**
 * @author Osj  
 * @date   2025. 8. 19. 오후 2:11:20
 * @subject 이스케이프 문자 
 * @content \" \' \\ \t \n \r
 */
public class Ex07 {

	public static void main(String[] args) {
		String result="유비\r\"관우\"\n장\t비";
		System.out.println(result);
		// \n 라인피드 LF 개행문자
		// \r 캐리지 리턴 CR 
		//엔터 -> CR LF \r\n
	}

}
