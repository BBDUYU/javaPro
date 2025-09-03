package days13;

import java.util.Random;

public class Ex05_02 {

	public static void main(String[] args) {
		int lottos[][]=new int[3][6];

		fillLottos(lottos);
		dispLottos(lottos);
	}
	
	private static void fillLottos(int[][] lottos) {
		for (int i = 0; i < lottos.length; i++) {
			fillLotto(lottos[i]);
		}
	}

	private static void fillLotto(int[] lotto) {//로또 한게임
		 
		Random rnd = new Random();
		int index = 0;
		int n;
		
		while ( index < 6 ) {
			n = rnd.nextInt(45)+1;
			
			if (!isDuplicateLotto(lotto, n, index)) {				
				lotto[index++] = n;
			}			
		} // while 
	}

	private static boolean isDuplicateLotto(int[] lotto, int n, int index) {//중복체크
		boolean flag = false;
		for (int i = 0 ; i < index; i++) {
			if( lotto[i] == n ) {
				flag = true;
				break;
			}
		} // for
		return flag;
	}

	//2차원 배열 메서드
	private static void dispLottos(int[][] lottos) {
		for (int i = 0; i < lottos.length; i++) {
	         System.out.printf("[%d 게임]\t", i+1);
			dispLotto(lottos[i]);
		}
	}

	//1차원 배열 메서드
	private static void dispLotto(int[] lotto) {

		for (int l : lotto) {
			System.out.printf("[%02d]", l);
		}
		System.out.println();

	}
}
