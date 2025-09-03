package days13;

public class Ex02_03 {

	public static void main(String[] args) {
		int m[][][]=new int[2][3][4];
		System.out.println(m.length);
		
		System.out.println(m[0].length);
		System.out.println(m[1].length);
		
		System.out.println(m[0][0].length);
		System.out.println(m[0][1].length);
		System.out.println(m[0][2].length);
		System.out.println(m[1][0].length);
		System.out.println(m[1][1].length);
		System.out.println(m[1][2].length);
		
		m[0][0][0]=1;
		m[0][0][1]=2;
		m[1][2][1]=10;
		dispM(m);
	}

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
	}

}
