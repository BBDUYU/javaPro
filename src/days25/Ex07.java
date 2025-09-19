package days25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author Osj  
 * @date   2025. 9. 19. 오후 2:36:38
 * @subject Map - Properties 컬렉션 클래스
 * @content 		ㄴ String key, String value
 * 					ㄴ Hashtable의 자식클래스
 * 					ㄴ 주로 설정 정보를 저장하고 읽어올 목적으로 사용
 */
public class Ex07 {

	public static void main(String[] args) {
		//DB 연결 설정 정보
		String url=null;
		String user=null;
		String password=null;
		String className=null;
		String fileName="./src/days25/oracle.config";
		//파일저장 -> 파일 읽어와서 사용
		try(FileReader fr=new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr)) {
			String line = null;
			while ((line=br.readLine())!=null) {
				String kv[]=line.split("=");
				String key=kv[0];
				String value=kv[1];
				System.out.printf("%s=%s\n",key,value);
			}
		} catch (Exception e) {
				e.printStackTrace();
		}
		
	}

}
