package understandingIncrease;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// +, -, *, / 연산을 수행하는 계산기 프로그램

		// 숫자 2개와 연산자를 받을 스캐너
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);

		// 변수 입력
		double num1; // 받아낼 숫자1
		double num2; // 받아낼 숫자2
		String op; // 연산자
		double programAnswer; // 정답
		double answer; // 사용자 답

		System.out.println("이 프로그램은 입력한 숫자와 연산자로 식을 만들고, 답을 맞추는 프로그램입니다.\n");
		// 숫자1 입력
		System.out.println("숫자1을 입력하세요 : ");
		num1 = input.nextDouble();
		// 연산자 입력
		System.out.println("\n+, -, *, / 중 하나의 연산자를 골라 입력하세요 : ");
		op = input2.nextLine();

		// 입력한 연산자에 대한 조건
		switch (op.charAt(0)) {
		case '+':
			// num2를 입력
			System.out.println("숫자2를 입력하세요");
			num2 = input.nextDouble();
			// 두 수의 합을 구한다.
			programAnswer = num1 + num2;
			// 결과를 알려준다.
			System.out.println("식 : " + num1 + op.charAt(0) + num2 + " = " );
			System.out.println("위 식의 정답을 입력하세요 : ");
			answer = input.nextDouble();
			System.out.print("입력한 답은 " + answer + "이고, 답은 " + programAnswer + "이므로");
			System.out.println((answer == programAnswer) ? "정답입니다." : "오답입니다.");
			break;
		case '-':
			// num2를 입력
			System.out.println("숫자2를 입력하세요");
			num2 = input.nextDouble();
			// 두 수의 차를 구한다.
			programAnswer = num1 - num2;
			// 결과를 알려준다.
			System.out.println("식 : " + num1 + op.charAt(0) + num2 + " = " );
			System.out.println("위 식의 정답을 입력하세요 : ");
			answer = input.nextDouble();
			System.out.print("입력한 답은 " + answer + "이고, 답은 " + programAnswer + "이므로");
			System.out.println((answer == programAnswer) ? "정답입니다." : "오답입니다.");
			break;
		case '*':
			// num2를 입력
			System.out.println("숫자2를 입력하세요");
			num2 = input.nextDouble();
			// 두 수의 곱을 구한다.
			programAnswer = num1 * num2;
			// 결과를 알려준다.
			System.out.println("식 : " + num1 + op.charAt(0) + num2 + " = " );
			System.out.println("위 식의 정답을 입력하세요 : ");
			answer = input.nextDouble();
			System.out.print("입력한 답은 " + answer + "이고, 답은 " + programAnswer + "이므로");
			System.out.println((answer == programAnswer) ? "정답입니다." : "오답입니다.");
			break;
		case '/':
			// num2를 입력
			System.out.println("숫자2를 입력하세요");
			num2 = input.nextDouble();
			if (num2 == 0) {
				System.out.println("나눗셈의 분모로 0이 올 수 없습니다.");
			} else {
				// 두 수의 나눔을 구한다.
				programAnswer = num1 / num2;
				// 결과를 알려준다.
				System.out.println("식 : " + num1 + op.charAt(0) + num2 + " = " );
				System.out.println("위 식의 정답을 입력하세요 : ");
				answer = input.nextDouble();
				System.out.print("입력한 답은 " + answer + "이고, 답은 " + programAnswer + "이므로");
				System.out.println((answer == programAnswer) ? " 정답입니다." : " 오답입니다.");
			}
			break;
		default:
			System.out.println("연산자는 +, -, *, / 중 하나로 입력해주세요.");
			break;
		}

	}

}
