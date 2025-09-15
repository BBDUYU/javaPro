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
public class Ex08_02 {

	public static void main(String[] args) {
		String fileName=".\\src\\days21\\Ex01.java";

		
		//counts[0] = 알파벳 A의 갯수 저장
		//counts[1] = 알파벳 B의 갯수 저장
		//	...
		//counts[25]= 알파벳 Z의 갯수 저장
		int Acounts[]=new int[26];//대문자 갯수
		int acounts[]=new int[26];//소문자갯수
		int numCounts[]=new int[10];//숫자갯수
		int one=0;
		try (FileReader fr=new FileReader(fileName);){

			while ((one=fr.read())!=-1) {
				if('A'<=one&&one<='Z') {	
					int Aindex=one-'A';
					Acounts[Aindex]++;
				} else if('a'<=one&&one<='z') {
					int aindex=one-'a';
					acounts[aindex]++;
				} else if('0'<=one&&one<='9') {
					int numIndex=one-'0';
					numCounts[numIndex]++;
				}
			}
			int totalA=0;
			int totala=0;
			int totalNum=0;
//			System.out.println(Arrays.toString(counts));
			
			
			for (int i = 0; i < Acounts.length; i++) {
				totalA+=Acounts[i];
			}
			System.out.printf("==대문자:%d==\n",totalA);
			for (int i = 0; i < Acounts.length; i++) {
				System.out.printf("%c(%02d) : %s\n",i+'A',Acounts[i],"#".repeat(Acounts[i]));				
			}
	
		
			for (int i = 0; i < acounts.length; i++) {
				totala+=acounts[i];
			}
			System.out.printf("==소문자:%d==\n",totala);
			for (int i = 0; i < acounts.length; i++) {
				System.out.printf("%c(%02d) : %s\n",i+'a',acounts[i],"#".repeat(acounts[i]));				
			}
			
			
			for (int i = 0; i < numCounts.length; i++) {
				totalNum+=numCounts[i];
			}
			System.out.printf("==숫자:%d==\n",totalNum);
			for (int i = 0; i < numCounts.length; i++) {
				System.out.printf("%d(%02d) : %s\n",i,numCounts[i],"#".repeat(numCounts[i]));				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" end ");
	}
}
