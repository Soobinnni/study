package Book;

public class Book {
	private int number;// 관리번호
	private String name; // 책 제목
	private String author; // 저자
	
	//생성자
	public Book() {
		this(1, "노인과 바다", "헤밍웨이");
	}

	public Book(int number, String name, String author) {
		super();
		this.number = number;
		this.name = name;
		this.author = author;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return " 책번호 : " + getNumber() + " 책 제목 : " + getName() + " 저자 : " + getAuthor() + "]";
	}
	
}
