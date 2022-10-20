import keyboard.*;
public class KeyboardTest {

	public static void main(String[] args) {
		Mouse m1 = new Mouse("Logitech");
		Mouse m2 = new Mouse("Logitech");
		Mouse m3 =m1;
		Keyboard k1 = new Keyboard("Microsoft");
		Keyboard k2 = new Keyboard("Microsoft");
		
		//toString메소드가 없어서 객체의 주소값을 출력한다.
		//Object클래스에서 물려받은 toString()메서드의 결과
		System.out.println(m1.toString());
		System.out.println(m1);
		
		System.out.println(k1.toString());
		System.out.println(k1);
		
		//.equals()메소드는 Object에서 상속받은 메소드로, 재정의되지 않고 각 객체가 메소드에 접근할 수 있다.
		//따라서 상속받은 메소드가 각 객체의 멤버가 되었기 떄문에 인스턴스메소드여서 내용이 같더라도 다른 객체이다.
		System.out.println(m1.equals(m2)); //false
		System.out.println(m1.equals(m3));
		System.out.println(k1.equals(k2)); //같은 이유로 false
		
	}

}
