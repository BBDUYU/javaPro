package days26;

import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Osj  
 * @date   2025. 9. 22. 오후 2:10:50
 * @subject 파일 입출력 
 * @content 		
 * 		Ex01.java -> 			-> Ex01_02.java
 * 		파일 입스					출스		파일저장
 * 
 * 		FileReader/FileWriter 를 사용
 * 		
 * 		File 클래스 사용
 * 			ㄴ 파일을 다루기 위한 기능이 구현된 클래스
 * 				ㄴ 파일정보, 생성,수정,삭제
 */
public class Ex05 {

	public static void main(String[] args) {
		String userDir=System.getProperty("user.dir");
		System.out.println(userDir);
		
		String parent=String.format("%s\\src\\days26", userDir);
//		System.out.println(parent);
		int code;
		String child="Ex01.java";
		File file=new File(parent, child);
		
		try (FileReader fr=new FileReader(file)){
			String fileName=file.getName();
			long fileLength=file.length();
			long lmTime = file.lastModified();
			
			Date d=new Date(lmTime);
			//System.out.println(d.toLocaleString());
			/*
			Calendar c = Calendar.getInstance();
			String pattern = "yyyy. MM. dd. hh:mm:ss E요일"; 
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			String strD = sdf.format(lmTime);
			strD = sdf.format(c.getTime());
			*/
			System.out.printf("> fileName : %s, %d(bytes), %s\n",fileName,fileLength,d.toLocaleString());
			
			while((code=fr.read())!=-1) {
//				System.out.printf("%1$d(%1$c)\n",code);
				System.out.printf("%c",code);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
