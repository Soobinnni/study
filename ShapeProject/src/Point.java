
public class Point {
	//필드 선언
	private int x; //x좌표
	private int y; //y좌표
	
	//생성자 생성 1.디폴트값
	public Point() {
		this(2,3);
	}
	//2. 인수 두개를 넣었을 때
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	//x값 반환
	public int getX() {
		return x;
	}
	//x값 수정
	public void setX(int x) {
		this.x = x;
	}
	//y값 반환
	public int getY() {
		return y;
	}
	//y값 수정
	public void setY(int y) {
		this.y = y;
	}

	//toString값으로 출력
	@Override
	public String toString() {
		return "(점- x좌표 :" + getX() + " y좌표 : " + getY() + ")";
	}
	
}
