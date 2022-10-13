
public class BMI {
	private String name; // 이름
	private int age; // 나이
	private double weight; // 몸무게
	private double height; // 키
	
	//default값을 정해줌
	public BMI() {
		this("홍길동", 1, 10, 100);
	}
	//BMI 메서드에게 호출되는 메서드
	public BMI(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	//이름을 반환
	public String getName() {
		return name;
	}
	//이름을 변경
	public void setName(String name) {
		this.name = name;
	}
	//나이를 반환
	public int getAge() {
		return age;
	}
	//나이를 변경
	public void setAge(int age) {
		this.age = age;
	}
	//몸무게를 반환
	public double getWeight() {
		return weight;
	}
	//몸무게를 변경
	public void setWeight(double weight) {
		this.weight = weight;
	}
	//키를 반환
	public double getHeight() {
		return height;
	}
	//키를 변경
	public void setHeight(double height) {
		this.height = height;
	}
	//BMI 계산하는 메서드
	public double clacBMI() {
		double bmi= weight/(height*height);
		return Math.round(bmi*100)/100.0;			
	}
	
	//비만상태를 판단하는 메서드
	public String statusBMI() {
		double bmi=clacBMI();
		if (bmi<16) {
			return "당신은 심각한 저체중";
		} else if (bmi<18) {
			return "당신은 저체중";
		} else if (bmi<24) {
			return "당신은 정상체중";
		} else if (bmi<29) {
			return "당신은 과체중";
		} else if (bmi<35) {
			return "당신은 심각한 과체중(고도 비만)";
		} else {
			return "당신은 위험한 과체중(초고도비만)";
		}
	}
	@Override
	public String toString() {
		return "BMI [ 이름 : " + getName() + ", 나이 : " + getAge() + ", 몸무게 : " + getWeight()
				+ ", 키 : " + getHeight() + " , bmi : " + clacBMI() + " , 상태 : " + statusBMI() + "]";
	}
	
	
}
