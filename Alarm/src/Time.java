
public class Time {
	private int time;
	private int minute;
	private int second;
	public Time() {
		this(1, 1, 1);
	}
	public Time(int time, int minute, int second) {
		super();
		this.time = time;
		this.minute = minute;
		this.second = second;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	@Override
	public String toString() {
		return "Time [getTime()=" + getTime() + ", getMinute()=" + getMinute() + ", getSecond()=" + getSecond() + "]";
	}

	
}

