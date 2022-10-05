package understandingIncrease;

import java.util.Scanner;

public class FourYearCollegeTuition {

	public static void main(String[] args) {
		// 4년 동안의 총 등록금을 계산하는 프로그램

		
		// 입력받을 데이터를 위한 스캐너
		Scanner input = new Scanner(System.in);

		// 변수 설정
		int freshmanTuition; // 1년 차 등록금이자, 원금
		double sophomoreTuition; // 2년 차 등록금
		double thirdGraderTuition; // 3년 차 등록금
		double fourthGraderTuition; // 4년 차 등록금
		double totalTuition; // 총 등록금

		// 상수 설정
		final double INTEREST_RATE; // 인상 비율 상수 설정
		INTEREST_RATE = 4.5 / 100.0; // 4.5%를 0.045의 백분율로 환산

		
		
		// 1년 차 등록금(원금)을 입력받는다.
		System.out.println("이 프로그램은 4년 간의 대학 등록금을 계산하는 프로그램입니다.\n등록금은 매년 4.5%씩 복리로 인상됩니다.");
		System.out.println("\n등록금을 입력하세요 : ");
		freshmanTuition = input.nextInt();

		
		
		// 입력받은 freshmanTution(등록금의 원금)>0에 해당되면 T-(계산식 수행, 결과 출력) F-정정요구를 출력
		if (freshmanTuition > 0) {
			// t일 때 계산식
			// 계산식. 각 해의 등록금 계산. 매년 4.5%씩 복리로 계산.(복리계산-원금, 원금+원금*이율, 원금+((원금*이율)*이율)…).
			sophomoreTuition = (double) freshmanTuition + (freshmanTuition * INTEREST_RATE); // 2년째 해의 등록금=원금+(첫째해*이율)
			thirdGraderTuition = (double) freshmanTuition + (sophomoreTuition * INTEREST_RATE); // 3년째 해의
																								// 등록금=원금+(둘째해*이율)
			fourthGraderTuition = (double) freshmanTuition + (thirdGraderTuition * INTEREST_RATE); // 4년째 해의
																									// 등록금=원금+(셋째해*이율)

			// 전체 등록금=1년 째 해의 등록금+2년 째 해의 등록금+3년 째 해의 등록금+4년 째 해의 등록금
			totalTuition = (double) freshmanTuition + sophomoreTuition + thirdGraderTuition + fourthGraderTuition;
			// 출력
			System.out.println("입학등록금 " + freshmanTuition + "원에 따른 총 4년간의 대학등록금은 " + totalTuition + "원입니다.");

		} else {
			//f일 때 출력
			System.out.println("입학 등록금이 음수로 입력됐습니다. 양수로 다시 입력해주세요.");
		}

	}

}
