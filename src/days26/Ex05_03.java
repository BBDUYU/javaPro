package days26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;

/**
 * @author Osj  
 * @date   2025. 9. 22. 오후 2:44:19
 * @subject 파일 입출력 (파일 복사) 
 * @content FileReader 버퍼기능이 있는 보조 스트림을 사용해 성능향상
 * 			FileWriter
 * 
 * 			버퍼 보조 스트림
 * 			BufferedReader
 * 			BufferedWriter
 * 			 
 */
public class Ex05_03 {

	public static void main(String[] args) {
		String userDir=System.getProperty("user.dir");

		//원본
		String originalFile=String.format("%s\\src\\days26\\%s",userDir,"Ex01.java");
		//		System.out.println(originalFile);

		//복사복
		String copiedFile=String.format("%s\\src\\days26\\%s",userDir,"Ex01_복사.java");

		//처리시간 : 3933300ns
		//처리시간 : 828800ns

		fileCopy_textStream(originalFile,copiedFile);
		System.out.println(" end ");
	}

	private static void fileCopy_textStream(String originalFile, String copiedFile) {
		long startTime=System.nanoTime();
		int n;
		final int BUFFER_SIZE=1024;
		try (FileReader fr=new FileReader(originalFile);
				BufferedReader br = new BufferedReader(fr,BUFFER_SIZE);
				FileWriter fw = new FileWriter(copiedFile);
				BufferedWriter bw = new BufferedWriter(fw,BUFFER_SIZE);
				){
			char cbuf[]=new char[BUFFER_SIZE];
			while((n=br.read(cbuf))!=-1) {
//				System.out.printf("%c",code);
				//cbuf배열의 0 위치부터 읽어온 수 n 위치까지만 파일로 저장
				bw.write(cbuf, 0, n);
			}
			bw.flush(); // 쓰기 작업 (스트림 저장후 비우기)
			//자동 fw.close() + flush()
		} catch (Exception e) {
		}
		long endTime=System.nanoTime();
		System.out.println("처리시간 : "+(endTime-startTime)+"ns");
	}
}
