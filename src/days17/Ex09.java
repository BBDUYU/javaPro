package days17;

/**
 * @author Osj  
 * @date   2025. 9. 9. 오후 4:10:43
 * @subject 다운캐스팅
 * @content 업캐스팅 이후에만 다운캐스팅이 가능
 */
public class Ex09 {

	public static void main(String[] args) {
		A obj = new A(); //--> new B();

		B obj2 = (B)obj;
		
		
	}

}
class A{}
class B extends A{}