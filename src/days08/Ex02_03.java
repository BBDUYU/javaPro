package days08;

public class Ex02_03 {

	public static void main(String[] args) {
		String message= "TODO Auto-generated method stub";
		//1.끝에서 3글자만 읽어와서 출력
		System.out.println(message.length());
		int beginIndex=message.length()-3;
		System.out.println(message.substring(beginIndex));
	}

}
