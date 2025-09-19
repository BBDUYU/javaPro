package days25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Osj  
 * @date   2025. 9. 19. 오전 10:08:56
 * @subject 1차_팀편성.txt파일을 읽어와서 컬렉션 클래스를 사용하여
 * @content 아래와 같이 출력  void dispTeam()
 *  출력형식)
[1조]
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
 */
public class Ex02 {
	public static void main(String[] args) {
		Map<String, ArrayList<String>> hm=new LinkedHashMap<>();
		String fileName="./src/days25/1차_팀편성.txt";
		try (FileReader fr = new FileReader(fileName);
				BufferedReader br = new BufferedReader(fr);){
			String line=null;
			String key=null;
			ArrayList<String> teamList = null;
			while ((line=br.readLine())!=null) {
				//				System.out.println(line);
				String regex="[:/]";
				String teamInfo[]=line.split(regex);
				//				System.out.println(Arrays.toString(teamInfo));
				key=teamInfo[0];	//key

				teamList=new ArrayList<String>();	//value
				for (int i = 1; i < teamInfo.length; i++) {
					teamList.add(teamInfo[i]);
				}


				hm.put(key, teamList); //엔트리추가
			}

			dispTemp(hm);

		} catch (Exception e) {
			e.printStackTrace();
		} 
		System.out.println("end");
	}

	private static void dispTemp(Map<String, ArrayList<String>> hm) {//엔트리 출력 메서드
		Set<Entry<String, ArrayList<String>>> es=hm.entrySet();//엔트리 es 생성
		Iterator<Entry<String, ArrayList<String>>> ir=es.iterator();//엔트리 순회 ir 생성
		while (ir.hasNext()) {
			Entry<String, ArrayList<String>>entry=ir.next();//hm 엔트리
			String key=entry.getKey();	//hm엔트리의 key호출 및 설정
			System.out.printf("[%s]\n",key);
			ArrayList<String> teamList=entry.getValue();//hm엔트리의 value -> teamList
			Iterator<String> ir2=teamList.iterator();//teamList 순회 -> ir2
			char no='A';
			while(ir2.hasNext()) {
				String name=ir2.next();
				System.out.printf("\t%c. %s\n",no++,name);
			}
		}
	}
}
















