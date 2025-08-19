package days02;

/**
 * @author Osj  
 * @date   2025. 8. 19. 오후 2:25:45
 * @subject 형변환
 * @content   ㄴ 자동 타입 변환
 * 			  ㄴ 강제 타입 변환
 * 
 * 			자동 형 변환
 * 			  1) byte(작은타입) + int(큰타입) => int(큰타입)
 * 			  2) long(큰타입) = int(작은타입) 
 */
public class Ex08 {

	public static void main(String[] args) {
//		byte b=50;
//		long l=b ; -> 큰 타입 = 작은타입 자동 형변환
		
//		long l=50;
//		byte b=(byte)l;
//		System.out.println(b);

//		float avg=(float)98.78;
//		float avg= 98.78f;
		
		byte b=10;
		long l=100;
		System.out.println(b+l); //작은타입 + 큰타입 => 큰타입
	}

}
