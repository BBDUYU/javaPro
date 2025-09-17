package days23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Osj  
 * @date   2025. 9. 17. 오전 10:37:29
 * @subject List 인터페이스를 구현한 대표적인 컬렉션 클래스 
 * @content 	ArrayList 컬렉션 클래스
 * 			특징 - 중복허용, 순서유지
 */
public class Ex05 {

	public static void main(String[] args) {
		//학생 이름은 여러명 저장
		//배열 사용 시 단점 
		//	- 배열 크기 자동증가 X
		//	- 배열 중간에 존재하는 데이터 수정 어려움
		//		String names[]=new String[30];


		//<E> 제네릭 - Element - 요소
		ArrayList list=new ArrayList();


		System.out.println(list.size());
		list.add("이나영");
		list.add("이창익");
		list.add("김수진");
		list.add("장소예");
		System.out.println(list.size());
		//		list.clear(); //모든 요소제거
		//		System.out.println(list.size());

		String name="홍길동";
		list.add("홍길동");
		// "홍길동"이 list에 있는지 유무 확인
		// 있으면 삭제하고 없으면 없다라는 메시지 출력
		if(list.contains(name)) {
			System.out.println(list);
			list.remove(name);
			System.out.println("삭제되었습니다");
			System.out.println(list);
		} else System.out.println(name+" : 해당 이름은 없습니다");

		//		System.out.println(list.get(1));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		if(list.contains("김수진")) {
			int index=list.indexOf("김수진");
			list.add(index, "홍길동");
			System.out.println(list);
		}
		//		list.trimToSize();

		//String.trim() 문자열 앞뒤 공백을 제거
		//		System.out.printf("[%s]\n"," XXX ".trim());


		list.add("이지혜");
		System.out.println(list);
		/* XXXX
		String regex="^이";
		list.remove(regex);
		System.out.println(list);
		 */
		/* [1]
		for (int i = 0; i < list.size(); i++) {
//			System.out.printf("%d - %s",i,list.get(i));
			name=(String) list.get(i);
			if(name.startsWith("이")) { 
				list.remove(i); 
				i--;
				//삭제시 index값 이동으로 인해 바로 다음 index에 해당하는 value가 삭제되지 않음
				// i=0, 0 이지혜 1이창익 -> i=1, 0 이창익 
			}
		}
		System.out.println(list);
		 */
		/*[2]
		ArrayList leeList=new ArrayList();
		for (int i = 0; i < list.size(); i++) {
			name=(String) list.get(i);
			if(name.startsWith("이")) { 
				leeList.add(name);
			}
		}
		System.out.println(leeList);
		list.removeAll(leeList);
		System.out.println(list);
		 */ 
		//[3] 익명클래스
		//		Predicate<String> p = new Predicate<String>() {
		//			
		//			@Override
		//			public boolean test(String t) {
		//				return t.startsWith("이");
		//			}
		//		};
		/*
		list.removeIf(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.startsWith("이");
			}
		});
		 */
		//list.removeIf((t)->  ((String) t).startsWith("이"));
		System.out.println(list);
		//[이나영, 이창익, 홍길동, 김수진, 장소예, 이지혜]
		//         1     2     3
		List list1_3= list.subList(1, 3);
		System.out.println(list1_3); //이창익,홍길동 index 1,2만 가져옴
		
		//배열 정렬하듯 ArrayList 정렬
		System.out.println(list);
		/* 
		Comparator<String>c=new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);//
			}
		};
		 */
		list.sort((o1,o2)-> ((String) o1).compareTo((String) o2));
		System.out.println(list);

	}

}
