package understandingIncrease;

import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
		// 구의 부피를 계산하는 프로그램 김수빈

		/*
		 * 구의 부피를 구하는 공식은 4/3*원주율*반지름의 세제곱. 사용자로부터 반지름의 값을 입력받으므로 새 스캐너 작성
		 */
		Scanner input = new Scanner(System.in);

		// 변수설정
		double radius;
		final double PI; // 원주율 상수
		PI = 3.14;
		double volume;

		// 입력
		// 사용자를 위한 가이드
		System.out.println("구의 부피를 구하는 프로그램 \n" + "부피를 구하고자하는 구의 반지름(실수로 입력해주세요)을 입력해주세요.");
		radius = input.nextDouble(); // 반지름 입력받음

		/*
		 * 반지름>0 t일때 식을 계산하고 구의 부피를 계산, f일때 양수입력을 부탁 
		 * 부피는 반지름의 세제곱 * 원주율 * (4/3)
		 */
		if (radius > 0) {
			volume = (4.0 / 3) * PI * (Math.pow(radius, 3));
			System.out.println("반지름이 " + radius + "일 때, 구의 부피는 " + volume + "입니다.");
		} else {
			System.out.println("반지름의 값이 음수로 입력됐습니다. 양수로 입력해주세요.");
		}
		System.out.println();

	}

}
