package days26;

import java.io.FileWriter;

/**
 * @author Osj  
 * @date   2025. 9. 22. 오후 5:15:35
 * @subject 기본타입 스트림 
 * @content 기본형 8가지를 읽기/쓰기 쉽게 하도록 만든 바이트 스트림
 * 			DataInputStream/DataOutputStream
 * 	
 * 			Ex09.java(쓰기), Ex09_02.java(읽기) 설명
 * 			Ex10.java, Ex10_02.java 설명 DataInputStream/DataOutputStream
 * 
 */
public class Ex09 {

	public static void main(String[] args) {
		String name = "홍길동";

		int kor = 90, eng = 80, mat = 99;
		int tot = kor + eng + mat;
		double avg = (double)tot/3;
		boolean gender = true;
		
		String fileName="student.txt"; // 파일로 저장
		try (FileWriter fw=new FileWriter(fileName,true);){
			   String data = String.format("%s,%d,%d,%d,%d,%.2f,%b\n"
		               , name, kor, eng, mat, tot, avg, gender);
			   fw.append(data); //데이터 추가
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" end ");
	}

}
