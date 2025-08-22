package days05;

public class Ex06_03 {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while(i++<=3) {
			System.out.printf("%d+",i);
			sum+=i;
			//i++;
		}//while
		System.out.printf("\b=%d",sum); 
	}//main

}//class
/*
(1)		(4)		  (2)       (3)
i		sum		i++<=3  ->   i
1		2		1   T	     2
2       5       2   T        3
3       9       3   T        4
4       6       4   F    
2+3+4=9  
*/