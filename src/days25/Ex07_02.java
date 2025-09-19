package days25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

/**
 * @author Osj  
 * @date   2025. 9. 19. 오후 2:36:38
 * @subject 
 * @content 	
 * 			properties 파일 읽기 - Properties 컬렉션 클래스로	
 */
public class Ex07_02 {

	public static void main(String[] args) {
		//DB 연결 설정 정보
		String url=null;
		String user=null;
		String password=null;
		String className=null;
		String fileName="./src/days25/oracle.properties";
		//파일저장 -> 파일 읽어와서 사용
		try(FileReader fr=new FileReader(fileName)) {
			Properties p = new Properties();
			//load() 메서드 기능 : oracle.properties 파일로부터 읽어와서 Properties 객체 p에 저장	
			p.load(fr);
			className=p.getProperty("className");
			url=p.getProperty("url");
			user=p.getProperty("user");
			password=p.getProperty("password");
			
			System.out.println(className);
			System.out.println(url);
			System.out.println(user);
			System.out.println(password);
			
		} catch (Exception e) {
				e.printStackTrace();
		}
		
	}

}
