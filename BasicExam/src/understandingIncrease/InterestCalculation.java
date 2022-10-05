package understandingIncrease;

import java.util.Scanner;

public class InterestCalculation {

	public static void main(String[] args) {
		// 2년간 이자를 계산하는 프로그램(이자는 복리로 계산)

		// 원금과 연이율을 입력할 스캐너
		Scanner input = new Scanner(System.in);

		// 변수 설정
		double credit; // 예금액
		double annualInterestRate; // 연이율
		double interest; // 이자
		double finalAmount; // 최종 예금액(2년 후의 예금액)

		// 사용자에게 예금액과 연이율을 입력받음
		System.out.println("이 프로그램은 2년 간 이자를 계산하여 2년 후의 예금액을 계산해주는 프로그램입니다.");
		System.out.println("예금액은 양수인 정수로 입력하고 연이율은 1을 넘지 않는 양수인 정수로 입력하고 법정이율을 넘기지 않습니다.");

		System.out.println("\n예금액을 입력하세요 : ");
		credit = input.nextInt(); // 예금액 입력

		System.out.println("연이율을 입력하세요 : (단위 퍼센트)");
		annualInterestRate = input.nextDouble();// 연이율 입력

		// credit 리터럴값과 annualInterestRate 리터럴값은 양수라는 조건이 t, 아니면 f
		// t일 때 계산식을 계산하고 f일때 정정을 요구하는 내용을 출력한다.
		if ((credit > 0) && (annualInterestRate > 0)) {
			// 계산식
			interest = credit * (annualInterestRate / 100); // 이자=현재 금액*(연이율/100)
			// 2년 후의 예금액을 계산한 계산식. *이자는 복리로 계산된다.
			finalAmount = credit + interest + ((credit + interest) * annualInterestRate / 100); // 2년 후의
																								// 예금액=(예금액+이자)+((예금액+이자)*연이율/100)

			// 출력
			System.out.println("예금액 : " + credit + "원"); // 예금액 출력
			System.out.println("연이율 : " + annualInterestRate + "%"); // 연이율 출력
			System.out.println("2년 후의 예금액 : " + finalAmount + "원"); // 2년 후의 예금액 출력
		} else {
			System.out.println("예금액이나 연이율이 음수로 입력되어 오류가 발생했습니다.");
		}

	}

}
