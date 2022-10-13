
public class Circle {
	
	private double radius;
	private String color;
	
	public Circle() {
		//메소드는 다른 메소드를 호출할 수 있다.
		this(1, "black"); //this()를 이용하여 자신이 속해있는 생성자를 호출
		//호출한 인수와 매개변수의 타입, 수, 순서가 맞는 것은 아래의 메서드뿐이므로
		//this()메서드는 아래를 호출하여 Circle()생성자는 1과 "black"으로 초기화된다.
	}
	//위와 아래는 같은 결과를 가진다. 
	//public Circle(){
	//     radius = 1;
	//     color = "black" 
//	}

	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
		this.color = "파랑";
	}
	
	public Circle(String color) {
		super();
		this.color = color;
		this.radius = 10.0;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "원의 반지름= " + getRadius() + ", 색상= " + getColor();
	}
	
	
	
}
