package person;

public class Student extends Person {
	private int grade; // 학년
	public static final int FRESHMAN = 1;
	public static final int SOPHOMORE = 2;
	public static final int THIRD_GRADE = 3;
	public static final int FOURTH_GRADE = 4;

	public Student() {
		this("김수빈","서울시 동작구","0103423000","ddd@aaa.com",FRESHMAN);
	}

	public Student(int grade) {
		super();
		this.grade = grade;
	}

	public Student(String name, String address, String tel, String eMail,int grade) {
		super(name, address, tel, eMail);
		// TODO Auto-generated constructor stub
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public static int getFreshman() {
		return FRESHMAN;
	}

	public static int getSophomore() {
		return SOPHOMORE;
	}

	public static int getThirdGrade() {
		return THIRD_GRADE;
	}

	public static int getFourthGrade() {
		return FOURTH_GRADE;
	}

	@Override
	public String toString() {
		return "\t\t<학생>\n[" + super.toString()+ "학년" + getGrade() + "]";
	}

}
