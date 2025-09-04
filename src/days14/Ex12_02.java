package days14;

import java.util.Arrays;

/**
 * @author Osj  
 * @date   2025. 9. 4. 오후 4:10:57
 * @subject 클래스 배열
 * @content 
 */
public class Ex12_02 {
	public static void main(String[] args) {
		//5명의 사람 객체를 생성 -> 일
		Person pArr[]=new Person[5];
		String pNames[]= {"김다원","김민배","김수진","김유진","김호연"};
		
		for (int i = 0; i < pArr.length; i++) {
			pArr[i]=new Person();
			pArr[i].name=pNames[i];
		}
		System.out.println(Arrays.toString(pArr));
		for (int i = 0; i < pNames.length; i++) {
			pArr[i].work();
		}
		//pArr[0].name="김다원";
	}
}
