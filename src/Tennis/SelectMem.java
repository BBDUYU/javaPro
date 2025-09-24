package Tennis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SelectMem {

	public static String[] dispSelectMem(int gameType, String[][] players) {
		Scanner sc = new Scanner(System.in);
		String team1Players = ""; 
		String team2Players = "";

		// 이미 선택된 선수들을 저장할 리스트
		List<String> selectedPlayerList = new ArrayList<>(); 

		if (gameType == 1) {
			// 단식 : 한 명씩 입력 + 존재 여부 체크 반복
			System.out.print("> 단식 1번 선수 이름 입력 : ");
			team1Players = sc.nextLine();
			while (!typeOneInList(team1Players, players)) {
				System.out.println("명단에 없는 선수입니다. 다시 입력하세요.");
				System.out.print("> 단식 1번 선수 이름 입력 : ");
				team1Players = sc.nextLine();
			}
			selectedPlayerList.add(team1Players); // 선택된 선수 리스트에 추가

			System.out.print("> 단식 2번 선수 이름 입력 : ");
			team2Players = sc.nextLine();
			while (!typeOneInList(team2Players, players) || selectedPlayerList.contains(team2Players)) {
				if (!typeOneInList(team2Players, players)) {
					System.out.println("명단에 없는 선수입니다. 다시 입력하세요.");
				} else {
					System.out.println("이미 선택된 선수입니다. 다시 입력하세요.");
				}
				System.out.print("> 단식 2번 선수 이름 입력 : ");
				team2Players = sc.nextLine();
			} // while

		} else {
			// --- 복식 팀1 선수 2명 ---
			System.out.print("> 복식 팀1 선수 2명 입력 (이름 띄어쓰기 구분) : ");
			team1Players = sc.nextLine();
			// 팀1 선수들이 유효할 때까지 반복
			while (!validateDoublesPlayers(team1Players, players, selectedPlayerList)) {
				//System.out.println("명단에 없는 선수가 포함되어 있습니다. 다시 입력하세요.");
				System.out.print("> 복식 팀1 선수 2명 다시 입력 : ");
				team1Players = sc.nextLine();
			}
			// 유효성 검사가 끝난 선수들을 선택 리스트에 추가
			for (String name : team1Players.split("\\s")) {
				selectedPlayerList.add(name);
			}

			// --- 복식 팀2 선수 2명 ---
			System.out.print("> 복식 팀2 선수 2명 입력 (이름 띄어쓰기 구분) : ");
			team2Players = sc.nextLine();
			// 팀2 선수들이 유효할 때까지 반복
			while (!validateDoublesPlayers(team2Players, players, selectedPlayerList)) {
				//System.out.println("명단에 없는 선수가 포함되어 있습니다. 다시 입력하세요.");
				System.out.print("> 복식 팀2 선수 2명 다시 입력 : ");
				team2Players = sc.nextLine();
			}
		}

		String selectedPlayers[]=new String[2];

		selectedPlayers[0]=team1Players;
		selectedPlayers[1]=team2Players;

		return selectedPlayers;

	}

	private static boolean validateDoublesPlayers(String inputNames, String[][] allPlayers
			,List<String> selectedPlayers) {
		String names[] = inputNames.split("\\s"); // return될 선택된 선수들 list

        // 1. 선수를 2명 입력했는지 확인
        if (names.length != 2) {
            System.out.println("반드시 2명의 선수를 입력해야 합니다.");
            return false;
        }

        // 2. 팀 내에서 중복된 이름을 입력했는지 확인 (예: "김테니스 김테니스")
        if (names[0].equals(names[1])) { // 처음 list에 넣은선수와 나중에 넣은 선수가 같을때
            System.out.println("한 팀에 같은 선수를 중복으로 입력할 수 없습니다.");
            return false;
        }

        // 3. 각 선수에 대해 명단 존재 여부 및 다른 팀과의 중복 여부 확인
        for (String name : names) {//names에 존재하는 값을 name이라는 이름으로 한개씩 불러옴
            // 3-1. 전체 선수 명단에 없는 경우
            if (!typeOneInList(name, allPlayers)) {//typeOneInList 호출해서 name이 allPlayers[][]에 존재하지 않는지 확인 
                System.out.println("'" + name + "' 선수는 명단에 없습니다.");
                return false;
            }
            // 3-2. 상대 팀에 이미 선택된 선수인 경우
            if (selectedPlayers.contains(name)) {//selectedPlayers에 팀2 선수 이름이 속해있으면
                System.out.println("'" + name + "' 선수는 이미 다른 팀에 속해 있습니다.");
                return false;
            }
        }

        // 모든 검사를 통과한 경우
        return true;
    }
/*
	private static boolean typeTwoInList(String team1Players, String[][] players) {
		String names[]=team1Players.split("\\s");
		if(names.length!=2)return false;
		for(String n : names) {  
			if(!typeOneInList(n, players)) {//존재 유무 확인
				return false;
			}
		}
		return true;

	}
*/
	private static boolean typeOneInList(String team1Players, String[][] players) { //리스트에 존재 유무
		for (String row[]:players) { // 2차원 배열인 players를 1차원 배열 row[]를 만들고 한줄씩 불러오고
			for(String name : row) { // 한줄씩 꺼내온 row에 있는 값을 name으로 이름짓고 한개씩 불러옴
				
									 // 2차원배열 전체 출력하는 코딩이랑 비슷한느낌
									/*
									 * for (int i = 0; i < m.length; i++) {
											for (int j = 0; j < m[i].length; j++) {
												System.out.printf("m[%d][%d]=%d ",i,j,m[i][j]);
											}
											System.out.println();
										}

									 * */
				if(name!=null&&name.equals(team1Players)) {// 배열이 비어있지 않거나 해당 list값과 입력한 team1Players가 같으면
					return true;
				}
			}
		}
		return false;
	}

}
