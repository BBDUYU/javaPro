package days08;

import java.util.Scanner;

public class text {

	public static void main(String[] args) {
		//문제 : 최대공약수, 최소공배수
		//최소공배수=두수의곱/최대공약수
		//10 12
		//1 2 5 10, 1 2 3 4 6 12 ,최소공배수60, 최대공약수2
		Scanner scanner=new Scanner(System.in);
		System.out.print("> 정수(n) 입력 ? ");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		
		
		
		int gcd;
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		gcd=a;
		int lcm=(a*b)/gcd;

		System.out.printf("최소공배수는 %d, 최대공약수는 %d",lcm,gcd);
		
		
		//문제 : 소수

	}

}

/*
 * a	b	temp(a%b)	
 * 30	18	
 * 	18	12	18
 * 	12	6	12
 * 	6	0	6
 * 최대공약수 6
 * 최소공배수=두수의곱/최대공약수=
 * */
