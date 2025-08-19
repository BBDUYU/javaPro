package days02;

/**
 * @author Osj  
 * @date   2025. 8. 19. 오전 10:29:05
 * @subject 기본형 중 정수계열 자료형
 * @content byte(1), short(2), int(4), long(8)
 */
public class Ex02 {

	public static void main(String[] args) {
		String name="오승종";
		byte age=90;
		//Type mismatch: cannot convert from String to byte - 문자열을 집어 넣을 때
		//Type mismatch: cannot convert from int to byte - 메모리 크기가 맞지 않을 때
		//Type mismatch: cannot convert from double to byte - 실수를 집어 넣을 때
		//Type mismatch: cannot convert from long to byte - 뒤에 문자를 집어 넣을 때
		System.out.println(name+"님은 "+age+"살까지");
	}

}
//2. 나이를 저장할 변수 선언     min=0   max=125
// byte   1byte  []    [][][][][][][] 2^7 = 128가지
//              부호비트  음수 128가지 양수 128
//                      [-128 ~ 127 정수] 
//                        0~255 정수  X 

// short 2byte   [] [][][]  2^15 =32768 가지
//                [-32768 ~ 32767 정수]

// int   4byte   []  2^31  2147483648가지( 21억 가지 )
//                  [-21억 ~ 21억 정수]

// long 8byte    []  2^63   9223372036854775808 가지
//                   [-900경 ~ 900경 정수]