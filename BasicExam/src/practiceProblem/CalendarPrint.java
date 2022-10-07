package practiceProblem;

import java.util.Scanner;

public class CalendarPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int year; // 년도
		int startDay; // 해당 연도의 1월 1일 요일


		System.out.println("달력 출력 프로그램\n");
		System.out.println("해당 연도를 입력하세요 : ");
		year = input.nextInt();
		System.out.println("해당 연도의 1월 1일의 요일을 입력하세요.\n예를 들어 숫자 1은 월요일, 숫자 7은 일요일은 의미합니다.\n : ");
		startDay = input.nextInt();
		
		int numberOfDaysInMonth = 0; // 달의 날수

		for (int month = 1; month <= 12; month++) {

			System.out.println(" ");
			switch (month) {
			case 1:
				System.out.println("       "+year+"년 " + "1월");
				numberOfDaysInMonth = 31;
				break;
			case 2:
				System.out.println("    "+year+"년 " + "2월");
				if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
					numberOfDaysInMonth = 29;
				} else {
					numberOfDaysInMonth = 28;
				}

				break;
			case 3:
				System.out.println("      "+year+"년 " + "3월");
				numberOfDaysInMonth = 31;
				break;
			case 4:
				System.out.println("      "+year+"년 " + "4월");
				numberOfDaysInMonth = 30;
				break;
			case 5:
				System.out.println("      "+year+"년 " + "5월");
				numberOfDaysInMonth = 31;
				break;
			case 6:
				System.out.println("      "+year+"년 " + "6월");
				numberOfDaysInMonth = 30;
				break;
			case 7:
				System.out.println("      "+year+"년 " + "7월");
				numberOfDaysInMonth = 31;
				break;
			case 8:
				System.out.println("      "+year+"년 " + "8월");
				numberOfDaysInMonth = 31;
				break;
			case 9:
				System.out.println("      "+year+"년 " + "9월");
				numberOfDaysInMonth = 30;
				break;
			case 10:
				System.out.println("      "+year+"년 " + "10월");
				numberOfDaysInMonth = 31;
				break;
			case 11:
				System.out.println("      "+year+"년 " + "11월");
				numberOfDaysInMonth = 30;
				break;
			case 12:
				System.out.println("      "+year+"년 " + "12월");
				numberOfDaysInMonth = 31;
				break;
			}
			System.out.println("----------------------");
			System.out.println(" 일  월  화  수  목  금  토");

			// 매월 1일의 화이트 공간
			int i = 0;
			for (i=0; i < startDay; i++) {
				if (startDay == 7) {
					System.out.println();
					break;
				}
				System.out.print("   ");
			}
			for (i = 1; i<= numberOfDaysInMonth; i++) {
				if (i<10) {
					System.out.print("  "+i);
				} else {
					System.out.print(" "+ i);
				}
				if ((i+startDay)%7==0) {
					System.out.println();
				}
			}
			System.out.println();
			System.out.println();
			startDay = (startDay+numberOfDaysInMonth)%7;
		}

	}

}
