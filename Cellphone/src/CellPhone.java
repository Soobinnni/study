
public class CellPhone {
	private String modelName; //모델명
	private String manufactureCompany; //제조회사
	private String color; //색상
	private String power; //전원
	private String camera; //카메라 여부
	//생성자 cellphone은 객체를 생성할 때 다음과 같이 초기화하겠다(디폴트). 초기화의 참고는 Cellphone메소드를 호출하여 한다.
	public CellPhone() {
		this("갤럭시 제트 플립","삼성","연보라색","on","Y" );
	}
	public CellPhone(String modelName, String manufactureCompany, String color, String power, String camera) {
		this.modelName = modelName;
		this.manufactureCompany = manufactureCompany;
		this.color = color;
		this.power = power;
		this.camera = camera;
	}
	
	//모델명 반환
	public String getModelName() {
		return modelName;
	}
	//모델명 변경
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	//제조사 반환
	public String getManufactureCompany() {
		return manufactureCompany;
	}
	//제조사 변경
	public void setManufactureCompany(String manufactureCompany) {
		this.manufactureCompany = manufactureCompany;
	}
	//제조사 반환
	public String getColor() {
		return color;
	}
	//제조사 변경
	public void setColor(String color) {
		this.color = color;
	}
	//제조사 반환
	public String getPower() {
		return power;
	}
	//제조사 변경
	public void setPower(String power) {
		this.power = power;
	}
	//제조사 반환
	public String getCamera() {
		return camera;
	}
	//제조사 변경
	public void setCamera(String camera) {
		this.camera = camera;
	}
	
	//전원을 키는 메소드
	public String on() {
		return "전원이 켜집니다.";
	}
	//전원을 끄는 메소드
	public String off() {
		return "전원이 꺼진 상태입니다.";
	}
	@Override
	public String toString() {
		return "내 핸드폰 상태 [모델명 : " + getModelName() + ", 제조회사 : " + getManufactureCompany()
				+ ", 색상 : " + getColor() + ", 카메라 여부 : " + getCamera() + "]";
	}
	
	
	
}
