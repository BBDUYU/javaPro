package days13;

public class Ex02_02 {

	public static void main(String[] args) {
		int m[]=new int[8];//배열생성
		//배열명.length 배열크기
		System.out.println("1차원 배열 m의 크기"+m.length);
		disp(m);//메서드 호출
		
	}

	private static void disp(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d ",i,m[i]);
		}
	}

}
