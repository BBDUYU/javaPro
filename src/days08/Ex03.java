package days08;

public class Ex03 {

	public static void main(String[] args) {
		//[정보처리기사 실기]
		//짝수 -
		//홀수 + 
		int i=1;
		int ln=10;
		int sum=0;

		while (i<=ln) {
			if(i%2==0) {
				System.out.printf(i==ln?"%d":"%d+",i);
				sum-=i;
			}else { 
				System.out.printf(i==ln?"%d":"%d-",i);
				sum+=i;
			}
			i++;
			
		}
		System.out.printf("=%d",sum);
	}//main

}//class
