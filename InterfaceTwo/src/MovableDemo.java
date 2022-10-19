
public class MovableDemo {

	public static void main(String[] args) {
		
		//Movable 인터페이스 참조변수 m이 Car객체를 참조한다. 
		Movable m = new Car();
		
		m.move(5); 
		//m.show(); Movable타입에는 show()메서드가 없기 때문에 호출할 수 없다.
		
		Car c= new Car();
		c=(Car) m;
		c.move(10);//m참조변수 때 m이 Car객체 멤버에 접근해 move()메소드에서 5를 더하는 동작을 수행했기 때문에 c로 타입변환한 뒤에 +10 값은 15
		c.show(); //Car타입으로 변환했기 때문에 호출할 수 있다.
	}

}
