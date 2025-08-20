package days03;

public class Ex09 {

	public static void main(String[] args) {
//		int a = Integer.MAX_VALUE;
//		a=a+5; //오버플로우
		
//		int a =Integer.MIN_VALUE;
//		a=a-5; //언더플로우
//		System.out.println(a);
		
		int i=Integer.MAX_VALUE;
		int j=100;
//		int k=i+j;
		long k=(long)i+j;
		System.out.printf("%d + %d=%d",i,j,k);
	}

}
