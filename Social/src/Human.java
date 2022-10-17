
public class Human {
	private String name; // 이름
	private int age; // 나이

	public Human() {
		this.name = "김수빈";
		this.age = 25;
	}

	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "이름 : " + getName() + ", 나이 : " + getAge();
	}
}
