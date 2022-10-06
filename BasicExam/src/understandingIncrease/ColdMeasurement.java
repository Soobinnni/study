package understandingIncrease;

import java.util.Scanner;

public class ColdMeasurement {

	public static void main(String[] args) {
		// 온도와 풍속을 사용하여 풍속 냉각 온도(추위를 가늠할 수 있다)를 계산하는 프로그램

		
		
		// 외부온도(ta) 바람의 속도(v)를 입력받는 스캐너
		Scanner input = new Scanner(System.in);

		// 변수설정
		double outsideTemperature = 0; // 외부온도(섭씨)
		double windVelocity = 0; // 바람의 속도(시간당 킬로미터)
		double windCoolingTemperature; // 풍속냉각온도

		final double WIND_COOLING_INDEX = 13.12; // 바람냉각지수

		
		
		
		System.out.println("이 프로그램은 온도와 풍속을 사용하여 풍속냉각온도를 계산합니다.\n");
		// 외부온도 입력
		System.out.println("외부온도(섭씨단위)를 입력하세요\n(조건 : 외부온도는 -50도 이하와 5도 이상일 경우 풍속냉각온도를 계산할 수 없습니다)\n : ");
		outsideTemperature = input.nextDouble();

		
		
		
		// 조건, 바람의 속도가 3km/h이하거나 온도는 -50도 이하이거나 5도 이상이면 계산식을 수행할 수 없다.
		// 온도는 -50도 이하이거나 5도 이상이라는 조건식에서 T이면, 조건에 맞는 외부온도 입력을 요구한다.
		if ((outsideTemperature <= -50.0) || (outsideTemperature >= 5.0)) {
			System.out.println("외부 온도가 조건과 같이 입력되지 않았습니다.");
		} else { // 온도조건에서 F일 경우 바람의 속도 입력
			System.out.println("바람의 속도(시간당 킬로미터 단위)를 입력하세요\n(조건 : 바람의 속도는 3km/h이하일 경우 풍속냉각온도를 계산할 수 없습니다) \n: ");
			windVelocity = input.nextDouble();
			if (windVelocity <= 3.0) { // 바람의 속도가 3보다 작냐는 조건식에서 T일 때 조건에 맞는 바람의 속도 입력 요구 
				System.out.println("바람의 속도가 조건과 같이 입력되지 않았습니다.");
			} else { // 계산식 수행-풍속냉각온도=바람냉각지수상수+(0.6215*외부측정온도)-(11.37*(바람의 속도^0.16))+(0.3965*외부온도*(바람의 속도^0.16))
				windCoolingTemperature = WIND_COOLING_INDEX + (0.6215 * outsideTemperature)
						- (11.37 * (Math.pow(windVelocity, 0.16)))
						+ (0.3965 * outsideTemperature * (Math.pow(windVelocity, 0.16)));
				
				//출력
				System.out.println("\n외부온도가 " + outsideTemperature + "섭씨이고,바람의 속도가 " + windVelocity + "일 때");
				System.out.println("풍속냉각온도는 " + windCoolingTemperature + "입니다.");

			}

		}

	}

}
