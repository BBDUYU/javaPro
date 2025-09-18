package days24;

/**
 * @author Osj  
 * @date   2025. 9. 18. 오후 3:31:14
 * @subject C <- S : HashSet, LinkedHashSet 
 * @content 		 [TreeSet] 컬렉션 클래스
 */
public class Ex08 {

	public static void main(String[] args) {
		/*
		 * [TreeSet]
		 * 1. 중복허용 X 순서유지 X
		 * 2. 이진검색 트리(binary search tree)라는 자료구조로 데이터를 저장
		 * 	  정렬, 검색, 범위검색시 높은 성능을 나타냄
		 * 3. 링크드리스트 처럼 노트가 서로 연결된 구조이다
		 * 4. 노드간의 관계
		 * 		- 최상위 노드 : 루트 노드
		 * 		- 부모노드 - 자식노드
		 * 		- 형제노드
		 * 5. 노드 구조
		 * 		class TreeNode{
		 * 			TreeNode 왼쪽자식노드; 
		 * 			int value;
		 * 			TreeNode 오른쪽자식노드;
		 * 		}
		 * 6. 이직 검색 트리 구조 설명
		 * 		- 부모노드의 왼쪽에는 부모노드 값보다 작은 값의 자식노드가 배치되고
		 * 		  		  오른쪽에는 	//	    큰 값의 자식노드가 배치
		 * 		
		 * */
	}

}
