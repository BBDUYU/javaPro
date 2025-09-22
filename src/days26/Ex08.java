package days26;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author Osj  
 * @date   2025. 9. 22. 오후 4:43:30
 * @subject  문자 읽기
 * @content 
 */
public class Ex08 {

	public static void main(String[] args) {
		InputStream is=System.in;

		System.out.print("한 문자 입력 > ");
		try {
//			byte b[]=new byte[3];
//			int n=is.read();
//			char one=new String(b).charAt(0);
//			System.out.println(one);
			/* 한글자만 읽음
			InputStreamReader isr = new InputStreamReader(is);
			int code = isr.read();
			System.out.printf("%1$d - %1$c\n",code);
			*/
			
			BufferedReader br=new BufferedReader(new InputStreamReader(is)); //입력받은 모든라인 읽음
			String name=br.readLine();
			System.out.println(name);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
