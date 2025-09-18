package days24;

public class Ex05_02 {

	public static void main(String[] args) {
		int m[]= {1,2,3,4,5,6,7,8};
		int n[][]=new int[4][2] ;
		
		
		int col=n[0].length;
		for (int i = 0; i < m.length; i++) {
			n[i/col][i%col]=m[i];
		}
		
	}

}
