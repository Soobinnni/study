package practiceProblem;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		// 특정 년도와 특정 달이 입력되면 그 달의 일수로 출력하는 프로그램.

		// 년도와 달을 입력받는 스캐너
		Scanner input = new Scanner(System.in);

		// 변수 설정
		int year;
		int month;
		int days;

		// 연도와 일수 입력
		System.out.println("이 프로그램은 특정 년도와 특정 달이 입력되면 그 달의 일수로 출력하는 프로그램입니다.\n");
		System.out.println("연도를 입력하세요 : ");
		year = input.nextInt();
		System.out.println("달을 입력하세요 : ");
		month = input.nextInt();

		// 입력한 연도를 조건에 따라 일수를 결정함
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		case 2:
			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
				days = 29;
			} else {
				days = 28;
			}
			break;
		default:
			days=0;
			System.out.println("월이 잘못 입력됐습니다.");
			break;

		}
		System.out.println("입력한 " + year + "년의 " + month + "월의 일수는 " + days + "입니다.");

	}
}
