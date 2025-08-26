package days07;

import java.util.Scanner;

/**
 * @author Osj  
 * @date   2025. 8. 26. 오후 2:54:54
 * @subject 
 * @content 
 */
public class Ex06 {

	public static void main(String[] args) {
//		[문제] 한 문자를 입력받아서
//		숫자, 한글, 특수문자, 대문자, 소문자 등등 파악해서 출력
		char one;
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 한 문자를 입력 :  ");
		String input=scanner.next();
		one =input.charAt(0);
		System.out.printf("one='%c'",one);
		
		if ('0'<=one&&one<='9') {
			System.out.println("숫자");
		}else if('A'<=one&&one<='Z') {
			System.out.println("대문자");
		}else if('a'<=one&&one<='z') {
			System.out.println("소문자");
		}else if(one=='!'||one=='@'||one=='#'||one=='$') {
			System.out.println("특수문자");
		}else if('가'<=one&&one<='힣'||'ㄱ'<=one&&one<='ㅎ'||'ㅏ'<=one&&one<='ㅣ') {
			System.out.println("한글");
			// str.matches(".*[ㄱ-ㅎㅏ-ㅣ가-힣].*")
		}else {
			System.out.println("입력잘못");
		}
	}

}
