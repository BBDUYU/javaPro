package days02;

/**
 * @author Osj  
 * @date   2025. 8. 19. 오후 12:27:05
 * @subject 실수형 : float(4) double(8)
 * @content 
 */
public class Ex05 {

	public static void main(String[] args) {

		float var1=0.1234567890123456789f;
		double var2=0.1234567890123456789;
		System.out.println("var1"+var1);
		System.out.println("var2"+var2);
		
		System.out.println("-".repeat(50)); //구분선
		/*
		 * 3.14 double
		 * 3. double
		 * 3D double
		 * 3d double
		 * 
		 * 3F float
		 * 3f float
		 * */
		
		
		//Type mismatch: cannot convert from double to float
		//float avg [s][8비트 지수부][23비트 가수부]
		float avg=98.789f; //0.98789(가수부) * 10^2(지수부)
		System.out.println(avg);
		
		//double avg=[s][11비트 지수부][52비트 가수부]
		double avg2=98.789;
		System.out.println(avg2);

	}

}
//char c='A';
//String s="A"; //문자열 == 문자의 나열 'A'+'/0'="A"