package days19;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Osj  
 * @date   2025. 9. 11. 오후 4:20:58
 * @subject 리소스 자동 닫기 
 * @content - 파일, DB
 * 				한 라인씩 읽어와서 출력
 * 			
 */
public class Ex09_04 {

	public static void main(String[] args) {
		String fileName="C:\\Class\\JavaClass\\javaPro\\src\\days19\\Ex01.java";
		int lineNum=1;
		String line=null; //한 라인 읽어와서 저장할 변수
		try (FileReader fr=new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr)){ //Reader in 매개변수 다형성
			while ((line=br.readLine())!=null) {
				System.out.printf("%d: %s\n",lineNum++,line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" end ");
	}

}
