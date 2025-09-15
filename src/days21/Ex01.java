package days21;

/**
 * @author Osj  
 * @date   2025. 9. 15. 오전 8:59:04
 * @subject 
 * @content 
 */
public class Ex01 {

	public static void main(String[] args) {
		//		System.out.println(solution(3));
		//		System.out.println(solution(4));
		//		System.out.println(solution(1));
		//		System.out.println(solution(10));
		System.out.println(solution(3));
		System.out.println(solution(4));
	}

	private static String solution(int n) {
		StringBuffer sb = new StringBuffer(n);
		for (int i = 0; i < n; i++) {
			sb.append(i%2==0?"수":"박");
		}	   
		return sb.toString();
	}
//	StringBuffer sb = new StringBuffer(n); //문자열 처리
//
//
//    for (int i = 0; i < n; i++) {
//    	
//    	if (i % 2 == 0) {
//            sb.append("수"); // 
//        } else {
//            sb.append("박");
//        } 
//    }
//
//    return sb.toString(); //sb.append + 
//
}
/*
길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수
      , solution을 완성하세요. 
      예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.

      제한 조건
      n은 길이 10,000이하인 자연수입니다.
      입출력 예
      n   return
      3   "수박수"
      4   "수박수박"
 */
