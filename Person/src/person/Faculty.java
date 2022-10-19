package person;

//교수 클래스--직원 클래스 상속
public final class Faculty extends Employee {
	private String consultationTime; // 상담시간
	private int grade; // 순위
	public Faculty() {
		super();
	}
	
	public Faculty(MyDate employmentDate, String consultationTime, int grade) {
		super();
		super.setEmploymentDate(employmentDate);
		this.consultationTime = consultationTime;
		this.grade = grade;
	}

	public Faculty(String name, String address, String tel, String eMail, String office, int salary,
			MyDate employmentDate, String consultationTime, int grade) {
		super(name, address, tel, eMail, office, salary, employmentDate);
		this.consultationTime = consultationTime;
		this.grade = grade;
	}

	public String getConsultationTime() {
		return consultationTime;
	}

	public void setConsultationTime(String consultationTime) {
		this.consultationTime = consultationTime;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "\t\t<교수>\n[" + super.toString() + "\n상담시간 : " + getConsultationTime() + " 순위 : " + getGrade() + " ]";
	}

}
