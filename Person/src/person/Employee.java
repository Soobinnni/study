package person;

//직원 클래스--Person 클래스 상속
public class Employee extends Person {
	private String office; //사무실 
	private int salary; //봉급
	private MyDate employmentDate; //고용날짜
	public Employee() {
		super();
	}
	public Employee(String office, int salary, MyDate employmentDate) {
		super();
		this.office = office;
		this.salary = salary;
		this.employmentDate = employmentDate;
	}
	public Employee(MyDate employmentDate) {
		super();
		this.employmentDate = employmentDate;
	}
	public Employee(String name, String address, String tel, String eMail,String office, int salary, MyDate employmentDate) {
		super(name, address, tel, eMail);
		this.office = office;
		this.salary = salary;
		this.employmentDate = employmentDate;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public MyDate getEmploymentDate() {
		return employmentDate;
	}
	public void setEmploymentDate(MyDate employmentDate) {
		this.employmentDate = employmentDate;
	}
	@Override
	public String toString() {
		return super.toString()+" \n사무실 : " + getOffice() + " 급여 : " + getSalary() + " 고용날짜 : "
				+ getEmploymentDate();
	}
	
}
