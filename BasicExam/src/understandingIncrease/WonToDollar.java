package understandingIncrease;

import java.util.Scanner;

public class WonToDollar {

	public static void main(String[] args) {

		// 이 프로그램은 사용자가 입력하는 원화를 달러화로 계산하는 프로그램입니다.

		// 사용자로부터 원화, 환율을 입력받는 스캐너 설정
		Scanner input = new Scanner(System.in);
		Scanner inputReset = new Scanner(System.in);

		// 변수 설정
		double exchangeRate; // 환율 변수 설정
		int won; // 원화 변수 설정
		double dollar; // 달러 변수 설정

		String reset;

		// 입력
		System.out.println("원화를 달러화로 계산하는 프로그램입니다.\n환율과 원화를 입력해주세요.\n"); // 사용자 가이드

		do {

			do {
				System.out.println("환율을 입력하시오 : "); // 사용자에게 환율 입력을 요구하는 가이드
				exchangeRate = input.nextDouble(); // 사용자로부터 환율을 입력받음
				if (exchangeRate > 0) {
					break;
				} else {
					System.out.println("환율을 양수의 값으로 입력해주세요");
				}
			} while (true);

			do {
				System.out.println("원화 금액을 입력하시오 : "); // 사용자에게 원화 입력을 요구하는 가이드
				won = input.nextInt(); // 사용자로부터 원화를 입력받음
				if (won > 0) {
					break;
				} else {
					System.out.println("원화를 양수로 입력해주세요.");
				}
			} while (true);

			// 계산식
			dollar = (double) (won / exchangeRate); // 입력받은 환율에 따른, 원화를 달러화로 계산하는 방식
			System.out.println("입력한 원화 " + won + "원은 " + dollar + "달러입니다."); // 사용자에게 원화를 달러화로 계산한 결과를 출력함.

			// 결과 출력 종료의 여부를 물음
			System.out.println("계속하여 프로그램을 사용하시겠습니까? (Y/y)");
			reset = inputReset.nextLine();
		} while (('y' == reset.charAt(0)) || ('Y' == reset.charAt(0)));

		System.out.println("\n\n~~~~~~프로그램을 종료합니다~~~~~~");
	}

}
