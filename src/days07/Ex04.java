package days07;

import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) throws IOException {

		char ch;
		System.out.print("> 한문자 입력 ? ");
		int input=System.in.read();//1 실행
		ch=(char)input;//2 ch에 대입
		System.out.println(ch);//3 출력
		
//		System.in.read();//10버리기
//		System.in.read();//13버리기
		
		System.in.skip(System.in.available()); //입력되어있는 사용가능 데이터 스킵
		
		System.out.print("> 한문자 입력 ? ");//4 출력
		input=System.in.read();//실행 X
		ch=(char)input;
		System.out.println(ch);
		
		
//		Scanner scanner = new Scanner(System.in);      
//		System.out.print("> 한 문자 입력 ? ");      
//		String input = scanner.next();
//		char ch = input.charAt(0);      
////		System.out.printf( "'%c'", ch );
//		System.out.printf( "'%d'", (int)ch );
		
	}

}
