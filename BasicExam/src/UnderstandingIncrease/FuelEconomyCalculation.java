package UnderstandingIncrease;

import java.util.Scanner;

public class FuelEconomyCalculation {

	public static void main(String[] args) {
		// 자동차의 연비를 계산하는 프로그램
		
		//출발 지점 주행 거리계, 도착 지점 주행 거리계, 사용연료를 입력받는 스캐너
		Scanner input=new Scanner(System.in);
		
		//변수 설정
		int startingPointDistance; //출발지점 주행 거리계
		int arrivalPointDistance; //도착지점 주행 거리계
		int distanceDriven; //주행거리
		int usedFuel; //사용한 연료
		double fuelEfficiency; //연비
		
		//사용자 입력
		System.out.println("이 프로그램은 출발지점 주행 거리계, 도착지점 주행 거리계, 사용 연료를 입력받아 연비를 계산하는 프로그램입니다.");
		System.out.println("입력하는 데이터는 모두 양수인 정수로 입력해주시고, 출발지점 주행거리계는 도착지점 주행거리계보다 크거나 같지 않습니다.");
		System.out.println("\n출발지점 주행 거리계를 입력해주세요 : ");
		startingPointDistance=input.nextInt();
		System.out.println("\n도착지점 주행 거리계를 입력해주세요 : ");
		arrivalPointDistance=input.nextInt();
		System.out.println("\n사용한 연료의 양을 입력해주세요 : ");
		usedFuel=input.nextInt();
		
		//계산식
		distanceDriven=arrivalPointDistance-startingPointDistance; //주행거리=도착-시작지점 주행거리계
		fuelEfficiency=((double)distanceDriven/usedFuel); //연비=주행거리/사용연료
		
		
		
		//출력
		System.out.println("출발 지점의 주행 거리계 : "+startingPointDistance+"km");
		System.out.println("도착 지점의 주행 거리계 : "+arrivalPointDistance+"km");
		System.out.println("사용한 연료량 : "+usedFuel+"l");
		System.out.println("연비 : "+fuelEfficiency+"km/l");
	}

}
