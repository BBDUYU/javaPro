package days25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class practice {

	public static void main(String[] args) {
		Map<String, ArrayList<String>> m = new LinkedHashMap<>();
		String fileName="./src/days25/연습용.txt";
		try (FileReader fr = new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr)){
			String line=null;
			String key=null;
			ArrayList<String> teamList=null;

			while ((line=br.readLine())!=null) {
				String regex="[:/]";
				String teamInfo[]=line.split(regex);
				key=teamInfo[0];
				teamList=new ArrayList<String>();
				for (int i = 1; i < teamInfo.length; i++) {
					teamList.add(teamInfo[i]);
				}
				m.put(key, teamList);
			}
			disp(m);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private static void disp(Map<String, ArrayList<String>> m) {
		Set<Entry<String, ArrayList<String>>> se=m.entrySet();
		Iterator<Entry<String, ArrayList<String>>>it=se.iterator();
		
		while (it.hasNext()) {
			Entry<String, ArrayList<String>> es=it.next();
			String key=es.getKey();
			System.out.printf("[%s]\n",key);
			ArrayList<String> teamList= es.getValue();
			Iterator<String> it2 = teamList.iterator();
			char no='A';
			while (it2.hasNext()) {
				String name=it2.next();
				System.out.printf("\t%c. %s\n",no++,name);
			}
		}
	}
	








}
/* 출력형식
 * [1조]
   A. 권태정
   B. 김도훈
   C. 김민선
   D. 김승효

[2조]
   A. 김유미
   B. 김현수
   C. 박지웅
   D. 변상호
   E. 서재웅

[3조]
   A. 서주원
   B. 안우혁
   C. 안준호
   D. 양재원
   E. 이정인
 * */
