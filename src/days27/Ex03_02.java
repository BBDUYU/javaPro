package days27;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Osj  
 * @date   2025. 9. 23. 오전 11:45:55
 * @subject 
 * @content 
 */
public class Ex03_02 {

	public static void main(String[] args) {
		// 1 차원 배열 -> 2차원 배열 초기화
		int [][] score = {
				{1, 100, 90, 90}
				,{2, 70 , 90,100}
				,{3, 100,100,100}
				,{4, 70 , 60, 80}
				,{5, 70 , 90,100}
		};
		String name="score.dat";
		String mode="rw";//read, write
		try (RandomAccessFile raf=new RandomAccessFile(name, mode)){
			for (int i = 0; i < score.length; i++) {
				for (int j = 0; j < score[i].length; j++) {
					long fp=raf.getFilePointer();
					System.out.printf("> 현재 FP : %d - [%d]\n",fp,score[i][j]);
					raf.writeInt(score[i][j]); //파일쓰기
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// 일시 정지 + 엔터 계속....
		pause();
		//[문제1]
		//모든 학생의 번호, 국어, 영어, 수학, 총점, 평균 정보를 출력

		int no,kor,eng,mat;
		int tot;
		double avg;

		try (RandomAccessFile raf=new RandomAccessFile(name, mode)){
			while (true) {
				no=raf.readInt();
				kor=raf.readInt();
				eng=raf.readInt();
				mat=raf.readInt();
				tot=kor+eng+mat;
				avg=tot/3;
				System.out.printf(
						"번호:%d, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f\n", 
						no, kor, eng, mat, tot, avg);
			}

		}catch (EOFException e) {

		} catch (Exception e) {

		}
		pause();
		//[문제2]
		//3번 학생의 수학점수(100)을 20점으로 수정하는 코딩
		try (RandomAccessFile raf=new RandomAccessFile(name, mode)){
			raf.seek(44);
			raf.writeInt(20);
		} catch (Exception e) {
			// TODO: handle exception
		}
		pause();
		//[문제3]
		//3번 학생의 번/국/영/수/총/평 을 출력해서 확인하는 코딩
		try (RandomAccessFile raf=new RandomAccessFile(name, mode)){
			raf.seek(32);
			no=raf.readInt();
			kor=raf.readInt();
			eng=raf.readInt();
			mat=raf.readInt();
			tot=kor+eng+mat;
			avg=tot/3;		
			System.out.printf(
					"번호:%d, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f\n", 
					no, kor, eng, mat, tot, avg);
		} catch (Exception e) {
			e.printStackTrace();		
		}
	}

	private static void pause() {
		System.out.println("> 엔터 치면 진행한다. ");
		try {
			System.in.read();
			System.in.skip(System.in.available()); // 13, 10 제거		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


