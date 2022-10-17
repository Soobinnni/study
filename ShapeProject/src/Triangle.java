
public class Triangle {
	private Point pointT; //삼각형의 꼭지점
	private double width; //삼각형의 가로 길이
	private double height; //삼각형의 높이
	
	//생성자 생성(디폴트값)
	public Triangle() {
		super();
	}
	public Triangle(Point pointT, double width, double height) {
		super();
		this.pointT = pointT;
		this.width = width;
		this.height = height;
	}
	//삼각형의 꼭지점 반환
 	public Point getPointT() {
		return pointT;
	}
 	//삼각형의 꼭지점 수정
	public void setPointT(Point pointT) {
		this.pointT = pointT;
	}
	//삼각형의 가로길이 반환
	public double getWidth() {
		return width;
	}
	//삼각형의 가로길이 수정
	public void setWidth(double width) {
		this.width = width;
	}
	//삼각형의 높이길이 반환
	public double getHeight() {
		return height;
	}
	//삼각형의 높이길이 수정
	public void setHeight(double height) {
		this.height = height;
	}
	//삼각형 결과 출력
	@Override
	public String toString() {
		return "삼각형 [ 꼭짓점" + getPointT() + " 가로길이 : " + getWidth() + " 높이 : " + getHeight()
				+ "]";
	}
	
}
