package days27;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author Osj  
 * @date   2025. 9. 23. 오후 4:40:05
 * @subject 시간표.pdf 
 * @content 시간표_1.pdf ~ 시간표_9.pdf -> 하나의 시간표2.pdf로 합치기
 * 시간표 합치기
 */
public class Ex04_08 {
	public static void main(String[] args) throws IOException {
		
		
		Vector<FileInputStream> v = new Vector<>();
		for (int i = 1; i <=9 ;i++) {
			FileInputStream fis=new FileInputStream(".\\src\\days27\\시간표 - "+i+".pdf");
			v.add(fis);
		}
		Enumeration<FileInputStream>en=v.elements();
		SequenceInputStream sis=new SequenceInputStream(en);
		
		try (FileOutputStream fos = new FileOutputStream(".\\src\\days27\\시간표2.pdf")){
			int b;
			while((b=sis.read())!=-1) {
				fos.write(b);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

