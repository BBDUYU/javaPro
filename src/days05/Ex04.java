package days05;

public class Ex04 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=10;i++) {
			//if(i>5)break;
//			if(i>5)continue;//아랫줄을 실행하지않고 증감식으로 이동
			if(i==6)continue;
			System.out.printf("%d+",i);
			sum+=i;
		}
		System.out.printf("=%d",sum);
		
	}

}
