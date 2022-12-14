package understandingIncrease;

import java.util.Scanner;

public class ConversionInSeconds {

	public static void main(String[] args) {
		// 입력받은 시, 분, 초를 초 단위의 시간으로 변환하는 프로그램

		// 시, 분, 초 입력받을 스캐너
		Scanner input = new Scanner(System.in);
		Scanner inputReset = new Scanner(System.in);

		// 변수 설정
		int hour; // 시 변수
		int minute; // 분 변수
		int second; // 초 변수
		int conversionInSeconds; // 초 단위 변환 변수

		String reset;

		// 사용자에게 시, 분, 초를 입력받음
		System.out.println("이 프로그램은 입력하시는 시, 분, 초를 초 단위의 시간으로 변환해주는 프로그램입니다.\n");
		System.out.println("입력 조건 : 시, 분, 초 모두 양수인 정수로 입력하고 분과 초는 60미만으로 입력합니다.");
		
		do {
			do {
				System.out.println("\n시를 입력해주세요: ");
				hour = input.nextInt();

				if (hour < 0) {
					System.out.println("시각은 정수로, 그리고 양수로 입력해야합니다.");
				}
			} while (!(hour >= 0));

			do {
				System.out.println("\n분을 입력해주세요: ");
				minute = input.nextInt();

				if (minute < 0) {
					System.out.println("분은 정수로, 그리고 양수로 입력해야합니다.");
				}
			} while (!(minute >= 0));

			do {
				System.out.println("\n초를 입력해주세요: ");
				second = input.nextInt();

				if (second < 0) {
					System.out.println("초는 정수로, 그리고 양수로 입력해야합니다.");
				}
			} while (!(second >= 0));

			/*
			 * 입력받은 시, 분, 초가 모두 양수일 때(t) 계산과 함께 결과를 출력 입력받은 데이터로 초 단위로 변환함
			 * *n시간=(60*60*n시간)초, n분=(60*n분)초 초 변환=((60*60*n시간)+(60*n분)+n초)
			 */
			conversionInSeconds = (60 * 60 * hour) + (60 * minute) + second;

			// 출력
			System.out.println("입력한 " + hour + "시 " + minute + "분 " + second + "초는\n" + conversionInSeconds + "초입니다.");

			System.out.println("\n프로그램을 계속하여 사용하시겠습니까? (Y or y)");
			reset = inputReset.nextLine();
		} while (('Y' == reset.charAt(0)) || ('y' == reset.charAt(0)));
		
		System.out.println("\n\n~~~~~~프로그램을 종료합니다~~~~~~");
	}

}
