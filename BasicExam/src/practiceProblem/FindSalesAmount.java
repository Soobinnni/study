package practiceProblem;

import java.util.Scanner;

public class FindSalesAmount {

	public static void main(String[] args) {
		// 
		
		Scanner input=new Scanner(System.in);
		
		long commisionTarget; //목표 커미션
		long yearSalary; //본래 본인의 연봉
		long salaryTarget; //목표 연봉
		
		long commision=0;
		double salesAmount=1; //판매량
		
		System.out.println("직원의 급여에서 커미션 계산 프로그램");
		
		System.out.println("\n본인의 연봉을 입력하세요 : ");
		yearSalary=input.nextLong();
		System.out.println("목표 연봉을 입력하세요 : ");
		salaryTarget=input.nextLong();
		
		// 목표 커미션 계산
		commisionTarget=salaryTarget-yearSalary;
		
		do {
			salesAmount+=1;
			
			if(salesAmount>=100000001) {
				commision = (long) (50000000 * 0.08 + 50000000 + (salesAmount - 10000000) * 0.012);
			} else if (salesAmount>=50000001) {
				commision = (long) (50000000 * 0.08 + (salesAmount - 50000000));
			} else { commision = (long)(salesAmount * 0.08);
				
			}
		} while (commision<commisionTarget);
		
		System.out.println("당신의 목표 연봉을 위해 판매해야하는 상품판매의 총액은"+((salesAmount * 100)/100)+"입니다.");
		
		
	

	}

}
