package vo;

public class DesertVO {
	// 디저트 카테고리 VO. 상품명과 가격
	private String gongGongchippang; // 공공치빵
	private int gongGongchippangPrice;
	private String gongGongchippangChoco; // 공공치빵초코
	private int gongGongchippangChocoPrice;
	private String creamisyu; // 크리미슈
	private int creamisyuPrice;
	private String creamisyuRedBean; // 크리미슈단팥빵
	private int creamisyuRedBeanPrice;
	private String softIceCream; // 노말한 소프트(아이스크림)
	private int softIceCreamPrice;
	private String dalgonaCrunchIceCream; // 노말한 소프트(아이스크림)
	private int dalgonaCrunchIceCreamPrice;
	private String pastryWaffles; // 긴 페스추리와플
	private int pastryWafflesPrice;
	private String madelec; // 큰마들렌
	private int madelecPrice;
	private String squareMuffinsChoco;// 네모머핀 초코
	private int squareMuffinsChocoPrice;
	private String saladBread; // 사라다빵
	private int saladBreadPrice;
	private String sausageBread; // 소시지빵
	private int sausageBreadPrice;
	private String macaronStrawberryCrunch; // 맛카롱딸기크런치
	private int macaronStrawberryCrunchPrice;
	private String macaronChocolateCrunch; // 맛카롱초코크런치
	private int macaronChocolateCrunchPrice;
	private String macaronMilk; // 맛카롱 순우유
	private int macaronMilkPrice;

	public DesertVO() {
		super();
	}

	public DesertVO(String gongGongchippang, int gongGongchippangPrice, String gongGongchippangChoco,
			int gongGongchippangChocoPrice, String creamisyu, int creamisyuPrice, String creamisyuRedBean,
			int creamisyuRedBeanPrice, String softIceCream, int softIceCreamPrice, String dalgonaCrunchIceCream,
			int dalgonaCrunchIceCreamPrice, String pastryWaffles, int pastryWafflesPrice, String madelec,
			int madelecPrice, String squareMuffinsChoco, int squareMuffinsChocoPrice, String saladBread,
			int saladBreadPrice, String sausageBread, int sausageBreadPrice, String macaronStrawberryCrunch,
			int macaronStrawberryCrunchPrice, String macaronChocolateCrunch, int macaronChocolateCrunchPrice,
			String macaronMilk, int macaronMilkPrice) {
		super();
		this.gongGongchippang = gongGongchippang;
		this.gongGongchippangPrice = gongGongchippangPrice;
		this.gongGongchippangChoco = gongGongchippangChoco;
		this.gongGongchippangChocoPrice = gongGongchippangChocoPrice;
		this.creamisyu = creamisyu;
		this.creamisyuPrice = creamisyuPrice;
		this.creamisyuRedBean = creamisyuRedBean;
		this.creamisyuRedBeanPrice = creamisyuRedBeanPrice;
		this.softIceCream = softIceCream;
		this.softIceCreamPrice = softIceCreamPrice;
		this.dalgonaCrunchIceCream = dalgonaCrunchIceCream;
		this.dalgonaCrunchIceCreamPrice = dalgonaCrunchIceCreamPrice;
		this.pastryWaffles = pastryWaffles;
		this.pastryWafflesPrice = pastryWafflesPrice;
		this.madelec = madelec;
		this.madelecPrice = madelecPrice;
		this.squareMuffinsChoco = squareMuffinsChoco;
		this.squareMuffinsChocoPrice = squareMuffinsChocoPrice;
		this.saladBread = saladBread;
		this.saladBreadPrice = saladBreadPrice;
		this.sausageBread = sausageBread;
		this.sausageBreadPrice = sausageBreadPrice;
		this.macaronStrawberryCrunch = macaronStrawberryCrunch;
		this.macaronStrawberryCrunchPrice = macaronStrawberryCrunchPrice;
		this.macaronChocolateCrunch = macaronChocolateCrunch;
		this.macaronChocolateCrunchPrice = macaronChocolateCrunchPrice;
		this.macaronMilk = macaronMilk;
		this.macaronMilkPrice = macaronMilkPrice;
	}

	public String getGongGongchippang() {
		return gongGongchippang;
	}

	public void setGongGongchippang(String gongGongchippang) {
		this.gongGongchippang = gongGongchippang;
	}

	public int getGongGongchippangPrice() {
		return gongGongchippangPrice;
	}

	public void setGongGongchippangPrice(int gongGongchippangPrice) {
		this.gongGongchippangPrice = gongGongchippangPrice;
	}

	public String getGongGongchippangChoco() {
		return gongGongchippangChoco;
	}

	public void setGongGongchippangChoco(String gongGongchippangChoco) {
		this.gongGongchippangChoco = gongGongchippangChoco;
	}

	public int getGongGongchippangChocoPrice() {
		return gongGongchippangChocoPrice;
	}

	public void setGongGongchippangChocoPrice(int gongGongchippangChocoPrice) {
		this.gongGongchippangChocoPrice = gongGongchippangChocoPrice;
	}

	public String getCreamisyu() {
		return creamisyu;
	}

	public void setCreamisyu(String creamisyu) {
		this.creamisyu = creamisyu;
	}

	public int getCreamisyuPrice() {
		return creamisyuPrice;
	}

	public void setCreamisyuPrice(int creamisyuPrice) {
		this.creamisyuPrice = creamisyuPrice;
	}

	public String getCreamisyuRedBean() {
		return creamisyuRedBean;
	}

	public void setCreamisyuRedBean(String creamisyuRedBean) {
		this.creamisyuRedBean = creamisyuRedBean;
	}

	public int getCreamisyuRedBeanPrice() {
		return creamisyuRedBeanPrice;
	}

	public void setCreamisyuRedBeanPrice(int creamisyuRedBeanPrice) {
		this.creamisyuRedBeanPrice = creamisyuRedBeanPrice;
	}

	public String getSoftIceCream() {
		return softIceCream;
	}

	public void setSoftIceCream(String softIceCream) {
		this.softIceCream = softIceCream;
	}

	public int getSoftIceCreamPrice() {
		return softIceCreamPrice;
	}

	public void setSoftIceCreamPrice(int softIceCreamPrice) {
		this.softIceCreamPrice = softIceCreamPrice;
	}

	public String getDalgonaCrunchIceCream() {
		return dalgonaCrunchIceCream;
	}

	public void setDalgonaCrunchIceCream(String dalgonaCrunchIceCream) {
		this.dalgonaCrunchIceCream = dalgonaCrunchIceCream;
	}

	public int getDalgonaCrunchIceCreamPrice() {
		return dalgonaCrunchIceCreamPrice;
	}

	public void setDalgonaCrunchIceCreamPrice(int dalgonaCrunchIceCreamPrice) {
		this.dalgonaCrunchIceCreamPrice = dalgonaCrunchIceCreamPrice;
	}

	public String getPastryWaffles() {
		return pastryWaffles;
	}

	public void setPastryWaffles(String pastryWaffles) {
		this.pastryWaffles = pastryWaffles;
	}

	public int getPastryWafflesPrice() {
		return pastryWafflesPrice;
	}

	public void setPastryWafflesPrice(int pastryWafflesPrice) {
		this.pastryWafflesPrice = pastryWafflesPrice;
	}

	public String getMadelec() {
		return madelec;
	}

	public void setMadelec(String madelec) {
		this.madelec = madelec;
	}

	public int getMadelecPrice() {
		return madelecPrice;
	}

	public void setMadelecPrice(int madelecPrice) {
		this.madelecPrice = madelecPrice;
	}

	public String getSquareMuffinsChoco() {
		return squareMuffinsChoco;
	}

	public void setSquareMuffinsChoco(String squareMuffinsChoco) {
		this.squareMuffinsChoco = squareMuffinsChoco;
	}

	public int getSquareMuffinsChocoPrice() {
		return squareMuffinsChocoPrice;
	}

	public void setSquareMuffinsChocoPrice(int squareMuffinsChocoPrice) {
		this.squareMuffinsChocoPrice = squareMuffinsChocoPrice;
	}

	public String getSaladBread() {
		return saladBread;
	}

	public void setSaladBread(String saladBread) {
		this.saladBread = saladBread;
	}

	public int getSaladBreadPrice() {
		return saladBreadPrice;
	}

	public void setSaladBreadPrice(int saladBreadPrice) {
		this.saladBreadPrice = saladBreadPrice;
	}

	public String getSausageBread() {
		return sausageBread;
	}

	public void setSausageBread(String sausageBread) {
		this.sausageBread = sausageBread;
	}

	public int getSausageBreadPrice() {
		return sausageBreadPrice;
	}

	public void setSausageBreadPrice(int sausageBreadPrice) {
		this.sausageBreadPrice = sausageBreadPrice;
	}

	public String getMacaronStrawberryCrunch() {
		return macaronStrawberryCrunch;
	}

	public void setMacaronStrawberryCrunch(String macaronStrawberryCrunch) {
		this.macaronStrawberryCrunch = macaronStrawberryCrunch;
	}

	public int getMacaronStrawberryCrunchPrice() {
		return macaronStrawberryCrunchPrice;
	}

	public void setMacaronStrawberryCrunchPrice(int macaronStrawberryCrunchPrice) {
		this.macaronStrawberryCrunchPrice = macaronStrawberryCrunchPrice;
	}

	public String getMacaronChocolateCrunch() {
		return macaronChocolateCrunch;
	}

	public void setMacaronChocolateCrunch(String macaronChocolateCrunch) {
		this.macaronChocolateCrunch = macaronChocolateCrunch;
	}

	public int getMacaronChocolateCrunchPrice() {
		return macaronChocolateCrunchPrice;
	}

	public void setMacaronChocolateCrunchPrice(int macaronChocolateCrunchPrice) {
		this.macaronChocolateCrunchPrice = macaronChocolateCrunchPrice;
	}

	public String getMacaronMilk() {
		return macaronMilk;
	}

	public void setMacaronMilk(String macaronMilk) {
		this.macaronMilk = macaronMilk;
	}

	public int getMacaronMilkPrice() {
		return macaronMilkPrice;
	}

	public void setMacaronMilkPrice(int macaronMilkPrice) {
		this.macaronMilkPrice = macaronMilkPrice;
	}

	@Override
	//listDesert()에서 호출될 toString값을 설정합니다. get한 상품명과 동일할 시, 상품명과 가격을 나열한 행을 반환합니다.
	public String toString() {
		if (getGongGongchippang() == "공공치빵") {
			return getGongGongchippang() + "\t" + getGongGongchippangPrice() + "원";
		} else if (getGongGongchippangChoco() == "공공치빵 초코") {
			return getGongGongchippangChoco() + "\t" + getGongGongchippangChocoPrice() + "원";
		} else if (getCreamisyu() == "크리미슈") {
			return getCreamisyu() + "\t" + getCreamisyuPrice() + "원";
		} else if (getCreamisyuRedBean() == "크리미단팥빵") {
			return getCreamisyuRedBean() + "\t" + getCreamisyuRedBeanPrice() + "원";
		} else if (getSoftIceCream() == "노말한 소프트") {
			return getSoftIceCream() + "\t" + getSoftIceCreamPrice() + "원";
		} else if (getDalgonaCrunchIceCream() == "달고나 크런치") {
			return getDalgonaCrunchIceCream() + "\t" + getDalgonaCrunchIceCreamPrice() + "원";
		} else if (getPastryWaffles() == "긴 페스추리와플") {
			return getPastryWaffles() + "\t" + getPastryWafflesPrice() + "원";
		} else if (getMadelec() == "큰 마들렌") {
			return getMadelec() + "\t" + getMadelecPrice() + "원";
		} else if (getSquareMuffinsChoco() == "네모머핀") {
			return getSquareMuffinsChoco() + "\t" + getSquareMuffinsChocoPrice() + "원";
		} else if (getSaladBread() == "사라다빵") {
			return getSaladBread() + "\t" + getSaladBreadPrice() + "원";
		} else if (getSausageBread() == "소시지빵") {
			return getSausageBread() + "\t" + getSausageBreadPrice() + "원";
		} else if (getMacaronStrawberryCrunch() == ("맛카롱(딸기크런치)")) {
			return getMacaronStrawberryCrunch() + "\t" + getMacaronStrawberryCrunchPrice() + "원";
		} else if (getMacaronChocolateCrunch() == "맛카롱(초코크런치)") {
			return getMacaronChocolateCrunch() + "\t" + getMacaronChocolateCrunchPrice() + "원";
		} else if (getMacaronMilk() == "맛카롱(순우유)") {
			return getMacaronMilk() + "\t" + getMacaronMilkPrice() + "원";
		} else {
			return null;
		}
	}
}
