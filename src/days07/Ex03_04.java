package days07;

import java.io.IOException;

/**
 * @author Osj  
 * @date   2025. 8. 26. 오후 12:08:45
 * @subject 
 * @content 각 라인마다 라인번호
 */
public class Ex03_04 {

	public static void main(String[] args) throws IOException {
		for(int i=0,count=1,lineNum=1;i<256;i++,count++) {
			
			if(count==1)System.out.printf("%02d: ",lineNum++);
			
			System.out.printf("[%c]",(char)i);
			if(count%10==0) {
				System.out.println();
				count=0;
			}
			if(i%50==49) {
				System.out.println("> 엔터치면 계속");
				System.in.read();
				System.in.skip(System.in.available());
			}
		}
	}

}
