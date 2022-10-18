package product;

public final class DiscountProduct extends Product {
	private double discount; // 할인율

	public DiscountProduct() {
		this("바나나", 2000, 20.0);
	}

	public DiscountProduct(double discount) {
		super();
		this.discount = discount;
	}

	public DiscountProduct(String name, int price, double discount) {
		super(name, price);
		this.discount = discount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public int getPrice() {
		// 퍼센테이지를 백분율로 변환하기
		discount = discount / 100.0;
		// 할인된 최종 가격 변수
		int amount;
		amount = (int) (super.getPrice() * (1 - discount));
		return amount;
	}

	@Override
	public String toString() {
		return "\t\t\t<할인된 상품 정보>\n[상품 이름 : " + getName() + " 할인된 상품 가격 : " + getPrice() + " (할인 전 가격 :  "+super.getPrice()+") ]";
	}

}
