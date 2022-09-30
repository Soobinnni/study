package n220930;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// 입력한 연도가 윤년인지 검사하는 예제 김수빈

		// 입력받을 연도를 위한 스캐너
		Scanner input = new Scanner(System.in);

		// 변수
		int year;
		boolean leapYear;

		// 연도 입력
		System.out.println("윤년을 계산하는 프로그램");
		System.out.println("연도를 입력하세요 : ");
		year = input.nextInt();

		/*
		 * 입력한 연도가 윤년이 맞는지 계산 &&과 ||는 우선순위가 같으므로 같은 선상에 있으면 왼쪽부터 처리하고 다음으로 그 값과 비교한다.
		 */
		leapYear = (year % 4 == 0) && (year % 100 == 0) || (year % 400 == 0);

		// 사용자에게 윤년인지, 아닌지 결과를 출력
		System.out.println("입력하신 "+year+"년은 "+ (leapYear ? "윤년입니다." : "윤년이 아닙니다."));
	}

}
