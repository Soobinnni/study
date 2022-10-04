package PracticeProblem;

import java.util.Scanner;

public class PaymentLoan {

	public static void main(String[] args) {
		// 대부금에 대해 지불할 금액을 계산하는 프로그램. 
		
		/*
		 * 입력 : 이율, 연수, 대부금 출력 : 매달 지불금, 전체 지불금
		 */
		
		//입력할 데이터를 위한 스캐너
		Scanner input=new Scanner(System.in);
		
		
		//변수 설정
		double annualInterestRate; //연이율
		double monthlyInterestRate; //월이율
		int numberOfYears; //연수
		int loanPayment; //대부금
		double monthlyPayment; //매달 지불금
		double totalPayment; //총 지불금
		
		//사용자에게 연이율, 연수, 대부금을 입력받음
		System.out.println("이 프로그램은 대부금에 대해 지불할 금액을 계산합니다.\n");
		System.out.println("연이율을 입력하세요(실수 입력, %단위로 입력) : ");
		annualInterestRate=input.nextDouble();
		System.out.println("연수를 입력하세요(정수로 입력) : ");
		numberOfYears=input.nextInt();
		System.out.println("대부금을 입력하세요(정수로 입력) : ");
		loanPayment=input.nextInt();
		
		//매달지불금과 전체 지불금 계산, 이율은 계산을 위해 백분율로 변환(%/100)
		monthlyInterestRate=annualInterestRate/1200; //연이율을 토대로 월이율을 계산. 월이율%=(연이율/(1/12))%. 백분율로 전환=>n/100 따라서 월이율=(연이율/1200)
		monthlyPayment=(loanPayment*monthlyInterestRate)/(1-(1/Math.pow((1+monthlyInterestRate),((double)numberOfYears*12))));
		totalPayment=monthlyPayment*12*numberOfYears;
		
		
		//소수점 2째자리까지 표시하기 위해
		monthlyPayment=(int)(monthlyPayment*100)/100.0;
		totalPayment=(int)(totalPayment*100)/100.0;
		
		
		//출력
		System.out.println(numberOfYears+"년 동안,");
		System.out.println("귀하의 매달 지불금은 "+monthlyPayment+"원이고, \n"+"전체 지불금은 "+totalPayment+"원입니다.");
	}

}
