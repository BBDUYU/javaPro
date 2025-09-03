package days13;

import java.util.Arrays;

public class Ex03_02 {

	public static void main(String[] args) {
		int m[][]= {{1,2,3,4},{5,6,7,8}};
		dispM(m);
	}
	private static void dispM(int[][] m) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("m[%d][%d]=%d ",i,j,m[i][j]);
			}
			System.out.println();
		}
	}
}
