package days13;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Osj  
 * @date   2025. 9. 3. 오후 4:12:38
 * @subject 검색(Search) 
 * 				항목들의 집합에서 특정 항목을 찾아내는것
 * 				1) 순차검색(Sequence Search)
 * 					n값이 있는 모든 index값을 출력
 * 				2) 이진검색(Binary Search)
 * @content 
 */
public class Ex06_02 {

	public static void main(String[] args) {
		int [] m = { 0, 2, 12, 16, 7, 9, 2, 9, 0, 13, 7, 13, 3, 14, 10
				, 15, 11, 6, 19, 5, 2, 0, 16, 18, 15, 18, 0, 9, 13, 16 };
		Scanner scanner = new Scanner(System.in);
		System.out.print("> 배열에서 찾을 정수 입력 ? ");
		int n = scanner.nextInt(); 
		int temp[]=sequenceSearch(m, n);
		System.out.println(Arrays.toString(temp));
		/*
		String result=sequenceSearch(m,n);
		System.out.println(result);

		String regex="\\s*,\\s*";
		String indexArr[]=result.split(regex);

		System.out.println(Arrays.toString(indexArr));
		 */
	}
	/*
	private static int[] sequenceSearch(int[] m, int n ) {//끝까지 찾음
		int temp[]=new int[m.length];
		int index=0;
		for (int i = 0; i < m.length; i++) {
			if( n == m[i] ) {
				temp[index++]=i;
			}
		}
		return Arrays.copyOf(temp, index); //copyOf - index값 까지 자름
	}*/

	/*[2]
	private static String sequenceSearch(int[] m, int n ) {//끝까지 찾음
		String result="";
		for (int i = 0; i < m.length; i++) {
			if( n == m[i] ) {
				result += i+", ";
			}
		}
		return result;
	}
	 */
	/*[1]
	private static int sequenceSearch(int[] m, int n ) {//끝까지 찾음
		int pos = -1;
		for (int i = 0; i < m.length; i++) {
			if( n == m[i] ) {
				System.out.printf("찾는 정수 %d는 %d위치에 있다\n",n,i);
			}
		}
		return pos;
	}
	 */
	private static int sequenceSearch(int[] m, int n, int index) {//주어진 값까지만 찾음
		int pos = -1;
		for (int i = 0; i < index; i++) {
			if( n == m[i] ) return i; 
		}
		return pos;
	}

}
