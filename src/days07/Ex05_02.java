package days07;

/**
 * @author Osj  
 * @date   2025. 8. 26. 오후 12:32:13
 * @subject 
 * @content 
 */
public class Ex05_02 {

	public static void main(String[] args) {
		//구구단(2~9) 출력
//		for(int i=2;i<=9;i++) {
//			//System.out.printf("[%d단]\n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d * %d = %02d ",i,j,i*j);
//			}
//			System.out.println();
//		}
//		--------------------------------------------------
		// 세로 구구단 [1]
//		for(int i=1;i<=9;i++) {
//			for(int j=2;j<=5;j++) {
//				System.out.printf("%d * %d = %02d ",j,i,i*j);
//			}
//			System.out.println();	
//		}
//		System.out.println();	
//		for(int i=1;i<=9;i++) {
//			for(int j=6;j<=9;j++) {
//				System.out.printf("%d * %d = %02d ",j,i,i*j);
//			}
//			System.out.println();	
//		} //그냥 for문두개로 했을때
		
		// 2(9) 3(9) 4(9) 5(9)
		// 6(9) 7(9) 8(9) 9(9) 단 으로 해야하니 18개
		
		
		//세로구구단[2]
		for(int first_num=1;first_num<=18;first_num++) { 
			int sec_num=first_num<=9?first_num:first_num-9; //첫번째 2~5단 에서 쓸 1~9, 두번째 6~9단에서 쓸 1~9
			int dan=first_num<=9?2:6;	// 숫자가 10이 넘어가면 아랫단인 6 7 8 9
										// 시작이 2단 or 6단
			for(int i=dan;i<dan+4;i++) {// 2단이면 i=2 -> i<6 -> 2 3 4 5 단, 6단이면 i=6-> i<10 ->6,7,8,9 
				System.out.printf("%d * %d = %02d ",i,sec_num,i*sec_num);
			}
			System.out.println();//2*i~5*i 출력후 i++ 내리기 
			if(sec_num==9)System.out.println(); //5*9=45까지 뽑고 한칸내리기
		}
		//세로 구구단 출력
		/*
		 * 	 dan -> 	 2		3		4		5
		 *first_num->	 1		
		 * 				 2     System.out.println();
		 * 				 3
		 * 				 4		//		//		//
		 * 				 5
		 * 				 6
		 * 				 7
		 * 				 8
		 * 				 9
		 * if(sec_num==9)System.out.println();
		 * dan	->       6		7		8		9
		 * second_num->	10->1
		 * 				11->2
		 * 				12->3
		 * 				13->4
		 * 				14->5
		 * 				15->6	
		 * 				16->7
		 * 				17->8
		 * 				18->9
		 * */
		
	}

}
