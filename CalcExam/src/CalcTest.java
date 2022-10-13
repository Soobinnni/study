
public class CalcTest {

	public static void main(String[] args) {
		// 클래스명 인스턴스명=new 생성자명(); - 설계도인 자바 파일에 이름을 붙이고 기능을 하도록 하겠다. 인스턴스화
		// 인스턴스화하여 이름만 다르면 제한없이 무한히 생성가능.
		// private으로 선언하면 다른 클래스에서 접근할 수 없지만, 접근할 수 있도록 생성자, 접근자, 설정자에서 설정할 수 있다.

		Calc myCalc;
		myCalc = new Calc();

		// 클래스변수를 set으로 초기화
		myCalc.setNumberFirst(1);
		myCalc.setNumberSecond(2);

		myCalc.setOp("+");

		if (myCalc.getOp().equals("+")) {
			myCalc.setResult(myCalc.getNumberFirst() + myCalc.getNumberSecond());
		}

	}

}
