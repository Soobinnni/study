
public class ControllableDemo {

	public static void main(String[] args) {
		
		
		//텔레비전 객체와 컴퓨터 객체 생성
		Television t = new Television();
		Computer c= new Computer();
		
		t.turnOn();
		t.turnOff();
		t.repair();
		c.turnOn();
		c.turnOff();
		c.repair();
		
		Controllable.reset();
	}

}
