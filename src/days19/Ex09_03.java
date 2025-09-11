package days19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Osj  
 * @date   2025. 9. 11. 오후 4:20:58
 * @subject 리소스 자동 닫기 
 * @content - 파일, DB
 * 			각 라인앞에 라인번호 붙이기
 * 			
 */
public class Ex09_03 {

	public static void main(String[] args) {
		String fileName="C:\\Class\\JavaClass\\javaPro\\src\\days19\\Ex01.java";
		
		
		int lineNum=1;
		int one=0;
		try (FileReader fr=new FileReader(fileName);){ //try with resources
			System.out.printf("%d: ",lineNum++);
			while ((one=fr.read())!=-1) {
				System.out.printf("%c",one);
				//one == /r/n -13, 10
				if(one==10) {
					System.out.printf("%d: ",lineNum++);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" end ");
	}

}
