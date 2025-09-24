package Tennis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileRead {
		public static String[][] readPlayerList(String fileName) {
			List<String> lines = new ArrayList<>();
	        String line = null;
	        try (FileReader fr = new FileReader(fileName); 
	             BufferedReader br = new BufferedReader(fr)) {
	            int i = 0;
	            while ((line = br.readLine()) != null) {
	            	lines.add(line.trim());
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        int numRows = (lines.size() + 1) / 2;
	    	String[][] nameArr = new String[numRows][2];

	    	for (int i = 0; i < lines.size(); i++) {
	    		nameArr[i / 2][i % 2] = lines.get(i);
	    	}
	        return nameArr;
	    }

}
