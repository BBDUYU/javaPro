package days19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Osj  
 * @date   2025. 9. 11. 오후 4:20:58
 * @subject 리소스 자동 닫기 
 * @content - 파일, DB
 * 			open() -> close()
 * 			
 */
public class Ex09 {

	public static void main(String[] args) {
		String fileName="C:\\Class\\JavaClass\\javaPro\\src\\days19\\Ex01.java";
		// FileReader 클래스
		// FileWriter 클래스
		
		FileReader fr=null;
		int one=0;
		try {
			fr=new FileReader(fileName);
			//one=fr.read();
			//System.out.printf("%1$d(%1$c)\n",one);
			//EOF - EndOfFile 파일 끝
			while ((one=fr.read())!=-1) {
				
				System.out.printf("%c",one);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}catch (NullPointerException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(" end ");
	}

}
