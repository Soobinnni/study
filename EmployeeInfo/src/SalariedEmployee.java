
public class SalariedEmployee extends Employee {
	private int salary; //월급

	public SalariedEmployee() {
		this("김수빈", 1, 5000000);
	}

	public SalariedEmployee(int salary) {
		super();
		this.salary = salary;
	}

	public SalariedEmployee(String name, int pressureOfBusiness, int salary) {
		super(name, pressureOfBusiness);
		this.salary=salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public void computeSalary() {
		//세금 계산 3.3퍼센트 차감
		System.out.println("월급 : "+salary+", 세금 : 3.3%\n월급에서 세금을 차감한 값을 계산합니다.");
		salary=(int)(salary*(1-0.033));
		System.out.println("실수령급여 : "+salary+"원");
	}

	@Override
	public String toString() {
		return "\t\t정규직 사원 정보 \n[ " + super.toString() +" 급여 : " + getSalary()+ "]" ;
	}
	
}
