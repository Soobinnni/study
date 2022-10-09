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

		String reset;

		// 이름, 주당근무시간, 시간당 급여, 소득세금을 입력받습니다.
		System.out.println("이 프로그램은 총급여와 수령 급여를 계산하는 프로그램입니다.\n");

		do {
			System.out.println("이름을 입력해주세요 : "); // 직원 이름 입력
			name = inputForName.nextLine();

			do {
				System.out.println("주당 근무시간을 입력해주세요(주당 최대근무시간 52시간) : "); // 주당 근무시간 입력
				monthlyWorkingHours = input.nextInt();
				if ((monthlyWorkingHours > 0) && (monthlyWorkingHours <= 52)) {
					break;
				} else {
					if (monthlyWorkingHours <= 0) {
						System.out.println("근로시간은 0시간 이하일 수 없습니다.");
					} else {
						System.out.println("근로시간은 법정 주당 최대근무시간인 52시간을 넘길 수 없습니다.");
					}
				}
			} while (true);

			do {
				System.out.println("시간당 급여를 입력해주세요(2022년 최저 시급 9,160원) : "); // 시간당 급여 입력
				hourlySalary = input.nextInt();
				if (hourlySalary >= 9160) {
					break;
				} else {
					System.out.println("2022년의 최저시급은 9160원입니다. 최저시급 이상의 시급을 입력해주세요.");
				}
			} while (true);

			do {
				System.out.println("소득세금을 입력해주세요(%단위로 입력) : "); // 소득세금 입력
				incomeTax = input.nextDouble();
				if (incomeTax > 0) {
					break;
				} else {
					System.out.println("소득세금을 양수로 입력해주세요.");
				}
			} while (true);

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

			// 결과 출력 종료의 여부를 물음
			System.out.println("계속하여 프로그램을 사용하시겠습니까? (Y/y)");
			reset = inputForName.nextLine();

		} while (('y' == reset.charAt(0)) || ('Y' == reset.charAt(0)));

		System.out.println("\n\n~~~~~~프로그램을 종료합니다~~~~~~");
	}

}
