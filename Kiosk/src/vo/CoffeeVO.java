package vo;

public class CoffeeVO {
	// 커피 카데고리 VO. 상품명과 가격
	private String ebEspresso; // 더블에스프레소
	private int espressoPrice;
	private String americano; // 아메리카노
	private int americanoPrice;
	private String originalCoffee; // 원조커피
	private int originalCoffeePrice;
	private String condensedMilkLatte; // 달달연유라떼
	private int condensedMilkLattePrice;
	private String cafeLatte; // 빽's 카페라떼
	private int cafeLattePrice;
	private String vanillaLatte; // 바닐라라떼
	private int vanillaLattePrice;
	private String cafeMocha; // 카페모카
	private int cafeMochaPrice;
	private String cMacchiato; // 카라멜마끼아토
	private int cMacchiatoPrice;
	private String coconutLatte; // 코코넛라떼
	private int coconutLattePrice;
	private String CoconutCoffeeSmoothie; // 코코넛커피스무디
	private int coconutCoffeeSmoothiePrice;
	private String iCCafeLatte; // 아이스크림 카페라떼
	private int iCCafeLattePrice;
	private String iCVanillaLatte;// 아이스바닐라라떼
	private int iCVanillaLattePrice;
	private String iCCafeMocha; // 아이스크림 카페모카
	private int iCCafeMochaPrice;
	private String coldCBrew;// 콜드브루
	private int coldCBrewPrice;
	private String decaffeColdCBrew; // 디카페인콜드브루
	private int decaffeColdCBrewPrice;//
	private String coldCBrewLatte; // 콜드브루 라떼
	private int coldCBrewLattePrice;
	private String decaffeColdCBrewLatte; // 디카페인콜드브루
	private int decaffeColdCBrewLattePrice;
	private String coldCBrewCondensedMilkLatte; // 콜드브루연유라떼
	private int coldCBrewCondensedMilkLattePrice;
	private String decaffeCondensedMilkLatte; // 디카페인콜드브루연유라떼
	private int decaffeCondensedMilkLattePrice;
	private String coldBrewBrownSugarLatte; // 콜드브루 흑당라뗴
	private int coldBrewBrownSugarLattePrice;
	private String decaffeBrownSugarLatte; // 디카페인 콜드브루 흑당라떼
	private int decaffeBrownSugarLattePrice;
	private String ashatchu; // 아샷추
	private int ashatchuPrice;

	public CoffeeVO() {
		super();
	}

	public CoffeeVO(String ebEspresso, int espressoPrice, String americano, int americanoPrice, String originalCoffee,
			int originalCoffeePrice, String condensedMilkLatte, int condensedMilkLattePrice, String cafeLatte,
			int cafeLattePrice, String vanillaLatte, int vanillaLattePrice, String cafeMocha, int cafeMochaPrice,
			String cMacchiato, int cMacchiatoPrice, String coconutLatte, int coconutLattePrice,
			String coconutCoffeeSmoothie, int coconutCoffeeSmoothiePrice, String iCCafeLatte, int iCCafeLattePrice,
			String iCVanillaLatte, int iCVanillaLattePrice, String iCCafeMocha, int iCCafeMochaPrice, String coldCBrew,
			int coldCBrewPrice, String decaffeColdCBrew, int decaffeColdCBrewPrice, String coldCBrewLatte,
			int coldCBrewLattePrice, String decaffeColdCBrewLatte, int decaffeColdCBrewLattePrice,
			String coldCBrewCondensedMilkLatte, int coldCBrewCondensedMilkLattePrice, String decaffeCondensedMilkLatte,
			int decaffeCondensedMilkLattePrice, String coldBrewBrownSugarLatte, int coldBrewBrownSugarLattePrice,
			String decaffeBrownSugarLatte, int decaffeBrownSugarLattePrice, String ashatchu, int ashatchuPrice) {
		super();
		this.ebEspresso = ebEspresso;
		this.espressoPrice = espressoPrice;
		this.americano = americano;
		this.americanoPrice = americanoPrice;
		this.originalCoffee = originalCoffee;
		this.originalCoffeePrice = originalCoffeePrice;
		this.condensedMilkLatte = condensedMilkLatte;
		this.condensedMilkLattePrice = condensedMilkLattePrice;
		this.cafeLatte = cafeLatte;
		this.cafeLattePrice = cafeLattePrice;
		this.vanillaLatte = vanillaLatte;
		this.vanillaLattePrice = vanillaLattePrice;
		this.cafeMocha = cafeMocha;
		this.cafeMochaPrice = cafeMochaPrice;
		this.cMacchiato = cMacchiato;
		this.cMacchiatoPrice = cMacchiatoPrice;
		this.coconutLatte = coconutLatte;
		this.coconutLattePrice = coconutLattePrice;
		CoconutCoffeeSmoothie = coconutCoffeeSmoothie;
		this.coconutCoffeeSmoothiePrice = coconutCoffeeSmoothiePrice;
		this.iCCafeLatte = iCCafeLatte;
		this.iCCafeLattePrice = iCCafeLattePrice;
		this.iCVanillaLatte = iCVanillaLatte;
		this.iCVanillaLattePrice = iCVanillaLattePrice;
		this.iCCafeMocha = iCCafeMocha;
		this.iCCafeMochaPrice = iCCafeMochaPrice;
		this.coldCBrew = coldCBrew;
		this.coldCBrewPrice = coldCBrewPrice;
		this.decaffeColdCBrew = decaffeColdCBrew;
		this.decaffeColdCBrewPrice = decaffeColdCBrewPrice;
		this.coldCBrewLatte = coldCBrewLatte;
		this.coldCBrewLattePrice = coldCBrewLattePrice;
		this.decaffeColdCBrewLatte = decaffeColdCBrewLatte;
		this.decaffeColdCBrewLattePrice = decaffeColdCBrewLattePrice;
		this.coldCBrewCondensedMilkLatte = coldCBrewCondensedMilkLatte;
		this.coldCBrewCondensedMilkLattePrice = coldCBrewCondensedMilkLattePrice;
		this.decaffeCondensedMilkLatte = decaffeCondensedMilkLatte;
		this.decaffeCondensedMilkLattePrice = decaffeCondensedMilkLattePrice;
		this.coldBrewBrownSugarLatte = coldBrewBrownSugarLatte;
		this.coldBrewBrownSugarLattePrice = coldBrewBrownSugarLattePrice;
		this.decaffeBrownSugarLatte = decaffeBrownSugarLatte;
		this.decaffeBrownSugarLattePrice = decaffeBrownSugarLattePrice;
		this.ashatchu = ashatchu;
		this.ashatchuPrice = ashatchuPrice;
	}

	public String getEbEspresso() {
		return ebEspresso;
	}

	public void setEbEspresso(String ebEspresso) {
		this.ebEspresso = ebEspresso;
	}

	public int getEspressoPrice() {
		return espressoPrice;
	}

	public void setEspressoPrice(int espressoPrice) {
		this.espressoPrice = espressoPrice;
	}

	public String getAmericano() {
		return americano;
	}

	public void setAmericano(String americano) {
		this.americano = americano;
	}

	public int getAmericanoPrice() {
		return americanoPrice;
	}

	public void setAmericanoPrice(int americanoPrice) {
		this.americanoPrice = americanoPrice;
	}

	public String getOriginalCoffee() {
		return originalCoffee;
	}

	public void setOriginalCoffee(String originalCoffee) {
		this.originalCoffee = originalCoffee;
	}

	public int getOriginalCoffeePrice() {
		return originalCoffeePrice;
	}

	public void setOriginalCoffeePrice(int originalCoffeePrice) {
		this.originalCoffeePrice = originalCoffeePrice;
	}

	public String getCondensedMilkLatte() {
		return condensedMilkLatte;
	}

	public void setCondensedMilkLatte(String condensedMilkLatte) {
		this.condensedMilkLatte = condensedMilkLatte;
	}

	public int getCondensedMilkLattePrice() {
		return condensedMilkLattePrice;
	}

	public void setCondensedMilkLattePrice(int condensedMilkLattePrice) {
		this.condensedMilkLattePrice = condensedMilkLattePrice;
	}

	public String getCafeLatte() {
		return cafeLatte;
	}

	public void setCafeLatte(String cafeLatte) {
		this.cafeLatte = cafeLatte;
	}

	public int getCafeLattePrice() {
		return cafeLattePrice;
	}

	public void setCafeLattePrice(int cafeLattePrice) {
		this.cafeLattePrice = cafeLattePrice;
	}

	public String getVanillaLatte() {
		return vanillaLatte;
	}

	public void setVanillaLatte(String vanillaLatte) {
		this.vanillaLatte = vanillaLatte;
	}

	public int getVanillaLattePrice() {
		return vanillaLattePrice;
	}

	public void setVanillaLattePrice(int vanillaLattePrice) {
		this.vanillaLattePrice = vanillaLattePrice;
	}

	public String getCafeMocha() {
		return cafeMocha;
	}

	public void setCafeMocha(String cafeMocha) {
		this.cafeMocha = cafeMocha;
	}

	public int getCafeMochaPrice() {
		return cafeMochaPrice;
	}

	public void setCafeMochaPrice(int cafeMochaPrice) {
		this.cafeMochaPrice = cafeMochaPrice;
	}

	public String getcMacchiato() {
		return cMacchiato;
	}

	public void setcMacchiato(String cMacchiato) {
		this.cMacchiato = cMacchiato;
	}

	public int getcMacchiatoPrice() {
		return cMacchiatoPrice;
	}

	public void setcMacchiatoPrice(int cMacchiatoPrice) {
		this.cMacchiatoPrice = cMacchiatoPrice;
	}

	public String getCoconutLatte() {
		return coconutLatte;
	}

	public void setCoconutLatte(String coconutLatte) {
		this.coconutLatte = coconutLatte;
	}

	public int getCoconutLattePrice() {
		return coconutLattePrice;
	}

	public void setCoconutLattePrice(int coconutLattePrice) {
		this.coconutLattePrice = coconutLattePrice;
	}

	public String getCoconutCoffeeSmoothie() {
		return CoconutCoffeeSmoothie;
	}

	public void setCoconutCoffeeSmoothie(String coconutCoffeeSmoothie) {
		CoconutCoffeeSmoothie = coconutCoffeeSmoothie;
	}

	public int getCoconutCoffeeSmoothiePrice() {
		return coconutCoffeeSmoothiePrice;
	}

	public void setCoconutCoffeeSmoothiePrice(int coconutCoffeeSmoothiePrice) {
		this.coconutCoffeeSmoothiePrice = coconutCoffeeSmoothiePrice;
	}

	public String getiCCafeLatte() {
		return iCCafeLatte;
	}

	public void setiCCafeLatte(String iCCafeLatte) {
		this.iCCafeLatte = iCCafeLatte;
	}

	public int getiCCafeLattePrice() {
		return iCCafeLattePrice;
	}

	public void setiCCafeLattePrice(int iCCafeLattePrice) {
		this.iCCafeLattePrice = iCCafeLattePrice;
	}

	public String getiCVanillaLatte() {
		return iCVanillaLatte;
	}

	public void setiCVanillaLatte(String iCVanillaLatte) {
		this.iCVanillaLatte = iCVanillaLatte;
	}

	public int getiCVanillaLattePrice() {
		return iCVanillaLattePrice;
	}

	public void setiCVanillaLattePrice(int iCVanillaLattePrice) {
		this.iCVanillaLattePrice = iCVanillaLattePrice;
	}

	public String getiCCafeMocha() {
		return iCCafeMocha;
	}

	public void setiCCafeMocha(String iCCafeMocha) {
		this.iCCafeMocha = iCCafeMocha;
	}

	public int getiCCafeMochaPrice() {
		return iCCafeMochaPrice;
	}

	public void setiCCafeMochaPrice(int iCCafeMochaPrice) {
		this.iCCafeMochaPrice = iCCafeMochaPrice;
	}

	public String getColdCBrew() {
		return coldCBrew;
	}

	public void setColdCBrew(String coldCBrew) {
		this.coldCBrew = coldCBrew;
	}

	public int getColdCBrewPrice() {
		return coldCBrewPrice;
	}

	public void setColdCBrewPrice(int coldCBrewPrice) {
		this.coldCBrewPrice = coldCBrewPrice;
	}

	public String getDecaffeColdCBrew() {
		return decaffeColdCBrew;
	}

	public void setDecaffeColdCBrew(String decaffeColdCBrew) {
		this.decaffeColdCBrew = decaffeColdCBrew;
	}

	public int getDecaffeColdCBrewPrice() {
		return decaffeColdCBrewPrice;
	}

	public void setDecaffeColdCBrewPrice(int decaffeColdCBrewPrice) {
		this.decaffeColdCBrewPrice = decaffeColdCBrewPrice;
	}

	public String getColdCBrewLatte() {
		return coldCBrewLatte;
	}

	public void setColdCBrewLatte(String coldCBrewLatte) {
		this.coldCBrewLatte = coldCBrewLatte;
	}

	public int getColdCBrewLattePrice() {
		return coldCBrewLattePrice;
	}

	public void setColdCBrewLattePrice(int coldCBrewLattePrice) {
		this.coldCBrewLattePrice = coldCBrewLattePrice;
	}

	public String getDecaffeColdCBrewLatte() {
		return decaffeColdCBrewLatte;
	}

	public void setDecaffeColdCBrewLatte(String decaffeColdCBrewLatte) {
		this.decaffeColdCBrewLatte = decaffeColdCBrewLatte;
	}

	public int getDecaffeColdCBrewLattePrice() {
		return decaffeColdCBrewLattePrice;
	}

	public void setDecaffeColdCBrewLattePrice(int decaffeColdCBrewLattePrice) {
		this.decaffeColdCBrewLattePrice = decaffeColdCBrewLattePrice;
	}

	public String getColdCBrewCondensedMilkLatte() {
		return coldCBrewCondensedMilkLatte;
	}

	public void setColdCBrewCondensedMilkLatte(String coldCBrewCondensedMilkLatte) {
		this.coldCBrewCondensedMilkLatte = coldCBrewCondensedMilkLatte;
	}

	public int getColdCBrewCondensedMilkLattePrice() {
		return coldCBrewCondensedMilkLattePrice;
	}

	public void setColdCBrewCondensedMilkLattePrice(int coldCBrewCondensedMilkLattePrice) {
		this.coldCBrewCondensedMilkLattePrice = coldCBrewCondensedMilkLattePrice;
	}

	public String getDecaffeCondensedMilkLatte() {
		return decaffeCondensedMilkLatte;
	}

	public void setDecaffeCondensedMilkLatte(String decaffeCondensedMilkLatte) {
		this.decaffeCondensedMilkLatte = decaffeCondensedMilkLatte;
	}

	public int getDecaffeCondensedMilkLattePrice() {
		return decaffeCondensedMilkLattePrice;
	}

	public void setDecaffeCondensedMilkLattePrice(int decaffeCondensedMilkLattePrice) {
		this.decaffeCondensedMilkLattePrice = decaffeCondensedMilkLattePrice;
	}

	public String getColdBrewBrownSugarLatte() {
		return coldBrewBrownSugarLatte;
	}

	public void setColdBrewBrownSugarLatte(String coldBrewBrownSugarLatte) {
		this.coldBrewBrownSugarLatte = coldBrewBrownSugarLatte;
	}

	public int getColdBrewBrownSugarLattePrice() {
		return coldBrewBrownSugarLattePrice;
	}

	public void setColdBrewBrownSugarLattePrice(int coldBrewBrownSugarLattePrice) {
		this.coldBrewBrownSugarLattePrice = coldBrewBrownSugarLattePrice;
	}

	public String getDecaffeBrownSugarLatte() {
		return decaffeBrownSugarLatte;
	}

	public void setDecaffeBrownSugarLatte(String decaffeBrownSugarLatte) {
		this.decaffeBrownSugarLatte = decaffeBrownSugarLatte;
	}

	public int getDecaffeBrownSugarLattePrice() {
		return decaffeBrownSugarLattePrice;
	}

	public void setDecaffeBrownSugarLattePrice(int decaffeBrownSugarLattePrice) {
		this.decaffeBrownSugarLattePrice = decaffeBrownSugarLattePrice;
	}

	public String getAshatchu() {
		return ashatchu;
	}

	public void setAshatchu(String ashatchu) {
		this.ashatchu = ashatchu;
	}

	public int getAshatchuPrice() {
		return ashatchuPrice;
	}

	public void setAshatchuPrice(int ashatchuPrice) {
		this.ashatchuPrice = ashatchuPrice;
	}

	@Override
	//listCoffee()에서 호출될 toString값을 설정합니다. get한 상품명과 동일할 시, 상품명과 가격을 나열한 행을 반환합니다.
	public String toString() {
		if (getEbEspresso() == "더블 에스프레소") {
			return getEbEspresso() + "\t" + getEspressoPrice() + "원";
		} else if (getAmericano() == "아메리카노") {
			return getAmericano() + "\t" + getAmericanoPrice() + "원";
		} else if (getOriginalCoffee() == "원조커피") {
			return getOriginalCoffee() + "\t" + getOriginalCoffeePrice() + "원";
		} else if (getCondensedMilkLatte() == "연유라떼") {
			return getCondensedMilkLatte() + "\t" + getCondensedMilkLattePrice() + "원";
		} else if (getCafeLatte() == "카페라떼") {
			return getCafeLatte() + "\t" + getCafeLattePrice() + "원";
		} else if (getVanillaLatte() == "바닐라라뗴") {
			return getVanillaLatte() + "\t" + getVanillaLattePrice() + "원";
		} else if (getCafeMocha() == "카페모카") {
			return getCafeMocha() + "\t" + getCafeMochaPrice() + "원";
		} else if (getcMacchiato() == "카라멜 마키아또") {
			return getcMacchiato() + "\t" + getcMacchiatoPrice() + "원";
		} else if (getCoconutLatte() == "코코넛 라떼") {
			return getCoconutLatte() + "\t" + getCoconutLattePrice() + "원";
		} else if (getCoconutCoffeeSmoothie() == "코코넛 커피스무디") {
			return getCoconutCoffeeSmoothie() + "\t" + getCoconutCoffeeSmoothiePrice() + "원";
		} else if (getiCCafeLatte() == "아이스크림 카페라떼") {
			return getiCCafeLatte() + "\t" + getiCCafeLattePrice() + "원";
		} else if (getiCVanillaLatte() == "아이스크림 바닐라 라떼") {
			return getiCVanillaLatte() + "\t" + getiCVanillaLattePrice() + "원";
		} else if (getiCCafeMocha() == "아이스크림 카페 모카") {
			return getiCCafeMocha() + "\t" + getiCCafeMochaPrice() + "원";
		} else if (getColdCBrew() == "콜드브루") {
			return getColdCBrew() + "\t" + getColdCBrewPrice() + "원";
		} else if (getDecaffeColdCBrew() == ("디카페인 콜드브루")) {
			return getDecaffeColdCBrew() + "\t" + getDecaffeColdCBrewPrice() + "원";
		} else if (getColdCBrewLatte() == ("콜드브루 라뗴")) {
			return getColdCBrewLatte() + "\t" + getColdCBrewLattePrice() + "원";
		} else if (getDecaffeColdCBrewLatte() == ("디카페인 콜드브루라뗴")) {
			return getDecaffeColdCBrewLatte() + "\t" + getDecaffeColdCBrewLattePrice() + "원";
		} else if (getColdCBrewCondensedMilkLatte() == ("콜드브루연유라떼")) {
			return getColdCBrewCondensedMilkLatte() + "\t" + getColdCBrewCondensedMilkLattePrice() + "원";
		} else if (getDecaffeCondensedMilkLatte() == ("디카페인 콜드브루연유라떼")) {
			return getDecaffeCondensedMilkLatte() + "\t" + getDecaffeCondensedMilkLattePrice() + "원";
		} else if (getColdBrewBrownSugarLatte() == ("콜드브루 흑당라뗴")) {
			return getColdBrewBrownSugarLatte() + "\t" + getColdBrewBrownSugarLattePrice() + "원";
		} else if (getDecaffeBrownSugarLatte() == ("디카페인 콜드브루 흑당라떼")) {
			return getDecaffeBrownSugarLatte() + "\t" + getDecaffeBrownSugarLattePrice() + "원";
		} else if (getAshatchu() == ("아샷추")) {
			return getAshatchu() + "\t" + getAshatchuPrice() + "원";
		} else {
			return null;
		}
	}

}
