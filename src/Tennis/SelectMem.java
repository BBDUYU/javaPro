package Tennis;

import java.util.Iterator;
import java.util.Scanner;

public class SelectMem {

	public static String[] dispSelectMem(int gameType, String[][] players) {
		Scanner sc = new Scanner(System.in);
		String team1Players = ""; 
		String team2Players = "";

		if (gameType == 1) {
			// 단식 : 한 명씩 입력 + 존재 여부 체크 반복
			System.out.print("> 단식 1번 선수 이름 입력 : ");
			team1Players = sc.nextLine();
			while (!typeOneInList(team1Players, players)) {
				System.out.println("명단에 없는 선수입니다. 다시 입력하세요.");
				System.out.print("> 단식 1번 선수 이름 입력 : ");
				team1Players = sc.nextLine();
			}

			System.out.print("> 단식 2번 선수 이름 입력: ");
			team2Players = sc.nextLine();
			while (!typeOneInList(team2Players, players)) {
				System.out.println("명단에 없는 선수입니다. 다시 입력하세요.");
				System.out.print("> 단식 2번 선수 이름 입력 : ");
				team2Players = sc.nextLine();
			}

		} else {
			// 복식: 팀별 2명씩 입력, 각 선수 체크
			System.out.println("> 복식 팀1 선수 2명 입력 : ");
			team1Players = sc.nextLine();
			while (!typeTwoInList(team1Players, players)) {
				System.out.println("명단에 없는 선수가 포함되어 있습니다. 다시 입력하세요.");
				System.out.println("> 복식 팀1 선수 2명 입력 : ");
				team1Players = sc.nextLine();
			}

			System.out.println("> 복식 팀2 선수 2명 입력 : ");
			team2Players = sc.nextLine();
			while (!typeTwoInList(team2Players, players)) {
				System.out.println("명단에 없는 선수가 포함되어 있습니다. 다시 입력하세요.");
				System.out.println("> 복식 팀2 선수 2명 입력 : ");
				team2Players = sc.nextLine();
			}
		}
		return new String [] {team1Players,team2Players};

	}

	private static boolean typeTwoInList(String team1Players, String[][] players) {
		String names[]=team1Players.trim().split("\\s");
		if(names.length!=2)return false;
		for(String n : names) {  
			if(!typeOneInList(n, players)) {//존재 유무 확인
				return false;
			}
		}
		return true;

	}

	private static boolean typeOneInList(String team1Players, String[][] players) { //리스트에 존재 유무
		for (String row[]:players) {
			for(String name : row) {
				if(name!=null&&name.equals(team1Players)) {
					return true;
				}
			}
		}
		return false;
	}

}
