package days19;

/**
 * @author Osj  
 * @date   2025. 9. 11. 오후 12:29:28
 * @subject 
 * @content 
 */
public class Ex05 {

	public static void main(String[] args) {
		int i = Integer.MAX_VALUE;
        int j = i + 100;
        System.out.println( j ); // -2147483549       
	}

}
/*
 * [예외처리(Exception Handling)]
 * 1. 오류 ? 프로그램 실행 중에 오작동 또는 비정상 종료되는 원인
 * 2. 오류 발생 시점에 따라... 
 *   1) 컴파일 오류
 *      int a
 *   2) 실행 오류 == 런타임(Runtime) 오류  
 *     int [] m  = null;
       m[0] = 100;
       System.out.println( m[0]);
          (1) 에러(Error) : 복구할 수 없는 심각한 오류
                            메모리 부족, 스택 오버프로워 등등
              Error 부모클래스
                 ㄴ Error 자식클래스....              
          (2) 예외(Exception) : 에러보다 덜 심각한 비교적 수습될 수 있는 실행 오류
              Exception 부모클래스
                 ㄴ 자식 클래스
     3) 논리적 오류( 가장 어려운 오류 ) 
           int i = Integer.MAX_VALUE;
         int j = i + 100;
         System.out.println( j ); // -2147483549           
 * */