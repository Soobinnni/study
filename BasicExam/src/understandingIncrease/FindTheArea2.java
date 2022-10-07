package understandingIncrease;

import java.util.Scanner;

public class FindTheArea2 {

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

		final double PI = 3.14; // 원주율

		double area;
		
		String reset;
		
		do {
			// 사용자에게 R, T, C 중 하나의 문자를 입력받음
			System.out.println("R을 입력하면 사각형의 면적을 구하고 T를 입력하면 삼각형의 면적을 구하고 C를 입력하면 원의 면적을 구합니다.");
			System.out.println("R, T, C 중 하나의 문자만 입력해주세요.");
			alphabet = inputString.nextLine();
			switch (alphabet) {
			case "r":
			case "R":
				System.out.println("사각형의 면적을 구하려면 사각형의 가로와 세로의 길이 입력이 필요합니다.\n");
				System.out.println("가로의 길이(양수입력)를 입력해주세요");
				squareWidth = inputNum.nextDouble(); // 가로 길이 입력
				do {
					if (squareWidth>0) {
						System.out.println("세로의 길이(양수입력)를 입력해주세요 : "); // 가로 길이가 0보다 크다가 True일때
						squarHeight = inputNum.nextDouble(); // 세로 길이 입력
						do {
							if(squarHeight>0) {
								area = squareWidth * squarHeight; // 면적=세로*가로
								// 사각형 넓이 출력
								System.out.println("세로 " + squarHeight + "와 가로 " + squareWidth + "일때 면적은 " + area + "입니다.");
								break;
							} else {
								System.out.println("오류! 사각형의 세로 길이가 음수로 입력됐습니다.");
							}
						} while (true);
					} else {
						System.out.println("오류! 사각형의 가로 길이가 음수로 입력됐습니다.");
					}
				} while (true);
				//break;
				
			case "t":
			case "T":
				System.out.println("삼각형의 면적을 구하려면 삼각형의 밑변길이와 높이의 입력이 필요합니다.\n");
				System.out.println("삼각형의 높이(양수 입력)를 입력하세요 : ");
				triangleHeight = inputNum.nextDouble(); // 높이 입력
				break;
				
			case "c":
			case "C":
				System.out.println("원의 면적을 구하려면 반지름의 입력이 필요합니다.\n");
				System.out.println("반지름(양수)을 입력하세요 : ");
				radius = inputNum.nextDouble(); // 반지름 입력
				break;
			
			default: 
				System.out.println("오류! R, T, C 중 하나를 입력주세요.");
			}
			
			System.out.println("프로그램을 다시 실행하시겠습니까? (y/Y/예");
			reset=inputString.nextLine();
		}while('예' == reset.charAt(0) || 'Y' == reset.charAt(0) || 'y' == reset.charAt(0));
	}

}
