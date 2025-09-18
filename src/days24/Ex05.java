package days24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 * @author Osj  
 * @date   2025. 9. 18. 오후 12:12:42
 * @subject 빙고 게임 
 * @content 
 */
public class Ex05 {

	public static void main(String[] args) {
		int bingo[][]=new int[5][5];
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 1; i <= 25; i++) {
			al.add(i);
		}
		Random rnd=new Random();
		int i=0;
		while(!al.isEmpty()) {
			// 0~24 index
			int index=rnd.nextInt(al.size());
			int n = al.remove(index);
			
			bingo[i/5][i%5]=n;
			i++;
		}

		dispBingo(bingo);
	}

	private static void dispBingo(int[][] bingo) {
		for (int i = 0; i < bingo.length; i++) {

			for (int j = 0; j < bingo[i].length; j++) {
				System.out.printf("[%02d]",bingo[i][j]);
			}
			System.out.println();
		}
	}
}
