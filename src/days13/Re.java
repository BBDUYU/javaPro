package days13;

import java.util.Random;
import java.util.Scanner;

public class Re {

	public static void main(String[] args) {
		//게임 횟수, 랜덤값, 배열
		Scanner scanner=new Scanner(System.in);
		int gameNum=0;
		
	
		System.out.print("게임횟수입력");
		gameNum=scanner.nextInt();
		int lotto[][]=new int[gameNum][6];
		createLotto(lotto);
		printLotto(lotto);
		
	}

	private static void printLotto(int[][] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("[%d 게임]\t",i);
			for (int j = 0; j < lotto[i].length; j++) {
				System.out.printf("[%d]",lotto[i][j]);
			}
			System.out.println();
		}
	}

	private static void createLotto(int[][] lotto) {
		//게임횟수, 랜덤값
		Random rnd=new Random();
		int index;
		int n;
		for (int i = 0; i < lotto.length; i++) {
			index=0;
			while (index<6) {
				n=rnd.nextInt(45)+1;
				if(!duplicateLotto(lotto[i],index,n)) {
					lotto[i][index++]=n;//0,1,2,3,4,5
				}
			}
		}
	}

	private static boolean duplicateLotto(int[] lotto, int index, int n) {
		//중복체크
		boolean flag=false;
		for (int i = 0; i < index; i++) {
			if(lotto[i]==n) {
				flag=true;
				break;
			}
		}
		return flag;
	}


	
	

}
