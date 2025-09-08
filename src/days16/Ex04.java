package days16;

public class Ex04 {

	public static void main(String[] args) {
		Calc calc=new Calc();
//		calc.btnExec클릭시 실행
		calc.btnExec.btn_click();
	}

}

class Calc{
	//Button btnPlus;
	//Button btns[]=null;
	Button btnExec=null;
	
	//디폴트생성자 - 필드 초기화
	public Calc() {
		init();
	}

	//클래스 초기화
	private void init() {
		//멤버를 가리킴
		//								  this 3용도 = 현재 계산기 인스턴스
		this.btnExec = new Button("[ = ]",this); 
	}
	public void execDisp(String result) {
		System.out.printf("[화면결과 출력] %s\n",result);
	}
}

class Button{
	String text;
	Calc calc;
	public Button() {}
	public Button(String text) {
		this.text=text;
	}
	public Button(String text,Calc calc) {
		this(text);//this 2
		this.calc=calc;//this 1
	}
	//버튼을 클릭 이벤트가 발생할 때 호출하는 메서드
	public void btn_click() {
		String result="3 + 5 = 8";
		// 이 버튼이 포함된 계산기의 화면에 계산 결과를 출력
		//execDisp(result)메서드를 호출
		this.calc.execDisp(result);
	}
}