package Tennis;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gameType;
		int totalSet=0;
		while (true) {
			System.out.print(">  단식(1) | 복식(2) : ");
			gameType=sc.nextInt();
			if(gameType==1 || gameType==2) break;
			System.out.println("1 또는 2를 입력");
		}
		while (true) {
			System.out.print("> 3세트(3) | 5세트(5) : ");
			totalSet=sc.nextInt();
			if(totalSet==3 || totalSet==5) break;
			System.out.println("3 또는 5를 입력");
		}

		dispMemList();
		String selectedPlayer[] =  dispPlayerList(gameType);
		String team1Players=selectedPlayer[0];
		String team2Players=selectedPlayer[1];
		
		dispGame(totalSet, team1Players, team2Players);
		
		
	}





	private static void dispGame(int totalSet, String p1, String p2) {
		Scanner sc=new Scanner(System.in);
		Random rnd=new Random();
		Game game=new Game(totalSet, p1, p2);
		while (game.getWinner() == null) {
			game.dispScoreBoard();
			System.out.print("> 경기진행 (엔터)");
			sc.nextLine();
			int randomWinner=rnd.nextBoolean()?1:2;// 반반 p1승 p2승
			//System.out.println((randomWinner==1?p1:p2));
			game.pointWinner(randomWinner);
		}
		game.dispScoreBoard();
		System.out.println("경기 종료 승자 : "+game.getWinner());
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
	
	private static String[] dispPlayerList(int gameType) { // 선택된 선수 리스트
		String fileName = ".\\src\\Tennis\\선수명단.txt";
		String players[][]=FileRead.readPlayerList(fileName);		
		String selectedPlayers[]=SelectMem.dispSelectMem(gameType, players);
		
		
		
//		String teamList=Arrays.toString(selectedPlayers);
		System.out.println("\tA팀 : "+selectedPlayers[0]);
		System.out.println("\tB팀 : "+selectedPlayers[1]);

        return selectedPlayers;

	}
	
}
