package n220930Understanding;

import java.util.Scanner;

public class UnitConversion {

	public static void main(String[] args) {
		// 마일을 킬로미터로 변환하는 프로그램 김수빈

		// 사용자로부터 마일을 입력받기 위한 스캐너
		Scanner input = new Scanner(System.in);

		// 변수 입력
		double mile; // 마일 변수
		double kilometer; // 킬로미터 변수
		final double KM_CHANGE;
		KM_CHANGE=1.609; //마일을 킬로미터로 변환하는 상수

		// 입력
		System.out.println("마일을 킬로미터로 변환하기 위한 프로그램");
		System.out.println("mile을 입력해주세요."); // 사용자 가이드
		mile = input.nextDouble(); // 마일 변수 입력
		
		kilometer = mile * KM_CHANGE; // 마일을 킬로미터로 변환하는 수식
		
		// 결과값 출력
		System.out.println(mile+"mile의"+ " km 변환값은 " + kilometer + "km 입니다.");

	}

}
