public class Book {
	private String title; //제목
	private int page; //페이지
	private String author; //저자
	
	public Book() {
		super();
	}
	
	public Book(String title, int page, String author) {
		super();
		this.title = title;
		this.page = page;
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return " 제목 : " + getTitle() + " 페이지 수 : " + getPage() + " 저자 : " + getAuthor() + " ";
	}
}
