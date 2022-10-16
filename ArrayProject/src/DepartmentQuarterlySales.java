import java.util.Scanner;

public class DepartmentQuarterlySales {

	public static void main(String[] args) {
		// 스캐너
		Scanner input = new Scanner(System.in);

		// 변수 설정
		final int DEPARTMENT = 5;// 부서 수
		final int QUARTER = 4;// 분기
		double sales[][] = new double[QUARTER][DEPARTMENT];// 매출액 배열
		double quarterlyTotal[] = new double[QUARTER]; // 분기별 총매출액
		double totalByDepartment[] = new double[DEPARTMENT];// 부서별 총 매출액
		double total; // 회사 총 매출액

		// 매출을 입력받는다.
		for (int i = 0; i < DEPARTMENT; i++) {
			for (int j = 0; j < QUARTER; j++) {
				System.out.println((i + 1) + "부서의 " + (j + 1) + "분기 매출액을 입력하세요 : ");
				sales[j][i] = input.nextDouble();
			}
		}

		// 부서별 총 매출액을 구한다.
		for (int i = 0; i < DEPARTMENT; i++) {
			for (int j = 0; j < QUARTER; j++) {
				totalByDepartment[i] += sales[j][i];
			}
		}

		// 분기별 총 매출액을 구한다.
		for (int i = 0; i < DEPARTMENT; i++) {
			for (int j = 0; j < QUARTER; j++) {
				quarterlyTotal[j] += sales[j][i];
			}
		}

		// 출력 1번 : 부서별 분기 매출액
		System.out.println("          부서별 분기 매출액");
		for (int j = 0; j < QUARTER; j++) {
			System.out.print("\t" + (j + 1) + "분기");
		}
		System.out.println();
		for (int i = 0; i < DEPARTMENT; i++) {
			System.out.print((i + 1) + "부서 : \t");
			for (int j = 0; j < QUARTER; j++) {
				System.out.print(sales[j][i] + "\t");
			}
			System.out.println();
		}

		System.out.println();

		// 출력 2번 : 부서별 전체 매출액
		System.out.println("   부서별 전체 매출액");
		for (int i = 0; i < DEPARTMENT; i++) {
			System.out.print((i + 1) + "부서 : \t" + totalByDepartment[i] + "\t");
			System.out.println();

		}
		System.out.println("\n");

		// 출력 3번 : 분기별 전체매출액, 분기별 전체 평균매출액, 연간회사총매출액
		// 분기별 전체 매출액
		System.out.println("분기별 전체매출액");
		for (int i = 0; i < QUARTER; i++) {
			System.out.print((i + 1) + "분기\t");
		}
		System.out.println();
		for (int j = 0; j < QUARTER; j++) {
			System.out.print(quarterlyTotal[j] + "\t");
		}
		System.out.println("\n");

		// 분기별 전체 평균매출액
		System.out.println("분기별 전체 평균 매출액");
		for (int i = 0; i < QUARTER; i++) {
			System.out.print((i + 1) + "분기\t");
		}
		System.out.println();
		for (int j = 0; j < QUARTER; j++) {
			System.out.print((quarterlyTotal[j] / DEPARTMENT) + "\t");
		}
		System.out.println("\n");

		// 연간회사총매출액
		System.out.println("연간 회사 총 매출액");
		total = 0;
		for (int i = 0; i < DEPARTMENT; i++) {
			total += totalByDepartment[i];
		}
		System.out.println(total);

		// 출력 4번 : 부서별 분기 매출액
		System.out.println("====================================");
		System.out.println("          부서별 분기 매출액");
		for (int j = 0; j < QUARTER; j++) {
			System.out.print("\t" + (j + 1) + "분기");
		}
		System.out.println();
		for (int i = 0; i < DEPARTMENT; i++) {
			System.out.print((i + 1) + "부서 : \t");
			for (int j = 0; j < QUARTER; j++) {
				System.out.print(sales[j][i] + "\t");
			}
			System.out.println();
		}

		System.out.print("합계 : \t");
		for (int j = 0; j < QUARTER; j++) {
			System.out.print(quarterlyTotal[j] + "\t");
		}
		System.out.println();

		System.out.print("평균 : \t");
		for (int j = 0; j < QUARTER; j++) {
			System.out.print((quarterlyTotal[j] / DEPARTMENT) + "\t");
		}

	}

}
