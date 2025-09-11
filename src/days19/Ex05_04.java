package days19;

import java.util.Random;

public class Ex05_04 {

	public static void main(String[] args) {
		int number=100;
		int result=0;
		int m[]=new int[5]; 

		Random rnd=new Random();

		int n=-1;
		for (int i = 0; i < 10; i++) {
			try {
				n=rnd.nextInt(5); // 0<=x<5

				result=number/n;
				System.out.println(result);

				int index=rnd.nextInt(10);
				m[index]=result;
				System.out.println("> index : "+index);
				//멀티 캐치 블럭
				//상속관게가 있을시 자식예외캐치블럭을 먼저
			}catch (ArrayIndexOutOfBoundsException | ArithmeticException e) { //자식개체를 위로
				// TODO: handle exception
				i--;
			}catch (Exception e) {
				System.out.println("@@@"+e.toString());
				System.out.println("###"+e.getMessage());
				e.printStackTrace();
			} 

		}//for
	}

}
