package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Osj  
 * @date   2025. 8. 19. 오후 4:05:15
 * @subject 이름을 키보드로 입력받아서 출력 
 * @content  
 * 				입력형식)
 * 				> 이름 입력 ? 
 * 				출력형식)
 *  			이름 : 홍길동
 */
public class Ex10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		// System.in -> 바이트 입력
		// InputStreamReader -> 문자로 변경
		// BufferedReader -> 버퍼링된 문자 입력
		
		// 버퍼링된 문자를 입력할 br 생성 
		// -> System.in으로 바이트입력 
		// -> InputStreamReader를 통해 문자로변경
		// -> 그 값을 new를 통해 초기화
		// 그 후 br에 대입
		
		System.out.print("> 이름 입력 ? ");
		// 문자열 출력 후 
		
		String name=br.readLine();
		// br에 들어있는 값을 통째로 읽음
		
		System.out.println("이름 : "+name);
	}

}
