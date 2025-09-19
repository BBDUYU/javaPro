package days25;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Osj  
 * @date   2025. 9. 19. 오전 9:02:44
 * @subject Map 
 * @content  ㄴ HashMap 컬렉션 클래스
 * 			 ㄴ entry ( key + value )
 */
public class Ex01 {

	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<>();
		//추가
		hm.put("admin","관리자");
		hm.put("kenik","이창익");
		hm.put("hong","홍길동");
		
		System.out.println(hm.size());
		System.out.println(hm);
		/*
		if(hm.containsKey("kenik")) {
			
//			hm.put("kenik","김창익");
			//삭제
			hm.remove("kenik");
		}
		System.out.println(hm);
		*/
		//모든 key값 조회 keySet() 메서드
		/*
		Set<String> ks =  hm.keySet();
		Iterator<String> ir = ks.iterator();
		while (ir.hasNext()) {
			String key=ir.next();
			System.out.println(key);
		}
		*/
		//모든 value값 조회
		/*[1]
		Set<String> ks =  hm.keySet();
		Iterator<String> ir = ks.iterator();
		while (ir.hasNext()) {
			String key=ir.next();
			String value = hm.get(key);
			System.out.println(value);
		}
		[2]*/
		/*
		Collection<String> vs = hm.values();
		Iterator<String> ir = vs.iterator();
		while (ir.hasNext()) {
			String value = ir.next();
			System.out.println(value);
		}
		*/
		//모든 key-value값을 같이 출력
		Set<Entry<String, String>> entry= hm.entrySet();
		Iterator<Entry<String, String>> ir = entry.iterator();
		while (ir.hasNext()) {
			Entry<String, String> result=ir.next();
			String key = result.getKey();
		    String value = result.getValue();
		    System.out.println(key+"-"+value);
		}
		
		
		
		
	}
}
