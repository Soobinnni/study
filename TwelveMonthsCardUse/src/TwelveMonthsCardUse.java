import java.util.Scanner;

public class TwelveMonthsCardUse {

	public static void main(String[] args) {
		// 12개월 동안의 카드 사용 금액을

		// 스캐너
		Scanner input = new Scanner(System.in);
		final int MONTH = 12;
		double creditUse[] = new double[MONTH];
		// 변수 입력
		double total = 0; // 1년 동안의 사용 전체 금액
		double monthAverage; // 월 평균 사용 금액
		double bestMonth; // 지출이 가장 많았던 월
		int bestMontNum=0;
		double worstMonth; // 지출이 가장 적었던 월
		int worstMonthNum=0;

		System.out.println(
				"이 프로그램은 12개월 동안의 카드 사용 금액을 입력받고, 1년 동안의 전체 사용 금액, 월평균 사용 금액, 지출이 가장 많았던 월, 지출이 가장 적었던 월을 출력해냅니다.");

		for (int i = 0; i < MONTH; i++) {
			do {
				System.out.println((i + 1) + "월 사용 금액 : ");
				creditUse[i] = input.nextDouble();
				if(creditUse[i]>0) {
					break;
				} else {
					System.out.println("금액은 양수로 입력해야 합니다.");
				}
			}while(true);
		}
		
		//총 합 구하기
		for(double money : creditUse) {
			total+=money;
		}

		// 월 평균
		monthAverage = total / MONTH;

		// 가장 지출이 많았던 월
		bestMonth = creditUse[0];
		for (int i = 1; i < MONTH; i++) {
			if (bestMonth < creditUse[i]) {
				bestMonth = creditUse[i];
				bestMontNum=i+1;
			}
			
			//if(bestMonth==creditUse[i]) {
			//	bestMontNum=i;
			//	bestMontNum=bestMontNum+1;
			//}
		}
		

		// 가장 지출이 적었던 월
		worstMonth = creditUse[0];
		for (int j = 1; j < MONTH; j++) {
			if (worstMonth > creditUse[j]) {
				worstMonth = creditUse[j];
				worstMonthNum=j+1;
			}
			//if(worstMonth==creditUse[j]) {
			//	worstMonthNum=j;
			//	worstMonthNum=worstMonthNum+1;
			//}
		}
		for (int i = 0; i < MONTH; i++) {
			System.out.println((i + 1) + "월 사용 금액 : " + creditUse[i]+"원");
		}
		System.out.println("\n총 사용 금액 : " + total+"원");
		System.out.println("월 평균 금액 : " + monthAverage+"원");
		System.out.println("가장 지출이 컸던 달 : " + bestMontNum+"월");
		System.out.println("가장 지출이 적었던 달 : " + worstMonthNum+"월");

	}


}
