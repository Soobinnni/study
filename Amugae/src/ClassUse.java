import keyboard.*;

public class ClassUse {

	public static void main(String[] args) {
		Keyboard k = new Keyboard("Logitech");
		Mouse m = new Mouse("");
		Class c = k.getClass();// Keyboard객체의 k의 Class객체를 가져온다.
		Class d = m.getClass();
		System.out.println(c.getName());

		System.out.println(d.getPackageName());

	}

}
