package days27;

import java.io.File;
import java.io.IOException;

import com.util.FileUtil;

/**
 * @author Osj  
 * @date   2025. 9. 23. 오후 2:00:51
 * @subject 
 * @content 
 */
public class Ex04 {

	public static void main(String[] args) throws IOException {
		//File 클래스
		// 파일 또는 폴더를 다룰 수 있는 기능이 구현
		
		String pathname=".\\src\\days27\\Ex01.java";
		File f = new File(pathname);
		//.\src\days27\Ex01.java
		System.out.println(f.getPath());
		//C:\Class\JavaClass\javaPro\.\src\days27\Ex01.java
		System.out.println(f.getAbsolutePath());
		//C:\Class\JavaClass\javaPro\src\days27\Ex01.java
		System.out.println(f.getCanonicalPath());
		
		System.out.println("=".repeat(100));
		
		
//		System.out.println(f.exists()); 존재유무
		if (f.exists()) {
			System.out.println(f.isDirectory());//false
			System.out.println(f.isFile());//true
			System.out.println(f.length()+" (bytes)");
		}
		System.out.println(File.separator);		// \ 
		System.out.println(File.pathSeparator); // ;
		String name=f.getName();
		System.out.println(name);
		
		// 확장자만
		
		// 확장자를 제외한
//		name.split(".");
		int pos = name.indexOf(".");
		String baseFilename=name.substring(0,pos);
		String ext=name.substring(pos);
		System.out.println(baseFilename);
		System.out.println(ext);
		//com.util.FileUtil.java
		
		baseFilename = FileUtil.getBaseName(name);
		ext=FileUtil.getExtension(name);
		System.out.println(baseFilename);
		System.out.println(ext);
		
		
	}

}
