package days05;

public class Ex06_02 {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while(i<=10) {
			System.out.printf("%d+",i);
			sum+=i;
			i++;
		}//while
		System.out.printf("\b=%d",sum); //\b -> 출력을 할때 마지막문자를 지움
	}//main

}//class
