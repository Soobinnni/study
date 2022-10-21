package student;

public class Student {
	private String name; // 학생이름
	private String address; //학생 주소
	private String tel; //전화번호
	private String grade; //학년
	public Student() {
		this("김용구","서울시","02472","3");
	}
	public Student(String name, String address, String tel, String grade) {
		super();
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "이름 : "+ getName() +"\n주소 : "+ getAddress() +"\n전화 : "+ getTel()
		+"\n학년 : "+ getGrade();
	}
	
	public void showStudentInfo() {
		System.out.println("이름 : "+name);
		System.out.println("주소 : "+address);
		System.out.println("전화 : "+tel);
		System.out.println("학년 : "+grade);
	}
	
}
