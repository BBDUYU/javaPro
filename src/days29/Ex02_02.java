package days29;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex02_02 {

	public static void main(String[] args) {
		String s[]= {"kbs", "mbc","sbs", "jtbc"};
		//String []->List 변환
		List<String> list=Arrays.asList(s);
		System.out.println(list);
		//정렬해서 출력
		/*
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2); //내림차
			}
		});
		*/
		list.sort((o1,o2)->o1.compareTo(o2));
		
		System.out.println(list);
		
		
		
	}

}
