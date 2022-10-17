
public class Rectangle {
	private Point pointR; // 사각형의 점
	private double width; // 사각형의 가로 길이
	private double height; // 사각형의 세로 길이

	// 디폴트 생성자 만들기
	public Rectangle() {
		super();
	}

	public Rectangle(Point pointR, double width, double height) {
		super();
		this.pointR = pointR;
		this.width = width;
		this.height = height;
	}

	// 사각형의 점 반환
	public Point getPointR() {
		return pointR;
	}

	// 사각형의 점 수정
	public void setPointR(Point pointR) {
		this.pointR = pointR;
	}

	// 사각형의 가로길이 반환
	public double getWidth() {
		return width;
	}

	// 사각형의 가로길이 수정
	public void setWidth(double width) {
		this.width = width;
	}

	// 사각형의 세로길이 반환
	public double getHeight() {
		return height;
	}

	// 사각형의 세로길이 수정
	public void setHeight(double height) {
		this.height = height;
	}

	// 결과 출력을 설정
	@Override
	public String toString() {
		return "사각형 [ 점" + getPointR() + " 가로길이 : " + getWidth() + " 세로길이 : " + getHeight() + "]";
	}

}
