
public class Loan {
	private double anuualInterestRate;// 연이율
	private int numberOfYears;// 대출기간
	private double loanAmount;// 대출금
	private java.util.Date loanDate;// 대출날짜

	// Loan의 기본 생성자
	public Loan() {
		this(2.5, 1, 1000);
	}

	// 이율, 연수, 대출금의 생성자
	public Loan(double anuualInterestRate, int numberOfYears, double loanAmount) {
		this.anuualInterestRate = anuualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate=new java.util.Date();
	}

	// 연이율 반환
	public double getAnuualInterestRate() {
		return anuualInterestRate;
	}

	// 연이율 변경
	public void setAnuualInterestRate(double anuualInterestRate) {
		this.anuualInterestRate = anuualInterestRate;
	}

	// 대출기간 반환
	public int getNumberOfYears() {
		return numberOfYears;
	}

	// 대출기간 변경
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	// 대출금 반환
	public double getLoanAmount() {
		return loanAmount;
	}

	// 대출금 변경
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;

	}

	// 대출날짜 반환
	public java.util.Date getLoanDate() {
		return loanDate;
	}

	// 대출 날짜 변경
	public void setLoanDate(java.util.Date loanDate) {
		this.loanDate = loanDate;
	}

	// 월 상환액 반환
	public double getMonthlyPayment() {
		double monthlyInteretRate = getAnuualInterestRate() / 1200;
		double monthlyPayment = loanAmount * monthlyInteretRate
				/ (1 - (Math.pow(1 / (1 + monthlyInteretRate), numberOfYears * 12)));
		return monthlyPayment;
	}

	// 총 상환액 반환
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}

}
