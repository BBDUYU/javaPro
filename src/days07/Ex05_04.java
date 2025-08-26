package days07;

import java.util.Iterator;

/**
 * @author Osj  
 * @date   2025. 8. 26. 오후 2:12:18
 * @subject 
 * @content 
 */
public class Ex05_04 {

	public static void main(String[] args) {

		/* 결과
        2*1=02 3*1=03 4*1=04 5*1=05  
        2*2=04 3*2=06 4*2=08 5*2=10  
        2*3=06 3*3=09 4*3=12 5*3=15  
        2*4=08 3*4=12 4*4=16 5*4=20  
        2*5=10 3*5=15 4*5=20 5*5=25  
        2*6=12 3*6=18 4*6=24 5*6=30  
        2*7=14 3*7=21 4*7=28 5*7=35  
        2*8=16 3*8=24 4*8=32 5*8=40  
        2*9=18 3*9=27 4*9=36 5*9=45  

        6*1=06 7*1=07 8*1=08 9*1=09
        6*2=12 7*2=14 8*2=16 9*2=18
        6*3=18 7*3=21 8*3=24 9*3=27
        6*4=24 7*4=28 8*4=32 9*4=36
        6*5=30 7*5=35 8*5=40 9*5=45
        6*6=36 7*6=42 8*6=48 9*6=54
        6*7=42 7*7=49 8*7=56 9*7=63
        6*8=48 7*8=56 8*8=64 9*8=72
        6*9=54 7*9=63 8*9=72 9*9=81  
		 * */ 
		//[1]
		/*
		for(int i=1;i<=9;i++) {
			for(int j=2;j<=5;j++) {
				System.out.printf("%d * %d = %02d ",j,i,i*j);
			}
			System.out.println();	
		}
		System.out.println();	
		for(int i=1;i<=9;i++) {
			for(int j=6;j<=9;j++) {
				System.out.printf("%d * %d = %02d ",j,i,i*j);
			}
			System.out.println();	
		} //그냥 for문두개로 했을때
		*/
		//[2]
		for(int k=1;k<=2;k++) {
			for(int i=1;i<=9;i++) {
				for(int j=4*k-2;j<=4*k-2+3;j++) {
					System.out.printf("%d * %d = %02d ",j,i,i*j);
				}
				System.out.println();	
			}
			System.out.println();
		}
		
		/*[3]
		 * 
		 * for(int first_num=1;first_num<=18;first_num++) { 
			int sec_num=first_num<=9?first_num:first_num-9; //첫번째 2~5단 에서 쓸 1~9, 두번째 6~9단에서 쓸 1~9
			int dan=first_num<=9?2:6;	// 숫자가 10이 넘어가면 아랫단인 6 7 8 9
										// 시작이 2단 or 6단
			for(int i=dan;i<dan+4;i++) {// 2단이면 i=2 -> i<6 -> 2 3 4 5 단, 6단이면 i=6-> i<10 ->6,7,8,9 
				System.out.printf("%d * %d = %02d ",i,sec_num,i*sec_num);
			}
			System.out.println();//2*i~5*i 출력후 i++ 내리기 
			if(sec_num==9)System.out.println(); //5*9=45까지 뽑고 한칸내리기
		}
		 * */

	}

}
