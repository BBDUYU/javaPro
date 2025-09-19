package days25;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.util.Properties;

/**
 * @author Osj  
 * @date   2025. 9. 19. 오후 2:36:38
 * @subject Map - Properties 컬렉션 클래스
 * @content 		ㄴ String key, String value
 * 					ㄴ Hashtable의 자식클래스
 * 					ㄴ 주로 설정 정보를 저장하고 읽어올 목적으로 사용
 */
public class Ex06_02 {

	public static void main(String[] args) {
		//DB 연결 설정 정보
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		String className="oracle.jdbc.driver.OracleDriver";
		//		String fileName="./src/days25/oracle.properties";
		String fileName="./src/days25/oracle.xml";
		//파일저장 -> 파일 읽어와서 사용

		Properties p = new Properties();
		p.setProperty("className", className);
		p.setProperty("url", url);
		p.setProperty("user", user);
		p.setProperty("password", password);

		//		try (FileWriter fw=new FileWriter(fileName)){
		try (FileOutputStream fos=new FileOutputStream(fileName) ){
			//			p.store(fw, "Oracle Database Config");		
			p.storeToXML(fos, "Oracle Database Config");
			System.out.println(" end ");
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
