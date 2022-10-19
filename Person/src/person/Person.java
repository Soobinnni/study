package person;

public abstract class Person {

	private String name; // 이름
	private String address; // 주소
	private String tel; // 전화번호
	private String eMail; // 이메일 주소

	public Person() {
		this("김용구","서울시","010-3423-0000","xpsxm225@ddd.com");
	}

	public Person(String name, String address, String tel, String eMail) {
		super();
		this.name = name;
		this.address = address;
		this.tel = tel;
		this.eMail = eMail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	@Override
	public String toString() {
		return "이름 : "+getName()+" 주소 : "+getAddress()+" 전화번호 : "+getTel()+" 이메일 주소 : "+geteMail();
	}

}
