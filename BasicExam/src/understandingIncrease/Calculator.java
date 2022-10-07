package understandingIncrease;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// +, -, *, / 중 하나를 연산자로 선택하고, 입력한 숫자 두 개를 통해 퀴즈를 만드느 프로그램

		// 숫자 2개와 연산자를 받을 스캐너
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		// 변수 입력
		double num1; // 받아낼 숫자1
		double num2; // 받아낼 숫자2
		String op; // 연산자
		double programAnswer; // 정답
		double answer; // 사용자 답

		String reset; // 다시 계산기를 실행할 것인가를 물음

		System.out.println("이 프로그램은 입력한 숫자와 연산자로 식을 만들고, 답을 맞추는 프로그램입니다.\n");
		do { // 숫자1 입력
			System.out.println("숫자1을 입력하세요 : ");
			num1 = input.nextDouble();

			// 연산자 입력
			do {
				System.out.println("\n 하나의 연산자를 골라 입력하세요 : ");

				op = input2.nextLine();
				if ('+' == op.charAt(0) || '-' == op.charAt(0) || '*' == op.charAt(0) || '/' == op.charAt(0)) {
					break;
				} else {
					System.out.println("연산자는 +, -, *, / 중 하나만 선택할 수 있습니다.");
				}
			} while (true);

			// 입력한 연산자에 대한 조건
			switch (op.charAt(0)) {
			case '+':
				// num2를 입력
				System.out.println("숫자2를 입력하세요");
				num2 = input.nextDouble();
				// 두 수의 합을 구한다.
				programAnswer = num1 + num2;
				// 결과를 알려준다.
				System.out.println("식 : " + num1 + op.charAt(0) + num2 + " = ");

				do {
					System.out.println("\n위 식의 정답을 입력하세요 : ");
					answer = input.nextDouble();
					if (answer == programAnswer) {
						System.out.println("입력한 답인 " + answer + "와 정답인" + programAnswer + "가 일치하므로 정답입니다.");
						break;
					} else {
						System.out.print("입력한 답은 " + answer + "이고, 답은 " + programAnswer + "이므로 오답입니다.");
					}
				} while (true);
				
				break;

			case '-':
				// num2를 입력
				System.out.println("숫자2를 입력하세요");
				num2 = input.nextDouble();
				// 두 수의 차를 구한다.
				programAnswer = num1 - num2;
				// 결과를 알려준다.
				System.out.println("식 : " + num1 + op.charAt(0) + num2 + " = ");

				do {
					System.out.println("\n위 식의 정답을 입력하세요 : ");
					answer = input.nextDouble();
					if (answer == programAnswer) {
						System.out.println("입력한 답인 " + answer + "와 정답인" + programAnswer + "가 일치하므로 정답입니다.");
						break;
					} else {
						System.out.print("오답입니다.");
					}
				} while (true);

				break;
			case '*':
				// num2를 입력
				System.out.println("숫자2를 입력하세요");
				num2 = input.nextDouble();
				// 두 수의 곱을 구한다.
				programAnswer = num1 * num2;
				// 결과를 알려준다.
				System.out.println("식 : " + num1 + op.charAt(0) + num2 + " = ");

				do {
					System.out.println("\n위 식의 정답을 입력하세요 : ");

					answer = input.nextDouble();
					if (answer == programAnswer) {
						System.out.println("입력한 답인 " + answer + "와 정답인" + programAnswer + "가 일치하므로 정답입니다.");
						break;
					} else {
						System.out.print("오답입니다.");
					}
				} while (true);
				break;

			case '/':
				// num2를 입력
				do {
					System.out.println("숫자2를 입력하세요");
					num2 = input.nextDouble();
					if (num2 == 0) {
						System.out.println("나눗셈의 분모로 0이 올 수 없습니다.");
					} else {
						// 두 수의 나눔을 구한다.
						programAnswer = num1 / num2;
						// 결과를 알려준다.
						System.out.println("식 : " + num1 + op.charAt(0) + num2 + " = ");

						do {
							System.out.println("\n위 식의 정답을 입력하세요 : ");
							answer = input.nextDouble();
							if (answer == programAnswer) {
								System.out.println("입력한 답인 " + answer + "와 정답인" + programAnswer + "가 일치하므로 정답입니다.");
								break;
							} else {
								System.out.print("오답입니다.");

							}
						} while (true);
						break;

					}
				} while (true);
			}
			System.out.println("계산기를 다시 사용하시겠습니까?(예 / Y / y)");
			reset = input2.nextLine();
		} while ('예' == reset.charAt(0) || 'Y' == reset.charAt(0) || 'y' == reset.charAt(0));

	}

}
