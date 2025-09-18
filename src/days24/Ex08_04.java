package days24;

import java.util.TreeSet;

/**
 * @author Osj  
 * @date   2025. 9. 18. 오후 4:38:14
 * @subject  
 * @content 
 */
public class Ex08_04 {

	public static void main(String[] args) {
		int [] score = { 80, 95, 50, 85, 45, 65, 10, 100 };
		/*1. 가장높은 점수?
		 *2. 가장낮은 점수?
		 *3-1.80점 초과점수
		 *3-2. 80점 이상 점수?
		 *3-3.80 미만
		 *3-4.80 이하
		 *4. 50<= 점수 <=80
		 *5. 총 점수 합
		 *6. 평균 점수
		 */
		TreeSet<Integer> ts=new TreeSet<Integer>();
		for (int i = 0; i < score.length; i++) {
			ts.add(score[i]);
		}
		System.out.println(ts);
		System.out.println("1. 가장 높은점수 : "+ts.last());
		System.out.println("2. 가장 낮은점수 : "+ts.first());
		System.out.println("3. 80점 초과 점수 : "+ts.tailSet(80,false));
		System.out.println("3. 80점 이상 점수 : "+ts.tailSet(80));
		System.out.println("3. 80점 미만 점수 : "+ts.headSet(80));
		System.out.println("3. 80점 이하 점수 : "+ts.headSet(80,true));
		System.out.println("4. 50점이상 80점 이하 점수 : "+ts.subSet(50,81));
		//System.out.println("5. 총 점수 합 : "+);
		
		
	}

}
