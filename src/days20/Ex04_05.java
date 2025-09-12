package days20;

/**
 * @author Osj  
 * @date   2025. 9. 12. 오후 3:05:40
 * @subject 과제
 * @content 
 */
public class Ex04_05 {

	public static void main(String[] args) {

		String [] urls = {
				"http://www.naver.com"
				,"www.naver.com"
				, "ftp://www.naver.com" 
				,"https://www.naver.com"
				,"http://www.sist.co.kr"
				,"http://www.iei.orkr"
		};
		/*	[문제]
		 * 	urls 배열에서 인터넷주소가 kr로 끝나는 인터넷주소를 모두출력
		 * 
		 * */
		for(int i = 0; i < urls.length; i++) {
			String url=urls[i];
			
			// [3]
			//String regex="www"; //www
			//String regex="^www$"; //www
//			String regex="www.*"; //www
//			String regex="www.+"; //www.+한문자이상
			String regex=".*\\.kr"; //.kr로 끝남
			
			if(url.matches(regex)) System.out.printf("%s\n",urls[i]);

			// [2]
			//if(url.endsWith("kr")) System.out.printf("%s\n",urls[i]);

			
			/* [1]
			if(url.substring(url.length()-2).equals("kr")) {
				System.out.printf("%s\n",url);
			}
			*/
		}
		/* 정규표현식-실패
		for(int i = 0; i < urls.length; i++) {
			String regex= "..kr";
			String url=urls[i];
			if(url.endsWith("kr")) System.out.printf("%s\n",urls[i]);
		}
		/* endsWith - 성공
		for(int i = 0; i < urls.length; i++) {
			String url=urls[i];
			if(url.endsWith("kr")) System.out.printf("%s\n",urls[i]);
		}
		*/
		
		
		// ftp://,http://로 시작하는 주소
		// boolean startsWith
		/*
		for (int i = 0; i < urls.length; i++) {
			String url=urls[i];
			if(url.startsWith("http://")) System.out.printf("%s\n",urls[i]);
		}
*/

		//compareTo() 문자열을 비교하는 메서드
		/*[1]
		System.out.println("abc".equals("abc"));	//t
		System.out.println("abc".equalsIgnoreCase("abc"));	//t
		System.out.println("abc".compareTo("abc"));	//0
		System.out.println("abc".compareTo("Abc"));	//32	
		System.out.println("Abc".compareTo("abc")); //-32
		System.out.println("Abc".compareToIgnoreCase("abc")); //0
		 */
	}

}
//[과제] 회원가입
/*
 * 		비밀번호 입력
 * 		1. 문자열 길이 8~15
 * 		2. 알파벳 대문자 반드시 1개 이상
 * 		3. 알파벳 소문자 반드시 1개 이상
 * 		4. 특수문자 반드시 1개 이상
 * 
 * 		정규표현식
 * 
 * */