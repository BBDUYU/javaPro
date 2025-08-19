package days02;

/**
 * @author Osj  
 * @date   2025. 8. 19. 오전 11:40:34
 * @subject Type == 타입 == 데이터형식 == 자료형
 * @content 자바의 타입
    	기본형(Primitive Type) – 8가지
         	ㄴ 숫자형
                정수계열 - byte(1), short(2), int(4), long(8)
                        * char(2) *
                        
                실수계열 – float(4), double(8)
        	ㄴ 논리형 – true/false -> boolean(1)
    	참조형(Reference Type)  - 배열, 클래스(String), 인터페이스
 */
public class Ex04 {

	public static void main(String[] args) {
		//학점 - A B C D F
		char grade;
//		grade='A';
		grade=65; //ASCII 코드
		grade='\u0041'; /* u -> 유니코드 */ 
		System.out.println(grade);
	}

}
