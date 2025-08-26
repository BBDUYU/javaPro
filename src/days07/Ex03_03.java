package days07;

public class Ex03_03 {

	public static void main(String[] args) {
		for(int i=0,count=1;i<256;i++,count++) {
			
			System.out.printf("[%c]",(char)i);
			if(count%10==0) {
				System.out.println();
				count=0;
			}
		}
	}

}
