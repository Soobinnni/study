package methodMakingUnderstandingIncrease;

import java.util.Scanner;

public class PolynomialCalculation {

	public static void main(String[] args) {
		// 다항식 3x세제곱 + 7x제곱 + 11x + 6을 구하는 프로그램

		// x의 값은 사용자로부터 받기 때문에 생성하는 스캐너
		Scanner input = new Scanner(System.in);
		Scanner inputReset = new Scanner(System.in);

		// 변수설정
		int unknown; // x에 대한 변수
		int cubic; // 세제곱에 대한 변수
		int squared; // 제곱에 대한 변수
		
		int result; //다항식에 x(unknown)값을 대입한 후 식의 결과

		String reset;

		// 입력
		System.out.println("x값에 따른 다항식 3x세제곱 + 7x제곱 + 11x + 6을 구하는 프로그램"); // 프로그램에 대한 설명

		do {
			System.out.println("x값을 입력하세요 : "); // 사용자를 위한 가이드
			unknown = input.nextInt(); // x에 대한 값을 입력받음
					
			squared = squared(unknown); //입력받은 값의 제곱값 계산을 한 squared메소드 호출
			cubic = cubic(unknown); //입력받은 값의 세제곱값 계산을 한 cubic메소드 호출
			result=result(unknown, squared, cubic); //다항식을 계산한 result 메소드 호출

			// 결과 출력
			System.out.println("x=" + unknown + "일 때," + " 다항식 3x세제곱 + 7x제곱 + 11x + 6 = "
					+ result + "입니다.");

			// 결과 출력 종료의 여부를 물음
			System.out.println("계속하여 프로그램을 사용하시겠습니까? (Y/y)");
			reset = inputReset.nextLine();
		} while (('y' == reset.charAt(0)) || ('Y' == reset.charAt(0)));

		System.out.println("\n\n~~~~~~프로그램을 종료합니다~~~~~~");
	}

	public static int squared(int unknown) {
		// 제곱을 계산할 메소드

		// 변수설정
		int squared; // 제곱계산 값에 대한 변수(빈환변수)

		squared = unknown*unknown; // 제곱=입력한 값*입력한 값

		return squared; // 제곱을 반환
	}

	public static int cubic(int unknown) {
		// 세제곱을 계산할 메소드

		// 변수설정
		int cubic; // 세제곱계산 값에 대한 변수(반환변수)

		cubic=unknown*unknown*unknown; //세제곱=값*값*값

		return cubic; //세제곱을 반환
	}

	public static int result(int unknown, int squared, int cubic) {
		//다항식 3x세제곱 + 7x제곱 + 11x + 6을 계산하는 메소드
		int result; //반환변수
		
		squared=squared(unknown); //제곱값은 squared 메소드에서 호출
		cubic=cubic(unknown);//세제곱값은 cubic메소드에서 호출
		//다항식은 3x^3+7x^2+11x+6
		result=(3*cubic)+(7*squared)+(11*unknown)+6; //다항식에 unknown을 대입한 값의 계산식
		
		return result;
		
	}
}
