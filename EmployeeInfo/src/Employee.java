
public class Employee {
	private String name; // 이름
	private int pressureOfBusiness; // 사번
	//생성자
	public Employee() {
		super();
	}

	public Employee(String name, int pressureOfBusiness) {
		super();
		this.name = name;
		this.pressureOfBusiness = pressureOfBusiness;
	}
	//이름 반환
	public String getName() {
		return name;
	}
	//이름 수정
	public void setName(String name) {
		this.name = name;
	}
	//사번 반환
	public int getPressureOfBusiness() {
		return pressureOfBusiness;
	}
	//사번 수정
	public void setPressureOfBusiness(int pressureOfBusiness) {
		this.pressureOfBusiness = pressureOfBusiness;
	}
	//급여계산 메소드
	public void computeSalary() {
		System.out.println("급여 계산");
	}
	//toString 메소드
	@Override
	public String toString() {
		return " 이름 : " + getName() + " 사번 : " + getPressureOfBusiness() + " ";
	}

}
