package Tennis;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gameType;// 단식/복식
		int totalSet=0;// 총 세트
		while (true) { // [1]*****
			System.out.print(">  단식(1) | 복식(2) : ");
			gameType=sc.nextInt();
			if(gameType==1 || gameType==2) break;
			System.out.println("1 또는 2를 입력");
		}
		while (true) {// [2]*******
			System.out.print("> 3세트(3) | 5세트(5) : ");
			totalSet=sc.nextInt();
			if(totalSet==3 || totalSet==5) break;
			System.out.println("3 또는 5를 입력");
		}

		dispMemList();//[3] 선수 리스트*********
		String selectedPlayer[] =  dispPlayerList(gameType);//[9] 66줄 dispPlayerList() 호출,[27] 리턴값 배열에 대입********
		String team1Players=selectedPlayer[0];
		String team2Players=selectedPlayer[1];
		
		dispGame(totalSet, team1Players, team2Players);//[28] 36줄 dispGame 호출********
		
		
	}

	private static void dispGame(int totalSet, String p1, String p2) {//[29]*********
		Scanner sc=new Scanner(System.in);
		Random rnd=new Random();
		Game game=new Game(totalSet, p1, p2);//Game.java 클래스
		while (game.getWinner() == null) {//승자가 없으면
			game.dispScoreBoard();//[30] Game.java 118줄 dispScoreBoard()호출********
			System.out.print("> 경기진행 (엔터)");
			sc.nextLine();
			int randomWinner=rnd.nextBoolean()?1:2;// 반반 p1승 p2승
			//System.out.println((randomWinner==1?p1:p2));//랜덤 이름 출력 확인용
			game.pointWinner(randomWinner);//[32] Game.java pointWinner()호출**********
		}
		game.dispScoreBoard();//[37] 스코어보드 호출
		System.out.println("경기 종료 승자 : "+game.getWinner());//[38] Game.java 150줄 getWinner()호출 후 출력 -끝-****
	}

	public static void dispMemList() { // [4] 선수 리스트 출력*********
		String fileName = ".\\src\\Tennis\\선수명단.txt";
		String players[][] = FileRead.readPlayerList(fileName); //[5] FileRead.java 이동, [8]배열에 리턴값 대입***********
		if (players != null) { 
			System.out.println("\n"+"-".repeat(11)+"선수 명단"+"-".repeat(11));
			for (int i = 0; i < players.length; i++) { //선수 전체출력
				for (int j = 0; j < players[i].length; j++) {
					System.out.print("\t"+players[i][j] );
				}
				System.out.println("");
			}
		}
	}// 끝나고 27줄로 이동
	
	private static String[] dispPlayerList(int gameType) { // [10]선택된 선수 리스트**********
		String fileName = ".\\src\\Tennis\\선수명단.txt";
		String players[][]=FileRead.readPlayerList(fileName);//	[11] FileRead.java 이동, [14] 배열에 리턴값 대입********
		String selectedPlayers[]=SelectMem.dispSelectMem(gameType, players);//[15] SelectMem.java이동 [26]리턴값 대입*******
		
//		String teamList=Arrays.toString(selectedPlayers);
		System.out.println("\tA팀 : "+selectedPlayers[0]);
		System.out.println("\tB팀 : "+selectedPlayers[1]);

        return selectedPlayers;//[9]로 돌아가 진행

	}
	
}
