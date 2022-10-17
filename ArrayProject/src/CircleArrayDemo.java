
public class CircleArrayDemo {
	private double radius;

	public CircleArrayDemo(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double findArea() {
		return radius * radius * 3.14;
	}

}

class Circle {
	public static void main(String[] args) {
		CircleArrayDemo[] circles = new CircleArrayDemo[5];
		// 객체들을 생성해준다.
		for (int i = 0; i < circles.length; i++) {
			circles[i] = new CircleArrayDemo(i + 1.0);

			System.out.println("원의 반지름: " + circles[i]);
			System.out.println("원의 넓이: " + circles[i].findArea());
		}

	}
}
