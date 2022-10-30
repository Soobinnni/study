
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import controller.*;
import view.*;
import vo.*;

public class CafeKiosk {

	// 선택번호
	static int select; // 선택하는 번호
	static int total = 0; // 총금액
	static String eatPack; // 영수증에 찍히는 글자(매장 or 식사)를 저장하는 변수
	static String iceHotOption; // 영수증에 찍히는 글자(ice or hot)를 저장하는 변수
	static int count; // 대기번호
	static String reset = ""; // 메인메뉴의 결제하기-y일 경우 반복합니다.

	static boolean returnWhile = true; // while문 통과를 위해 설정한 변수

	// SetupNameAndPrice에서 셋업한 메뉴이름과 가격을 담은 객체를 활용하기 위해 SetupNameAndPrice 객체를 생성한다.
	static SetUpNameAndPrice selectCBD = new SetUpNameAndPrice();

	// 고객이 주문한 메뉴를 저장하기 위해 VO 객체를 생성한다(새 VO에 기존에 설정한get들이 set으로 들어감).(그 객체의 메모리 주소에
	// 새로운
	// set작업을 진행).
	static CoffeeVO coffee = selectCBD.coffeeSetup(); // 커피주문리스트
	static BeverageVO beverage = selectCBD.beverageSetup(); // 음료주문리스트
	static DesertVO dessert = selectCBD.desertSetup(); // 디저트주문리스트

	// 고객저장 리스트. 위의 변수들을 활용하여 값을 set하며 각 주문리스트는 카테고리별로 저장된다.
	static List<CoffeeVO> coffeeOrderList = new ArrayList<>();
	static List<BeverageVO> beverageOrderList = new ArrayList<>();
	static List<DesertVO> desertOrderList = new ArrayList<>();

	// 각 가격들을 담는 arrayList
	static ArrayList<Integer> priceCoffee = new ArrayList<>(); // 커피가격
	static ArrayList<Integer> priceBeverage = new ArrayList<>();// 음료가격
	static ArrayList<Integer> priceDesert = new ArrayList<>();// 디저트 가격
	static ArrayList<Integer> priceTotal = new ArrayList<>(); // 모든 가격을 담는 정수 배열리스트

	// 스캐너
	static Scanner input = new Scanner(System.in);
	static Scanner input2 = new Scanner(System.in);

	// 메인뷰 객체
	static MainView mainView = new MainView();

	// 메인메서드
	public static void main(String[] args) {

		// 1. 포장과 매장식사를 묻는 화면
		do {
			try { // 정수가 아닌 다른 값의 예외처리
				packOrEatQ(); // 1.매장식사 2.포장식사 택
				select = input.nextInt();
				packOrEatSelect(); // 선택 switch
			} catch (Exception e) {
				System.out.println("잘못된 선택이 입력되었습니다.");
				return;
			}
		} while (!((select == SelectCategory.EAT) || (select == SelectCategory.PACK)));

		// 2. 메인 화면 ( 결제창 , 카테고리(커피,음료,디저트))
		do {
			orderHistory(); // 카테고리와 함께 주문리스트를 보여주는 메인화면의 구성.

			try {
				mainView.categorySelect(); // 1.커피 2.음료 3.디저트 4.결제하기
				select = input.nextInt(); // 사용자 입력
				if (!((select >= 1) && (select <= 4))) { // 범위 내 입력 안 하면 메인화면으로 돌아감.
					System.out.println("선택한 메뉴는 존재하지 않습니다.");
					continue;
				}
				switch (select) {
				case SelectCategory.PURCHASE: // 4. 결제하기 택.
					purchase(); // 구매를 확정할 것인지, 모든 것을 취소할 것인지를 택하는 메서드 호출
					if (!((reset.charAt(0) == 'n') || (reset.charAt(0) == 'N') || (reset.charAt(0) == 'y')
							|| (reset.charAt(0) == 'Y') || (reset.charAt(0) == 'x') || (reset.charAt(0) == 'X'))) {
						continue; // n,y,x가 아닐 경우 메인화면으로 돌아감.
					}
					break;
				case SelectCategory.COFFEE: // 1. 커피 택
					coffeeSubMenu(); // 커피 카테고리 메뉴를 보여주고 선택한 메뉴를 리스트에 저장하는 메소드
					if (select == SelectCategory.EXIT) { // 0번을 누르면 메인화면으로 돌아갑니다.
						System.out.println("메인화면으로 돌아갑니다.");
						continue;
					}
					if (!((select >= 1) && (select <= 22))) {
						System.out.println("선택한 메뉴는 존재하지 않습니다.");
						continue;
					} else {
						System.out.println("커피 카테고리 선택이 완료됐습니다.");
					}

					iceOrHotSelect(); // 카테고리 중 한 메뉴를 선택 한 후 옵션을 선택한다. hot/ice
					select = input2.nextInt();
					iceOrHotSwitch();
					break; // 스위치문을 나감
				case SelectCategory.BEVERAGE: // 2. 음료 택
					beverageSubMenu(); // 음료 카테고리 메뉴를 보여주고 선택한 메뉴를 리스트에 저장하는 메소드
					if (select == SelectCategory.EXIT) { // 0번을 누르면 메인화면으로 돌아갑니다.
						System.out.println("메인화면으로 돌아갑니다.");
						continue;
					}
					if (!((select >= 1) && (select <= 32))) {
						System.out.println("선택한 메뉴는 존재하지 않습니다.");
						continue;
					} else {
						System.out.println("음료 카테고리 선택이 완료됐습니다.");
					}

					iceOrHotSelect(); // 카테고리 중 한 메뉴를 선택 한 후 옵션을 선택한다. hot/ice
					select = input2.nextInt();
					iceOrHotSwitch();
					break;// 스위치문을 나감.
				case SelectCategory.DESERT: // 3. 디저트 택
					desertSubMenu(); // 디저트 카테고리 메뉴를 보여주고 선택한 메뉴를 리스트에 저장하는 메소드
					if (select == SelectCategory.EXIT) { // 0번을 누르면 메인화면으로 돌아갑니다.
						System.out.println("메인화면으로 돌아갑니다.");
						continue;
					}
					if (!((select >= 1) && (select <= 14))) {
						System.out.println("선택한 메뉴는 존재하지 않습니다.");
						continue;
					} else {
						System.out.println("디저트 카테고리 선택이 완료됐습니다.");
					}

					break; // 스위치문을 나감
				default:
					if (select == SelectCategory.EXIT) {
						continue;
					}
					System.out.println("오류! 선택하신 번호는 없는 번호입니다.\n"); // 1~4중 다른 번호를 택했을 때
				}

				// 위에 선택들을 기준으로 담은 주문리스트의 가격의 총합을 호출해 total에 담는다.
				// while문으로 반복됐을 떄 orderHistory가 total값을 가져감
				total = total();
				count++; // 주문번호
			} catch (Exception e) {
				System.out.println("잘못된 선택이 입력됐습니다.");
				if (select == SelectCategory.PURCHASE) {
					continue; // 아무것도 구매하지 않은 상태일 때 결제를 시도하면 메인화면으로 돌아감.
				}
				return;
			}

		} while (returnWhile == true);

		// 3. 영수증 출력
		receipt();

	}

	// 메인화면 전, 포장과 식사를 묻는 메서드
	public static void packOrEatQ() {
		System.out.println("포장 여부를 물어봅니다.");
		System.out.println("1. 매장식사");
		System.out.println("2. 포장");
		System.out.println("선택 : ");
	}

	// 포장과 식사를 선택하는 메서드
	public static void packOrEatSelect() {
		switch (select) {
		case SelectCategory.EAT:
			System.out.println("매장식사를 선택했습니다."); // 매장식사 택
			eatPack = "매장식사";
			break;
		case SelectCategory.PACK:
			System.out.println("포장을 선택했습니다."); // 포장 택
			eatPack = "포장";
			break;
		default:
			System.out.println("오류! 선택하신 번호는 없는 번호입니다.\n"); // 잘못된 번호를 입력했을 시
		}
	}

	// 4번 결제하기를 택했을 때 나타내는 메서드
	public static void purchase() {
		if ((coffeeOrderList.isEmpty()) && (beverageOrderList.isEmpty()) && (desertOrderList.isEmpty())) {
			System.out.println("결제할 수 있는 상품이 없습니다."); // 주문리스트가 비어져있을 때 나타나는 화면구성
		} else {
			mainView.purchaseStatus(); // 주문 결제의 확답을 얻음 y-결제하기 이동 n-주문을 계속 x-프로그램을 종료
			reset = input.next();
			switch (reset.charAt(0)) {
			case 'n':
			case 'N':
				break; // 주문을 계속하기 위해 switch문을 나가고 while의 반복으로 돌아감
			case 'e':
			case 'E':
				System.out.println("모든 결제를 취소합니다.");
				System.exit(1); // 프로그램 나가기
				break;
			case 'y':
			case 'Y':
				returnWhile = false; // false로 만들어 반복문 자체를 나가고 결제가 완료된다.
				break;
			default:
				System.out.println("잘못된 선택입니다.");
				break;
			}
		}
	}

	// 커피주문리스트를 담는 메서드
	public static void coffeeSubMenu() {
		mainView.coffeeMenu();// 커피 메뉴를 보여준다.
		select = input.nextInt(); // 메뉴에 따라 선택번호를 입력한다.
		CoffeeVO coffeeOrder = new CoffeeVO(); // 손님이 주문한 상품명과 가격을 저장하는 객체

		// 손님이 담는 메뉴에 따라 나누고, 선택 메뉴를 저장한다.
		// 각 스위치문의 case들은 첫번째 controller에서 값을 get하여 리스트에 set한다(상품명과 가격).
		// 두 번째 가격만 따로 integer배열리스트로 저장하여 나중에 총합 계산에 사용한다.
		if (select == SelectCategory.EXIT) { // 0번을 누르면 메서드를 탈출하며, 호출된 장소에서는 continue로 해당 반복을 쉬고 상단으로 이동
			return;
		} else if (!((select >= 1) && (select <= 22))) {
			return; // 범위에 없는 번호는 메인화면으로 돌아가게 만든다.
		}
		switch (select) {
		case SelectCategory.espresso: // 더블에스프레소
			// set해두었던(get) SetUpNameAndPrice의 상품명과 가격을 coffeeOrder에 set함
			coffeeOrder.setEbEspresso(coffee.getEbEspresso());
			coffeeOrder.setEspressoPrice(coffee.getEspressoPrice());
			priceCoffee.add(coffeeOrder.getEspressoPrice());
			break;
		case SelectCategory.americano: // 아메리카노
			coffeeOrder.setAmericano(coffee.getAmericano());
			coffeeOrder.setAmericanoPrice(coffee.getAmericanoPrice());
			priceCoffee.add(coffeeOrder.getAmericanoPrice());
			break;
		case SelectCategory.originalCoffee: // 원조커피
			coffeeOrder.setOriginalCoffee(coffee.getOriginalCoffee());
			coffeeOrder.setOriginalCoffeePrice(coffee.getOriginalCoffeePrice());
			priceCoffee.add(coffeeOrder.getOriginalCoffeePrice());
			break;
		case SelectCategory.condensedMilkLatte:// 연유라떼
			coffeeOrder.setCondensedMilkLatte(coffee.getCondensedMilkLatte());
			coffeeOrder.setCondensedMilkLattePrice(coffee.getCondensedMilkLattePrice());
			priceCoffee.add(coffeeOrder.getCondensedMilkLattePrice());
			break;
		case SelectCategory.cafeLatte:// 카페라떼
			coffeeOrder.setCafeLatte(coffee.getCafeLatte());
			coffeeOrder.setCafeLattePrice(coffee.getCafeLattePrice());
			priceCoffee.add(coffeeOrder.getCafeLattePrice());
			break;
		case SelectCategory.vanillaLatte:// 바닐라라뗴
			coffeeOrder.setVanillaLatte(coffee.getVanillaLatte());
			coffeeOrder.setVanillaLattePrice(coffee.getVanillaLattePrice());
			priceCoffee.add(coffeeOrder.getVanillaLattePrice());
			break;
		case SelectCategory.cafeMocha:// 카페모카
			coffeeOrder.setCafeMocha(coffee.getCafeMocha());
			coffeeOrder.setCafeMochaPrice(coffee.getCafeMochaPrice());
			priceCoffee.add(coffeeOrder.getCafeMochaPrice());
			break;
		case SelectCategory.cMacchiato: // 카라멜마키아또
			coffeeOrder.setcMacchiato(coffee.getcMacchiato());
			coffeeOrder.setcMacchiatoPrice(coffee.getcMacchiatoPrice());
			priceCoffee.add(coffeeOrder.getcMacchiatoPrice());
			break;
		case SelectCategory.coconutLatte:// 코코넛라떼
			coffeeOrder.setCoconutLatte(coffee.getCoconutLatte());
			coffeeOrder.setCoconutLattePrice(coffee.getCoconutLattePrice());
			priceCoffee.add(coffeeOrder.getCoconutLattePrice());
			break;
		case SelectCategory.coconutCoffeeSmoothie:// 코코넛커피스무디
			coffeeOrder.setCoconutCoffeeSmoothie(coffee.getCoconutCoffeeSmoothie());
			coffeeOrder.setCoconutCoffeeSmoothiePrice(coffee.getCoconutCoffeeSmoothiePrice());
			priceCoffee.add(coffeeOrder.getCoconutCoffeeSmoothiePrice());
			break;
		case SelectCategory.iCCafeLatte:// 아이스크림 카페라떼
			coffeeOrder.setiCCafeLatte(coffee.getiCCafeLatte());
			coffeeOrder.setiCCafeLattePrice(coffee.getiCCafeLattePrice());
			priceCoffee.add(coffeeOrder.getiCCafeLattePrice());
			break;
		case SelectCategory.iCVanillaLatte:// 아이스바닐라라떼
			coffeeOrder.setiCVanillaLatte(coffee.getiCVanillaLatte());
			coffeeOrder.setiCVanillaLattePrice(coffee.getiCVanillaLattePrice());
			priceCoffee.add(coffeeOrder.getiCVanillaLattePrice());
			break;
		case SelectCategory.iCCafeMocha: // 아이스크림 카페모카
			coffeeOrder.setiCCafeMocha(coffee.getiCCafeMocha());
			coffeeOrder.setiCCafeMochaPrice(coffee.getiCCafeMochaPrice());
			priceCoffee.add(coffeeOrder.getiCCafeMochaPrice());
			break;
		case SelectCategory.coldCBrew:// 콜드브루
			coffeeOrder.setColdCBrew(coffee.getColdCBrew());
			coffeeOrder.setColdCBrewPrice(coffee.getColdCBrewPrice());
			priceCoffee.add(coffeeOrder.getColdCBrewPrice());
			break;
		case SelectCategory.decaffeColdCBrew:// 디카페인콜드브루
			coffeeOrder.setDecaffeColdCBrew(coffee.getDecaffeColdCBrew());
			coffeeOrder.setDecaffeColdCBrewPrice(coffee.getDecaffeColdCBrewPrice());
			priceCoffee.add(coffeeOrder.getDecaffeColdCBrewPrice());
			break;
		case SelectCategory.coldCBrewLatte:// 콜드브루연유라떼
			coffeeOrder.setColdCBrewLatte(coffee.getColdCBrewLatte());
			coffeeOrder.setColdCBrewLattePrice(coffee.getColdCBrewLattePrice());
			priceCoffee.add(coffeeOrder.getColdCBrewLattePrice());
			break;
		case SelectCategory.decaffeColdCBrewLatte:// 디카페인콜드브루연유라떼
			coffeeOrder.setDecaffeColdCBrewLatte(coffee.getDecaffeColdCBrewLatte());
			coffeeOrder.setDecaffeColdCBrewLattePrice(coffee.getDecaffeColdCBrewLattePrice());
			priceCoffee.add(coffeeOrder.getDecaffeColdCBrewLattePrice());
			break;
		case SelectCategory.coldCBrewCondensedMilkLatte:// 디카페인콜드브루 흑당라뗴
			coffeeOrder.setColdCBrewCondensedMilkLatte(coffee.getColdCBrewCondensedMilkLatte());
			coffeeOrder.setColdCBrewCondensedMilkLattePrice(coffee.getColdCBrewCondensedMilkLattePrice());
			priceCoffee.add(coffeeOrder.getColdCBrewCondensedMilkLattePrice());
			break;
		case SelectCategory.decaffeCondensedMilkLatte:// 콜드브루연유라떼
			coffeeOrder.setDecaffeCondensedMilkLatte(coffee.getDecaffeCondensedMilkLatte());
			coffeeOrder.setDecaffeCondensedMilkLattePrice(coffee.getDecaffeCondensedMilkLattePrice());
			priceCoffee.add(coffeeOrder.getDecaffeCondensedMilkLattePrice());
			break;
		case SelectCategory.coldBrewBrownSugarLatte: // 콜드브루 흑당라뗴
			coffeeOrder.setColdBrewBrownSugarLatte(coffee.getColdBrewBrownSugarLatte());
			coffeeOrder.setColdBrewBrownSugarLattePrice(coffee.getColdBrewBrownSugarLattePrice());
			priceCoffee.add(coffeeOrder.getColdBrewBrownSugarLattePrice());
			break;
		case SelectCategory.decaffeBrownSugarLatte:// 디카페인 콜드브루 흑당라떼
			coffeeOrder.setDecaffeBrownSugarLatte(coffee.getDecaffeBrownSugarLatte());
			coffeeOrder.setDecaffeBrownSugarLattePrice(coffee.getDecaffeBrownSugarLattePrice());
			priceCoffee.add(coffeeOrder.getDecaffeBrownSugarLattePrice());
			break;
		case SelectCategory.ashatchu:// 아샷추
			coffeeOrder.setAshatchu(coffee.getAshatchu());
			coffeeOrder.setAshatchuPrice(coffee.getAshatchuPrice());
			priceCoffee.add(coffeeOrder.getAshatchuPrice());
			break;
		default:
			System.out.println("선택한 메뉴는 존재하지 않습니다."); // 예외번호 입력시

		}
		coffeeOrderList.add(coffeeOrder); // 선택된 주문리스트를 담는다.

	}

	// coffeeSubMenu()메서드와 같이 beverageSubMenu()도 손님의 주문리스트를 담고 가격만 따로 배열리스트에 저장한다.
	public static void beverageSubMenu() {
		mainView.BeverageMenu();// 음료 메뉴를 보여준다.

		select = input.nextInt(); // 메뉴에 따라 선택번호를 입력한다.
		BeverageVO beverageOrder = new BeverageVO(); // 손님이 주문한 상품명과 가격을 저장하는 객체

		if (select == SelectCategory.EXIT) { // 0번을 누르면 메서드를 탈출하며, 호출된 장소에서는 continue로 해당 반복을 쉬고 상단으로 이동
			return;
		} else if (!((select >= 1) && (select <= 32))) {
			return; // 범위에 없는 번호는 메인화면으로 돌아가게 만든다.
		}

		// 손님이 담는 메뉴에 따라 나누고, 선택 메뉴를 저장한다.
		switch (select) {
		case SelectCategory.strawberryLatte:// 딸기라떼
			beverageOrder.setStrawberryLatte(beverage.getStrawberryLatte());
			beverageOrder.setStrawberryLattePrice(beverage.getStrawberryLattePrice());
			priceBeverage.add(beverageOrder.getStrawberryLattePrice());
			break;
		case SelectCategory.chocolateLatte:// 초코라떼
			beverageOrder.setChocolateLatte(beverage.getChocolateLatte());
			beverageOrder.setChocolateLattePrice(beverage.getChocolateLattePrice());
			priceBeverage.add(beverageOrder.getChocolateLattePrice());
			break;
		case SelectCategory.greenTeaLatte:// 녹차라떼
			beverageOrder.setGreenTeaLatte(beverage.getGreenTeaLatte());
			beverageOrder.setGreenTeaLattePrice(beverage.getGreenTeaLattePrice());
			priceBeverage.add(beverageOrder.getGreenTeaLattePrice());
			break;
		case SelectCategory.mintChocoLatte:// 민트초코라떼
			beverageOrder.setMintChocoLatte(beverage.getMintChocoLatte());
			beverageOrder.setMintChocoLattePrice(beverage.getMintChocoLattePrice());
			priceBeverage.add(beverageOrder.getMintChocoLattePrice());
			break;
		case SelectCategory.toffeeNutLatte:// 토피넛라떼
			beverageOrder.setToffeeNutLatte(beverage.getToffeeNutLatte());
			beverageOrder.setToffeeNutLattePrice(beverage.getToffeeNutLattePrice());
			priceBeverage.add(beverageOrder.getToffeeNutLattePrice());
			break;
		case SelectCategory.sweetpotatoLatte:// 고구마라떼
			beverageOrder.setSweetpotatoLatte(beverage.getSweetpotatoLatte());
			beverageOrder.setSweetpotatoLattePrice(beverage.getSweetpotatoLattePrice());
			priceBeverage.add(beverageOrder.getSweetpotatoLattePrice());
			break;
		case SelectCategory.riceFlourLatte:// 미숫가루라떼
			beverageOrder.setRiceFlourLatte(beverage.getRiceFlourLatte());
			beverageOrder.setRiceFlourLattePrice(beverage.getRiceFlourLattePrice());
			priceBeverage.add(beverageOrder.getRiceFlourLattePrice());
			break;
		case SelectCategory.milkTea:// 밀크티
			beverageOrder.setMilkTea(beverage.getMilkTea());
			beverageOrder.setMilkTeaPrice(beverage.getMilkTeaPrice());
			priceBeverage.add(beverageOrder.getMilkTeaPrice());
			break;
		case SelectCategory.peppermintTea:// 페퍼민트티
			beverageOrder.setPeppermintTea(beverage.getPeppermintTea());
			beverageOrder.setPeppermintTeaPrice(beverage.getPeppermintTeaPrice());
			priceBeverage.add(beverageOrder.getPeppermintTeaPrice());
			break;
		case SelectCategory.GoldenChamomileTea:// 황금캐모마일티
			beverageOrder.setGoldenChamomileTea(beverage.getGoldenChamomileTea());
			beverageOrder.setGoldenChamomileTeaPrice(beverage.getGoldenChamomileTeaPrice());
			priceBeverage.add(beverageOrder.getGoldenChamomileTeaPrice());
			break;
		case SelectCategory.calamansiTea:// 깔라만시티
			beverageOrder.setCalamansiTea(beverage.getCalamansiTea());
			beverageOrder.setCalamansiTeaPrice(beverage.getCalamansiTeaPrice());
			priceBeverage.add(beverageOrder.getCalamansiTeaPrice());
			break;
		case SelectCategory.SweetIceTea:// 달콤아이스티
			beverageOrder.setSweetIceTea(beverage.getSweetIceTea());
			beverageOrder.setSweetIceTeaPrice(beverage.getSweetIceTeaPrice());
			priceBeverage.add(beverageOrder.getSweetIceTeaPrice());
			break;
		case SelectCategory.lemonTea:// 레몬티
			beverageOrder.setLemonTea(beverage.getLemonTea());
			beverageOrder.setLemonTeaPrice(beverage.getLemonTeaPrice());
			priceBeverage.add(beverageOrder.getLemonTeaPrice());
			break;
		case SelectCategory.lemonEarlGrayTea:// 레몬얼그레이티
			beverageOrder.setLemonEarlGrayTea(beverage.getLemonEarlGrayTea());
			beverageOrder.setLemonEarlGrayTeaPrice(beverage.getLemonEarlGrayTeaPrice());
			priceBeverage.add(beverageOrder.getLemonEarlGrayTeaPrice());
			break;
		case SelectCategory.orangeGrapefruitBlackTea:// 오렌지자몽블랙티
			beverageOrder.setOrangeGrapefruitBlackTea(beverage.getOrangeGrapefruitBlackTea());
			beverageOrder.setOrangeGrapefruitBlackTeaPrice(beverage.getOrangeGrapefruitBlackTeaPrice());
			priceBeverage.add(beverageOrder.getOrangeGrapefruitBlackTeaPrice());
			break;
		case SelectCategory.citrusTea:// 유자티
			beverageOrder.setCitrusTea(beverage.getCitrusTea());
			beverageOrder.setCitrusTeaPrice(beverage.getCitrusTeaPrice());
			priceBeverage.add(beverageOrder.getCitrusTeaPrice());
			break;
		case SelectCategory.grapefruitTea:// 자몽티
			beverageOrder.setGrapefruitTea(beverage.getGrapefruitTea());
			beverageOrder.setGrapefruitTeaPrice(beverage.getGrapefruitTeaPrice());
			priceBeverage.add(beverageOrder.getGrapefruitTeaPrice());
			break;
		case SelectCategory.cherryCockCock:// 체리콕콕
			beverageOrder.setCherryCockCock(beverage.getCherryCockCock());
			beverageOrder.setCherryCockCockPrice(beverage.getCherryCockCockPrice());
			priceBeverage.add(beverageOrder.getCherryCockCockPrice());
			break;
		case SelectCategory.strawberryAid:// 딸기에이드
			beverageOrder.setStrawberryAid(beverage.getStrawberryAid());
			beverageOrder.setStrawberryAidPrice(beverage.getStrawberryAidPrice());
			priceBeverage.add(beverageOrder.getStrawberryAidPrice());
			break;
		case SelectCategory.lemonadeGreenGrapeAid:// 레몬에이드
			beverageOrder.setLemonadeGreenGrapeAid(beverage.getLemonadeGreenGrapeAid());
			beverageOrder.setLemonadeGreenGrapeAidPrice(beverage.getLemonadeGreenGrapeAidPrice());
			priceBeverage.add(beverageOrder.getLemonadeGreenGrapeAidPrice());
			break;
		case SelectCategory.citronAid:// 유자에이드
			beverageOrder.setCitronAid(beverage.getCitronAid());
			beverageOrder.setCitronAidPrice(beverage.getCitronAidPrice());
			priceBeverage.add(beverageOrder.getCitronAidPrice());
			break;
		case SelectCategory.grapefruitAid:// 청포도에이드
			beverageOrder.setGrapefruitAid(beverage.getGrapefruitAid());
			beverageOrder.setGrapefruitAidPrice(beverage.getGrapefruitAidPrice());
			priceBeverage.add(beverageOrder.getGrapefruitAidPrice());
			break;
		case SelectCategory.grapeJuice:// 우리포도주스
			beverageOrder.setGrapeJuice(beverage.getGrapeJuice());
			beverageOrder.setGrapeJuicePrice(beverage.getGrapeJuicePrice());
			priceBeverage.add(beverageOrder.getGrapeJuicePrice());
			break;
		case SelectCategory.watermelonJuice:// 완전수박주스
			beverageOrder.setWatermelonJuice(beverage.getWatermelonJuice());
			beverageOrder.setWatermelonJuicePrice(beverage.getWatermelonJuicePrice());
			priceBeverage.add(beverageOrder.getWatermelonJuicePrice());
			break;
		case SelectCategory.strawberryJuice:// 완전딸기주스
			beverageOrder.setStrawberryJuice(beverage.getStrawberryJuice());
			beverageOrder.setStrawberryJuicePrice(beverage.getStrawberryJuicePrice());
			priceBeverage.add(beverageOrder.getStrawberryJuicePrice());
			break;
		case SelectCategory.mangojuice:// 완전망고주스
			beverageOrder.setMangojuice(beverage.getMangojuice());
			beverageOrder.setMangojuicePrice(beverage.getMangojuicePrice());
			priceBeverage.add(beverageOrder.getMangojuicePrice());
			break;
		case SelectCategory.peachAid:// 복숭아에이드
			beverageOrder.setPeachAid(beverage.getPeachAid());
			beverageOrder.setPeachAidPrice(beverage.getPeachAidPrice());
			priceBeverage.add(beverageOrder.getPeachAidPrice());
			break;
		case SelectCategory.milkshake:// 밀크쉐이크
			beverageOrder.setMilkshake(beverage.getMilkshake());
			beverageOrder.setMilkshakePrice(beverage.getMilkshakePrice());
			priceBeverage.add(beverageOrder.getMilkshakePrice());
			break;
		case SelectCategory.sweetpotatoSmoothie:// 고구마스무디
			beverageOrder.setSweetpotatoSmoothie(beverage.getSweetpotatoSmoothie());
			beverageOrder.setSweetpotatoSmoothiePrice(beverage.getSweetpotatoSmoothiePrice());
			priceBeverage.add(beverageOrder.getSweetpotatoSmoothiePrice());
			break;
		case SelectCategory.blueberryYogurtsmoothie:// 블루베리요거트스무디
			beverageOrder.setBlueberryYogurtsmoothie(beverage.getBlueberryYogurtsmoothie());
			beverageOrder.setBlueberryYogurtsmoothiePrice(beverage.getBlueberryYogurtsmoothiePrice());
			priceBeverage.add(beverageOrder.getBlueberryYogurtsmoothiePrice());
			break;
		case SelectCategory.plainYogurtSmoothie:// 플레인요거트스무디
			beverageOrder.setPlainYogurtSmoothie(beverage.getPlainYogurtSmoothie());
			beverageOrder.setPlainYogurtSmoothiePrice(beverage.getPlainYogurtSmoothiePrice());
			priceBeverage.add(beverageOrder.getPlainYogurtSmoothiePrice());
			break;
		case SelectCategory.strawberryYogurtSmoothie:// 딸기요거트스무디
			beverageOrder.setStrawberryYogurtSmoothie(beverage.getStrawberryYogurtSmoothie());
			beverageOrder.setStrawberryYogurtSmoothiePrice(beverage.getStrawberryYogurtSmoothiePrice());
			priceBeverage.add(beverageOrder.getStrawberryYogurtSmoothiePrice());
			break;
		}
		beverageOrderList.add(beverageOrder); // 주문내역을 담는다.

	}

	// coffeeSubMenu()메서드와 같이 desertSubMenu()도 손님의 주문리스트를 담고 가격만 따로 배열리스트에 저장한다.
	public static void desertSubMenu() {
		mainView.Desert();// 음료 메뉴를 보여준다.
		select = input.nextInt();// 메뉴에 따라 선택번호를 입력한다.
		DesertVO dessertOrder = new DesertVO(); // 손님이 주문한 상품명과 가격을 저장하는 객체

		if (select == SelectCategory.EXIT) { // 0번을 누르면 메서드를 탈출하며, 호출된 장소에서는 continue로 해당 반복을 쉬고 상단으로 이동
			return;
		} else if (!((select >= 1) && (select <= 14))) {
			return; // 범위에 없는 번호는 메인화면으로 돌아가게 만든다.
		}
		// 손님이 담는 메뉴에 따라 나누고, 선택 메뉴를 저장한다.
		switch (select) {
		case SelectCategory.gongGongchippang:// 공공치빵
			dessertOrder.setGongGongchippang(dessert.getGongGongchippang());
			dessertOrder.setGongGongchippangPrice(dessert.getGongGongchippangPrice());
			priceDesert.add(dessertOrder.getGongGongchippangPrice());
			break;
		case SelectCategory.gongGongchippangChoco:// 공공치빵초코
			dessertOrder.setGongGongchippangChoco(dessert.getGongGongchippangChoco());
			dessertOrder.setGongGongchippangChocoPrice(dessert.getGongGongchippangChocoPrice());
			priceDesert.add(dessertOrder.getGongGongchippangChocoPrice());
			break;
		case SelectCategory.creamisyu:// 크리미슈
			dessertOrder.setCreamisyu(dessert.getCreamisyu());
			dessertOrder.setCreamisyuPrice(dessert.getCreamisyuPrice());
			priceDesert.add(dessertOrder.getCreamisyuPrice());
			break;
		case SelectCategory.creamisyuRedBean:// 크리미슈단팥빵
			dessertOrder.setCreamisyuRedBean(dessert.getCreamisyuRedBean());
			dessertOrder.setCreamisyuRedBeanPrice(dessert.getCreamisyuRedBeanPrice());
			priceDesert.add(dessertOrder.getCreamisyuRedBeanPrice());
			break;
		case SelectCategory.softIceCream:// 노말한 소프트(아이스크림)
			dessertOrder.setSoftIceCream(dessert.getSoftIceCream());
			dessertOrder.setSoftIceCreamPrice(dessert.getSoftIceCreamPrice());
			priceDesert.add(dessertOrder.getSoftIceCreamPrice());
			break;
		case SelectCategory.dalgonaCrunchIceCream:// 노말한 소프트(아이스크림)
			dessertOrder.setDalgonaCrunchIceCream(dessert.getDalgonaCrunchIceCream());
			dessertOrder.setDalgonaCrunchIceCreamPrice(dessert.getDalgonaCrunchIceCreamPrice());
			priceDesert.add(dessertOrder.getDalgonaCrunchIceCreamPrice());
			break;
		case SelectCategory.pastryWaffles:// 긴 페스추리와플
			dessertOrder.setPastryWaffles(dessert.getPastryWaffles());
			dessertOrder.setPastryWafflesPrice(dessert.getPastryWafflesPrice());
			priceDesert.add(dessertOrder.getPastryWafflesPrice());
			break;
		case SelectCategory.madelec:// 큰마들렌
			dessertOrder.setMadelec(dessert.getMadelec());
			dessertOrder.setMadelecPrice(dessert.getMadelecPrice());
			priceDesert.add(dessertOrder.getMadelecPrice());
			break;
		case SelectCategory.squareMuffinsChoco:// 네모머핀 초코
			dessertOrder.setSquareMuffinsChoco(dessert.getSquareMuffinsChoco());
			dessertOrder.setSquareMuffinsChocoPrice(dessert.getSquareMuffinsChocoPrice());
			priceDesert.add(dessertOrder.getSquareMuffinsChocoPrice());
			break;
		case SelectCategory.saladBread:// 사라다빵
			dessertOrder.setSaladBread(dessert.getSaladBread());
			dessertOrder.setSaladBreadPrice(dessert.getSaladBreadPrice());
			priceDesert.add(dessertOrder.getSaladBreadPrice());
			break;
		case SelectCategory.sausageBread:// 소시지빵
			dessertOrder.setSausageBread(dessert.getSausageBread());
			dessertOrder.setSausageBreadPrice(dessert.getSausageBreadPrice());
			priceDesert.add(dessertOrder.getSausageBreadPrice());
			break;
		case SelectCategory.macaronStrawberryCrunch:// 맛카롱딸기크런치
			dessertOrder.setMacaronStrawberryCrunch(dessert.getMacaronStrawberryCrunch());
			dessertOrder.setMacaronStrawberryCrunchPrice(dessert.getMacaronStrawberryCrunchPrice());
			priceDesert.add(dessertOrder.getMacaronStrawberryCrunchPrice());
			break;
		case SelectCategory.macaronChocolateCrunch:// 맛카롱초코크런치
			dessertOrder.setMacaronChocolateCrunch(dessert.getMacaronChocolateCrunch());
			dessertOrder.setMacaronChocolateCrunchPrice(dessert.getMacaronChocolateCrunchPrice());
			priceDesert.add(dessertOrder.getMacaronChocolateCrunchPrice());
			break;
		case SelectCategory.macaronMilk:// 맛카롱 순우유
			dessertOrder.setMacaronMilk(dessert.getMacaronMilk());
			dessertOrder.setMacaronMilkPrice(dessert.getMacaronMilkPrice());
			priceDesert.add(dessertOrder.getMacaronMilkPrice());
			break;

		}
		desertOrderList.add(dessertOrder); // 주문 내역을 담는다.
	}

	// 커피와 음료의 경우 ice or hot의 옵션을 선택한다.
	public static void iceOrHotSelect() {
		System.out.println("\n 옵션을 선택합니다.");
		System.out.println("1. ice");
		System.out.println("2. hot");

		System.out.println("선택 : ");
	}

	// ice와 hot을 선택하는 메서드
	public static void iceOrHotSwitch() {
		switch (select) {
		case SelectCategory.ICE: // 1번 아이스
			iceHotOption = "ice";
			break;
		case SelectCategory.HOT: // 2번 아이스
			iceHotOption = "hot";
			break;
		default:
			System.out.println("오류! 선택하신 번호는 없는 번호입니다.\n");
		}
	}

	// 주문내역을 보여준다.
	public static void orderHistory() {
		System.out.println("\n\n--------------------------주문내역--------------------------");
		System.out.println("\t선택상품\t\t가격\t");
		if ((coffeeOrderList.isEmpty()) && (beverageOrderList.isEmpty()) && (desertOrderList.isEmpty())) {
			// 주문내역이 없을 때 나타나는 메인화면의 구성
			System.out.println("아직 선택한 상품이 없습니다.");
			System.out.println("----------------------------------------------------------");

		} else {// 주문리스트가 채워져있을 때만 나타나는 메인화면의 구성
			listCoffee();// 커피 상품목록

			listBeverage();// 음료 상품목록

			listDesert(); // 디저트 상품목록
			System.out.println("\n총 결제 금액 : " + total + "원");
			System.out.println("---------------------------------------------------------");
		}

	}

	// 주문한 가격을 카테고리별로 담았었다. 그것을 하나의 배열리스트에 담은 뒤, iterator를 생성하고 하나씩 값을 꺼냈다.
	// 그리고 integer를 언박싱하여 int a에 담고 b에 가격들의 총합을 담았다.
	public static int total() {
		// 반복문을 통해서 주문이 다시 담기면, 담기는 값이 중복되므로 호출될 떄 초기화가 되도록 설정한다.
		total = 0;
		priceTotal.removeAll(priceTotal);
		// 주문리스트와 함께 메인화면을 구성하는 카테고리 선택지
		priceTotal.addAll(priceCoffee); // priceTotal에 주문커피가격을 담는다.
		priceTotal.addAll(priceBeverage);// priceTotal에 주문음료가격을 담는다.
		priceTotal.addAll(priceDesert);// priceTotal에 주문디저트가격을 담는다.
		int b = 0;
		Iterator<Integer> total = priceTotal.iterator();// 반복기
		while (total.hasNext()) {
			Integer integer = (Integer) total.next(); // 반복기로 리스트의 원소를 하나씩 꺼낸다.
			int a = integer.intValue(); // 정수화

			b = a + b; // b가 가격의 총합이 되어준다.

		}
		return b;
	}

	// 주문한 커피 목록
	public static void listCoffee() {
		// 반복기를 형성해서 객체들을 꺼내온다.
		Iterator<CoffeeVO> itr = coffeeOrderList.iterator();

		while (itr.hasNext()) {
			CoffeeVO order = (CoffeeVO) itr.next();
			// toString 값을 출력한다.
			if (order == null) {
				System.out.println(order); // CoffeeVO의 toString 호출 order가 null이면 null
			} else { // 커피는 옵션이 존재합니다.
				System.out.println("\t" + order + "\n\t└옵션 : " + iceHotOption);// CoffeeVO의 toString 호출
			}
		}
	}

	// 주문한 음료 목록
	public static void listBeverage() {
		Iterator<BeverageVO> itr = beverageOrderList.iterator();
		// 반복기를 형성해서 객체들을 꺼내온다.
		while (itr.hasNext()) {
			BeverageVO order = (BeverageVO) itr.next();
			// toString 값을 출력한다.
			if (order == null) {
				System.out.println(order);// BeverageVO의 toString 호출 order가 null이면 null
			} else { // 음료는 옵션이 존재합니다.
				System.out.println("\t" + order + "\n\t└옵션 : " + iceHotOption);// BeverageVO의 toString 호출
			}

		}
	}

	// 주문한 디저트 목록
	public static void listDesert() {
		// 반복기를 형성해서 객체들을 꺼내온다.
		Iterator<DesertVO> itr = desertOrderList.iterator();

		while (itr.hasNext()) {
			// toString 값을 출력한다.
			DesertVO order = (DesertVO) itr.next();
			System.out.println("\t" + order);// DesertVO의 toString 호출
		}
	}

	// 영수증 출력 메서드
	public static void receipt() {
		// 현재 날짜 시각을 포맷
		SimpleDateFormat f = new SimpleDateFormat("yyyy년 MM월 dd일 h시 m분 s초");
		String date = f.format(new Date());

		System.out.println("결제가 완료됐습니다 :)~!");
		System.out.println("\n\n\n【       영           수           증       】");
		System.out.println("   \n[대기번호]" + count);
		System.out.println("\n빽다방-왕십리점" + "\t" + date);
		System.out.println("TEL : 010-1234-5678    관리자 : 김수빈");
		System.out.println("서울특별시 가나다라길 1234길 마바사아자빌딩 123호");
		System.out.println("-------------------------------------------");
		System.out.println();
		listCoffee();// 커피 상품목록
		listBeverage();// 음료 상품목록
		listDesert(); // 디저트 상품목록

		System.out.println("\n\t└옵션 <매장 / 포장> : " + eatPack);
		System.out.println("\n-------------------------------------------");

		System.out.println("\n부가세 과세 물품가액 : " + total + "원");
		System.out.println("부    가    세  : " + (int) (total * 0.1) + "원"); // 부가세 계산 = 총액*0.1
		System.out.println("-------------------------------------------");
		System.out.println("-------------------------------------------");
		System.out.println("\n결제수단 : 카드 결제");
		System.out.println("\n합         계  :  " + total + "원");

	}
}
