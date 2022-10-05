package understandingIncrease;

import java.util.Scanner;

public class PolynomialCalculation {

	public static void main(String[] args) {
		// 다항식 3x세제곱 + 7x제곱 + 11x + 6을 구하는 프로그램

		// x의 값은 사용자로부터 받기 때문에 생성하는 스캐너
		Scanner input = new Scanner(System.in);

		// 변수설정
		int unknown; //x에 대한 변수
		int cubic; // 세제곱에 대한 변수
		int squared; // 제곱에 대한 변수

		// 입력
		System.out.println("x값에 따른 다항식 3x세제곱 + 7x제곱 + 11x + 6을 구하는 프로그램"); // 프로그램에 대한 설명
		System.out.println("x값을 입력하세요 : "); // 사용자를 위한 가이드
		
		unknown = input.nextInt(); // x에 대한 값을 입력받음
		cubic = unknown * unknown * unknown; // 출력 식이 길어지지 않기 위해서 cubic(세제곱) 변수 초기화
		squared = unknown * unknown; // 출력 식이 길어지지 않기 위해서 squared(제곱) 변수 초기화

		// 결과 출력
		System.out.println("x="+unknown+"일 때,"+" 다항식 3x세제곱 + 7x제곱 + 11x + 6 = " + ((3 * cubic) + (7 * squared) + (11 * unknown) + 6) + "입니다.");

	}

}
