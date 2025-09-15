package days21;

import java.util.Objects;

import days15.Point;

/**
 * @author Osj  
 * @date   2025. 9. 15. 오후 12:14:07
 * @subject java.util.Arrays 
 * @content 		 .Random
 * 					 .Objects
 */					 
public class Ex07 {

	public static void main(String[] args) {
		Point p=null;
		if(p!=null) p.x=100; //Dead Code경고

		
		if(!Objects.isNull(p)) {
			p.x=100;
		}
		
		Point p2=null;
		if (p!=null && p.equals(p2)) {
			
		}
		if (Objects.equals(p, p2)) {
			
		}
		
//		System.out.println(p.toString());
		System.out.println(Objects.toString(p,"NULL"));
		//Object의 보조기능 클래스 -> Objects 클래스
		
	}

}
