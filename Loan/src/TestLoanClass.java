import java.util.Scanner;

public class TestLoanClass {
	public static void main(String[] args) {
		// 스캐너 생성
		Scanner input = new Scanner(System.in);

		// 변수 입력
		double annualInterestRate; // 연이율
		int numberOfYears; // 대출기간
		double loanAmount; // 대출금
		double monthlyPayment;
		double totalPayment;

		// Loan 객체 선언
		Loan customer;

		System.out.println("이 프로그램은 당신의 대출금에 대한 월 상환액과 총 상환액을 알려줍니다.");
		//이율, 대출기간, 대출금은 0미만으로 입력 -true일 떄 반복
		do {
			System.out.println("이율을 입력하세요");
			annualInterestRate = input.nextDouble(); // 이율입력
		}while(annualInterestRate<0);
		do {
			System.out.println("대출기간을 입력하세요");
			numberOfYears = input.nextInt(); // 대출기간 입력
		}while(numberOfYears<0);
		do {
			System.out.println("대출금을 입력하세요");
			loanAmount = input.nextDouble(); // 대출금 입력
		}while(loanAmount<0);

		// customer라는 객체 생성. 생성자로 필드 초기화
		customer = new Loan(annualInterestRate, numberOfYears, loanAmount);

		// 소수점 이후 두 자리를 유지
		monthlyPayment = (int) (customer.getMonthlyPayment() * 100) / 100.0;
		totalPayment = (int) (customer.getTotalPayment() * 100) / 100.0;

		// 결과출력
		System.out.println("연이율 : "+customer.getAnuualInterestRate());
		System.out.println("대출기간 : "+customer.getNumberOfYears());
		System.out.println("대출금 : "+customer.getLoanAmount());
		System.out.println("대출 날짜 시작 : " + customer.getLoanDate().toString() + "\n매월 상환 금액 : " + monthlyPayment
				+ "\n총상환금액 : " + totalPayment);


	}
}
