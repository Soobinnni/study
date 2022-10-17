
public class Goldfish extends Animal {
	private String fin;// 지느러미

	public Goldfish() {
		super();
	}

	public Goldfish(String fin) {
		super();
		this.fin = fin;
	}

	public Goldfish(String eye, String mouth, String fin) {
		super(eye, mouth);
		this.fin=fin;
	}

	public String getFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}
	public void swim() {
		System.out.println("물고기는 헤엄친다.");
	}

	@Override
	public String toString() {
		return "금붕어 [지느러미 : " + getFin() + ", " + super.toString() + "]";
	}
	
}
