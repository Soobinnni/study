package methodMakingUnderstandingIncrease;

import java.util.Scanner;

public class SemesterAverage {

	public static void main(String[] args) {
		// 각 과목의 점수를 입력하면, 해당 학기의 총점과 평균을 출력하는 프로그램

		// 각 과목의 점수를 입력받는 스캐너
		Scanner input = new Scanner(System.in);
		Scanner inputReset = new Scanner(System.in);

		// 변수 설정
		int computerIntro = 0; // 컴퓨터 개론 과목
		int javaProgramming = 0; // 자바프로그래밍 과목
		int english = 0; // 영어 과목
		int generalMath = 0; // 일반수학 과목

		int totalScore; // 총점 변수
		double average; // 평균 변수

		String reset;

		// 각 과목들의 점수를 입력받음
		System.out.println("각 과목의 점수를 입력해주세요\n\n(조건) : 단, 모든 과목은 정수으로 입력하며 0과 같거나 크고 100과 같거나 작게 입력해주세요(예:80).");

		do {
			for (int i = 1; i <= 4; i++) {
				switch (i) {
				case 1:
					do {
						System.out.println("\n컴퓨터 개론 : "); // 컴퓨터 개론입력
						computerIntro = input.nextInt();
						if ((computerIntro >= 0) && (computerIntro <= 100)) {
							break;
						} else {
							System.out.println("점수를 0점 이상 100점 이하의 정수로 입력해주세요.");
						}
					} while (true);
					break;
				case 2:
					do {
						System.out.println("자바프로그래밍 : "); // 자바프로그래밍 입력
						javaProgramming = input.nextInt();
						if ((javaProgramming >= 0) && (javaProgramming <= 100)) {
							break;
						} else {
							System.out.println("점수를 0점 이상 100점 이하의 정수로 입력해주세요.");
						}
					} while (true);
					break;
				case 3:
					do {
						System.out.println("영어 : "); // 영어입력
						english = input.nextInt();
						if ((english >= 0) && (english <= 100)) {
							break;
						} else {
							System.out.println("점수를 0점 이상 100점 이하의 정수로 입력해주세요.");
						}
					} while (true);
					break;
				case 4:
					do {
						System.out.println("일반수학 : "); // 일반 수학 입력
						generalMath = input.nextInt();
						if ((generalMath >= 0) && (generalMath <= 100)) {
							break;
						} else {
							System.out.println("점수를 0점 이상 100점 이하의 정수로 입력해주세요.");
						}
					} while (true);

					// 평균과 총점 계산 : 총점=각 과목 점수의 합 평균=총점/과목 수
					totalScore = computerIntro + javaProgramming + english + generalMath;
					average = (double) totalScore / i;

					// 결과 출력
					System.out.println("\n컴퓨터 개론 점수 : " + computerIntro + "점\n" + "Java 프로그래밍 점수 : " + javaProgramming
							+ "점\n" + "영어 점수 : " + english + "점\n" + "일반 수학 점수 : " + generalMath + "점");
					System.out.println("\n결과\n" + "총점 : " + totalScore + "점, " + "평균 : " + average + "점");

					break;

				}
			}
			// 결과 출력 종료의 여부를 물음
			System.out.println("계속하여 프로그램을 사용하시겠습니까? (Y/y)");
			reset = inputReset.nextLine();
		} while (('y' == reset.charAt(0)) || ('Y' == reset.charAt(0)));

		System.out.println("\n\n~~~~~~프로그램을 종료합니다~~~~~~");
	}

}
