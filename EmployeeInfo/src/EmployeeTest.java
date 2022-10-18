import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {

		// 스캐너
		Scanner input = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);

		// 변수 선언
		String name; // 이름
		int pressureOfBusiness; // 사번
		int salary; // 급여
		int hourlyWage; // 시간당 임금
		int worktime; // 일한 시간

		// 정규직 사원 정보 출력
		SalariedEmployee salaryMan; // salaryMan의 클래스변수 선언
		System.out.println("정사원의 이름을 입력하세요 : ");
		name = inputString.nextLine(); // 이름 입력
		System.out.println("정사원이 사번을 입력하세요 : ");
		pressureOfBusiness = input.nextInt(); // 사번 입력
		System.out.println("월급을 입력하세요 : ");
		salary = input.nextInt(); // 월급 입력

		// 생성자로 salaryMan 초기화
		salaryMan = new SalariedEmployee(name, pressureOfBusiness, salary);
		System.out.println(salaryMan);
		System.out.println();
		salaryMan.computeSalary();

		System.out.println("\n\n");

		HourlyEmployee hourlyMan; // salaryMan의 클래스변수 선언
		System.out.println("비정규직 사원의 이름을 입력하세요 : ");
		name = inputString.nextLine(); // 이름 입력
		System.out.println("정사원이 사번을 입력하세요 : ");
		pressureOfBusiness = input.nextInt(); // 사번 입력
		System.out.println("시간당 급여를 입력하세요 : ");
		hourlyWage=input.nextInt();
		System.out.println("주간 일한 시간을 입력하세요 : ");
		worktime=input.nextInt();

		// 생성자로 hourlyMan 초기화
		hourlyMan = new HourlyEmployee(name, pressureOfBusiness, hourlyWage, worktime);
		System.out.println(hourlyMan);
		System.out.println();
		hourlyMan.computeSalary();

	}

}
