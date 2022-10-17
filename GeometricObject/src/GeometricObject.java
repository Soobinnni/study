import java.util.Date;

public class GeometricObject {
	private String color;
	private boolean filled;
	private java.util.Date dateCreated;

	public GeometricObject() {
		this.color="white";
		this.filled=false;
		this.dateCreated=new Date();
	}

	public GeometricObject(String color, boolean filled, Date dateCreated) {
		super();
		this.color = color;
		this.filled = filled;
		this.dateCreated = dateCreated;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	@Override
	public String toString() {
		return "도형 색 : " + getColor() + " 채워져 있는가?" + isFilled() + " 도형 생성일 : "
				+ getDateCreated() + "]";
	}

}
