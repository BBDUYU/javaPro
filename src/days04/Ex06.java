package days04;

/**
 * @author Osj  
 * @date   2025. 8. 21. 오전 11:47:14
 * @subject [] 인덱스 연산자 (index)
 * @content 
 */
public class Ex06 {

	public static void main(String[] args) {
	      // () 연산자 : cast 연산자, 최우선 연산자
	      // ,  연산자 : 나열 연산자
	      // ;        : 명령 종결 연산자
	      // {}   "   : 범위(영역) 연산자 
	      // 1. 한 학생의 국어 점수를 저장할 변수를 선언
	      // int kor; // 0~100 byte
	      
	      // 2. 전교생의 국어 점수를 저장할 변수를 선언.
	      //   30X10+30X10+30X10 = 900
	      /*
	      int kor_1_1_1;
	      :
	      int kor_3_10_30;
	      */
	      
	      // 배열 사용
	      // 1. 참조 타입
	      // 2. 배열 정의 ? 동일한 자료형을 메모리 상에 연속적으로 놓이게 한 것.
	      // 3. 배열 선언 형식 
	      //    자료형 [] 배열명;  // 변수, 참조변수
	      //    자료형 배열명 [];
	      //  스택(Stack) 영역
	      //  [ 100번지 ]
	      //    kors
	      int  kors[]; //배열생성
	      
	      // 동적(Heap) 영역
	      //    0     1    2     3     4       899   index 첨자값
	      // 0번째 요소 1번째 요소 ...
	      // 배열명[index]
	       // [4int][4int][4int][4int][4int]..[4int]
	      // 시작주소
	      // 100번지104번지108번...
	      kors = new int[900]; //배열크기 설정
	      // kors = 100;  X
	      kors[0] = 100; // 배열 주소 지정 후 데이터 입력
	      kors[1] = 90;
	      System.out.println( kors[0]  );
	      System.out.println( kors[1]  );
	      
	      
	      
	      /*
	      int kor;
	      kor = 90;
	      System.out.println( kor );
	      */
	      
	      
	      
	      
	      
	      
	   }

}
