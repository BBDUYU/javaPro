package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11 {

	public static void main(String[] args) throws IOException {
		//키보드로 이름, 나이, 성별 입력
		//출력형식)
		//	이름은 "홍길동"이고, 나이는 24살이고, 성별은 true입니다
		String name;
		byte age;
		boolean gender;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("1. 이름 입력 : ");
		name=br.readLine();
		
		System.out.print("2. 나이 입력 : ");
		//age=(byte)br.readLine(); -> 불가 String - X -> byte 
		age=Byte.parseByte(br.readLine()); //parse 기본형변환
		
		System.out.print("3. 성별 입력 : ");
		gender=Boolean.parseBoolean(br.readLine());
		
		System.out.println("이름은 \""+name+"\"이고, 나이는 "+age+"살이고, 성별은 "+gender+"입니다");
		
		
		
	}

}
