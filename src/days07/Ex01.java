package days07;

import java.util.Arrays;
import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		//로또 번호 1개 출력 1~45
		//1. Math.random()
		//2. Random클래스
		Random rnd=new Random();
		int n;
		
		
		//System.out.println(rnd.nextInt(45)+1);
		//중복체크
		//로또번호를 저장할 변수선언
		//int lotto1,lotto2,lotto3,lotto4,lotto5,lotto6;
		int lottoArr[]=new int[6];
		
		//System.out.println(Arrays.toString(lottoArr)); [0, 0, 0, 0, 0, 0]
		int index=0;
		boolean flag=false; //중복값 여부
		
		
		while (index<6) {
			n=rnd.nextInt(45)+1;
			flag=false;
			for(int i=0;i<index;i++) {
				if(lottoArr[i]==n) {
					flag=true;//중복값 존재
					break;//
				}//if
			}//for
			if(!flag) {//flag가 false일때 값을 넣음
				lottoArr[index++]=n;
				System.out.println(Arrays.toString(lottoArr)+"/"+index);
			}
			
		}//while
		
		
//		n=rnd.nextInt(45)+1;
//		lottoArr[index++]=n;
//		System.out.println(Arrays.toString(lottoArr));
//		
//		//Duplicate local variable n
//		n=rnd.nextInt(45)+1;
//		lottoArr[index++]=n;
//		System.out.println(Arrays.toString(lottoArr));
		
		
	}

}
