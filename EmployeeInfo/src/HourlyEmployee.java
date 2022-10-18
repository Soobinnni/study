
public class HourlyEmployee extends Employee {
	private int hourlyWage; // 시간당 임금
	private int worktime; // 일한 시간

	public HourlyEmployee() {
		this("김용구", 2, 9160, 8);
	}

	public HourlyEmployee(int hourlyWage, int worktime) {
		super();
		this.hourlyWage = hourlyWage;
		this.worktime = worktime;
	}

	public HourlyEmployee(String name, int pressureOfBusiness, int hourlyWage, int worktime) {
		super(name, pressureOfBusiness);
		this.hourlyWage = hourlyWage;
		this.worktime = worktime;
	}

	public int getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(int hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public int getWorktime() {
		return worktime;
	}

	public void setWorktime(int worktime) {
		this.worktime = worktime;
	}

	@Override
	public void computeSalary() {
		// 세금 계산 8.9퍼센트 차감
		System.out.println("급여를 계산합니다. 급여=시간당급여*주간 일한 시간*4*(1-(세금 3.3%))");
		System.out.println("[시간당 급여 : "+hourlyWage+" 주간 일한 시간 : "+worktime+"]");
		int wage; // 총 임금
		wage = (int)(hourlyWage * worktime * 4 * (1 - 0.033));
		System.out.println("총임금 :"+ wage+"원");
	}

	@Override
	public String toString() {
		// "정규직 사원 정보 [ " + super.toString() +" 급여 : " + getSalary()+ "]" ;
		return "\t\t비정규직 사원 정보\n" +"["+ super.toString() + "시간당 급여 : "+getHourlyWage()+" 일한 시간(일주일 단위) : "+getWorktime()+"]";
	}

}
