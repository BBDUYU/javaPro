package days16;

public class Ex08_02 {

	public static void main(String[] args) {
		
		//main(String[] args)
		
		
		System.out.printf("%s %d %.2f %b\n",
				"홍길동",20,3.14,true);


		// [가변인자 사용시 주의할 점]
		// 1. 가변인자는 내부적으로 배열을 사용.
		// 2. 오버로딩을 하지 않는 게 좋다.
		// 3. 비효율적이기 때문에 꼭 필요한 곳에서만 사용.
		// 4. 제일 마지막에 가변 인자를 선언한다. 
		String [] names = {
				"홍길동",
				"김민곤",
				"이찬희",
				"오재문"
		};
		System.out.println(joinNames("-", names));
		System.out.println(joinNames(":", "a","b","c","d"));
	}
	public static String joinNames(String delimiter, String ...args) {
		return String.join(delimiter, args);
	}
	

}
