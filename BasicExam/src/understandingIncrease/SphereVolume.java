package understandingIncrease;

import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
		// 구의 부피를 계산하는 프로그램 김수빈

		// 구의 부피를 구하는 공식은 4/3*원주율*반지름의 세제곱. 사용자로부터 반지름의 값을 입력받으므로 새 스캐너 작성
		Scanner input = new Scanner(System.in);
		Scanner inputReset = new Scanner(System.in);

		// 변수설정
		double radius;
		final double PI; // 원주율 상수
		PI = 3.14;
		double volume;

		String reset;

		// 입력
		// 사용자를 위한 가이드
		System.out.println("구의 부피를 구하는 프로그램");

		do {
			System.out.println("부피를 구하고자하는 구의 반지름(실수로 입력해주세요)을 입력해주세요.");
			radius = input.nextDouble(); // 반지름 입력받음

			do { // 반지름>0 t일때 식을 계산하고 구의 부피를 계산, f일때 양수입력을 부탁
				if (radius > 0) {
					// 계산식 부피=반지름^3 * 원주율 * (4/3)
					volume = (4.0 / 3) * PI * (Math.pow(radius, 3));
					System.out.println("반지름이 " + radius + "일 때, 구의 부피는 " + volume + "입니다.");
					break;
				} else {
					System.out.println("반지름의 값이 음수로 입력됐습니다. 양수로 입력해주세요.");
				}
			} while (true);

			// 결과 출력 종료의 여부를 물음
			System.out.println("계속하여 프로그램을 사용하시겠습니까? (Y/y)");
			reset = inputReset.nextLine();
		} while (('y' == reset.charAt(0)) || ('Y' == reset.charAt(0)));

		System.out.println("\n\n~~~~~~프로그램을 종료합니다~~~~~~");

	}

}
