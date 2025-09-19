package days25;

import java.io.FileWriter;

/**
 * @author Osj  
 * @date   2025. 9. 19. 오후 2:36:38
 * @subject Map - Properties 컬렉션 클래스
 * @content 		ㄴ String key, String value
 * 					ㄴ Hashtable의 자식클래스
 * 					ㄴ 주로 설정 정보를 저장하고 읽어올 목적으로 사용
 */
public class Ex06 {

	public static void main(String[] args) {
		//DB 연결 설정 정보
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="scott";
		String password="tiger";
		String className="oracle.jdbc.driver.OracleDriver";
		String fileName="./src/days25/oracle.config";
		//파일저장 -> 파일 읽어와서 사용
		try(FileWriter fw=new FileWriter(fileName)) {
			fw.write(String.format("%s=%s\r\n", "className",className));
			fw.write(String.format("%s=%s\r\n", "url",url));
			fw.write(String.format("%s=%s\r\n", "user",user));
			fw.write(String.format("%s=%s\r\n", "password",password));
		} catch (Exception e) {
				e.printStackTrace();
		}
		
	}

}
