import java.util.Date;

public class Rectangle extends GeometricObject {
	private double width;
	private double height;
	public Rectangle() {
		super();
		this.width=3;
		this.height=5;
	}
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	public Rectangle(String color, boolean filled, Date dateCreated, double width, double height) {
		super(color, filled, dateCreated);
		this.width=width;
		this.height=height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	//사각형의 둘레 메소드
	public double getPerimeter() {
		return (width+height)*2;
	}
	//사각형의 넓이 메소드
	public double getArea() {
		return (width*height);
	}
	@Override
	public String toString() {
		return "사각형 [ 가로길이 : " + getWidth() + ", 세로길이 : " + getHeight() + ", "
				+ super.toString() + "\n사각형의 둘레 : "+getPerimeter()+" 사각형의 넓이 : "+getArea()+"]";
	}
	
}
