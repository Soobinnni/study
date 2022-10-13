//클래스
public class Calc {

	// 필드
	private double numberFirst; //첫 번째 숫자
	private double numberSecond;//두 번째 숫자
	private String op;//연산자 
	private double result; //결괏값
	public double getNumberFirst() {
		return numberFirst; //지역변수가 없기 떄문에(지역변수와 필드변수명이 같지 않기 때문에) this가 안 붙임
	}
	public void setNumberFirst(double numberFirst) {
		this.numberFirst = numberFirst; //지역변수와 필드변수명이 같기 때문에 this를 붙여 구분.
	}
	public double getNumberSecond() {
		return numberSecond;
	}
	public void setNumberSecond(double numberSecond) {
		this.numberSecond = numberSecond;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}

	//생성자는 1개 이상 올 수 있다.  +생성자() 생성자를 생성하지 않으면 default생성자가 생성됨
	//그 다음 setters          +setters
	//그 다음 getters			 +getters
	//메소드					 +메소드명(변수):반환타입
	
	
	
	
}
