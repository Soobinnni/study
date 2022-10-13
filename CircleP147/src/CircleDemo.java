
public class CircleDemo {

	public static void main(String[] args) {

		Circle myCircle = new Circle(1);

		Circle yourCircle = new Circle("노랑");

		Circle hisCricle = new Circle(10, "빨강");

		Circle herCircle = new Circle();

		myCircle.setColor("black");

		// 원래 myCircle의 주소값이 출력되지만, toString메서드가 반환하는 내용을 출력
		// toString을 호출해냄. 클래스에 만들어낼 것인지 본인이 결정.
		// 초기화되어 다 값이 결정된 후에 toString의 내용을 불러와야한다.
		System.out.println(myCircle);
	}

}
