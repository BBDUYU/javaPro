package days16;

/**
 * @author Osj  
 * @date   2025. 9. 8. 오후 3:48:43
 * @subject 가변인자 
 * @content 
 */
public class Ex08 {

	public static void main(String[] args) {
		//두정수의 합을 구해서 반환하는 sum함수선언+호출
		int result=sum(1,2);
		System.out.println(result);
		result=sum(1,2,3);
		System.out.println(result);
		result=sum(1,2,3,4);
		System.out.println(result);
		
		int m[]= {1,2,3,4,5,6,7,8,9};
		result=sum(m);
		System.out.println(result);
	}

	
	//오버로딩
	//가변 인자 : jdk1.5 메서드의 매개변수의 갯수가 고정 X -> 동적 지정할 수 있다
	private static int sum(int...m) {
		int result=0;
		for (int i = 0; i < m.length; i++) {
			result+=m[i];
		}
		return result;
	}
	/*
	private static int sum(int m[]) {
		int result=0;
		for (int i = 0; i < m.length; i++) {
			result+=m[i];
		}
		return result;
	}
	private static int sum(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		return i+j+k+l;
	}

	private static int sum(int i, int j, int k) {
		// TODO Auto-generated method stub
		return i+j+k;
	}

	private static int sum(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}
*/
}
