
public class Tiger extends Animal {
	private String leg; //다리

	public Tiger() {
		super();
	}

	public Tiger(String leg) {
		super();
		this.leg = leg;
	}

	public Tiger(String eye, String mouth, String leg) {
		super(eye, mouth);
		this.leg=leg;
	}

	public String getLeg() {
		return leg;
	}

	public void setLeg(String leg) {
		this.leg = leg;
	}
	public void run() {
		
	}

	@Override
	public String toString() {
		return "호랑이 [ 다리 : " + getLeg() + ", " + super.toString() + "]";
	}
	
}
