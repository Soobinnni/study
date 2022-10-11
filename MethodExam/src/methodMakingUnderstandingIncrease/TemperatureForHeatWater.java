package methodMakingUnderstandingIncrease;

import java.util.Scanner;

public class TemperatureForHeatWater {

	public static void main(String[] args) {
		// 초기 온도로부터 최종온도까지 물을 데우는 데 필요한 에너지를 계산하는 프로그램

		// 물의 양, 물의 초기온도, 최종온도를 입력받는 스캐너
		Scanner input = new Scanner(System.in);
		Scanner inputReset = new Scanner(System.in);

		// 변수 설정
		int amountOfWater; // 물의 양(kg)
		int initialTemperature; // 물의 초기 온도(섭씨)
		int finalTemperature; // 물의 최종 온도(섭씨)

		int neededEnergy; // 필요한 에너지
		final int CONVERSION_CONSTANT; // 초기온도로부터 최종온도까지 물을 데우는 데 필요한 에너지를 계산하는 데 필요한 변환 값
		CONVERSION_CONSTANT = 4184;

		String reset;

		// 물의 양, 물의 초기온도, 최종온도를 입력받음
		System.out.println("이 프로그램은 물을 데우는 데 필요한 에너지를 계산하는 프로그램입니다.\n");

		do {
			System.out.println("물의 양을 입력해주세요(단위:kg,정수입력) : "); // 물의 양 입력
			amountOfWater = input.nextInt();
			System.out.println("물의 초기온도를 입력해주세요(단위:섭씨, 정수입력) : "); // 초기 온도 입력
			initialTemperature = input.nextInt();
			System.out.println("물의 최종온도를 입력해주세요(단위:섭씨, 정수입력) : "); // 최종 온도 입력
			finalTemperature = input.nextInt();

			// [조건식-(초기온도<최종온도)그리고(0<물의 양)]이 참일 때(계산수행, 결과 출력)/거짓일 때(출력-정정을 요구)
			if ((0 < amountOfWater) && (initialTemperature < finalTemperature)) {
				// 계산식
				// 필요한 에너지=물의 양*(최종온도-최초온도)*변환상수
				neededEnergy = amountOfWater * (finalTemperature - initialTemperature) * CONVERSION_CONSTANT;
				// 참일 때 출력
				System.out.println("물의 양 " + amountOfWater + "kg, " + "초기 온도 " + initialTemperature + "섭씨, " + "최종 온도 "
						+ finalTemperature + "섭씨의 물을 데우는 데 필요한 에너지의 양은");
				System.out.println(neededEnergy + " J입니다.");
			} else {
				// 거짓일 때 출력
				System.out.println("다음의 원인 중 하나를 포함하고 있어 오류가 발생했습니다.");
				System.out.println("1. 물의 양이 음수로 입력됐습니다.");
				System.out.println("2. 최초온도가 최종온도보다 높습니다.");
			}
			// 결과 출력 종료의 여부를 물음
			System.out.println("계속하여 프로그램을 사용하시겠습니까? (Y/y)");
			reset = inputReset.nextLine();
		} while (('y' == reset.charAt(0)) || ('Y' == reset.charAt(0)));

		System.out.println("\n\n~~~~~~프로그램을 종료합니다~~~~~~");

	}

}
