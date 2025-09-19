package days25;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Ex03_02 {

	public static void main(String[] args) {
		String fileName=".\\src\\days21\\Ex01.java";


		//counts[0] = 알파벳 A의 갯수 저장
		//counts[1] = 알파벳 B의 갯수 저장
		//	...
		//counts[25]= 알파벳 Z의 갯수 저장

		//		ArrayList<HashMap<Character, Integer>> al=new ArrayList<>();

		HashMap<Character,Integer > hmUpper=new HashMap<>();
		for (int i = 'A'; i <= 'Z'; i++) hmUpper.put((char) i, 0);
		HashMap<Character,Integer > hmLower=new HashMap<>();
		for (int i = 'a'; i <= 'z'; i++) hmLower.put((char) i, 0);
		HashMap<Character,Integer > hmDigit=new HashMap<>();
		for (int i = '0'; i <= '9'; i++) hmDigit.put((char) i, 0);


		int one=0;
		try (FileReader fr=new FileReader(fileName);){

			while ((one=fr.read())!=-1) {
				if('A'<=one&&one<='Z') {	
					int value=hmUpper.get((char)one);
					hmUpper.put((char) one, value+1);
				} else if('a'<=one&&one<='z') {
					int value=hmLower.get((char)one);
					hmLower.put((char) one, value+1);
				} else if('0'<=one&&one<='9') {
					int value=hmDigit.get((char)one);
					hmDigit.put((char) one, value+1);
				}
			}
			int totalA=0;
			int totala=0;
			int totalNum=0;
			//			System.out.println(Arrays.toString(counts));

			{
				Set<Entry<Character, Integer>>en=hmUpper.entrySet();
				Iterator<Entry<Character, Integer>> ir=en.iterator();

				while (ir.hasNext()) {
					Entry<Character,Integer> entry=ir.next();
					char alp=entry.getKey();
					int count=entry.getValue();
					System.out.printf("%c(%d) :%s\n",alp,count,"#".repeat(count));
				}
			}
			{
				Set<Entry<Character, Integer>>en=hmLower.entrySet();
				Iterator<Entry<Character, Integer>> ir=en.iterator();

				while (ir.hasNext()) {
					Entry<Character,Integer> entry=ir.next();
					char alp=entry.getKey();
					int count=entry.getValue();
					System.out.printf("%c(%d) :%s\n",alp,count,"#".repeat(count));
				}
			}
			{
				Set<Entry<Character, Integer>>en=hmDigit.entrySet();
				Iterator<Entry<Character, Integer>> ir=en.iterator();

				while (ir.hasNext()) {
					Entry<Character,Integer> entry=ir.next();
					char alp=entry.getKey();
					int count=entry.getValue();
					System.out.printf("%c(%d) :%s\n",alp,count,"#".repeat(count));
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" end ");
	}

}
