
public class Retangle {
	
	private int width; //가로길이 클래스변수
	private int height;//세로길이 클래스변수
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int calcArea() {
		return width*height;
	}
}
