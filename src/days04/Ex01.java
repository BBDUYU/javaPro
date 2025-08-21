package days04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		//풀이
		String name;
		char grade;
		double height;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("이름 등급 키를 입력해주세요 : ");
		
		name=scanner.next();
		String input=scanner.next();
		grade=input.charAt(0);
		height=scanner.nextDouble();
		System.out.printf("이름 : %s \n학점 : %c \n키 : %.2f",name,grade,height);
		
		
		
		/*
		String name;
		char grade;
		double height;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("이름 키 등급을 입력해주세요 : ");
		name=scanner.next();
		height=scanner.nextDouble();
		grade=scanner.next();
		*/
	}

}
