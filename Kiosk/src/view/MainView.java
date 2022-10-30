package view;

import controller.SetUpNameAndPrice;
import vo.*;

public class MainView {

	// controller에서 초기화된 값들을 가져와 메뉴를 구성합니다.
	SetUpNameAndPrice set = new SetUpNameAndPrice();

	// 카테고리선택
	public void categorySelect() {
		System.out.println("\n카테고리를 선택합니다.\n");
		System.out.println("1. 커피");
		System.out.println("2. 음료");
		System.out.println("3. 디저트");
		System.out.println("4. 결제창");

		System.out.print("선택 : ");
	}

	// 결제선택
	public void purchaseStatus() {
		System.out.println("결제하기를 선택했습니다. ");
		System.out.println("\n결제를 확정하겠습니까? : y/n  [**e를 입력하면 모든 결제를 취소합니다]");
		System.out.println("선택 : ");
	}

	// 커피메뉴
	public void coffeeMenu() {
		CoffeeVO coffee = (CoffeeVO) set.coffeeSetup();
		System.out.println("'커피'카테고리의 메뉴를 선택합니다.\n");
		System.out.println("1. " + coffee.getEbEspresso() + " 가격 : " + coffee.getEspressoPrice());
		System.out.println("2. " + coffee.getAmericano() + " 가격 : " + coffee.getAmericanoPrice());
		System.out.println("3. " + coffee.getOriginalCoffee() + " 가격 : " + coffee.getOriginalCoffeePrice());
		System.out.println("4. " + coffee.getCondensedMilkLatte() + " 가격 : " + coffee.getCondensedMilkLattePrice());
		System.out.println("5. " + coffee.getCafeLatte() + " 가격 : " + coffee.getCafeLattePrice());
		System.out.println("6. " + coffee.getVanillaLatte() + " 가격 : " + coffee.getVanillaLattePrice());
		System.out.println("7. " + coffee.getCafeMocha() + " 가격 : " + coffee.getCafeMochaPrice());
		System.out.println("8. " + coffee.getcMacchiato() + " 가격 : " + coffee.getcMacchiato());
		System.out.println("9. " + coffee.getCoconutLatte() + " 가격 : " + coffee.getCoconutLattePrice());
		System.out.println(
				"10. " + coffee.getCoconutCoffeeSmoothie() + " 가격 : " + coffee.getCoconutCoffeeSmoothiePrice());
		System.out.println("11. " + coffee.getiCCafeLatte() + " 가격 : " + coffee.getiCCafeLattePrice());
		System.out.println("12. " + coffee.getiCVanillaLatte() + " 가격 : " + coffee.getiCVanillaLattePrice());
		System.out.println("13. " + coffee.getiCCafeMocha() + " 가격 : " + coffee.getiCCafeMochaPrice());
		System.out.println("14. " + coffee.getColdCBrew() + " 가격 : " + coffee.getColdCBrewPrice());
		System.out.println("15. " + coffee.getDecaffeColdCBrew() + " 가격 : " + coffee.getDecaffeColdCBrewPrice());
		System.out.println("16. " + coffee.getColdCBrewLatte() + " 가격 : " + coffee.getColdCBrewLattePrice());
		System.out.println(
				"17. " + coffee.getDecaffeColdCBrewLatte() + " 가격 : " + coffee.getDecaffeColdCBrewLattePrice());
		System.out.println("18. " + coffee.getColdCBrewCondensedMilkLatte() + " 가격 : "
				+ coffee.getColdCBrewCondensedMilkLattePrice());
		System.out.println(
				"19. " + coffee.getDecaffeCondensedMilkLatte() + " 가격 : " + coffee.getDecaffeCondensedMilkLattePrice());
		System.out.println(
				"20. " + coffee.getColdBrewBrownSugarLatte() + " 가격 : " + coffee.getColdBrewBrownSugarLattePrice());
		System.out.println(
				"21. " + coffee.getDecaffeBrownSugarLatte() + " 가격 : " + coffee.getDecaffeBrownSugarLattePrice());
		System.out.println("22. " + coffee.getAshatchu() + " 가격 : " + coffee.getAshatchuPrice());

		System.out.println("\n\n0. 메인으로 돌아가기");

		System.out.println("\n\n선택 : ");

	}

	// 음료 메뉴
	public void BeverageMenu() {
		BeverageVO beverage = set.beverageSetup();
		System.out.println("'음료'카테고리의 메뉴를 선택합니다.\n");
		System.out.println("1. " + beverage.getStrawberryLatte() + " 가격 : " + beverage.getStrawberryLattePrice());
		System.out.println("2. " + beverage.getChocolateLatte() + " 가격 : " + beverage.getChocolateLattePrice());
		System.out.println("3. " + beverage.getGreenTeaLatte() + " 가격 : " + beverage.getGreenTeaLattePrice());
		System.out.println("4. " + beverage.getMintChocoLatte() + " 가격 : " + beverage.getMintChocoLattePrice());
		System.out.println("5. " + beverage.getToffeeNutLatte() + " 가격 : " + beverage.getToffeeNutLattePrice());
		System.out.println("6. " + beverage.getSweetpotatoLatte() + " 가격 : " + beverage.getSweetpotatoLattePrice());
		System.out.println("7. " + beverage.getRiceFlourLatte() + " 가격 : " + beverage.getRiceFlourLattePrice());
		System.out.println("8. " + beverage.getMilkTea() + " 가격 : " + beverage.getMilkTeaPrice());
		System.out.println("9. " + beverage.getPeppermintTea() + " 가격 : " + beverage.getPeppermintTeaPrice());
		System.out
				.println("10. " + beverage.getGoldenChamomileTea() + " 가격 : " + beverage.getGoldenChamomileTeaPrice());
		System.out.println("11. " + beverage.getCalamansiTea() + " 가격 : " + beverage.getCalamansiTeaPrice());
		System.out.println("12. " + beverage.getSweetIceTea() + " 가격 : " + beverage.getSweetIceTeaPrice());
		System.out.println("13. " + beverage.getLemonTea() + " 가격 : " + beverage.getLemonTeaPrice());
		System.out.println("14. " + beverage.getLemonEarlGrayTea() + " 가격 : " + beverage.getLemonEarlGrayTeaPrice());
		System.out.println("15. " + beverage.getOrangeGrapefruitBlackTea() + " 가격 : "
				+ beverage.getOrangeGrapefruitBlackTeaPrice());
		System.out.println("16. " + beverage.getCitrusTea() + " 가격 : " + beverage.getCitrusTeaPrice());
		System.out.println("17. " + beverage.getGrapefruitTea() + " 가격 : " + beverage.getGrapefruitTeaPrice());
		System.out.println("18. " + beverage.getCherryCockCock() + " 가격 : " + beverage.getCherryCockCockPrice());
		System.out.println("19. " + beverage.getStrawberryAid() + " 가격 : " + beverage.getStrawberryAidPrice());
		System.out.println(
				"20. " + beverage.getLemonadeGreenGrapeAid() + " 가격 : " + beverage.getLemonadeGreenGrapeAidPrice());
		System.out.println("21. " + beverage.getCitronAid() + " 가격 : " + beverage.getCitronAidPrice());
		System.out.println("22. " + beverage.getGrapefruitAid() + " 가격 : " + beverage.getGrapefruitAidPrice());
		System.out.println("23. " + beverage.getGrapeJuice() + " 가격 : " + beverage.getGrapeJuicePrice());
		System.out.println("24. " + beverage.getWatermelonJuice() + " 가격 : " + beverage.getWatermelonJuicePrice());
		System.out.println("25. " + beverage.getStrawberryJuice() + " 가격 : " + beverage.getStrawberryJuicePrice());
		System.out.println("26. " + beverage.getMangojuice() + " 가격 : " + beverage.getMangojuicePrice());
		System.out.println("27. " + beverage.getPeachAid() + " 가격 : " + beverage.getPeachAidPrice());
		System.out.println("28. " + beverage.getMilkshake() + " 가격 : " + beverage.getMilkshakePrice());
		System.out.println(
				"29. " + beverage.getSweetpotatoSmoothie() + " 가격 : " + beverage.getSweetpotatoSmoothiePrice());
		System.out.println(
				"30. " + beverage.getBlueberryYogurtsmoothie() + " 가격 : " + beverage.getBlueberryYogurtsmoothiePrice());
		System.out.println(
				"31. " + beverage.getPlainYogurtSmoothie() + " 가격 : " + beverage.getPlainYogurtSmoothiePrice());
		System.out.println("32. " + beverage.getStrawberryYogurtSmoothie() + " 가격 : "
				+ beverage.getStrawberryYogurtSmoothiePrice());

		System.out.println("\n\n0. 메인으로 돌아가기");
		System.out.println("\n\n선택 : ");
	}

	// 디저트 메뉴
	public void Desert() {
		DesertVO desert = set.desertSetup();
		System.out.println("'디저트'카테고리의 메뉴를 선택합니다.\n");
		System.out.println("1. " + desert.getGongGongchippang() + " 가격 : " + desert.getGongGongchippang());
		System.out.println("2. " + desert.getGongGongchippangChoco() + " 가격 : " + desert.getGongGongchippangChoco());
		System.out.println("3. " + desert.getCreamisyu() + " 가격 : " + desert.getCreamisyuPrice());
		System.out.println("4. " + desert.getCreamisyuRedBean() + " 가격 : " + desert.getCreamisyuRedBeanPrice());
		System.out.println("5. " + desert.getSoftIceCream() + " 가격 : " + desert.getSoftIceCreamPrice());
		System.out
				.println("6. " + desert.getDalgonaCrunchIceCream() + " 가격 : " + desert.getDalgonaCrunchIceCreamPrice());
		System.out.println("7. " + desert.getPastryWaffles() + " 가격 : " + desert.getPastryWafflesPrice());
		System.out.println("8. " + desert.getMadelec() + " 가격 : " + desert.getMadelecPrice());
		System.out.println("9. " + desert.getSquareMuffinsChoco() + " 가격 : " + desert.getSquareMuffinsChocoPrice());
		System.out.println("10. " + desert.getSaladBread() + " 가격 : " + desert.getSaladBreadPrice());
		System.out.println("11. " + desert.getSausageBread() + " 가격 : " + desert.getSausageBreadPrice());
		System.out.println(
				"12. " + desert.getMacaronStrawberryCrunch() + " 가격 : " + desert.getMacaronStrawberryCrunchPrice());
		System.out.println(
				"13. " + desert.getMacaronChocolateCrunch() + " 가격 : " + desert.getMacaronChocolateCrunchPrice());
		System.out.println("14. " + desert.getMacaronMilk() + " 가격 : " + desert.getMacaronMilkPrice());
		System.out.println("\n\n0. 메인으로 돌아가기");
		System.out.println("\n\n선택 : ");

	}
}
