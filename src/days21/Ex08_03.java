package days21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.IntStream;

/**
 * @author Osj  
 * @date   2025. 9. 15. 오후 2:27:35
 * @subject 가변배열을 이용해 수정 
 * @content 
 */
public class Ex08_03 {

	public static void main(String[] args) {


		String fileName = ".\\src\\days21\\Ex01.java";


		int [][] counts = new int[3][]; // 대문자 갯수 저장 배열

		counts[0]=new int[26]; //대문자
		counts[1]=new int[26]; //소문자
		counts[2]=new int[10]; //숫자

		int one = 0;
		try ( FileReader fr = new FileReader(fileName);) {

			while (  (one = fr.read())  != -1 ) {
				if ( Character.isUpperCase(one) ) { // 대문자
					int index = one - 'A';
					counts[0][index]++;
				} else if ( Character.isLowerCase(one) ) { // 소문자
					int index = one - 'a';
					counts[1][index]++;
				} else if ( Character.isDigit(one) ) { // 숫자
					int index = one - '0';
					counts[2][index]++;
				}
			}
			// System.out.println( Arrays.toString(counts) );
			for (int i = 0; i < counts.length; i++) {
				int totalCount=IntStream.of(counts[i]).sum();
				System.out.printf("== %s: %d ==\n", i==0?"대문자":(i==1)?"소문자":"숫자",totalCount );				
				for (int j = 0; j < counts[i].length; j++) {
					System.out.printf("%c(%02d) : %s\n", j + (i==0?'A':(i==1)?'a':'0'),  counts[i][j]
							, "#".repeat( counts[i][j]));            

				}
			}



		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}  

		System.out.println( " end ");

	} // main
}
/*
 * 
 * 
 * */
