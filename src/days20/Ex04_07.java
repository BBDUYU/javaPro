package days20;

import java.io.FileReader;

public class Ex04_07 {

	public static void main(String[] args) {
		String userDir=System.getProperty("user.dir");
		//System.out.println(userDir);
		int lineNum=1; //ㄷ 앞에 라인넘버
		int word=0;//읽어올 글자
		String fileName="./src/days20/학생명단.txt";
		try (FileReader fr=new FileReader(fileName)){
			System.out.printf("%d : ",lineNum++);
			while ((word=fr.read())!=-1) {
				System.out.printf("%c",word);
				if(word==10) System.out.printf("%d : ",lineNum++);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
