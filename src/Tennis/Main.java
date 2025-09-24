package Tennis;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gameType;
		while (true) {
			System.out.print(">  단식(1) | 복식(2) : ");
			gameType=sc.nextInt();
			if(gameType==1 || gameType==2) break;
			System.out.println("1 또는 2를 입력");
		}
		while (true) {
			System.out.print("> 3세트(3) | 5세트(5) : ");
			int totalSet=sc.nextInt();
			if(totalSet==3 || totalSet==5) break;
			System.out.println("3 또는 5를 입력");
		}

		dispMemList();
		dispPlayerList(gameType);
		//dispGame();
	}





	public static void dispMemList() { // 선수 리스트 출력
		String fileName = ".\\src\\Tennis\\선수명단.txt";
		String players[][] = FileRead.readPlayerList(fileName);
		if (players != null) {
			System.out.println("\n"+"-".repeat(11)+"선수 명단"+"-".repeat(11));
			for (int i = 0; i < players.length; i++) {
				for (int j = 0; j < players[i].length; j++) {
					System.out.print("\t"+players[i][j] );
				}
				System.out.println("");
			}
		}
	}
	
	private static void dispPlayerList(int gameType) { // 선택된 선수 리스트
		String fileName = ".\\src\\Tennis\\선수명단.txt";
		String players[][]=FileRead.readPlayerList(fileName);
		
		String selectedPlayers[]=SelectMem.dispSelectMem(gameType, players);
		String team1Players=selectedPlayers[0];
		String team2Players=selectedPlayers[1];
//		String teamList=Arrays.toString(selectedPlayers);
		System.out.println("\tA팀 : "+team1Players);
		System.out.println("\tB팀 : "+team2Players);

	}
	
}
