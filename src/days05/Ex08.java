package days05;

public class Ex08 {

	public static void main(String[] args) {
		//홀수의 합 출력 : 조건 -continue사용
		int i=1,sum=0;
		while(i<=10) {
			if(i%2==0) {
				i++;
				continue;
			}
			System.out.printf("%d+",i);
			sum+=i;
			i++;
		}
		System.out.printf("\b=%d",sum);
	}

}
