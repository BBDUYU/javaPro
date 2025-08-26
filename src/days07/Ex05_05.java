package days07;

public class Ex05_05 {

	public static void main(String[] args) {
		
		for(int k=1;k<=3;k++) {
			OUT:for(int i=1;i<=9;i++) {
				for(int j=3*k-1;j<=3*k+1;j++) {
					if(i==10)break OUT; //중첩for문일때 break할 for문앞에 이름:
					System.out.printf("%d * %d = %02d ",j,i,i*j);
				}
				System.out.println();	
			}
			System.out.println();
		}
	}

}
