package understandingIncrease;

import java.util.Scanner;

public class FourYearCollegeTuition {

	public static void main(String[] args) {
		// 4년 동안의 총 등록금을 계산하는 프로그램

		// 입력받을 데이터를 위한 스캐너
		Scanner input = new Scanner(System.in);
		Scanner inputReset = new Scanner(System.in);

		// 변수 설정
		double principal;
		double freshmanTuition; // 1년 차 등록금이자, 원금
		double sophomoreTuition = 0; // 2년 차 등록금
		double thirdGraderTuition = 0; // 3년 차 등록금
		double fourthGraderTuition = 0; // 4년 차 등록금
		double totalTuition = 0; // 총 등록금

		// 상수 설정
		double interesetRate; // 인상 비율

		String reset;

		// 1년 차 등록금(원금)을 입력받는다.
		System.out.println("이 프로그램은 4년 간의 대학 등록금을 계산하는 프로그램입니다.\n등록금은 매년 4.5%씩 복리로 인상됩니다.");

		do {
			do {
				System.out.println("\n등록금을 입력하세요 : ");
				freshmanTuition = input.nextInt();
				if (freshmanTuition>0) {
					break;
				} else if(freshmanTuition==0){
					System.out.println("등록금을 0원 이상 입력해주세요.");
				} else {
					System.out.println("등록금이 음수로 입력됐습니다. 양수로 입력해주세요.");
				}
			}while(true);
			//인상율과 원금은 반복과정에서 0으로 초기화
			interesetRate = 0 ;
			principal=0;

			// 1년 차 등록금을 토대로 2, 3, 4학년의 등록금을 계산(복리)
			for (int i = 1; i <= 4; i++) {
				//각 4년마다의 총액은 = 1학년 등록금 + (원금 * 이율)
				totalTuition = freshmanTuition + (principal * interesetRate);
				//각 등록금의 인상율은 복리로 적용되므로 원금은 총액으로 반복하여 초기화.
				principal = totalTuition;
				interesetRate = 4.5 / 100.0; // 4.5%를 0.045의 백분율로 환산
				switch (i) {
				case 1:
					freshmanTuition = totalTuition;
					break;
				case 2:
					sophomoreTuition = totalTuition;
					break;
				case 3:
					thirdGraderTuition = totalTuition;
					break;
				case 4:
					fourthGraderTuition = totalTuition;
					break;
				}
			}

			System.out.println("===========등록금 명세서===========");
			System.out.println(" 1학년 등록금 : " + freshmanTuition + "원");
			System.out.println(" 2학년 등록금 : " + sophomoreTuition + "원");
			System.out.println(" 3학년 등록금 : " + thirdGraderTuition + "원");
			System.out.println(" 4학년 등록금 : " + fourthGraderTuition + "원");
			System.out.println("\n 등록금의 총액은 "
					+ (freshmanTuition + sophomoreTuition + thirdGraderTuition + fourthGraderTuition) + "원입니다.");
			System.out.println("------------------------------");

			// 결과 출력 종료의 여부를 물음
			System.out.println("계속하여 프로그램을 사용해 총 등록금을 구하시겠습니까? (Y/y)");
			reset = inputReset.nextLine();
		} while (('y' == reset.charAt(0)) || ('Y' == reset.charAt(0)));
		
		
		
		System.out.println("~~~~~~~~~프로그램 종료~~~~~~~~~");

	}

}
