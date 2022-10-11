package methodMakingUnderstandingIncrease;

import java.util.Scanner;

public class FindTheArea {

	public static void main(String[] args) {
		// 사각형 또는 삼각형 또는 원의 면적 구하는 프로그램
		// R-사각형 면적 T-삼각형 면적 C-원 면적

		// 스캐너
		Scanner inputNum = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);

		// 변수설정
		String alphabet; // R, T, C를 입력받을 변수
		double squareWidth; // 사각형의 가로길이
		double squarHeight; // 사각형의 세로길이
		double triangleWidth; // 삼각형의 밑변길이
		double triangleHeight; // 삼각형의 높이
		double radius; // 원의 반지름

		double area;
		String reset;

		System.out.println("이 프로그램은 입력한 도형의 면적을 계산하는 프로그램입니다.");
		System.out.println("<보기>\n도형은 R,T,C 중 하나만 입력할 수 있으며 각각 R은 사각형, T는 삼각형, R은 원입니다.");

		do {
			// 사용자에게 R, T, C 중 하나의 문자를 입력받음. 보기에 없는 문자 입력시 재입력을 반복.
			do {
				System.out.println("\n도형을 입력해주세요.");
				alphabet = inputString.nextLine();
				if (('R' == alphabet.charAt(0)) || ('r' == alphabet.charAt(0)) || ('C' == alphabet.charAt(0))
						|| ('c' == alphabet.charAt(0)) || ('t' == alphabet.charAt(0)) || ('T' == alphabet.charAt(0))) {
					break;
				} else {
					System.out.println("<보기> 중에서 문자를 재입력해주세요.");
				}
			} while (true);

			// 입력한 문자에 따라 다른 계산을 수행
			switch (alphabet.charAt(0)) {
			case 'R': // 입력 문자가 R일때
			case 'r':
				System.out.println("사각형의 면적을 구하려면 사각형의 가로와 세로의 길이 입력이 필요합니다.\n");

				do {
					System.out.println("가로의 길이(양수입력)를 입력해주세요");
					squareWidth = inputNum.nextDouble(); // 가로 길이 입력

					wrong(squareWidth); //wrong메소드로 입력한 데이터가 범위 안에 있는 지 확인
				} while ((squareWidth < 0) || ((int) squareWidth == 0));

				do {
					System.out.println("세로의 길이(양수입력)를 입력해주세요");
					squarHeight = inputNum.nextDouble(); // 세로 길이 입력

					wrong(squarHeight);//wrong메소드로 입력한 데이터가 범위 안에 있는 지 확인
				} while ((squarHeight < 0) || ((int) squarHeight == 0));

				area = square(squareWidth, squarHeight); // 면적=세로*가로

				// 사각형 넓이 출력
				System.out.println("세로 " + squarHeight + "와 가로 " + squareWidth + "일때 면적은 " + area + "입니다.");

				break; // 스위치 문의 break

			case 'T': // 입력 문자가 T일때
			case 't':
				System.out.println("삼각형의 면적을 구하려면삼각형의 밑변길이와 높이의 입력이 필요합니다.\n");

				do {
					System.out.println("삼각형의 밑변의 길이(양수입력)를 입력해주세요");
					triangleWidth = inputNum.nextDouble(); // 가로 길이 입력

					wrong(triangleWidth);//wrong메소드로 입력한 데이터가 범위 안에 있는 지 확인

				} while ((triangleWidth < 0) || ((int) triangleWidth == 0));

				do {
					System.out.println("삼각형의 높이(양수입력)를 입력해주세요");
					triangleHeight = inputNum.nextDouble(); // 세로 길이 입력

					wrong(triangleHeight);//wrong메소드로 입력한 데이터가 범위 안에 있는 지 확인
				} while ((triangleHeight < 0) || ((int) triangleHeight == 0));

				area = triangle(triangleWidth, triangleHeight) * triangleWidth * 0.5; // 면적=밑변길이*높이*0.5

				// 삼각형 면적 출력
				System.out.println("높이 " + triangleHeight + "와 밑변의 길이 " + triangleWidth + "일때 면적은 " + area + "입니다.");

				break; // 스위치 문의 break

			case 'C': // 입력 문자가 C일때
			case 'c':
				System.out.println("원의 면적을 구하려면 반지름의 입력이 필요합니다.\n");

				do {
					System.out.println("반지름(양수)을 입력하세요 : ");
					radius = inputNum.nextDouble(); // 반지름 입력

					wrong(radius);//wrong메소드로 입력한 데이터가 범위 안에 있는 지 확인

					area = circle(radius); // 면적=원주율*(반지름^2)
					// 원의 면적 출력
					System.out.println("반지름 " + radius + "일때 면적은 " + area + "입니다.");
				} while ((radius < 0) || ((int) radius == 0));
				break;
			}
			// 결과 출력 종료의 여부를 물음
			System.out.println("\n계속하여 프로그램을 이용하시겠습니까? (Y/y)");
			reset = inputString.nextLine();
		} while (('y' == reset.charAt(0)) || ('Y' == reset.charAt(0)));

		System.out.println("\n~~~~~~~프로그램종료~~~~~~~");
	}

	public static double square(double width, double height) {
		double area; //반환할 사각형면적 변수
		area = height * width;//면적=높이*가로길이

		return area; //area를 반환
	}

	public static double triangle(double width, double height) {
		double area;//반환할 삼각형 면적변수

		area = width * height * 0.5; // 면적=밑변길이*높이*0.5
		return area; //area를 반환
	}

	public static double circle(double radius) {
		double area; //반환할 원 면적 변수
		final double PI = 3.14; //원주율 상수

		area = PI * (Math.pow(radius, 2)); // 면적=원주율*(반지름^2)
		return area; //area를 반환
	}

	public static void wrong(double i) {
		//입력한 값이 음수일 때(길이, 높이, 반지름은 양수값이어야하므로), 메시지를 출력하는 메소드
		
		if (i < 0) {
			System.out.println("값이 음수로 입력됐습니다. 양수로 입력해주세요.");
		}

		switch ((int) i) {
		case 0:
			System.out.println("값은 0이될 수 없습니다. 양수로 입력해주세요.");
		}
	}
}
