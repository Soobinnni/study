package understandingIncrease;

import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) {
		// 급여 대장 출력하기. 이름, 주당근무시간, 시간당 급여, 소득세금, 총급여, 수령급여의 내용을 포함함

		// 이름, 주당근무시간, 시간당 급여, 소득세금을 입력받을 스캐너
		Scanner inputForName = new Scanner(System.in); // 문자열을 입력받을 스캐너(이름)
		Scanner input = new Scanner(System.in);

		// 변수 설정
		String name; // 직원 이름
		int monthlyWorkingHours; // 주당 근무시간
		int hourlySalary; // 시간당 급여
		double incomeTax; // 소득세금

		double totalSalary; // 총 급여
		double salaryReceived; // 수령 급여

		// 이름, 주당근무시간, 시간당 급여, 소득세금을 입력받습니다.
		System.out.println("이 프로그램은 총급여와 수령 급여를 계산하는 프로그램입니다.\n");

		System.out.println("이름을 입력해주세요 : "); // 직원 이름 입력
		name = inputForName.nextLine();

		System.out.println("주당 근무시간을 입력해주세요(주당 최대근무시간 52시간) : "); // 주당 근무시간 입력
		monthlyWorkingHours = input.nextInt();

		System.out.println("시간당 급여를 입력해주세요(2022년 최저 시급 9,160원) : "); // 시간당 급여 입력
		hourlySalary = input.nextInt();

		System.out.println("소득세금을 입력해주세요(%단위로 입력) : "); // 소득세금 입력
		incomeTax = input.nextDouble();

		/*
		 * 조건식 : 0<주당근무시간<=52 그리고 시간당 급여>=9160(2022년 최저시급) 그리고 소득세금>0 을 모두 만족할 때 T-(계산식
		 * 수행,결과 출력) F-(정정요구를 출력)
		 */
		if ((0 < monthlyWorkingHours) && (monthlyWorkingHours <= 52) && (0 < hourlySalary) && (hourlySalary >= 9160)
				&& (incomeTax > 0)) {
			// <계산식> 총급여 = 입력한 주당 근무시간 * 입력한 시간당 급여
			totalSalary = monthlyWorkingHours * hourlySalary;
			// <계산식> 수령 급여=총 급여*(1-(소득세금/100)). 퍼센테이지 소득세금을 백분율로 환산=>소득세금/100
			salaryReceived = (double) (totalSalary * (1 - (incomeTax / 100.0)));

			// 이름, 주당근무시간, 시간당 급여, 소득세금, 총급여, 수령급여 순으로 출력
			System.out.println("==주급 명세서==\n");
			System.out.println("직원 이름 : " + name);
			System.out.println("주당 근무 시간 : " + monthlyWorkingHours + "시간");
			System.out.println("시간당 급여 : " + hourlySalary + "원");
			System.out.println("소득 세금 : " + incomeTax + "%");
			System.out.println("\n총급여 : " + totalSalary + "원");
			System.out.println("수령 급여 : " + salaryReceived + "원");
		} else {
			System.out.println("다음 원인 중 하나 이상이 해당되어 오류가 발생했습니다.");
			System.out.println("1. 주당 근무시간 또는 소득세금 또는 최저시급이 음수로 입력됐습니다.");
			System.out.println("2. 시간당 급여가 2022년 최저시급인 9,160원 이하로 입력됐습니다.");
			System.out.println("3. 근로기준법에 기준하여 연장근로 12시간을 포함하여 주당 최저 기준근로시간인 52시간 이상으로 입력됐습니다.");
		}

	}

}
