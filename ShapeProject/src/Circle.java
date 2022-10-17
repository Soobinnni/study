
public class Circle {
	private Point circleP; // 점 클래스타입의 필드
	private double radius; // 원의 반지름 정수타입의 필드
	// 생성자 디폴트 값 생성

	public Circle() {
		super();
	}

	public Circle(Point circleP, double radius) {
		super();
		this.circleP = circleP;
		this.radius = radius;
	}

	// 원의 중심점 반환
	public Point getCircleP() {
		return circleP;
	}

	// 원의 중심점 수정
	public void setCircleP(Point circleP) {
		this.circleP = circleP;
	}
	
	//원의 반지름 반환
	public double getRadius() {
		return radius;
	}

	//원의 반지름 수정
	public void setRadius(double radius) {
		this.radius = radius;
	}

	//결과 출력을 설정
	@Override
	public String toString() {
		return "원의 정보 [ 중심점" + getCircleP() + " 반지름 : " + getRadius() + "]";
	}

}
