import java.util.Iterator;

public class TwelveMonthsCardUse {

	public static void main(String[] args) {
		//스캐너
		Scanner input=new Scanner(System.in);
		final int MONTH=12;
		double creditUse][]=new double[MONTH];
		//변수 입력
		double total=0; // 1년 동안의 사용 전체 금액
		double monthAverage; // 월 평균 사용 금액
		int bestMonth; // 지출이 가장 많았던 월
		int worstMonth; //지출이 가장 적었던 월
		
		
		System.out.println("이 프로그램은 12개월 동안의 카드 사용 금액을 입력받고, 1년 동안의 전체 사용 금액, 월평균 사용 금액, 지출이 가장 많았던 월, 지출이 가장 적었던 월을 출력해냅니다.");
		
		for (int i = 0; i < MONTH; i++) {
			System.out.println((i+1)+"월 사용 금액 : ");
			creditUse[i]=input.nextDouble;
			System.out.println((i+1)+"월 사용 금액 : "+creditUse[i]);
			total=total+creditUse[i]
		}
		
		//월 평균
		monthAverage=total/MONTH;
		
		//가장 지출이 많았던 월
		bestMonth=creditUse[0];
		for(int i=1;i<MONTH;i++) {
			if(best<creditUse[i]) {
				best=creditUse[i]
			}
		}
		
		// 가장 지출이 적었던 월
		worstMonth=creditUse[0];
		for (int j = 1; j < MONTH; j++) {
			if(worst>creditUse[j]) {
				worst=creditUse[j];
			}
		}
		
		System.out.println("총 사용 금액 : "+total);
		System.out.println("월 평균 금액 : "+monthAverage);
		System.out.println("가장 지출이 컸던 달 : "+bestMonth);
		System.out.println("가장 지출이 적었던 달 : "+worstMonth);
		
		
		
		
	}

}
