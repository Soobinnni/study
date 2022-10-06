import java.util.Scanner;

public class VendingMachine {
	
	//안녕 수빈아 자판기 만들기 힘내! 내 자판기는 죄다 품절 때리려고^~^ 

	public static void main(String[] args) {

		// 스캐너 변환
		Scanner input = new Scanner(System.in);

		// 상품명 변수 설정
		String cokeOriginal = "코카콜라"; // 코카콜라 변수
		String fantaOriginal = "환타"; // 환타 변수
		String cokeCherry = "콜라체리맛"; // 콜라체리맛 변수
		String fantaGrpae = "환타포도맛"; // 환타포도맛 변수
		String chilsungCider = "칠성사이다"; // 칠성사이다 변수
		String sprite = "스프라이트"; // 스프라이트 변수
		String cocopham = "코코팜"; // 코코팜 변수
		String jejuSamdasu = "제주삼다수"; // 제주삼다수 변수

		// 상품(가격) 변수 설정
		int cokeOriginalPrice = 1000; // 코카콜라 가격(1000)
		int fantaOriginalPrice = 800; // 환타 가격(800)
		int cokeCherryPrice = 1100; // 콜라 체리맛 가격(1100)
		int fantaGrpaePrice = 800; // 환타 포도맛 가격(800)
		int chilsungCiderPrice = 700; // 칠성사이다 가격(700)
		int spritePrice = 700; // 스프라이트 가격(700)
		int cocophamPrice = 600; // 코코팜 가격(600)
		int jejuSamdasuPrice = 300; // 제주삼다수 가격(300)

		// 입력받을 변수 설정(투입 가격, 상품번호)
		int inputMoney; // 사용자의 투입 금액
		int selectProductNumber; // 사용자가 선택한 상품의 번호
		int selectProductPrice = 0; // 사용자가 선택한 상품의 가격
		String selectProductName = ""; // 사용자가 선택한 상품의 이름

		// 사용자가 보는 자판기의 모습
		System.out.println("　　");
		System.out.println("　　　　　　　　　　★음료 자판기★");
		System.out.println("　　");
		System.out.println("　1. 코카콜라(1000원)\t2. 환타(800원)");
		System.out.println("　3. 콜라체리맛(1100원)\t4. 환타포도맛(800원)");
		System.out.println("　5. 칠성사이다(700원)\t6. 스프라이트(700원)");
		System.out.println("　7. 코코팜(600원)\t\t8. 제주삼다수(300원)");
		System.out.println("\n\n\n");

		// 사용자가 금액을 투입(사용자의 투입금액)
		System.out.println("금액을 투입하세요 : \n");
		inputMoney = input.nextInt();

		
		
		
		
		// 사용자가 투입한 금액을 기준으로 변수 결정
		// 조건식 : 투입금액>=300 T일 때 상품번호를 입력받는다. 
		if (inputMoney >= 300) {
			System.out.println("선택할 상품의 번호를 입력해주세요 : ");
			selectProductNumber = input.nextInt();	
			//상품번호(1~8)를 case를 활용해 선택번호의 값을 정해주고, 그 선택번호의 값이 각각 정해지면 선택번호에 따라 선택된 상품가격과 선택된 상품 이름의 값을 정함.
			switch (selectProductNumber) {
			case 1: //1번 : 코카콜라 가격, 코카콜라이름
				selectProductPrice = cokeOriginalPrice;
				selectProductName = cokeOriginal;
				if (inputMoney >= selectProductPrice) { //투입금액>=선택상품가격 true:선택상품, 잔금 배출 false:금액투입요구
					System.out.println("선택한 상품 " + selectProductName + " 가(이) 배출됐습니다.");
					System.out.println("잔금이 배출됩니다 : " + (inputMoney - selectProductPrice));
				} else {
					System.out.println(
							"선택한 상품의 가격보다 투입한 금액이 더 적습니다. 최소 " + (selectProductPrice - inputMoney) + "원 더 투입해주세요.");
				}
				break;
			case 2: //2번 : 환타가격, 환타이름
				selectProductPrice = fantaOriginalPrice;
				selectProductName = fantaOriginal;
				if (inputMoney >= selectProductPrice) {
					System.out.println("선택한 상품 " + selectProductName + " 가(이) 배출됐습니다.");
					System.out.println("잔금이 배출됩니다 : " + (inputMoney - selectProductPrice));
				} else {
					System.out.println(
							"선택한 상품의 가격보다 투입한 금액이 더 적습니다. 최소 " + (selectProductPrice - inputMoney) + "원 더 투입해주세요.");
				}
				break;
			case 3: //3번 : 콜라체리가격, 콜라체리이름
				selectProductPrice = cokeCherryPrice;
				selectProductName = cokeCherry;
				if (inputMoney >= selectProductPrice) {
					System.out.println("선택한 상품 " + selectProductName + " 가(이) 배출됐습니다.");
					System.out.println("잔금이 배출됩니다 : " + (inputMoney - selectProductPrice));
				} else {
					System.out.println(
							"선택한 상품의 가격보다 투입한 금액이 더 적습니다. 최소 " + (selectProductPrice - inputMoney) + "원 더 투입해주세요.");
				}
				break;
			case 4: //4번 환타포도가격, 환타포도이름
				selectProductPrice = fantaGrpaePrice;
				selectProductName = fantaGrpae;
				if (inputMoney >= selectProductPrice) {
					System.out.println("선택한 상품 " + selectProductName + " 가(이) 배출됐습니다.");
					System.out.println("잔금이 배출됩니다 : " + (inputMoney - selectProductPrice));
				} else {
					System.out.println(
							"선택한 상품의 가격보다 투입한 금액이 더 적습니다. 최소 " + (selectProductPrice - inputMoney) + "원 더 투입해주세요.");
				}
				break;
			case 5: //5번 칠성사이다가격, 칠성사이다 이름
				selectProductPrice = chilsungCiderPrice;
				selectProductName = chilsungCider;
				if (inputMoney >= selectProductPrice) {
					System.out.println("선택한 상품 " + selectProductName + " 가(이) 배출됐습니다.");
					System.out.println("잔금이 배출됩니다 : " + (inputMoney - selectProductPrice));
				} else {
					System.out.println(
							"선택한 상품의 가격보다 투입한 금액이 더 적습니다. 최소 " + (selectProductPrice - inputMoney) + "원 더 투입해주세요.");
				}
				break;
			case 6: //6번 스프라이트 가격, 스프라이트 이름
				selectProductPrice = spritePrice;
				selectProductName = sprite;
				if (inputMoney >= selectProductPrice) {
					System.out.println("선택한 상품 " + selectProductName + " 가(이) 배출됐습니다.");
					System.out.println("잔금이 배출됩니다 : " + (inputMoney - selectProductPrice));
				} else {
					System.out.println(
							"선택한 상품의 가격보다 투입한 금액이 더 적습니다. 최소 " + (selectProductPrice - inputMoney) + "원 더 투입해주세요.");
				}
				break;
			case 7: //7번 코코팜 가격, 코코팜이름
				selectProductPrice = cocophamPrice;
				selectProductName = cocopham;
				if (inputMoney >= selectProductPrice) {
					System.out.println("선택한 상품 " + selectProductName + " 가(이) 배출됐습니다.");
					System.out.println("잔금이 배출됩니다 : " + (inputMoney - selectProductPrice));
				} else {
					System.out.println(
							"선택한 상품의 가격보다 투입한 금액이 더 적습니다. 최소 " + (selectProductPrice - inputMoney) + "원 더 투입해주세요.");
				}
				break;
			case 8: //8번 제주삼다수 가격, 제주삼다수 이름
				selectProductPrice = jejuSamdasuPrice;
				selectProductName = jejuSamdasu;
				if (inputMoney >= selectProductPrice) {
					System.out.println("선택한 상품 " + selectProductName + " 가(이) 배출됐습니다.");
					System.out.println("잔금이 배출됩니다 : " + (inputMoney - selectProductPrice));
				} else {
					System.out.println(
							"선택한 상품의 가격보다 투입한 금액이 더 적습니다. 최소 " + (selectProductPrice - inputMoney) + "원 더 투입해주세요.");
				}
				break;
			default: //선택 번호가 1~8번 사이에서 입력되지 않은 경우의 출력
				System.out.println("선택한 번호는 없는 번호입니다.1에서 8까지의 번호를 입력해주세요.");
			}
		} else { // 조건식 : 투입금액>=300 F일 때
			System.out.println("금액을 더 투입해주세요. 최소 금액은 300원입니다.");
			System.out.println("잔금을 배출합니다 : "+inputMoney+"원");
		}

		/*
		 * if (inputMoney>=selectProductPrice) {
		 * System.out.println("선택한 상품 "+selectProductName+"이(가) 배출됐습니다.");
		 * System.out.println("잔금이 배출됩니다 : "+(inputMoney-selectProductPrice)); } else {
		 * System.out.println("선택한 상품의 가격보다 투입한 금액이 더 적습니다. 최소 "+(selectProductPrice-
		 * inputMoney)+"원 더 투입해주세요."); }
		 */

	}
}
