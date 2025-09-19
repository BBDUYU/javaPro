package days25;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Ex04 {

	static HashMap<String, HashMap<String, String>> phoneBook = new HashMap<>(); //(7)(9)(11)

	public static void main(String[] args) {//(1)
		String groupName, name, tel;

		addPhoneNo( "친구","이자바","010-1111-1111" );   //(2)
		addPhoneNo( "친구","김자바","010-2222-2222" );
		addPhoneNo( "친구","김자바","010-3333-3333" );
		addPhoneNo( "회사","이대리","010-4444-4444" );
		addPhoneNo( "회사","김대리","010-5555-5555" );
		addPhoneNo( "회사","박대리","010-6666-6666" );
		addPhoneNo( "동아리","김동아","010-7777-7777" );
		addPhoneNo( null, "세탁소","010-8888-8888" ); 
		addPhoneNo( null, "PC방","010-9999-8888" );  


		printList();//printList 메서드 출력//(13)
	}

	private static void printList() { //(14)

		Set<Entry<String, HashMap<String, String>>> es   = phoneBook.entrySet();// es 엔트리 세팅 - phoneBook HashMap<String, HashMap<String, String>>
		Iterator<Entry<String, HashMap<String, String>>> ir = es.iterator(); // es 엔트리 순회

		while (ir.hasNext()) {//ir 다음값이 있으면
			Entry<String, HashMap<String, String>> entry =ir.next(); //entry 엔트리에 ir해당값 대입

			String groupName = entry.getKey(); // 해당엔트리의 key를 groupName에 대입
			HashMap<String, String> groupMap = entry.getValue();//해당엔트리의 value를 HashMap groupMap에 저장
			System.out.printf("* %s [%d]\n",  groupName, groupMap.size() ); //출력

			Iterator<Entry<String, String>>  ir2 = groupMap.entrySet().iterator(); //groupMap 순회
			while (ir2.hasNext()) {
				Entry<String, String> entry2 = (Entry<String, String>) ir2.next();
				String tel  = entry2.getKey();
				String name = entry2.getValue();
				System.out.printf("\t%s : %s\n", name, tel);
			}
		}
	}

	private static void addPhoneNo(//(3)
			String groupName, String name, String tel) {

		groupName = (  groupName == null ? "기타" : groupName  );

		addGroup(  groupName );  //(4)

		HashMap<String, String>  group = phoneBook.get(groupName);//(10)
		group.put( tel, name );//(12)
	}

	private static void addGroup(String groupName) {//(5)

		if (     !phoneBook.containsKey(groupName)   ) {//(6)
			phoneBook.put(groupName, new HashMap<String, String>());//(8)
		}

	}

}
