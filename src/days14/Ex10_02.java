package days14;

/**
 * @author Osj  
 * @date   2025. 9. 4. 오후 3:32:19
 * @subject 복제 (Clone) 
 * @content 
 */
public class Ex10_02 {

	public static void main(String[] args) {
		/*  인스턴스                                            객체
		 *  [color][power][channel][][][]                    [0x100]
		 *  0x100                                             t1
		 *  
		 *                                                   [0x100]
		 *                                                    t3
		 *  
		 *  인스턴스                                            객체
		 *  [color][power][channel][][][]                    [0x200]
		 *  0x200                                              t2
		 *  
		 *  
		 *  
		 *                 [power()][channelUp()][channelDown()]
		 * */
		Tv t1=new Tv();
		t1.color="red";
		t1.channel=15;
		t1.power=true;

		Tv t2=new Tv();
		t2.color = t1.color;
		t2.channel = t1.channel;
		t2.power = t1.power;
	}

}
