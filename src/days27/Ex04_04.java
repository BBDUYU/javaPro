package days27;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.util.FileUtil;

/**
 * @author Osj  
 * @date   2025. 9. 23. 오후 3:10:37
 * @subject days26 폴더를 검색 "제네릭" 문자열을 가지고있는 파일을 출력 
 * @content 특정 문자 찾기
 */
public class Ex04_04 {

	public static void main(String[] args) {
		File d = new File(".\\src\\days26");
		String word="제네릭";
		
		File jlist[]=d.listFiles((n)->{
			String ext=FileUtil.getExtension(n.getName());
			return ext.equals(".java");
		});
		
		int lineNum=1;
		System.out.printf("Path\t\tLine\tText\n");

		for (int i = 0; i < jlist.length; i++) {
			File jf = jlist[i];
			lineNum=1;
			String fileName=jf.getName();
			try (FileReader fr = new FileReader(jf);
					BufferedReader br = new BufferedReader(fr)){
				String line=null;
				while ((line=br.readLine())!=null) {
					if(line.contains(word)) {
						System.out.printf("%s\t%d\t%s\n",fileName,lineNum,line.replaceAll(word, "<"+word+">"));
					}
					lineNum++;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
