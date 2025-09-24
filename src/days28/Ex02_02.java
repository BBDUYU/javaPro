package days28;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * @author Osj  
 * @date   2025. 9. 24. 오전 9:39:16
 * @subject 
 * @content 
 */
public class Ex02_02 {

	public static void main(String[] args) {
		Parent p=null;
		Child c=null;
		
		// 파일에 저장
		String name=".\\src\\days28\\Child.ser";
		try (FileInputStream fis=new FileInputStream(name);
				ObjectInputStream ois=new ObjectInputStream(fis)){
			p=(Parent) ois.readObject();
			c=(Child) ois.readObject();
			System.out.println(p);
			System.out.println(c);

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(" end ");
	}

}
