package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Osj  
 * @date   2025. 8. 19. 오후 3:05:53
 * @subject 문자열을 기본타입으로 변환 
 * @content 키보드로 이름을 입력받아서 처리
 */
public class Ex09 {

	public static void main(String[] args) throws IOException {
		
		//java.io.BufferedReader br=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름을 입력하세요 : ");
		
		String input_data=br.readLine();
		String name=input_data;
	
		System.out.println("입력된 이름은 "+name+"입니다");
		
		
	}

}
