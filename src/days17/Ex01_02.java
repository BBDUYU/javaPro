package days17;

public class Ex01_02 {

	public static void main(String[] args) {
		Document doc1=new Document();
		Document doc2=new Document();
		Document doc3=new Document("자바문서.txt");
		Document doc4=new Document();
		Document doc5=new Document();
	}

}

class Document{
	String fileName;
	static int count=1; //명시적초기화
	//인스턴스 초기화블럭
	//생성자가 오버로딩 되어져있을때
	//중복되는 코딩이 있다면 초기화 블럭을 사용
	{
		//count++;
	}
	Document(){
		this(String.format("Noname%d.txt", count++));
		 //this의 두번째 용도 - 또다른 생성자를 호출할때의 this	
	}
	Document(String fileName){
		this.fileName=fileName;//this의 첫번째 용도 - 멤버를 가리킬때의 this
		System.out.printf("문서 \"%s\"가 생성되었습니다.\n", this.fileName);
	}
}