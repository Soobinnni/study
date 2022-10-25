package phoneBookClass;


public class PhoneCompanyInfo extends PhoneInfo {
	private String company; //회사이름

	public PhoneCompanyInfo() {
		super();
	}

	public PhoneCompanyInfo(String company) {
		super();
		this.company = company;
	}

	public PhoneCompanyInfo(String name, String tel, String company) {
		super(name, tel);
		this.company = company;
		// TODO Auto-generated constructor stub
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	//회사정보출력
	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("회사이름 : "+company);
	}
}
