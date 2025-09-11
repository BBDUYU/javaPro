package days19;

public class Ex01 {

	public static void main(String[] args) {
		String fileName="sample.xml";
		String docType="xml";

		Parseable parser=ParserManager.getParser(docType);
		parser.parse(fileName);
		parser.print();

		System.out.println("end");
	}

}

//2000년 A개발자 구현
interface Parseable{
	//구문분석하는데 사용되는 추상메서드 선언
	void parse(String fileName); // public abstract 생략

	//구문분석 후 분석결과 출력하는 추상메서드 선언
	default void print() //2025년 추가
	{
		System.out.println("출력 기능 구현된 메서드");
	}
	//25년 새로운 기능의 메서드
	public static void test() {
		System.out.println("기능");
	}
}

//2000년 A개발자 구현
//XML 문서 파싱클래스
class XMLParser implements Parseable{
	@Override
	public void parse(String fileName) {
		System.out.println("XML 문서 파일을 구분 분석 메서드 호출");
	}
}

//2000년 A개발자 구현
//HTML파싱 클래스

class HTMLParser implements Parseable{
	@Override
	public void parse(String fileName) {
		System.out.println("HTML 문서 파일을 구분 분석 메서드 호출");
	}
}

//2020년 A개발자 구현
//PDF 문서 파싱

class PDFParser implements Parseable{
	@Override
	public void parse(String fileName) {
		System.out.println("PDF 문서 파일을 구분 분석 메서드 호출");
	}
	public void print() 
	{
		System.out.println("출력 기능 구현된 메서드");
	}

}
//2024년 A개발자 구현
//WORD 문서 파싱

class WordParser implements Parseable{
	@Override
	public void parse(String fileName) {
		System.out.println("Word 문서 파일을 구분 분석 메서드 호출");
	}
}
//인터페이스 상속 - extends
interface ParseablePlus extends Parseable{
	void print(); //출력
}

//Parser 관리
class ParserManager{
	public static Parseable getParser(String docType){
		Parseable parser=null;
		switch (docType) {
		case "xml":
			parser=new XMLParser();
			break;
		case "html":
			parser=new HTMLParser();
			break;
		case "pdf":
			parser=new PDFParser();
			break;
		case "wrod":
			parser=new WordParser();
			break;

		default:
			parser=null;
			break;
		}
		return parser;
	}
}