package sec01;

import java.util.Scanner;

public class SquareArea {

	public static void main(String[] args) {

		// 직사각형의 넓이 구하기 김수빈

		// 스캐너 객체 생성
		Scanner in = new Scanner(System.in);

		// 변수 입력
		double width; // 가로길이
		double hight; // 세로길이
		double area; // 넓이

		// 직사각형의 가로, 세로 입력
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		width = in.nextDouble();

		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		hight = in.nextDouble();

		// 넓이 = 가로 * 세로
		area = width * hight;

		// 출력
		System.out.println("직사각형의 넓이는 " + area + "입니다.");

	}

}
