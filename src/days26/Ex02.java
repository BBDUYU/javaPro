package days26;

public class Ex02 {

	public static void main(String[] args) {
		//열거형안에 있는 상수에게 특정값 설정 -> 사용
		Direction dirArr[]=Direction.values();
		for(Direction d : dirArr) {
			System.out.printf("> name:%s, value:%d, symbol:%s, %s\n"
					,d.name()
					,d.getValue()
					,d.getSymbol()
					,d.toString());
		}
	}

}
