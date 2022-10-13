
public class Fan {
	static final int SPEED_SLOW=1; //속도 1을 가리키는 상수
	static final int SPEED_MEDIUM=2; //속도 2를 가리키는 상수
	static final int SPEED_FAST=3; //속도 3을 가리키는 상수
	
	private int speed; //속도 : 상수로 표현한다.
	private boolean move;//작동 여부
	private double radius; //반지름으로 선풍기의 크기
	private String color; //선풍기의 크기
	
	//아무 인수도 사용하지 않을 때 디폴트 값
	public Fan() {
		this(SPEED_SLOW,false,5,"red");
	}
	//인수를 입력했을 떄 그 값으로 초기화
	public Fan(int speed, boolean move, double radius, String color) {
		this.speed = speed;
		this.move = move;
		this.radius = radius;
		this.color = color;
	}
	//속도 반환
	public int getSpeed() {
		return speed;
	}
	//속도 변경
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	//움직임 여부 반환
	public boolean isMove() {
		return move;
	}
	//움직임 여부 변경
	public void setMove(boolean move) {
		this.move = move;
	}
	//크기 반환
	public double getRadius() {
		return radius;
	}
	//크기 변경
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//색깔 반환
	public String getColor() {
		return color;
	}
	//색깔 변경
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return move?("선풍기 [스피드(1,2,3)   " + getSpeed() + ", 작동여부 : " + isMove() + ", 반지름의 크기 : " + getRadius()
				+ ", 색깔 : " + getColor()):"꺼져있습니다.";
	}
	
	

}
