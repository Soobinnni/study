
public class Animal {
	private String eye; // 눈
	private String mouth; // 입

	// 생성자
	public Animal() {
		super();
	}

	public Animal(String eye, String mouth) {
		super();
		this.eye = eye;
		this.mouth = mouth;
	}

	// 눈 값을 반환
	public String getEye() {
		return eye;
	}

	// 눈 값을 설정
	public void setEye(String eye) {
		this.eye = eye;
	}

	// 입 값을 반환
	public String getMouth() {
		return mouth;
	}

	// 입 값을 설정
	public void setMouth(String mouth) {
		this.mouth = mouth;
	}

	// 먹는다 메소드
	public void eat() {
		System.out.println("동물은 먹을 수 있다.");
	}

	// 잔다 메소드
	public void sleep() {
		System.out.println("동물은 잘 수 있다.");
	}

	// 출력 내용 설정
	@Override
	public String toString() {
		return "눈 : " + getEye() + ", 입 : " + getMouth();
	}

}
