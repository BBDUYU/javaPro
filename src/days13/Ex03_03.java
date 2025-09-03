package days13;

public class Ex03_03 {

	public static void main(String[] args) {
		//2면 3행 4열 3차원배열 초기화
		int m[][][]= {
				{//0면
					{1,1,1,1},//행
					{1,1,1,1},
					{1,1,1,1}
				},
				{//1면
					{1,1,1,1},
					{1,1,1,1},
					{1,1,1,1}
				}
		};//m[][][]
		dispM(m);
	}//main
	private static void dispM(int[][][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				for (int k = 0; k < m[i][j].length; k++) {
					System.out.printf("m[%d][%d][%d]=%d ",i,j,k,m[i][j][k]);
				}//열
				System.out.println();
			}//행
			System.out.println();
		}//면
	}//dispM
}//class
