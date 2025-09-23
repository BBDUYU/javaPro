package days27;

import java.io.File;
import java.io.FileFilter;
import java.util.Date;

import com.util.FileUtil;

/**
 * @author Osj  
 * @date   2025. 9. 23. 오후 2:37:23
 * @subject 
 * @content 
 */
public class Ex04_03 {

	public static void main(String[] args) {
		//days26 폴더 안에 있는 .png 파일만 정보를 출력
		
		String path=".\\src\\days26";
		File f = new File(path);
		
//		File fileName = new File(path);

		
		File list[]=f.listFiles((t) ->{
				String ext=FileUtil.getExtension(t.getName());
				return ext.equals(".png");
			
		});
		
		/*
		File list[] = parent.listFiles();
		for (int i = 0; i < list.length; i++) {
			File f = list[i];
			String fname=f.getName();
			if (f.isFile()) {
				String fileName=f.getName();
				String ext=FileUtil.getExtension(fileName);
				if(ext.equals(".png")) {
		               System.out.println( fileName );
				}
			}
		}
		*/
		
	}

}
