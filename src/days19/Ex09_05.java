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
public class Ex09_05 {

	public static void main(String[] args) {
		//절대경로
		//상대경로
		//user.dir -> 프로젝트파일
		
		// . 상대경로 기호 : 현재 디렉토리
		String userDir = System.getProperty("user.dir");
		//System.out.println(userDir);
		//String fileName=".\\src\\days19\\Ex01.java"; //상대경로 코딩
		//String fileName=userDir+"\\src\\days19\\Ex01.java"; //절대경로 코딩
		//String fileName=".classpath"; //현재디렉터리 파일명
		String fileName="..\\Sample.java"; // 상위폴더로 이동 -> ..
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
