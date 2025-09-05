package days15;

public class Student {

	//필드
	public int no;
	public String name;
	public int kor, eng, math, total, rank,wrank;
	public double avg;

	//메서드
	public String getInfo() {
		return String.format("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\n"
				, no
				, name 
				, kor , eng , math, total 
				, avg , rank,wrank);
	}
}