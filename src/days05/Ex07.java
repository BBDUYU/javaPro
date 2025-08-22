package days05;

/**
 * @author Osj  
 * @date   2025. 8. 22. 오후 4:02:11
 * @subject while
 * 			do while
 * @content 
 */
public class Ex07 {

	public static void main(String[] args) {
		//=0
		int i=11;
		int sum=0;
		while(i<=10) {
			System.out.printf("%d+",i);
			sum+=i;
			i++;
		}
		
		System.out.printf("\b=%d",sum);
	}

}
