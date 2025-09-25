package Tennis;

public class Game {

	int totalSet; // 3 | 5
	int currentSet;// 현재 세트
	String player1,player2; 
	int player1SetWin, player2SetWin; //이긴 횟수
	int gamesWin[][];//[1세트][p1], [2세트][p2]...
	
	int pointSet[]= {0,15,30,40}; //0 1 2 3
	int player1Point,player2Point; //점수 
	
	boolean isDuce; //듀스 판단
	int advantagePlayer; //어드밴티지흭득 선수

	public Game(int totalSet, String p1, String p2) {
		this.totalSet=totalSet; //총 세트수
		this.player1=p1;
		this.player2=p2;
		this.player1Point=0; 
		this.player2Point=0;
		this.player1SetWin=0;
		this.player2SetWin=0;
		this.isDuce=false;
		this.advantagePlayer=0;
		this.gamesWin=new int[totalSet][2];
		this.currentSet=0;
	}
	
	public void pointWinner(int p) {
		if (p == 1) player1Score();
		else if (p == 2) player2Score();
	}
	public void player1Score() {//p1 점수 계산
		if(isDuce) { //듀스인가?
			if(advantagePlayer==1) { //p1이 어드밴티지면?
				gameWin(1);//p1이 이김
			}else if(advantagePlayer==2) {//근데 p2도 어드밴티지가되면
				advantagePlayer=0;//어드밴티지 사라짐
			}else {//어드밴티지가 0이면 다시 듀스
				advantagePlayer=1;
			}
		}else { //듀스가 아닐때
			//			   0  1  2  3	
			//pointSet[]= {0,15,30,40}
			if(player1Point<3) { //p1 40점 미만이면?
				player1Point++;//p1 점수증가
				if(player1Point==3&&player2Point==3)isDuce=true;//p1 과 p2가 40점이면 듀스
			}else {//p1이 40점 위일때
				if(player2Point<3) {//p2가 40점 미만이면?
					//			   0  1  2  3	
					//pointSet[]= {0,15,30,40}
					gameWin(1);//p1 승리
				}
				else if(player2Point==3) {//근데 p2도 40점이면?
					isDuce=true; // 듀스
				}
			}
		}
	}
	public void player2Score() {//p2 점수 계산
		if(isDuce) { //듀스인가?
			if(advantagePlayer==2) {//p2가 어드밴티지면
				gameWin(2);//p2가 이김
			}else if(advantagePlayer==1) {//근데 p1도 어드밴티지가되면
				advantagePlayer=0;//어드밴티지 사라짐
			}else {//다시 듀스
				advantagePlayer=2;
			}
		}else {//듀스가 아닐때
			//			   0  1  2  3	
			//pointSet[]= {0,15,30,40}
			if(player2Point<3) { //p2가 40점 미만이면?
				player2Point++;//p2 점수 증가
				if(player1Point==3&&player2Point==3)isDuce=true;//p1과 p2가 40점이면 듀스
			}else {//p2가 40점 이상일때
				//			   0  1  2  3	
				//pointSet[]= {0,15,30,40}
				if(player1Point<3) {//p1이 40점 미만이면?
					gameWin(2);//p2 승리
				}
				else if(player1Point==3) {//근데 p1도 40점이면?
					isDuce=true;//듀스
				}
			}
		}
	}

	private void gameWin(int player) {//승리시
		if(player==1) gamesWin[currentSet][0]++;//p1이면 gamesWin[][player1] 에 +1
		else gamesWin[currentSet][1]++;//p2면 gamesWin[][player1]에 +1
		resetPoints();//새 세트 시작 시 포인트 초기화
		
		if(isSetOver()) {//세트종료
			//		  세트 팀1
			//		   |  |
			// gamesWin[][];//[1세트][p1], [2세트][p2]...
			if(gamesWin[currentSet][0]>gamesWin[currentSet][1]) player1SetWin++; //현재 세트에 p1 점수가 더 크면 
			else player2SetWin++;//p2 점수가 더 크면
			currentSet++; //승리점수 처리후 현재세트 +1
		}
	}

	public boolean isSetOver() {//세트 종료
		int p1Game=gamesWin[currentSet][0];//현재 세트 p1점수
		int p2Game=gamesWin[currentSet][1];//현재 세트 p2점수
		return(p1Game>=6||p2Game>=6)&&Math.abs(p1Game-p2Game)>=2;
		//③ 상대방보다 2게임 이상 차이를 두고 6게임 이상을 먼저 획득한 선수가 그 세트를 승리한다. 
	}

	private void resetPoints() { //새로운 세트가 시작될때 지정됐었던 값들 초기화
		player1Point=0;
		player2Point=0;
		isDuce=false;
		advantagePlayer=0;
	}
	public void dispScoreBoard() { //점수판 표기
		System.out.println("=".repeat(11)+"스코어보드"+"=".repeat(11));
		System.out.printf("총 세트 수 : %d, 현재 세트 : %d\n",totalSet,currentSet+1);
		System.out.printf("%s 세트 승리 : %d, %s 세트 승리 : %d\n", player1, player1SetWin, player2, player2SetWin);
		for (int i = 0; i <= currentSet &&i<totalSet; i++) {//0~현재세트보다 작거나 같을때 && 0~총세트수
							//왜 i <= currentSet 이걸 추가해야하는지는 모르겠음...
							// 총세트수 만큼 돌리니까 오류남
			
			if (gamesWin[i][0] != 0 || gamesWin[i][1] != 0) { //각 팀 점수가 0이 아닐때 출력
		        System.out.printf("세트 %d - %s: %d, %s: %d\n", i + 1, player1, gamesWin[i][0], player2, gamesWin[i][1]);
		    }
		}//매판 마다 현재 세트, 팀별 점수 출력
		System.out.print("현재 게임 점수 : ");
		String advantagePoint="Ad"; //어드밴티지 점수표시
		if (isDuce) {//듀스라면
			if (advantagePlayer==0) {
				System.out.printf("%s: %d, %s: %d\n", player1,pointSet[player1Point],player2,pointSet[player2Point]);
				System.out.println("\t     듀스");//어드밴티지 선수가 없으면 듀스 출력
			}
			else if (advantagePlayer==1) {
				System.out.printf("%s: %s, %s: %d\n", player1,advantagePoint,player2,pointSet[player2Point]);
				System.out.println("\t어드밴티지 : "+player1);//p1이 어드밴티지 라면 출력
			}
			else {
				System.out.printf("%s: %d, %s: %s\n", player1,pointSet[player1Point],player2,advantagePoint);
				System.out.println("\t어드밴티지 : "+player2);//p2면 출력
			}
		}else {//듀스가 아니라면
			System.out.printf("%s: %d, %s: %d\n", player1,pointSet[player1Point],player2,pointSet[player2Point]);
		}
		
		System.out.println("=".repeat(29));
	}
	public String getWinner() {
		// 3판 2선승 또는 5판 3선승
		int setsToWin = totalSet / 2 + 1; //총세트/2 +1 ->
										  // 3/2 + 1 = 2 || 5/2 + 1 = 3
										  // 3판       2선    5판       3선
		if (player1SetWin == setsToWin) return player1; 
		if (player2SetWin == setsToWin) return player2;
		return null;
	}

	
	
	

}
