package days05;

/**
 * @author Osj  
 * @date   2025. 8. 22. 오후 12:42:08
 * @subject 1~10+= 합 출력
 * @content 1) 10뒤에 +제거
 * 			2) 짝수의 합 출력
 */
public class Ex05 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i<=9) System.out.printf("%d+",i);
			else System.out.printf("%d\n",i);
			if(i%2==0) { 
				sum+=i;
			}//if
			
		}//for
		System.out.printf("짝수의 합은 %d입니다",sum);

	}//main

}//class
