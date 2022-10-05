package practiceProblem;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		//프로젝트 : 10년 동안 월급을 모두 저금할 경우 저축될 돈 계산
		
		// 입력 받을 월급을 위한 새 스캐너
		Scanner input=new Scanner(System.in);
		
		//변수설정
		int monthSalary;
		int saving;
		
		
		//출력
		System.out.println("10년 동안 월급을 모두 저금할 경우, 얼마나 모을 수 있는지를 계산하는 프로그램");
		
		//사용자에게 월급을 입력받음
		System.out.println("월급(만원)을 입력하세요 : "); //사용자가 월급을 입력하도록 안내
		monthSalary=input.nextInt();
		
		//연봉에 연수를 곱한다.
		saving=12*10*monthSalary;
		
		//최종 값 출력
		System.out.println("10년 동안의 저축액은 "+saving+"만원"+"입니다.");

	}

}
