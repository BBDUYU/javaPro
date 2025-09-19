package days25;

/**
 * @author Osj  
 * @date   2025. 9. 19. 오후 4:43:55
 * @subject Enum - 열거형 
 * 			- 한정된 값을 갖는 자료형
 * @content 남은거
 * 			제네릭, IO, 람다식, 스트림 O
 * 
 * 			스레드, 네트워크 X
 * 
 * 			Enum이 없으면 아래와 같이 코딩
 * 
 * 			Enum
 * 			ㄴ  서로 관련된 상수들의 집합을 나타내는 특별한 클래스 타입.
 *            ㄴ  jdk 1.5 새로 추가.
 *            ㄴ 정의 
 *                enum 열거형이름 {  상수명,상수명...              }
 *            ㄴ 사용방법
 *               열거형이름.상수명
 * 
 * 
 */
public class Ex10 {

	public static void main(String[] args) {
		System.out.println(Card.CLOVER);

		int myCard=Card.CLOVER;

		switch (myCard) {
		case Card.CLOVER:
			break;

		case Card.DIAMOND:
			break;

		default:
			break;
		}
	}

}

class Card{
	public static final int CLOVER=0;
	public static final int HEART=1;
	public static final int DIAMOND=2;
	public static final int SPADE=3;
}