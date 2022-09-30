package n220930Understanding;

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
		final double PREMETER;  //원주율 상수
		PREMETER=3.14;

		// 입력
		// 사용자를 위한 가이드
		System.out.println("구의 부피를 구하는 프로그램 \n" + "부피를 구하고자하는 구의 반지름(실수로 입력해주세요)을 입력해주세요.");
		radius = input.nextDouble(); // 반지름 입력받음
		
		// 결과 출력
		System.out.println("반지름이 "+radius+"일 때, 구의 부피는 " + (radius * radius * radius * PREMETER * (4.0 / 3)) + "입니다.");
		
		//3/4의 값은 1로 나옴(정수끼리의 나누기) 따라서 3.0/4 또는 3.0/4.0 또는 3/4.0 등으로 설정해야 한다.
	}

}
