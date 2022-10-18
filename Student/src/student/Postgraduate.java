package student;

public final class Postgraduate extends Student {
	private String assistanceCategory; // 조교유형
	private double scholarshipRate; // 장학금 비율

	public Postgraduate() {
		this("김용구", 20001014, "멍멍이과", 1, 20, "교육보조", 0.1);
	}

	public Postgraduate(String assistanceCategory, double scholarshipRate) {
		super();
		this.assistanceCategory = assistanceCategory;
		this.scholarshipRate = scholarshipRate;
	}

	public Postgraduate(String name, int studentID, String department, int grade, int crditsCompletedNum, String assistanceCategory, double scholarshipRate) {
		super(name, studentID, department, grade, crditsCompletedNum);
		this.assistanceCategory = assistanceCategory;
		this.scholarshipRate = scholarshipRate;
	}

	public String getAssistanceCategory() {
		return assistanceCategory;
	}

	public void setAssistanceCategory(String assistanceCategory) {
		this.assistanceCategory = assistanceCategory;
	}

	public double getScholarshipRate() {
		return scholarshipRate;
	}

	public void setScholarshipRate(double scholarshipRate) {
		this.scholarshipRate = scholarshipRate;
	}

	@Override
	public String toString() {

		return "\t\t\t\t\t<대학원생 정보> \n[ " + super.toString() + "조교 유형 : " + getAssistanceCategory() + " 장학금 비율 : "
				+ getScholarshipRate() + " ]";
	}

}
