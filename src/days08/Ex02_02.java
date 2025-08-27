package days08;

public class Ex02_02 {

	public static void main(String[] args) {
		//주민번호
		/*
		String rrn = "830412-1700001";
		String regex="-"; //나누는 기준 설정
		rrn.split(regex); //나눔
		String rrnArr[]=rrn.split(regex); //나눈걸 배열로 저장
		
		rrnArr[1]="*******"; //배열에 1번째 값을 변환
		
		String result=String.join("-", rrnArr); //배열사이에 -
		System.out.println(result);
		*/
		//출력2) 830412-1******
		/*
		String rrn = "830412-1700001";
		String regex="-"; //나누는 기준 설정
		rrn.split(regex); //나눔
		String rrnArr[]=rrn.split(regex); //나눈걸 배열로 저장
		
		char num=rrnArr[1].charAt(0); //rrnArr[1] 첫번째 값
		rrnArr[1]="*".repeat(6);
		
		System.out.println(rrnArr[0]+"-"+num+rrnArr[1]);
		*/
		
		//출력3) 830412-1******
		String rrn = "830412-1700001";
		int year=Integer.parseInt( rrn.substring(0,2));
		int month=Integer.parseInt( rrn.substring(2,4));
		int day=Integer.parseInt( rrn.substring(4,6));

		System.out.println(rrn.substring(0,8)+"*".repeat(6));
		System.out.println(rrn.substring(7));
		
		System.out.printf("생년월일: %d년 %d월 %d일",year,month,day);
		
		
		
	}

}
