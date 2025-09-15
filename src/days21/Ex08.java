package days21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Osj  
 * @date   2025. 9. 15. 오후 12:20:22
 * @subject Ex01.java 파일을 읽어와서
 * @content A() B() 갯수 출력 + 막대그래프
 */
public class Ex08 {

	public static void main(String[] args) {
		String fileName=".\\src\\days21\\Ex01.java";

		
		//counts[0] = 알파벳 A의 갯수 저장
		//counts[1] = 알파벳 B의 갯수 저장
		//	...
		//counts[25]= 알파벳 Z의 갯수 저장
		int counts[]=new int[26];
		int one=0;
		try (FileReader fr=new FileReader(fileName);){

			while ((one=fr.read())!=-1) {
				one=Character.toUpperCase(one);
				//if('A'<=one&&one<='Z') {					
				if(Character.isUpperCase(one)) {
					int index=one-'A';
					counts[index]++;
				}
			}
//			System.out.println(Arrays.toString(counts));
			for (int i = 0; i < counts.length; i++) {
				System.out.printf("%c(%02d) : %s\n",i+'A',counts[i],"#".repeat(counts[i]));				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" end ");
	}
}
