package days08;

import days07.Graphic2D;

/**
 * @author Osj  
 * @date   2025. 8. 27. 오후 3:19:25
 * @subject 메서드 
 * @content 함수 ?
 * 			프로그래밍에서 반복되는 명령어를 별도로 묶어 필요할 때 마다 불러서 사용
 * 			프로그램의 구조화 - 유지보수용이
 * 			선언 형식
 * 			[접][기]리턴자료형 메소드명([매개변수...]){
 * 				-Body-
 * 				실행명령
 * 				[return 리턴값;]
 * 			}
 * 			메서드 3가지 파악
 * 				- 기능
 * 				- 매개변수
 * 				- 리턴값
 */
public class Ex07 {

	public static void main(String[] args) {
		Graphic2D.LineDraw(50,'^');
		System.out.println(" 부서명  : 사원명 ");
//		System.out.println("---------------"); 
		Graphic2D.LineDraw(30,'$');
		System.out.println(" 영업부  : 사원명 ");
		System.out.println(" 총무부  : 사원명 ");
		System.out.println(" 자재부  : 사원명 ");
		System.out.println(" 기획부  : 사원명 ");
//		System.out.println("---------------"); 
		Graphic2D.LineDraw(10,'#');
	}
	//선긋는기능
	//매개변수 x
	//return x
//함수선언부분
//	public static void LineDraw(){
//		System.out.println("---------------"); 
//		
//	}
//	//Duplicate method LineDraw() in type Ex07
//	//메소드 명 동일+매개변수 갯수+타입X
//	//중복함수
//	//오버로딩
//	public static void LineDraw(int n){
//		for(int i=1;i<=n;i++) {
//			System.out.print("-");
//		}
//		System.out.println(); 
//		
//	}
//	public static void LineDraw(int n,char style){
//		for(int i=1;i<=n;i++) {
//			System.out.print(style);
//		}
//		System.out.println(); 
//		
//	}

}
