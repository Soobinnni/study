import java.util.Scanner;

public class Rainfall {

	public static void main(String[] args) {
		// 스캐너
		Scanner input = new Scanner(System.in);

		// 변수
		final int YEARS = 3;
		final int QUARTERS = 4;
		double[][] rain = new double[YEARS][QUARTERS];
		
		

		System.out.println((YEARS + 1) + "년간의 강수량을 계산하는 프로그램");

		for (int j = 0; j < YEARS; j++) {
			for (int i = 0; i < QUARTERS; i++) {
				System.out.println((i + 1) + "년의 " + (j + 1) + "분기 강수량을 입력하세요 : ");
				rain[j][i] = input.nextDouble();
			}
		}

		System.out.println("\n입력에 따른 결과를 출력합니다.(" + (YEARS) + "년 동안의 강수량)");

		// 연도별 강수량 합계
		for (int j = 0; j < YEARS; j++) {
			double total = 0;
			for (int i = 0; i < QUARTERS; i++) {
				total += rain[j][i];
			}
			System.out.println((j + 1) + "년차 총 강수량 : " + total);
		}

	}

}
