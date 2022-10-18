
public class Melon extends Fruit {
	private String plantationInfo; // 경작농원정보

	public Melon() {
		this(100, 3500, 20.5, "영양농장");
	}

	public Melon(String plantationInfo) {
		super();
		this.plantationInfo = plantationInfo;
	}

	public Melon(double calorie, int price, double weight, String plantationInfo) {
		super(calorie, price, weight);
		this.plantationInfo = plantationInfo;
	}

	public String getPlantationInfo() {
		return plantationInfo;
	}

	public void setPlantationInfo(String plantationInfo) {
		this.plantationInfo = plantationInfo;
	}

	@Override
	public String toString() {
		return "\t\t\t<멜론정보>\n" + "[" + super.toString() + " 경작농원정보 : " + getPlantationInfo() + " ]";
	}

}
