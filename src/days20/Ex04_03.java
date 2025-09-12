package days20;

public class Ex04_03 {

	public static void main(String[] args) {
		String s="public static void main(String[] args)";
		//s 문자열속 st 문자열의 위치를 출력
		/*
		int index s.indexOf(매개변수) 
		int index s.lastIndexOf(매개변수)
		boolean s.contains(매개변수)
		 */
		/*
		int index=s.toLowerCase().indexOf("st");
		System.out.println(index);

		index=s.toLowerCase().lastIndexOf("st");
		System.out.println(index);
		 */

		//[1] 문제
		/*	s 문자열 속에 대소문자 상관없이 's'를 찾아서
		 * 	모든 위치값을 출력하고
		 * 	2번째 s를 한글 에스 로 변경
		 * */
		/*
		 * 
		 * indexOf(ch,fromIndex)
		 * Parameters:
			ch a character (Unicode code point).
			fromIndex the index to start the search from.
		 * 
		 * */
		/*
		int findIndex=0; 
		int count=0;
		while (true) {
			int index = s.toLowerCase().indexOf('s',findIndex);//찾기 시작할 위치 지정
			if (index==-1) break;
			/*
		 *	 7
				24
				26 ? line 51 index 코딩 오류로 뒤로밀린 s가 한번더찍힘
				38
		 * */
		/*
			System.out.println(index);
			count++;//index 순서

			if(count==2) {
				//public static void main(에스String[] args)
				//s=s.substring(0,index)+"에스"+s.substring(index);//0~두번째 s위치-1  +에스+ 두번째s부터 끝까지
				s=s.substring(0,index)+"에스"+s.substring(index+1);
			}
			findIndex=index+1;//찾은위치+1


		}
		System.out.printf("%s",s);
		 */
		String s2=s.toLowerCase();
		String word="s";
		int index=-1;
		int fromIndex = 0;
		int count=1;
		
		int secondIndex=-1;
		
		while ((index = s2.indexOf(word, fromIndex))!=-1) {
		
			System.out.println(index);// 7
			if(count==2)secondIndex=index;
			fromIndex = index + word.length();
			count++;
		}
		System.out.println("secondIndex -> "+secondIndex);
		//replace
		
		System.out.println(s2.replace('s', 'X'));
		System.out.println(s2.replace("s", "에스"));
		System.out.println(s2.replaceAll("s", "에스"));
		System.out.println(s2.replaceFirst("s", "에스"));
		
		System.out.println(s2.substring(0,secondIndex)+"에스"+s2.substring(secondIndex+1));
		

	}

}
