package understandingIncrease;

import java.util.Scanner;

public class InterestCalculation {

	public static void main(String[] args) {
		// 2년간 이자를 계산하는 프로그램(이자는 복리로 계산)

		// 원금과 연이율을 입력할 스캐너
		Scanner input = new Scanner(System.in);
		Scanner inputReset = new Scanner(System.in);

		// 변수 설정
		double credit; // 예금액
		double annualInterestRate; // 연이율
		double firstInterest = 0; // 첫해이자
		double secondInterest = 0; // 둘째해 이자
		double finalAmount = 0; // 최종 예금액(2년 후의 예금액)

		double principal;
		double total;

		String reset;

		// 사용자에게 예금액과 연이율을 입력받음
		System.out.println("이 프로그램은 2년 간 이자를 계산하여 2년 후의 예금액을 계산해주는 프로그램입니다.");
		System.out.println("예금액과 연이율은 모두 양수로 입력하세요.");

		do {
			total = 0;
			principal = 0;
			do {
				System.out.println("\n예금액을 입력하세요 : ");
				credit = input.nextInt(); // 예금액 입력
				if (credit > 0) {
					break;
				} else {
					System.out.println("예금액이 음수로 입력됐습니다. 양수로 다시 입력해주세요.");
				}
			} while (true);

			do {
				System.out.println("\n연이율을 입력하세요 (단위 퍼센트) : ");
				annualInterestRate = input.nextDouble();// 연이율 입력
				if (annualInterestRate > 0) {
					break;
				} else {
					System.out.println("연이율이 음수로 입력됐습니다. 양수로 다시 입력해주세요.");
				}
			} while (true);

			for (int i = 0; i <= 2; i++) {
				total = principal * (annualInterestRate / 100);
				principal = total + credit;

				switch (i) {
				case 1:
					firstInterest = total;
				case 2:
					secondInterest = total;
				}

			}
			// 계산식 총 예금액 = 원금 +첫해 이자+둘째해 이자
			finalAmount = credit + firstInterest + secondInterest;

			// 출력
			System.out.println("예금액 : " + credit + "원"); // 예금액 출력
			System.out.println("연이율 : " + annualInterestRate + "%"); // 연이율 출력
			System.out.println("2년 후의 예금액 : " + finalAmount + "원"); // 2년 후의 예금액 출력

			// 결과 출력 종료의 여부를 물음
			System.out.println("계속하여 프로그램을 사용하시겠습니까? (Y/y)");
			reset = inputReset.nextLine();
		} while (('y' == reset.charAt(0)) || ('Y' == reset.charAt(0)));

		System.out.println("\n\n~~~~~~프로그램을 종료합니다~~~~~~");
	}

}
