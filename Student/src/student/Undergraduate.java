package student;

public final class Undergraduate extends Student {
	private String clubName; // 소속 동아리 명

	// 생성자
	public Undergraduate() {
		this("김수빈", 17001014, "사학과", 4, 130, " 없음");
	}

	public Undergraduate(String clubName) {
		super();
		this.clubName = clubName;
	}

	public Undergraduate(String name, int studentID, String department, int grade, int crditsCompletedNum,
			String clubName) {
		super(name, studentID, department, grade, crditsCompletedNum);
		this.clubName = clubName;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	@Override
	public String toString() {
		return "\t\t\t\t<학부생 정보> \n[ " + super.toString() +"소속 동아리명 : " + getClubName()+ " ]";
	}

}
