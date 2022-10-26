package phoneBookClass;

import java.io.Serializable;

public class PhoneInfo implements Serializable {
	private String name; //이름
	private String tel; //전화번호
	public PhoneInfo() {
		super();
	}
	public PhoneInfo(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	//정보를 출력하는 메소드
	public void showPhoneInfo() {
		System.out.println("이름 : "+name+"\n전화번호 : "+tel);
	}
	//이름의 해쉬코드를 반환하여 동일객체인지를 판단할 수 있다.
	public int hasCode() {
		return name.hashCode();
	}
	public boolean equals(Object obj) {
		PhoneInfo cmp = (PhoneInfo) obj;
		if(name.compareTo(cmp.name)==0) {
			return true;
		} else {
			return false;
		}
	}
}
