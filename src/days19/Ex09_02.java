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
 * 			자동으로 리소스를 닫기 : try with resources
 * 			
 */
public class Ex09_02 {

	public static void main(String[] args) {
		String fileName="C:\\Class\\JavaClass\\javaPro\\src\\days19\\Ex01.java";
		
		
		
		int one=0;
		try (FileReader fr=new FileReader(fileName);){ //try with resources
			while ((one=fr.read())!=-1) {
				System.out.printf("%c",one);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" end ");
	}

}
