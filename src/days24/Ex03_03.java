package days24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


public class Ex03_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numberOfGames;   

		ArrayList lottos = new ArrayList();

		System.out.print("> 게임 횟수 입력 ? ");
		numberOfGames = scanner.nextInt(); // 유효성 검사~      

		createLottoGames(lottos, numberOfGames);
		printLottoGames(lottos);


	} // main

	private static void printLottoGames(ArrayList lottos) {
		for(int i = 0;i<lottos.size();i++) {
			System.out.printf("[%d 게임]\t ",i+1);
			HashSet lotto=(HashSet) lottos.get(i);
			Iterator ir = lotto.iterator();
			while (ir.hasNext()) {
				int n = (int)ir.next();
				System.out.printf("[%d]",n);
			}
			System.out.println();
		}
	}
	/*
	 *    private static void printLottoGames(ArrayList lottos) {
      for(int i = 0;i<lottos.size();i++) {
          System.out.printf("[%d 게임]\t ",i+1);
          System.out.println(lottos.get(i));
      
      }
   }
	 * */

	private static void createLottoGames(ArrayList lottos, int numberOfGames) {      
		Random rnd = new Random();       
		int n;
		for (int i = 0; i < numberOfGames; i++) {  // 게임횟수만큼 로또번호 발생.
			HashSet lotto = new HashSet(6);
			while ( lotto.size() < 6 ) {       // 한 게임 로또 발생.
				n = rnd.nextInt(45)+1; 
				lotto.add(n);         
			} // while         
			lottos.add(lotto);
		} // for i
	} 



} // class
