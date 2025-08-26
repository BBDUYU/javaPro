package days07;

public class Ex03 {

	public static void main(String[] args) {
		
		//ASCII 0~255
		//0~31 제어문자
		//32~127 일반문자(숫자,대문자,소문자)
		//128~
		
		for(int i=0;i<256;i++) {
			
			System.out.printf("[%d]('%c')\n",i,(char)i);
		}
		//13 CR	'\r'
		//10 LF '\n'
		
	}//main

}//class
