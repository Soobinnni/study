
public class Circle {

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double findArea(){
		double area=radius*radius*3.14;
		return area;
	}

}