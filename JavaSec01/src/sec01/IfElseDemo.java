package sec01;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		// 입력한 데이터가 홀수인지 짝수인지를 판단하는 프로그램

		// 숫자 데이터 입력을 위한 스캐너
		Scanner input = new Scanner(System.in);

		// 변수 설정
		int isItElse;

		// 숫자 데이터 입력
		System.out.println("이 프로그램은 입력한 정수의 숫자가 짝수인지, 홀수인지를 알려주는 프로그램입니다.\n숫자를 입력하세요 : ");
		isItElse = input.nextInt();

		// if~else문 : isItElse 나머지가 0->true일 때 "짝수"를 출력하고, false일 때 "홀수"를 출력한다.
		if (isItElse % 2 == 0) {
			System.out.println("짝수!");
		} else {
			System.out.println("홀수!");
		}

		System.out.println("종료"); // 항상 실행한다.

	}

}
