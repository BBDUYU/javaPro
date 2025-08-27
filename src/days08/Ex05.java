package days08;

public class Ex05 {

	public static void main(String[] args) {
		//수열
		//항(term)
		//1+2+3+4+5+6+7+8+9+10
		/*
		int n=0;
		int sum=0;
		for(int i=1;i+n<=100;i++) {
			System.out.printf("%d+",i+n);
			
			n=i+n-1;
		}
		*/
		int sum=0;
		int term=1;
		int inc=1;

		while (term<=100) {
			sum+=term;
			System.out.printf("%d+",term);
			term=term+inc;
			inc++;
		}
		System.out.printf("=%d",sum);
	}

}
