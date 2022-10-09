package practiceProblem;

import java.util.Scanner;

public class CalendarPrint {

	public static void main(String[] args) {

		// 스캐너 설정
		Scanner input = new Scanner(System.in);

		// 변수 설정
		int days = 0;
		int month;
		int firstDaysInJanuary;
		int year;

		do {
			System.out.println("연도를 입력해주세요 : (양수 입력)");
			year = input.nextInt();
			if (year > 0) {
				break;
			} else {
				System.out.println("오류! 연도를 양수로 입력해주세요.\n");
			}
		} while (true);

		do {
			System.out.println("입력하신 연도의 1월 1일 요일을 입력해주세요\n요일 입력의 예는 일요일-1, 월요일-2, ... , 토요일-7입니다.");
			firstDaysInJanuary = input.nextInt();
			if ((firstDaysInJanuary >= 1) && (firstDaysInJanuary <= 7)) {
				break;
			} else {
				System.out.println("오류! 수의 범위는 1부터 7 사이입니다.\n");
			}
		} while (true);

		System.out.println("\n\n\n             [  " + year + "년 달력  ]\n");

		// days가 year마다 다르니, 조건을 단다.
		for (month = 1; month <= 12; month++) { // for시작
			switch (month) {
			case 1:
				System.out.println("==================| 1월 |===================");
				days = 31;
				break;
			case 2:
				System.out.println("==================| 2월 |===================");
				if ((year % 4 == 0) || (year % 100 != 0) && (year % 400 == 0)) {
					days = 29;
				} else {
					days = 28;
				}
				break;
			case 3:
				System.out.println("==================| 3월 |===================");
				days = 31;
				break;
			case 4:
				System.out.println("==================| 4월 |===================");
				days = 30;
				break;
			case 5:
				System.out.println("==================| 5월 |===================");
				days = 31;
				break;
			case 6:
				System.out.println("==================| 6월 |===================");
				days = 30;
				break;
			case 7:
				System.out.println("==================| 7월 |===================");
				days = 31;
				break;
			case 8:
				System.out.println("==================| 8월 |===================");
				days = 31;
				break;
			case 9:
				System.out.println("==================| 9월 |===================");
				days = 30;
				break;
			case 10:
				System.out.println("=================| 10월 |==================");
				days = 31;
				break;
			case 11:
				System.out.println("==================| 11월 |===================");
				days = 30;
				break;
			case 12:
				System.out.println("==================| 12월 |===================");
				days = 31;
				break;
			}

			System.out.println("   일 |  월 |   화 |   수 |   목 |   금 |  토 |");
			System.out.println("------------------------------------------");

			// i변수는 두 개의 독립적인 for문에서 같이 쓰이는 변수이므로 같이 쓰이기 위해 위에 선언
			int i;

			// 일요일=1이므로 1부터 시작
			for (i = 1; i < firstDaysInJanuary; i++) {
				System.out.print("      ");
			}
			for (i = 1; i <= days; i++) {
				if (i < 10) {
					System.out.print("   " + i + " |");
				} else {
					System.out.print("  " + i + " |");
				}
				if ((i + firstDaysInJanuary) % 7 == 1) {
					System.out.println();
				}
			}
			System.out.println("\n\n");
			firstDaysInJanuary = ((firstDaysInJanuary + days) % 7 + 7);

			if (firstDaysInJanuary >= 8) {
				firstDaysInJanuary = firstDaysInJanuary % 7;

			}
		}

	}
}
