package days08;

public class Ex03_02 {

	public static void main(String[] args) {
		//[정보처리기사 실기]
		//짝수 -
		//홀수 + 
		int i=1;
		int ln=10;
		int sum=0;
		
		boolean sw=false;

		while (i<=ln) {
			/*
			if(sw) {
				System.out.printf(i==ln?"%d":"%d+",i);
				sum-=i;
				sw=false;
			}else { 
				System.out.printf(i==ln?"%d":"%d-",i);
				sum+=i;
				sw=true;
			}*/
//			if(sw) {
//				sum-=i;
//			}else { 
//				sum+=i;
//			}
			System.out.printf(sw?"%d+":"%d-",i);
			sum+=(sw?i:-i);
			sw=!sw;
			i++;
			
		}
		System.out.printf("=%d",sum);
	}//main

}//class
