
public class Fruit {
	private double calorie;
	private int price;
	private double weight;
	public Fruit() {
		super();
	}
	public Fruit(double calorie, int price, double weight) {
		super();
		this.calorie = calorie;
		this.price = price;
		this.weight = weight;
	}
	public double getCalorie() {
		return calorie;
	}
	public void setCalorie(double calorie) {
		this.calorie = calorie;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return " 칼로리 : " + getCalorie() + " 가격 : " + getPrice() + " 중량 : " + getWeight()
				+ " ";
	}
	
	
}
