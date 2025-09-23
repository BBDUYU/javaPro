package days27;

import java.io.File;

/**
 * @author Osj  
 * @date   2025. 9. 23. 오후 3:25:49
 * @subject days27 폴더 안에 upload폴더가 있는지 확인후 
 * @content 만약 없으면 upload 폴더 생성
 */
public class Ex04_05 {

	public static void main(String[] args) {
		File parent = new File(".\\src\\days27");
		
		File uf = new File(parent,"upload");
		
		//[2] days27/upload 폴더가 있는지 확인후 있으면 upload폴더 삭제
		System.out.println(uf.exists());
		if (uf.exists()) {
			System.out.println( uf.delete()); 
		}
		/* [1] 폴더 생성 코딩
//		System.out.println(uf.exists());
		if (!uf.exists()) {
			System.out.println( uf.mkdir()); // days27\\temp\\upload X
			//System.out.println(uf.mkdirs()); // days27\\temp\\upload O
			
		}
		*/
	}

}
