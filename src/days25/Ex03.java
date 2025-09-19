package days25;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Osj  
 * @date   2025. 9. 19. 오후 12:03:48
 * @subject 파일 
 * @content 
 */
public class Ex03 {

	public static void main(String[] args) {
		String fileName=".\\src\\days21\\Ex01.java";

		
		//counts[0] = 알파벳 A의 갯수 저장
		//counts[1] = 알파벳 B의 갯수 저장
		//	...
		//counts[25]= 알파벳 Z의 갯수 저장
		HashMap<Character,Integer > hmap=new HashMap<>();
		for (int i = 'A'; i < 'Z'; i++) {
			hmap.put((char) i, 0);
		}
		
		
		int one=0;
		try (FileReader fr=new FileReader(fileName);){

			while ((one=fr.read())!=-1) {
				one=Character.toUpperCase(one);
				//if('A'<=one&&one<='Z') {					
				if(Character.isUpperCase(one)) {
					int value=hmap.get((char)one);
					hmap.put((char) one, value+1);
				}
			}
//			System.out.println(Arrays.toString(counts));
			/*
			for (int i = 0; i < counts.length; i++) {
				System.out.printf("%c(%02d) : %s\n",i+'A',counts[i],"#".repeat(counts[i]));				
			}
			*/
			Set<Entry<Character, Integer>>en=hmap.entrySet();
			Iterator<Entry<Character, Integer>> ir=en.iterator();
			
			while (ir.hasNext()) {
				Entry<Character,Integer> entry=ir.next();
				char alp=entry.getKey();
				int count=entry.getValue();
				System.out.printf("%c(%d) :%s\n",alp,count,"#".repeat(count));
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" end ");
	}

}
