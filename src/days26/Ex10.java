package days26;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

/**
 * @author Osj  
 * @date   2025. 9. 22. 오후 5:15:35
 * @subject 기본타입 스트림 
 * @content 기본형 8가지를 읽기/쓰기 쉽게 하도록 만든 바이트 스트림
 * 			DataInputStream/DataOutputStream
 * 	
 * 			Ex10.java, Ex10_02.java 설명 DataInputStream/DataOutputStream
 * 
 */
public class Ex10 {

	public static void main(String[] args) {
		String name = "홍길동";

		int kor = 90, eng = 80, mat = 99;
		int tot = kor + eng + mat;
		double avg = (double)tot/3;
		boolean gender = true;
		
		String fileName="student.dat"; // dat 파일로 저장
		try (FileOutputStream fos = new FileOutputStream(fileName,true);
				DataOutputStream dos = new DataOutputStream(fos)){
			//writeXXX()
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(mat);
			dos.writeInt(tot);
			dos.writeDouble(avg);
			dos.writeBoolean(gender);
			
			dos.flush();
			
			  
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" end ");
	}

}
