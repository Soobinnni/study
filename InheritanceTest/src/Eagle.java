
public class Eagle extends Animal {
	private String wing;
	public Eagle() {
		super();
	}
	public Eagle(String wing) {
		this.wing=wing;
	}
	//부모 생성자 가져옴->+날개도 추가. 
	public Eagle(String eye, String mouth, String wing) {
		super(eye, mouth);
		this.wing = wing;
	}
	
	public String getWing() {
		return wing;
	}
	public void setWing(String wing) {
		this.wing = wing;
	}
	
	//나는 메소드
	public void fly() {
		System.out.println("독수리는 난다.");
	}
	@Override
	public String toString() {
		return "독수리 [ 날개 : " + getWing() + ", " + super.toString() + "]";
	}
	
}
