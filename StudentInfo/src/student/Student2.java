package student;

public class Student2 {
	private String name;
	private String address;
	private String tel;
	private String grade;
	public Student2() {
		super();
	}
	public Student2(String name, String address, String tel, String grade) {
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
	public void giveAList() {
		System.out.println("~~~~~~~~~~~~~~~~~~~");
		System.out.println("이름 : "+name);
		System.out.println("주소 : "+address);
		System.out.println("전화번호 : "+tel);
		System.out.println("학년 : "+grade);
		System.out.println("~~~~~~~~~~~~~~~~~~~");
	}
	@Override
	public String toString() {
		return "~~~~~~~~~~~~~~~~~~~"+"\n이름 : "+name+"\n주소 : "+address+
				"\n전화번호 : "+tel+"\n학년 : "+grade+"~~~~~~~~~~~~~~~~~~~";
	}
	
}
