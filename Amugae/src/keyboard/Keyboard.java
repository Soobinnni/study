package keyboard;

public class Keyboard {
	//필드멤버변수
	String name;
	//생성자
	public Keyboard(String name) {
		super();
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Keyboard) {
			Keyboard k =(Keyboard) obj;
			if(name.equals(k.name))
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "키보드 입니다";
	}
	
	
}
