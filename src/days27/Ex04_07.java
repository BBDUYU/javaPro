package days27;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.util.FileUtil;

/**
 * @author Osj  
 * @date   2025. 9. 23. 오후 4:19:46
 * @subject 1. 시간표.pdf 파일을 50kb씩 잘라서 
 * @content    시간표_1.pdf 50kb
 * 			   시간표_2.pdf 50kb
 * 					...
 * 			   시간표_9.pdf
 */
public class Ex04_07 {

	public static void main(String[] args) {
		String parent=".\\src\\days27";
		String child="시간표.pdf";
		File f =new File(parent,child);
		//443093 bytes -> 432.70 kb
		System.out.println("> 파일크기 : "+f.length()+" bytes");
		
		final int VOLUME=1024*50; //50kb
		String baseName=FileUtil.getBaseName(f.getName()); // 파일명
		String ext=FileUtil.getExtension(f.getName());	   // 확장자
		
		FileOutputStream fos=null; // 9개 필요
		BufferedOutputStream bos=null;
		int index=0;
		int code=-1;
		int count=0; //50kb 파일 쓰기, 새 파일 스트림 생성
		
		try (FileInputStream fis = new FileInputStream(f);
				BufferedInputStream bis= new BufferedInputStream(fis)){
			while ((code=bis.read())!=-1) { //EOF
				if (count%VOLUME==0) {
					if(count!=0)bos.close(); // 저장
					
					//새로운 시간표_2.pdf 저장하기위한 출력스트림생성
					child=String.format("%s - %d%s", baseName,++index,ext);
					File temp=new File(parent, child);
					fos=new FileOutputStream(temp);
					bos=new BufferedOutputStream(fos);
				}
				bos.write(code); //쓰기
				
				count++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" end ");
	}

}
