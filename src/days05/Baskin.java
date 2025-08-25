package days05;

import java.util.Random;
import java.util.Scanner;

public class Baskin {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int currentNumber = 0; //현재숫자
        boolean PlayerTurn = random.nextBoolean(); // 50% 확률로 선공 결정

        System.out.println("=== 베스킨라빈스31 게임을 시작합니다 ===");
        System.out.println((PlayerTurn ? "플레이어" : "컴퓨터") + "가 먼저 시작합니다\n");

        while (currentNumber < 31) {
            if (PlayerTurn) {
                // 플레이어 차례
                int count = 0;
                while (true) {
                    System.out.print("1~3 사이의 숫자를 입력하세요 : ");
                    if (scanner.hasNextInt()) {
                        count = scanner.nextInt();
                        if (count >= 1 && count <= 3) {
                            break;
                        }//if
                    } else {
                        scanner.next(); // 잘못된 입력 무시
                    }//else
                    System.out.println("잘못된 입력입니다. 1에서 3 사이의 숫자만 입력하세요.");
                }//while

                for (int i = 0; i < count; i++) {
                    currentNumber++;
                    System.out.println("\t플레이어: " + currentNumber);
                    if (currentNumber == 31) {
                        System.out.println("\n플레이어가 31을 말했습니다. 패배");
                        return;
                    }//if
                }//for

            } else {
                // 컴퓨터 차례
                int count = random.nextInt(3) + 1; // 1~3 랜덤
                System.out.println("컴퓨터가 " + count + "개 숫자를 부릅니다");
                for (int i = 0; i < count; i++) {
                    currentNumber++;
                    System.out.println("\t컴퓨터: " + currentNumber);
                    if (currentNumber == 31) {
                        System.out.println("\n컴퓨터가 31을 말했습니다. 승리");
                        return;
                    }//if
                }//for
            }//else

            // 턴 전환
            PlayerTurn = !PlayerTurn;
        }//while

        scanner.close();
    }//main

}//class
