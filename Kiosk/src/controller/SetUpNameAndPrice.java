package controller;

import vo.BeverageVO;
import vo.CoffeeVO;
import vo.DesertVO;

public class SetUpNameAndPrice {
	CoffeeVO coffee = new CoffeeVO();
	BeverageVO beverage = new BeverageVO();
	DesertVO desert = new DesertVO();

	// 커피 이름 설정 메서드
	public CoffeeVO coffeeSetup() {
		coffee.setEbEspresso("더블 에스프레소");
		coffee.setAmericano("아메리카노");
		coffee.setOriginalCoffee("원조커피");
		coffee.setCondensedMilkLatte("연유라떼");
		coffee.setCafeLatte("카페라떼");
		coffee.setVanillaLatte("바닐라라뗴");
		coffee.setCafeMocha("카페모카");
		coffee.setcMacchiato("카라멜 마키아또");
		coffee.setCoconutLatte("코코넛 라떼");
		coffee.setCoconutCoffeeSmoothie("코코넛 커피스무디");
		coffee.setiCCafeLatte("아이스크림 카페라떼");
		coffee.setiCVanillaLatte("아이스크림 바닐라 라떼");
		coffee.setiCCafeMocha("아이스크림 카페 모카");
		coffee.setColdCBrew("콜드브루");
		coffee.setDecaffeColdCBrew("디카페인 콜드브루");
		coffee.setColdCBrewLatte("콜드브루 라뗴");
		coffee.setDecaffeColdCBrewLatte("디카페인 콜드브루라뗴");
		coffee.setColdCBrewCondensedMilkLatte("콜드브루연유라떼");
		coffee.setDecaffeCondensedMilkLatte("디카페인 콜드브루연유라떼");
		coffee.setColdBrewBrownSugarLatte("콜드브루 흑당라뗴");
		coffee.setDecaffeBrownSugarLatte("디카페인 콜드브루 흑당라떼");
		coffee.setAshatchu("아샷추");
		// 가격
		coffee.setEspressoPrice(1500);
		coffee.setAmericanoPrice(1500);
		coffee.setOriginalCoffeePrice(2000);
		coffee.setCondensedMilkLattePrice(2500);
		coffee.setCafeLattePrice(2500);
		coffee.setVanillaLattePrice(3000);
		coffee.setCafeMochaPrice(3000);
		coffee.setcMacchiatoPrice(3000);
		coffee.setCoconutLattePrice(3000);
		coffee.setCoconutCoffeeSmoothiePrice(4000);
		coffee.setiCCafeLattePrice(4000);
		coffee.setiCVanillaLattePrice(4500);
		coffee.setiCCafeMochaPrice(4500);
		coffee.setColdCBrewPrice(3000);
		coffee.setDecaffeColdCBrewPrice(3500);
		coffee.setColdCBrewLattePrice(4000);
		coffee.setDecaffeColdCBrewLattePrice(4500);
		coffee.setColdCBrewCondensedMilkLattePrice(4000);
		coffee.setDecaffeCondensedMilkLattePrice(4500);
		coffee.setColdBrewBrownSugarLattePrice(5000);
		coffee.setDecaffeBrownSugarLattePrice(5500);
		coffee.setAshatchuPrice(2500);

		return coffee;
	}

	// 음료 이름 설정 메서드
	public BeverageVO beverageSetup() {
		beverage.setStrawberryLatte("딸기라떼");
		beverage.setChocolateLatte("초코라떼");
		beverage.setGreenTeaLatte("녹차라떼");
		beverage.setMintChocoLatte("민트초코 라떼");
		beverage.setToffeeNutLatte("토피넛 라떼");
		beverage.setSweetpotatoLatte("고구마 라떼");
		beverage.setRiceFlourLatte("미숫가루 라떼");
		beverage.setMilkTea("밀크티");
		beverage.setPeppermintTea("페퍼민트티");
		beverage.setGoldenChamomileTea("황금 캐모마일티");
		beverage.setCalamansiTea("칼라만시 티");
		beverage.setSweetIceTea("달콤 아이스티");
		beverage.setLemonTea("레몬티");
		beverage.setLemonEarlGrayTea("레몬얼그레이티");
		beverage.setOrangeGrapefruitBlackTea("오렌지 자몽 블랙티");
		beverage.setCitrusTea("유자티");
		beverage.setGrapefruitTea("자몽티");
		beverage.setCherryCockCock("체리콕콕");
		beverage.setStrawberryAid("딸기에이드");
		beverage.setLemonadeGreenGrapeAid("레몬에이드");
		beverage.setCitronAid("유자에이드");
		beverage.setGrapefruitAid("청포도에이드");
		beverage.setGrapeJuice("우리포도주스");
		beverage.setWatermelonJuice("완전수박주스");
		beverage.setStrawberryJuice("완전딸기주스");
		beverage.setMangojuice("완전망고주스");
		beverage.setPeachAid("복숭아에이드");
		beverage.setMilkshake("밀크쉐이크");
		beverage.setSweetpotatoSmoothie("고구마스무디");
		beverage.setBlueberryYogurtsmoothie("블루베리스무디");
		beverage.setPlainYogurtSmoothie("플레인요거트스무디");
		beverage.setStrawberryYogurtSmoothie("딸기요거트스무디");
	
		// 음료 가격 설정 메서드
		beverage.setStrawberryLattePrice(3500);
		beverage.setChocolateLattePrice(3000);
		beverage.setGreenTeaLattePrice(3000);
		beverage.setMintChocoLattePrice(3000);
		beverage.setToffeeNutLattePrice(3000);
		beverage.setSweetpotatoLattePrice(3000);
		beverage.setRiceFlourLattePrice(2500);
		beverage.setMilkTeaPrice(3000);
		beverage.setPeppermintTeaPrice(2500);
		beverage.setGoldenChamomileTeaPrice(2500);
		beverage.setCalamansiTeaPrice(3000);
		beverage.setSweetIceTeaPrice(3000);
		beverage.setLemonTeaPrice(3500);
		beverage.setLemonEarlGrayTeaPrice(3500);
		beverage.setOrangeGrapefruitBlackTeaPrice(3500);
		beverage.setCitrusTeaPrice(3500);
		beverage.setGrapefruitTeaPrice(3500);
		beverage.setCherryCockCockPrice(3500);
		beverage.setStrawberryAidPrice(3500);
		beverage.setLemonadeGreenGrapeAidPrice(3500);
		beverage.setCitronAidPrice(3500);
		beverage.setGrapefruitAidPrice(3500);
		beverage.setGrapeJuicePrice(4000);
		beverage.setWatermelonJuicePrice(4000);
		beverage.setStrawberryJuicePrice(4000);
		beverage.setMangojuicePrice(3500);
		beverage.setPeachAidPrice(3500);
		beverage.setMilkshakePrice(3000);
		beverage.setSweetpotatoSmoothiePrice(4000);
		beverage.setBlueberryYogurtsmoothiePrice(3500);
		beverage.setPlainYogurtSmoothiePrice(3500);
		beverage.setStrawberryYogurtSmoothiePrice(3500);
		
		return beverage;
	}

	// 디저트 이름 설정 메서드
	public DesertVO desertSetup() {
		desert.setGongGongchippang("공공치빵");
		desert.setGongGongchippangChoco("공공치빵 초코");
		desert.setCreamisyu("크리미슈");
		desert.setCreamisyuRedBean("크리미단팥빵");
		desert.setSoftIceCream("노말한 소프트");
		desert.setDalgonaCrunchIceCream("달고나 크런치");
		desert.setPastryWaffles("긴 페스추리와플");
		desert.setMadelec("큰 마들렌");
		desert.setSquareMuffinsChoco("네모머핀");
		desert.setSaladBread("사라다빵");
		desert.setSausageBread("소시지빵");
		desert.setMacaronStrawberryCrunch("맛카롱(딸기크런치)");
		desert.setMacaronChocolateCrunch("맛카롱(초코크런치)");
		desert.setMacaronMilk("맛카롱(순우유)");

		// 디저트 가격 설정 메서드
		desert.setGongGongchippangPrice(2500);
		desert.setGongGongchippangChocoPrice(2500);
		desert.setCreamisyuPrice(1500);
		desert.setCreamisyuRedBeanPrice(1500);
		desert.setSoftIceCreamPrice(1500);
		desert.setDalgonaCrunchIceCreamPrice(2000);
		desert.setPastryWafflesPrice(2500);
		desert.setMadelecPrice(2800);
		desert.setSquareMuffinsChocoPrice(2300);
		desert.setSaladBreadPrice(2500);
		desert.setSausageBreadPrice(2500);
		desert.setMacaronStrawberryCrunchPrice(2000);
		desert.setMacaronChocolateCrunchPrice(2000);
		desert.setMacaronMilkPrice(1500);
		
		return desert;
	}
}
