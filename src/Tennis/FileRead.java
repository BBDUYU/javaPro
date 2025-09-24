package Tennis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileRead {
	public static String[][] readPlayerList(String fileName) {
		List<String> lines = new ArrayList<>();//수정용이
		String line = null;
		try (FileReader fr = new FileReader(fileName); 
				BufferedReader br = new BufferedReader(fr)) {
			while ((line = br.readLine()) != null) {
				lines.add(line.trim());//공백제거한 br.readLine을 list에 추가
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		int numRows = (lines.size() + 1) / 2; //행 구하는 식
		String nameArr[][] = new String[numRows][2];//list사이즈에 맞게 행 크기 조정

		for (int i = 0; i < lines.size(); i++) {
			nameArr[i / 2][i % 2] = lines.get(i);//해당배열에 list값 대입
		}
		return nameArr;
	}

}
