package days26;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Osj  
 * @date   2025. 9. 22. 오후 3:28:14
 * @subject 보조스트림을 사용해 파일 복사
 * @content 바이트 스트림 XXXInputStream, XXXOutputStream
 * 					  FileInputStream, FileOutputStream
 * 					  버퍼 기능이 있는 바이트 보조 스트림을 사용해서 코딩 수정
 * 					  BufferedInputStream, BufferedOutputStream
 */
public class Ex06_02 {

	public static void main(String[] args) {
		String originalFile="C:\\Program Files\\Kakao\\KakaoTalk\\KakaoTalk.exe";
		String copiedFile=String.format(".\\KakaoTalk-복사.exe");

		fileCopy_byteStream(originalFile,copiedFile);
		System.out.println(" end ");
	}

	private static void fileCopy_byteStream(String originalFile, String copiedFile) {
		long startTime=System.nanoTime();
		final int BUFFER_SIZE=1024;

		int n;
		try (FileInputStream fis=new FileInputStream(originalFile);
				BufferedInputStream bis=new BufferedInputStream(fis, BUFFER_SIZE);
				
				FileOutputStream fos = new FileOutputStream(copiedFile);
				BufferedOutputStream bos=new BufferedOutputStream(fos, BUFFER_SIZE)
				){
			byte b[]=new byte[BUFFER_SIZE];
			while((n=bis.read(b))!=-1) {
				bos.write(b,0,n);
			}
			bos.flush(); 
		} catch (Exception e) {
		}
		long endTime=System.nanoTime();
		//처리시간 : 82621525600ns
		//처리시간 : 114733000ns

		System.out.println("처리시간 : "+(endTime-startTime)+"ns");
	}
	
	

}
