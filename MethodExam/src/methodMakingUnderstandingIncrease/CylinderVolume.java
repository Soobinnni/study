package methodMakingUnderstandingIncrease;

import java.util.Scanner;

public class CylinderVolume {

	public static void main(String[] args) {
		// 실린더의 부피를 계산하는 프로그램입니다. 김수빈

		/*
		 * 원의 넓이는 반지름의 제곱*3.14로, 원기둥의 부피는 원의넓이*길이로 구합니다. 이 프로그램은 반지름과 길이를 입력받습니다. 따라서 두
		 * 값의 입력을 위한 스캐너를 생성합니다
		 */
		Scanner input = new Scanner(System.in);
		Scanner inputAnser = new Scanner(System.in);  

		// 변수 설정
		double radius; // 반지름 변수설정
		double length; // 길이 변수설정
		double area; // 편의를 위해서 넓이에 대한 변수 설정
		double volume; // 부피 변수 설정
		final double PI=3.14; // 원주율 상수
		
		String answer; //프로그램 반복 여부를 묻는 변수

		// 입력
		System.out.println("실린더의 부피를 구하세요.");
		System.out.println("참고 : 실린더의 부피는 반지름과 원주율을 이용해 원의 넓이를 구한 다음, 높이를 곱한 값입니다. \n"); // 사용자에 대한 가이드

		
		
		do {
			do {
				System.out.println("반지름을 입력해주세요 : "); // 사용자에 대한 가이드2
				radius = input.nextDouble(); // 원주율 입력 스캐너
				if (radius>0) {
					break;
				} else {
					System.out.println("반지름을 양수로 입력해주세요.");
				}
			} while (true);
			
	
			do {
					System.out.println("실린더의 길이를 입력해주세요 : "); // 사용자에 대한 가이드3
					length = input.nextDouble(); // 원주율 입력 스캐너
					if (length>0) {
						
						break;
					} else {
						System.out.println("실린더의 길이를 양수로 입력해주세요.");
					}
				} while (true);
		
				area = radius * radius * PI; // 입력받은 값으로 구하는 넓이 공식
				volume = area * length; // 부피를 구하는 공식
		
				System.out.println("반지름 " + radius + "에 따른 원의 부피는 " + area + "이며, \n" + "실린더의 부피는 " + volume + "입니다.");
				
				//결과 출력 종료의 여부를 물음
				System.out.println("계속하여 다른 실린더의 부피를 구하시겠습니까? (Y/y)");
				answer=inputAnser.nextLine();
				
		}while(('y'==answer.charAt(0))||('Y'==answer.charAt(0)));


	}

}
