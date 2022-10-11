package methodMakingUnderstandingIncrease;

import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
		// 구의 부피를 계산하는 프로그램 김수빈

		// 사용자로부터 입력받을 데이터를 위한 새 스캐너 작성
		Scanner input = new Scanner(System.in); //반지름 입력스캐너
		Scanner inputReset = new Scanner(System.in);//프로그램 재활용여부 입력 스캐너

		// 변수설정
		int radius;
		double volume;

		String reset;

		// 입력
		// 사용자를 위한 가이드
		System.out.println("구의 부피를 구하는 프로그램");

		do {
			System.out.println("부피를 구하고자하는 구의 반지름(실수로 입력해주세요)을 입력해주세요.");

			do { //wrong메소드에 해당하는 값이 있으면 반복
				radius = input.nextInt(); // 반지름 입력받음
				//wrong메소드가 입력한 반지름이 옳은 범주에 있지 않으면 오류메시지를 출력
				wrong(radius);
				
				//부피를 계산한 메소드를 호출
				volume=volume(radius);
				System.out.println("반지름이 " + radius + "일 때, 구의 부피는 " + volume + "입니다.");
					
			} while (!(radius>0));

			// 결과 출력 종료의 여부를 물음
			System.out.println("계속하여 프로그램을 사용하시겠습니까? (Y/y)");
			reset = inputReset.nextLine();
		} while (('y' == reset.charAt(0)) || ('Y' == reset.charAt(0)));

		System.out.println("\n\n~~~~~~프로그램을 종료합니다~~~~~~");

	}
	
	public static double volume(int radius) {
		// 구의 부피를 계산하는 메소드
		
		//변수설정
		final double PI=3.14; // 원주율 상수
		double volume; //반환 변수
		
		// 계산식 부피=반지름^3 * 원주율 * (4/3)
		volume = (4.0 / 3) * PI * (Math.pow(radius, 3));
		
		return volume; //계산한 부피를 반환
	}
	
	public static void wrong(int radius) {
		if(radius<0) {
			System.out.println("반지름은 양수 값으로 입력하여야 합니다.");
			System.out.println("\n재입력하세요 : ");
		}
		switch (radius) {
		case 0 : 
			System.out.println("반지름 값으로 0을 입력할 수 없습니다.");
			System.out.println("\n재입력하세요 : ");
		}
	}


}
