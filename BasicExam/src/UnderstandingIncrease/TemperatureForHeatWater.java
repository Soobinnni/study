package UnderstandingIncrease;

import java.util.Scanner;

public class TemperatureForHeatWater {

	public static void main(String[] args) {
		// 초기 온도로부터 최종온도까지 물을 데우는 데 필요한 에너지를 계산하는 프로그램
		
		//물의 양, 물의 초기온도, 최종온도를 입력받는 스캐너
		Scanner input=new Scanner(System.in);
		
		//변수 설정
		int amountOfWater; //물의 양(kg)
		int initialTemperature; // 물의 초기 온도(섭씨)
		int finalTemperature; //물의 최종 온도(섭씨)
		
		int neededEnergy; //필요한 에너지
		final int CONVERSION_CONSTANT; // 초기온도로부터 최종온도까지 물을 데우는 데 필요한 에너지를 계산하는 데 필요한 변환 값
		CONVERSION_CONSTANT=4184;
		
		//물의 양, 물의 초기온도, 최종온도를 입력받음
		System.out.println("이 프로그램은 물을 데우는 데 필요한 에너지를 계산하는 프로그램입니다.\n");
		
		System.out.println("물의 양을 입력해주세요(단위:kg,정수입력) : "); // 물의 양 입력
		amountOfWater=input.nextInt();
		System.out.println("물의 초기온도를 입력해주세요(단위:섭씨, 정수입력) : "); //초기 온도 입력
		initialTemperature=input.nextInt();
		System.out.println("물의 최종온도를 입력해주세요(단위:섭씨, 정수입력) : "); //최종 온도 입력
		finalTemperature=input.nextInt();
		
		//입력된 데이터를 토대로 필요한 에너지 계산
		//필요한 에너지=물의 양*(최종온도-최초온도)*변환상수
		neededEnergy=amountOfWater*(finalTemperature-initialTemperature)*CONVERSION_CONSTANT;
		
		//출력
		System.out.println("물의 양 "+amountOfWater+"kg, "+"초기 온도 "+initialTemperature+"섭씨, "+"최종 온도 "+finalTemperature+"섭씨의 물을 데우는 데 필요한 에너지의 양은");
		System.out.println(neededEnergy+" J입니다.");
	}

}
