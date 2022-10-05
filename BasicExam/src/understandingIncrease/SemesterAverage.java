package understandingIncrease;

import java.util.Scanner;

public class SemesterAverage {

	public static void main(String[] args) {
		// 각 과목의 점수를 입력하면, 해당 학기의 총점과 평균을 출력하는 프로그램

		// 각 과목의 점수를 입력받는 스캐너
		Scanner input = new Scanner(System.in);

		// 변수 설정
		int computerIntro; // 컴퓨터 개론 과목
		int javaProgramming; // 자바프로그래밍 과목
		int english; // 영어 과목
		int generalMath; // 일반수학 과목

		int totalScore; // 총점 변수
		double average; // 평균 변수
		final double NUMBER_OF_SUBJECTS = 4.0;// 과목 수

		// 각 과목들의 점수를 입력받음
		System.out.println("각 과목의 점수를 입력해주세요\n\n(조건) : 단, 모든 과목은 정수으로 입력하며 0과 같거나 크고 100과 같거나 작게 입력해주세요(예:80).");

		System.out.println("\n컴퓨터 개론 : "); // 컴퓨터 개론입력
		computerIntro = input.nextInt();
		System.out.println("자바프로그래밍 : "); // 자바프로그래밍 입력
		javaProgramming = input.nextInt();
		System.out.println("영어 : "); // 영어입력
		english = input.nextInt();
		System.out.println("일반수학 : "); // 일반 수학 입력
		generalMath = input.nextInt();

		/*
		 * 만점은 100점이므로 각 과목의 점수는 100이하이면서 0이상이어야 한다. t-계산식을 계산하고 결과 출력 / f-정정을 요구하는 멘트를
		 * 출력 //
		 */
		if ((0 <= computerIntro) && (0 <= javaProgramming) && (0 <= english) && (0 <= generalMath)
				&& (computerIntro <= 100) && (javaProgramming <= 100) && (english <= 100) && (generalMath <= 100)) {
			// 평균과 총점 계산 : 총점=각 과목 점수의 합 평균=총점/과목 수
			totalScore = computerIntro + javaProgramming + english + generalMath;
			average = (double) totalScore / NUMBER_OF_SUBJECTS;
			// 결과 출력
			System.out.println("\n컴퓨터 개론 점수 : " + computerIntro + "점\n" + "Java 프로그래밍 점수 : " + javaProgramming + "점\n"
					+ "영어 점수 : " + english + "점\n" + "일반 수학 점수 : " + english + "점");
			System.out.println("\n결과\n" + "총점 : " + totalScore + "점, " + "평균 : " + average + "점");

		} else {
			System.out.println("위의 조건을 다시 확인해주세요.");
		}

	}

}
