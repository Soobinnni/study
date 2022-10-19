
public class AnimalDemo {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cuckoo cuckoo = new Cuckoo();
		
		makeSound(dog);
		makeSound(cuckoo);
	}
//Animal은 인터페이스 객체고, a는 그의 참조변수. 만약 Dog클래스 변수 dog가 a의 인수가 되면 
//a=dog; 자동 형변환이 되어 a=(Dog)dog;와 같은 타입변환이 일어난다
	static void makeSound(Animal a) {
		a.sound();
	}

}
