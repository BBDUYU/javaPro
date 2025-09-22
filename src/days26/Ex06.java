package days26;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Osj  
 * @date   2025. 9. 22. 오후 3:28:14
 * @subject 
 * @content 
 */
public class Ex06 {

	public static void main(String[] args) {
		String originalFile="C:\\Program Files\\Kakao\\KakaoTalk\\KakaoTalk.exe";

		
		String copiedFile=String.format(".\\KakaoTalk-복사.exe");

		fileCopy_byteStream(originalFile,copiedFile);
		System.out.println(" end ");
	}

	private static void fileCopy_byteStream(String originalFile, String copiedFile) {
		long startTime=System.nanoTime();
		int code;
		try (FileInputStream fis=new FileInputStream(originalFile);
				FileOutputStream fos = new FileOutputStream(copiedFile)){
			while((code=fis.read())!=-1) {
				fos.write(code);
			}
			fos.flush(); 
		} catch (Exception e) {
		}
		long endTime=System.nanoTime();
		//처리시간 : 82621525600ns
		System.out.println("처리시간 : "+(endTime-startTime)+"ns");
	}
	
	

}
