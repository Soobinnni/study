package methodMakingUnderstandingIncrease;

import java.util.Scanner;

public class Receipt {

	public static void main(String[] args) {
		// 상품가격, 지불금액, 거스름돈, 부가세를 나타내는 영수증을 출력하는 프로그램

		// 변수 설정
		int price = 0; // 상품의 총액
		int money = 0; // 받은 돈(고객이 지불한 금액)
		int addMoney = 0; // 추가 지불금액

		String yesOrNo = "";
		String reset;

		// 상품가격과 지불금액을 입력받기 위한 스캐너
		Scanner input = new Scanner(System.in);
		Scanner inputReset = new Scanner(System.in);

		// 상품의 총액과 받은 돈을 입력받습니다.
		System.out.println("이 프로그램은 영수증을 출력하는 프로그램입니다. \n" + "영수증은 받은 돈, 상품의 총액, 부가세, 거스름돈을 출력합니다.");

		do {
			do {
				System.out.println("\n상품의 총액을 입력하세요(상품의 총액은 0초과, 정수로 입력해주세요)");
				price = input.nextInt(); // 총액 입력
				if (price > 0) {
					break;
				} else {
					System.out.println("상품의 총액이 음수로 입력되거나 0이 입력됐습니다.");
				}
			} while (true);

			System.out.println("금액을 0초과의 양수로 입력하세요 : ");
			money = input.nextInt(); // 지불 금액 입력
			do {
				do {
					money = money + addMoney;
					if ((money > 0) || (money >= price)) {
						break;
					} else {
						System.out.println("지불하신 금액이 음수로 입력됐습니다.");
					}
				} while (true);

				if (money >= price) {
					receipt(money, price);
					break;
				} else {
					System.out.println("지불 금액이 상품의 총액보다 작습니다.");

					System.out.println("금액을 더 지불하고 상품을 구매하시겠습니까? (Y or y or 예)");
					yesOrNo = inputReset.nextLine();
					if (('Y' == yesOrNo.charAt(0)) || ('y' == yesOrNo.charAt(0)) || ('예' == yesOrNo.charAt(0))) {
						System.out.println("추가 금액을 입력하세요 : ");
						addMoney = input.nextInt();
					} else {
						break;
					}
				}
			} while (true);

			// 결과 출력 종료의 여부를 물음
			System.out.println("계속하여 프로그램을 사용하시겠습니까? (Y/y)");
			reset = inputReset.nextLine();
		} while (('y' == reset.charAt(0)) || ('Y' == reset.charAt(0)));

		System.out.println("\n\n~~~~~~프로그램을 종료합니다~~~~~~");

	}

	public static double vat(int price) {
		double vat;// 반환 변수

		vat = price * 0.1;
		
		return vat;
	}

	public static int change(int money, int price) {
		int change; // 반환변수

		change = money - price;
		
		return change;
	}

	public static void receipt(int money, int price) {
		String receipt;// 반환변수
		double vat;
		int change;
		vat = vat(price);
		change = change(money, price);

		receipt = "\n*받은 돈, 상품의 총액, 부가세, 거스름돈을 포함하는 \n영수증을 출력합니다." + "\n\n= 영수증 =" + "\n받은 돈 : " + money + "원"
				+ "\n상품의 총액 : " + price + "원" + "\n부가세 : " + vat + "원" + "\n거스름돈 : " + change + "원";

		System.out.println(receipt);
	}

}
