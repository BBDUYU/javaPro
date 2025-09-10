package days18;

/**
 * @author Osj  
 * @date   2025. 9. 10. 오전 11:10:50
 * @subject 싱글톤 패턴 [암기]
 * @content 
 */
public class Ex04 {

	public static void main(String[] args) {
		//자바는 [단일상속]만 지원, [다중상속]은 지원하지 않는다
		//인터페이스를 통해서 다중상속을 대신할수있음
		//The constructor BoardDAO() is not visible
		BoardDAO dao1=BoardDAO.getInstance();//new BoardDAO();
		BoardDAO dao2=BoardDAO.getInstance();//new BoardDAO();
		BoardDAO dao3=BoardDAO.getInstance();//new BoardDAO();

		System.out.println(dao1.hashCode());
		System.out.println(dao2.hashCode());
		System.out.println(dao3.hashCode());

	}

}

// 게시판 - 글쓰기, 수정, 삭제, 목록 등등 + DB
class BoardDAO{

	//필드
	private static volatile BoardDAO boardDAO=null; //volatile
	//생성자의 접근지정자가 private이기 때문에
	//new BoardDAO() 인스턴스화 불가능
	private BoardDAO() {

	}
	//메서드
	public static BoardDAO getInstance(){
		if (boardDAO==null) {
			synchronized (BoardDAO.class) {
				if (boardDAO==null) {
					boardDAO=new BoardDAO();
				}
			}
		}
		return boardDAO;
	}
}