package days29;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Osj  
 * @date   2025. 9. 25. 오전 10:13:22
 * @subject java.util.function 패키지 
 * @content 			ㄴ 자주 사용되는 함수형 인터페이스 설명
 * 			- j.u.function 패키지는 자주 사용되는 함수형 인터페이스를 미리 정의해 놓은 패키지
 * 			- 개발자들이 통일(표준화), 유지보수 용이
 * 			- j.u.function 패키지의 함수형 인터페이스 종료
 * 				1)
 * 				2)
 * 				3)
 * 				4)
 * 				5)
 */
public class Ex03 {

	public static void main(String[] args) {
		Map<String, String>map= new HashMap<>();
		map.put("admin", "관리자");
		map.put("hong", "홍길동");
		map.put("se", "서영학");
		
		map.forEach((id,name)->System.out.println(id+":"+name));
		
		
	}

}
