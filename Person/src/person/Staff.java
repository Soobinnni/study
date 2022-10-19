package person;

//직원클래스--Employee클래스 상속
public final class Staff extends Employee {
	private String spot;//직위

	public Staff() {
		super();
	}

	public Staff(String spot, MyDate employmentDate) {
		super();
		super.setEmploymentDate(employmentDate);
		this.spot = spot;
	}

	public Staff(String office, int salary, MyDate employmentDate) {
		super(office, salary, employmentDate);
		// TODO Auto-generated constructor stub
	}

	public Staff(String name, String address, String tel, String eMail, String office, int salary,
			MyDate employmentDate, String spot) {
		super(name, address, tel, eMail, office, salary, employmentDate);
		this.spot = spot;
	}

	public String getSpot() {
		return spot;
	}

	public void setSpot(String spot) {
		this.spot = spot;
	}

	@Override
	public String toString() {
		return "\t\t<직원>\n ["+super.toString() +" 직원 : "+ getSpot() +" ]";
	}
	
}
