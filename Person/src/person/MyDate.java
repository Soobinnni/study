package person;

public final class MyDate {
	private int year; // 연도
	private int month; // 달
	private int day; // 날짜

	public MyDate() {
		this(2022,10,19);
	}

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return getYear() + "년 " + getMonth() + "월 " + getDay() + "일]";
	}
	
}
