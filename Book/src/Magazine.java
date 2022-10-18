
public class Magazine extends Book {
	private String releaseDateInfo; //발매일

	public Magazine() {
		this("매거진", 100, "김수빈", "2022년 10월 18일");
	}

	public Magazine(String releaseDateInfo) {
		super();
		this.releaseDateInfo = releaseDateInfo;
	}

	public Magazine(String title, int page, String author, String releaseDateInfo) {
		super(title, page, author);
		this.releaseDateInfo=releaseDateInfo;
	}

	public String getReleaseDateInfo() {
		return releaseDateInfo;
	}

	public void setReleaseDateInfo(String releaseDateInfo) {
		this.releaseDateInfo = releaseDateInfo;
	}

	@Override
	public String toString() {
		return "Magazine정보 \n["+ super.toString() + "발매날짜 : "  + getReleaseDateInfo()+ "]";
	}
	
	
}
