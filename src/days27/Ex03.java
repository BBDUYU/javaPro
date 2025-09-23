package days27;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Osj  
 * @date   2025. 9. 23. 오전 11:24:14
 * @subject PipedReader / PipedWriter - 문자스트림
 * @content ㄴ 스레드 간에 데이터를 주고 받을 때 사용하는 스트림
 * 
 * 			RandomAcessFile 
 * 				ㄴ 파일의 어느 임의의 위치에 읽기/쓰기가 가능한 장점이 있는 스트림
 */
public class Ex03 {

	public static void main(String[] args) throws IOException {
		//[2]
		String s = "I Love normal Java";
		String q = "javabook";

		String name="random.txt";
		String mode="rw";//read, write
		try (RandomAccessFile raf=new RandomAccessFile(name, mode)){
			raf.writeBytes(s);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 일시 정지 + 엔터 계속....
		System.out.println("> 엔터 치면 진행한다. ");
		System.in.read();
		System.in.skip(System.in.available()); // 13, 10 제거

		try (RandomAccessFile raf=new RandomAccessFile(name, mode)){
			raf.seek(2);
			raf.writeBytes(q);
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 일시 정지 + 엔터 계속....
		System.out.println("> 엔터 치면 진행한다. ");
		System.in.read();
		System.in.skip(System.in.available()); // 13, 10 제거

		try (RandomAccessFile raf=new RandomAccessFile(name, mode)){
			raf.seek(2);
			String line=raf.readLine();
			System.out.println(line);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" end ");


		//[1] 테스트
		/*
		String name="text.txt";
		String mode="rw";//read, write
		try (RandomAccessFile raf=new RandomAccessFile(name, mode)){
			// 파일포인터 : 파일에 읽기/쓰기를 할 현재 위치
			System.out.println("> 파일포인터의 위치 : "+raf.getFilePointer());
			raf.writeInt(100); //4byte
			System.out.println("> 파일포인터의 위치 : "+raf.getFilePointer());
			raf.writeLong(10L); //8byte
			System.out.println("> 파일포인터의 위치 : "+raf.getFilePointer());
			raf.seek(0); //원하는 위치로 이동
			System.out.println("> 파일포인터의 위치 : "+raf.getFilePointer());
		} catch (Exception e) {
			e.printStackTrace();
		}
		 */
	}

}
