package phoneBookClass;



public class PhoneUnivInfo extends PhoneInfo {
	private String major; //전공학과
	private int year; // 학년
	public PhoneUnivInfo() {
		super();
	}
	public PhoneUnivInfo(String major, int year) {
		super();
		this.major = major;
		this.year = year;
	}
	public PhoneUnivInfo(String name, String tel, String major, int year) {
		super(name, tel);
		this.major = major;
		this.year = year;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	//대학 정보 출력
	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("전공학과 : "+major+"\n학년 : "+year);
	}
}
