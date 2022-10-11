package methodMakingPractice;

import java.util.Scanner;

public class GreatestCommonDivisorMethod {
	// 최대공약수를 구하는 프로그램
	public static void main(String[] args) {
		// 프로그램을 출력하는 메서드

		// 사용자 입력 스캐너
		Scanner input = new Scanner(System.in);

		// 변수 설정
		int firstNumber; // 첫번째 숫자
		int secondNumber;// 두번째 숫자
		int d; // 입력한 두 수의 공약수
		int gcd; // 입력한 두 수의 최대공약수

		String text;
		boolean isTrueData;

		System.out.println("이 프로그램은 입력한 두 숫자의 최대 공약수를 구하는 프로그램입니다.\n");

		do {
			System.out.println("첫 번째 숫자를 입력하세요(양수)");
			firstNumber = input.nextInt(); // 첫 번째 숫자 입력
			isTrueData = IsTrueData(firstNumber);
			if (isTrueData == true) {
				break;
			} else {
				System.out.println("숫자는 음수로 입력할 수 없습니다(예시 : 1과 같은 양수)");
			}
		} while (true);

		do {
			System.out.println("두 번째 숫자를 입력하세요(양수)");
			secondNumber = input.nextInt(); // 첫 번째 숫자 입력
			isTrueData = IsTrueData(secondNumber);
			if (isTrueData == true) {
				break;
			} else {
				System.out.println("숫자는 음수로 입력할 수 없습니다(예시 : 1과 같은 양수)");
			}
		} while (true);

		// 최대 공약수-계산은 greatestFind메서드에서 호출
		gcd = greatestFind(firstNumber, secondNumber);

		// 출력
		System.out.println("첫 번째 숫자 : " + firstNumber);
		System.out.println("두 번째 숫자 : " + secondNumber);
		System.out.println("일때, 최대 공약수는 " + gcd + "입니다.");

	}

	private static int greatestFind(int firstNumber, int secondNumber) {
		// 첫번째 숫자와 두번째 숫자의 최대공약수를 계산하는 메서드

		int d = 1; // 입력한 두 수의 공약수
		int gcd = 2; // 입력한 두 수의 최대공약수

		while ((d <= firstNumber) && (d <= secondNumber)) {
			if ((firstNumber % d == 0) && (secondNumber % d == 0)) {
				gcd = d;
			}
			d++;
		}

		return gcd;

	}

	public static boolean IsTrueData(int a) {
		if (a > 0) {
			return true;
		} else {
			return false;
		}
		

	}
}
