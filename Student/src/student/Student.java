package student;

public class Student {
	private String name; // 이름
	private int studentID; // 학번
	private String department; // 소속학과
	private int grade; // 학년
	private int crditsCompletedNum; // 이수학점 수

	// 생성자
	public Student() {
		super();
	}

	public Student(String name, int studentID, String department, int grade, int crditsCompletedNum) {
		super();
		this.name = name;
		this.studentID = studentID;
		this.department = department;
		this.grade = grade;
		this.crditsCompletedNum = crditsCompletedNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getCrditsCompletedNum() {
		return crditsCompletedNum;
	}

	public void setCrditsCompletedNum(int crditsCompletedNum) {
		this.crditsCompletedNum = crditsCompletedNum;
	}

	@Override
	public String toString() {
		return " 이름 : " + getName() + " 학번 : " + getStudentID() + " 학과 : " + getDepartment() + " 학년 : " + getGrade()
				+ " 이수학점 수 : " + getCrditsCompletedNum() + " ";
	}

}
