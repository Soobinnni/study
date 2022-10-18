package product;

public class Product {
	private String name; // 상품명
	private int price; // 가격
	//생성자
	public Product() {
		super();
	}

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return " 상품명 : " + getName() + " 상품가격 : " + getPrice() + " ";
	}

}
