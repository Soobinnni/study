
public class Box {
	private double height; //높이 
	private double width; //너비
	private double length; //폭
	private boolean empty; //빈 여부 true일떄 비어있고, false일때 차 있다
	public Box() {
		this(1,1,1, true);
	}
	public Box(double height, double width, double length, boolean empty) {
		this.height = height;
		this.width = width;
		this.length = length;
		this.empty = empty;
	}
	//높이 반환
	public double getHeight() {
		return height;
	}
	//높이 변경
	public void setHeight(double height) {
		this.height = height;
	}
	//너비 반환
	public double getWidth() {
		return width;
	}
	//너비 변경
	public void setWidth(double width) {
		this.width = width;
	}
	//폭 반환
	public double getLength() {
		return length;
	}
	//폭 변경
	public void setLength(double length) {
		this.length = length;
	}
	//비어있는지를 확인
	public boolean isEmpty() {
		return empty;
	}
	//비어있는지 차 있는 지 상태 결정
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	
	//볼륨을 구하는 메소드
	public double volume() {
		return width*length*height;
	}
	@Override
	public String toString() {
		return "Box의 상태 [ 높이 : " + getHeight() + ", 너비 : " + getWidth() + ", 폭 : " + getLength()
				+ ", 속의 상태 : " + isEmpty() + ", 부피 : " + volume() + "]";
	}
	
	
	
}
