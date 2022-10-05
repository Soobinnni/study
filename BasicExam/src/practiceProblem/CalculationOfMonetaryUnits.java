package practiceProblem;

import java.util.Scanner;

public class CalculationOfMonetaryUnits {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in); //금액 입력 스캐너
		
		// 주어진 금액을 더 작은 화폐 단위로 분류하는 프로그램. 
		
		//변수 설정
		double amount; //사용자에게 입력받는 전체 금액
		int dollar; //달러 =100센트
		int quarter; //쿼터 =25센트
		int dime; //다임 =10센트
		int nickel; //니켈 =5센트
		int pennie; //페니 =1센트
		
		int remainingAmount; //주어진 금액을 센트로 변환
		
		//달러 금액을 입력받음
		System.out.println("달러를 센트로 변환하는 프로그램\n");
		System.out.println("달러 금액을 입력해주세요(예: 13.75달러) : ");
		amount=input.nextDouble();
		
		//입력받은 달러 금액을 작은 화폐 단위로 분류하는 계산
		remainingAmount=(int)(amount*100); //달러=100센트. 입력받은 달러를 센트로 변환.
		
		//달러의 개수를 계산
		dollar=remainingAmount/100; //몫은 달러가 됨
		remainingAmount=remainingAmount%100; //나머지는 다음 단위 계산에 사용
		
		//나머지 금액에서 쿼터의 개수를 계산
		quarter=remainingAmount/25;
		remainingAmount=remainingAmount%25;
		
		//나머지 금액에서 다임의 개수를 계산
		dime=remainingAmount/10;
		remainingAmount=remainingAmount%10;
		
		//나머지 금액에서 니켈의 개수를 계산
		nickel=remainingAmount/5;
		remainingAmount=remainingAmount%5;
		
		//나머지 금액을 페니의 개수로 계산
		pennie=remainingAmount;
		
		//결과 출력
		System.out.println("전체 달러 구성\n\t"+dollar+"dollars\n"+"\t"+quarter+"quarters\n"+"\t"+dime+"dimes\n"+"\t"+nickel+"nickels\n"+"\t"+pennie+"pennies");


		
		
		
		
		
		

	}

}
