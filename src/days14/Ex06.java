package days14;

import java.util.Arrays;

public class Ex06 {

	public static void main(String[] args) {
		int m[]= {1,2,3};
		Car myCar=new Car();
		dispInfo(10,m,myCar);
	}
	public static void dispInfo(int n,int m[],Car car) {
		System.out.println("> dispInfo() 호출됨"+n);
		System.out.println(Arrays.toString(m));
		
		car.dispCarInfo();
	}

}
