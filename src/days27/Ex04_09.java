package days27;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Osj  
 * @date   2025. 9. 23. 오후 4:49:39
 * @subject 
 * @content 매일 아침마다 팀 폴더
 * 			2025-09-23
 * 				ㄴ 1조
 * 					ㄴ홍길동 
 * 					ㄴ홍길동 
 * 					ㄴ홍길동 
 * 				ㄴ 2조
 * 					ㄴ홍길동 
 * 					ㄴ홍길동 
 * 					ㄴ홍길동 
 * 				ㄴ 3조
 * 					ㄴ홍길동 
 * 					ㄴ홍길동 
 * 					ㄴ홍길동 
 */
public class Ex04_09 {

	public static void main(String[] args) {
		String parent="C:\\temp\\";
		LocalDate now = LocalDate.now();
		String pattern="yyyy-MM-dd(E)";
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern(pattern);
		String strNow=now.format(dtf);
		
		parent=parent.concat(strNow);
		//C:\temp\2025-09-23(화)\1조\홍길동
		System.out.println(parent);
		String fileName=".\\src\\days25\\1차_팀편성.txt";
		try (FileReader fr = new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr)){
			String line=null;
			String regex="[:/,-]";
			String teamName=null;
			String memberName=null;
			String pathName=null;
			while ((line=br.readLine())!=null) {
				System.out.println(line);
				String tiArr[]=line.split(regex);
				teamName=tiArr[0];
				for (int i = 1; i < tiArr.length; i++) {
					memberName=tiArr[i];
					pathName=String.format("%s\\%s\\%s", parent,teamName,memberName);
					System.out.println(pathName);
					File f = new File(pathName);
					System.out.println( f.mkdirs());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" end ");
	}

}
