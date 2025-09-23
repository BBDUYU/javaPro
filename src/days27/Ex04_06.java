package days27;

import java.io.File;

/**
 * @author Osj  
 * @date   2025. 9. 23. 오후 3:39:20
 * @subject  
 * @content 
 */
public class Ex04_06 {

	public static void main(String[] args) {
		/*
		days27
			ㄴ temp 폴더
				ㄴ 1조
				ㄴ 2조
				ㄴ 3조
		*/
		/* [1]
		File d1 = new File(".\\src\\days27\\temp\\1조");
		d1.mkdirs();
		File d2 = new File(".\\src\\days27\\temp\\2조");
		d2.mkdirs();
		File d3 = new File(".\\src\\days27\\temp\\3조");
		d3.mkdirs();
		*/
		/* [2]
		String parent=".\\src\\days27\\temp";
		for (int i = 1; i < 4; i++) {
			String child=String.format("%d조", i);
			File d = new File(parent,child);
			d.mkdirs();
		}
		*/
		
		// 문제  - 하위 폴더 전체 삭제
		String pathname=".\\src\\days27\\temp";
		File temp = new File(pathname);
		
		//재귀함수 선언
		directoryDelete(temp);
		
		System.out.println(" end ");
		
//		System.out.println(d.exists());
		/*
		if(d.exists()) {
			System.out.println( d.delete());
		}
		*/
		
		
	}

	private static void directoryDelete(File f) {
		while (!f.delete()) {
			//하위폴더존재
			File list[]=f.listFiles();
			for (int i = 0; i < list.length; i++) {
				File t = list[i];
				if (t.delete()) {
					System.out.printf("%s 삭제완료\n",t.getName());
				}else {
					directoryDelete(t);
				}
			}
		}
	}

}
