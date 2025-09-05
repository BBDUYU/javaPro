package days15;

public class Time {
	//필드
	public int hour;
	protected int minute;
	int second;
	private int millisecond;
	
	//생성자추가
	public Time() {
		System.out.println("> Time Default Constructor  ");
	}
	
	
	public Time(int hour, int minute, int second) {
		System.out.println("> Time Constructor 3 ");

		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	
	
	
}
