package UnderstandingIncrease;

import java.util.Scanner;

public class Payroll {

	public static void main(String[] args) {
		// 급여 대장 출력하기. 이름, 주당근무시간, 시간당 급여, 소득세금, 총급여, 수령급여의 내용을 포함함
		
		//이름, 주당근무시간, 시간당 급여, 소득세금을 입력받을 스캐너
		Scanner inputForName=new Scanner(System.in); //문자열을 입력받을 스캐너(이름)
		Scanner input=new Scanner(System.in);
		
		//변수 설정
		String name; //직원 이름
		int monthlyWorkingHours; //주당 근무시간
		int hourlySalary; //시간당 급여
		double incomeTax; //소득세금
		
		double totalSalary; //총 급여
		double salaryReceived; //수령 급여
		
		
		
		//이름, 주당근무시간, 시간당 급여, 소득세금을 입력받습니다.
		System.out.println("이 프로그램은 총급여와 수령 급여를 계산하는 프로그램입니다.\n");
		
		System.out.println("이름을 입력해주세요 : "); //직원 이름 입력
		name=inputForName.nextLine();
		
		System.out.println("주당 근무시간을 입력해주세요 : "); //주당 근무시간 입력
		monthlyWorkingHours=input.nextInt();
		
		System.out.println("시간당 급여를 입력해주세요 : "); //시간당 급여 입력
		hourlySalary=input.nextInt();
		
		System.out.println("소득세금을 입력해주세요(%단위로 입력) : "); //소득세금 입력
		incomeTax=input.nextDouble();
		
		
		
		//총급여, 수령 급여 계산하기
		totalSalary=monthlyWorkingHours*hourlySalary; //총급여 = 입력한 주당 근무시간 * 입력한 시간당 급여
		
		salaryReceived=(double)(totalSalary*(1-(incomeTax/100.0))); 
			 	//수령 급여=총 급여*(1-(소득세금/100)). 퍼센테이지 소득세금을 백분율로 환산=>소득세금/100
		
		
		
		
		//이름, 주당근무시간, 시간당 급여, 소득세금, 총급여, 수령급여 순으로 출력
		System.out.println("직원 이름 : "+name);
		System.out.println("주당 근무 시간 : "+monthlyWorkingHours+"시간");
		System.out.println("시간당 급여 : "+hourlySalary+"원");
		System.out.println("소득 세금 : "+incomeTax+"%");
		System.out.println("\n총급여 : "+totalSalary+"원");
		System.out.println("수령 급여 : "+salaryReceived+"원");
	}

}
