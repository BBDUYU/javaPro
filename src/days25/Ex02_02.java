package days25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Osj  
 * @date   2025. 9. 19. 오전 11:04:15
 * @subject 월요일 시험 ***
 * @content 
 * 출력형식)
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
public class Ex02_02 {

	public static void main(String[] args) {
		String fileName="./src/days25/1차_팀편성.txt";
		String line=null;
		Map<String, ArrayList<String>> hm=new LinkedHashMap<>();
		ArrayList<String> teamList=new ArrayList<>();
		
		try (FileReader fr=new FileReader(fileName);
				BufferedReader br=new BufferedReader(fr)){
			while ((line=br.readLine())!=null) {				
//				System.out.println(line);
				String regex="[:/]";
				String teamInfo[]=line.split(regex);
				String key=teamInfo[0];
				
				for (int i = 1; i < teamInfo.length; i++) {
					teamList.add(teamInfo[i]);
				}//for
				System.out.println(Arrays.toString(teamInfo));
				for (int i = 0; i < hm.size(); i++) {
//					System.out.printf("[%d조]",);
				}
				hm.put(key, teamList); //엔트리추가

			}//while
			dispTemp(hm);			
		} catch (Exception e) {
			// TODO: handle exception
		}//catch
	
	}//main

	private static void dispTemp(Map<String, ArrayList<String>> hm) {
		
	}

}//class
