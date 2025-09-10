package days18;

/**
 * @author Osj  
 * @date   2025. 9. 10. 오후 12:26:27
 * @subject 추상메서드, 추상클래스 
 * @content 
 */
public class Ex06 {

	public static void main(String[] args) {
		Player cdP=new CDPlayer();
		cdP.play(10);
		
		
	}

}

//추상클래스선언 
//추상메서드가 없어도 추상클래스 선언가능
// - 객체를 생성할필요가 없는 클래스일 때
abstract class Player{
	//필드
	boolean pause;//작동중지
	int currentPos; //현재작동위치
	
	//생성자
	public Player() {
		
	}
	
	//추상메서드 선언 - 오디오,비디오 플레이어 기능
	abstract void play(int pos); //1
	abstract void stop();//2
}


 //The type AudioPlayer must implement the inherited abstract method Player.stop()
//The type AudioPlayer must implement the inherited abstract method Player.play(int)
//추상메서드를 가진 부모클래스를 상속받으면 자식클래스도 추상클래스 -> abstract 추가
abstract class AudioPlayer extends Player{

	@Override
	void stop() {
		System.out.println("> stop 추상메서드를 오버라이딩 완료");//2
	}
	
}

class CDPlayer extends AudioPlayer{//2

	@Override
	void play(int pos) {
		System.out.println("> 추상메서드 오버라이딩 완료");//1
	}
	
}









