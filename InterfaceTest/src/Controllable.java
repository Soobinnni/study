
public interface Controllable {
	int A = 1;
	
	//디폴트 메소드
	default void repair() {
		show("장비를 수리한다.");
	}
	
	//static 메소드
	static void reset() {
		System.out.println("장비를 초기화한다");
	}
	
	//private 메소드
	private void show(String s) {
		System.out.println(s);
	}
	
	//추상메소드
	void turnOn();
	void turnOff();
}
