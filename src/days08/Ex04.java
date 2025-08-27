package days08;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//어떤 정수를 입력받아서 약수를 구해서 출력
		Scanner scanner=new Scanner(System.in);
		System.out.print("> 정수(n) 입력 ? ");
		int n=scanner.nextInt();
		
		System.out.println(1);
		System.out.println(n);
		
		
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
	}

}
