import java.util.Date;

public class Circle extends GeometricObject {
	private double radius;

	public Circle() {
		super();
		this.radius=5;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(String color, boolean filled, Date dateCreated, double radius) {
		super(color, filled, dateCreated);
		this.radius=radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//원의 지름 메소드
	public double getDiameter() {
		return radius*2;
	}
	//원의 둘레 메소드. 소수점 3째자리까지만 반환
	public double getPerimeter() {
		return ((int)(radius*2*Math.PI*1000))/1000.0;
	}
	@Override
	public String toString() {
		return "원 [ 반지름 : " + getRadius() + ", " + super.toString() + "]"+"\n원의 지름 : "+getDiameter()+" 원의 둘레 : "+getPerimeter();
	}
	
	
}
