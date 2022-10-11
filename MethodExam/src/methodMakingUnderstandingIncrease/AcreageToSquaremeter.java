package methodMakingUnderstandingIncrease;

import java.util.Scanner;

public class AcreageToSquaremeter {

	public static void main(String[] args) {
		// 면적의 단위인 '평'을 제곱미터로 환산하는 프로그램

		// 변수 '평' 데이터를 입력받을 스캐너
		Scanner input = new Scanner(System.in);
		Scanner inputReset= new Scanner(System.in);

		// 변수 설정
		int acreage; // 평 변수
		final double CONVERSION_VALUE = 3.3058; // 1평=3.3058 평에서 제곱미터로 변환할 때 필요한 상수 값
		double acreageToSquare; // 평에서 제곱미터로 환산한 값
		
		String reset;

		
		
		// 변수 '평' 데이터를 입력받음
		System.out.println("이 프로그램은 평을 제곱미터로 환산하는 프로그램입니다.");
		do {
			do {
				System.out.println("평을 입력해주세요 : ");
				acreage = input.nextInt();
				if (acreage>0) {
					break;
				} else {
					System.out.println("평은 0보다 큰 양수로 입력해주세요.");
				}
			}while(true);

			// 입력받은 '평'을 제곱미터로 환산함
			acreageToSquare = (double) acreage * CONVERSION_VALUE; // 평을 제곱미터로 환산한 값=입력받은 평*변환 상수
			// 변환한 값을 출력함
			System.out.println("입력한 " + acreage + "평은 " + acreageToSquare + "m^2입니다.");
		
			System.out.println("\n프로그램을 더 사용하시겠습니까? (y/Y/예)");
			reset=inputReset.nextLine();
		}while(('y'==reset.charAt(0))||('Y'==reset.charAt(0))||'예'==reset.charAt(0));
		
		System.out.println("프로그램 종료");
	}

}
