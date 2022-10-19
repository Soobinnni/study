
public class Car implements Movable {
	private int pos = 0;
	
	@Override
	public void move(int x) {
		pos+=x;
	}
	
	//자신의 메소드
	public void show() {
		System.out.println(pos+"m 이동했습니다.");
	}

}
