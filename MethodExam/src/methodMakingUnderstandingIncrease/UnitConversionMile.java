package methodMakingUnderstandingIncrease;

import java.util.Scanner;

public class UnitConversionMile {

	public static void main(String[] args) {
		// 마일을 킬로미터로 변환하는 프로그램 김수빈

		// 사용자로부터 마일을 입력받기 위한 스캐너
		Scanner input = new Scanner(System.in);
		Scanner inputReset = new Scanner(System.in);

		// 변수 입력
		int mile; // 마일 변수
		String reset;
		double kilometer;

		// 입력
		System.out.println("마일을 킬로미터로 변환하기 위한 프로그램");

		do {
			do {
				System.out.println("mile을 입력해주세요(양수 입력)"); // 사용자 가이드
				mile = input.nextInt(); // 마일 변수 입력
				if (mile > 0) {
					break;
				} else {
					System.out.println("마일을 양수로 입력해주세요.\n");
				}
			} while (true);

			// 결과값 출력
			kilometer=mileConvertKm(mile);
			System.out.println(mile + "mile의" + " km 변환값은 " + kilometer + "km 입니다.");

			// 결과 출력 종료의 여부를 물음
			System.out.println("계속하여 프로그램을 사용하시겠습니까? (Y/y)");
			reset = inputReset.nextLine();
		} while (('y' == reset.charAt(0)) || ('Y' == reset.charAt(0)));

		System.out.println("\n\n~~~~~~프로그램을 종료합니다~~~~~~");

	}

	public static double mileConvertKm(int mile) {
		
		double kilometer; //km변수
		kilometer = mile * 1.609; // km = mile * 1609 계산식
		return kilometer; //계산식의 결과를 반환한다.
	}
}
