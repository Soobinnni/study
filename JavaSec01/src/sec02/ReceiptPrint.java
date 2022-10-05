package sec02;

import java.util.Scanner;

public class ReceiptPrint {

	public static void main(String[] args) {
		// 받은 돈, 상품의 총액, 부가세, 거스름돈의 내용을 담은 영수증을 출력하는 프로그램

		// 받은 돈, 상품의 총액을 입력받기 위한 스캐너
		Scanner input = new Scanner(System.in);

		// 변수 설정
		int price; // 상품의 총액
		int money; // 받은 돈(고객이 지불한 금액)
		int change; // 거스름돈
		int vat; // 부가세

		// 상품의 총액과 받은 돈을 입력받습니다.
		System.out.println("이 프로그램은 영수증을 출력하는 프로그램입니다. \n" + "영수증은 받은 돈, 상품의 총액, 부가세, 거스름돈을 출력합니다.");
		System.out.println("\n상품의 총액을 입력하세요.");
		price = input.nextInt(); // 총액 입력

		// 조건식1) 받은돈>0 * False:정정멘트 출력 T값은 계속해서 중첩됨
		// 조건식2) 상품의 총액>0 * False:정정멘트 출력
		// 조건식3) 상품의 총액<=받은 돈 * False:정정멘트 출력
		// 모두가 충족 됐을 때, 계산식을 수행하고 영수증을 출력한다.
		if (price > 0) {
			System.out.println("지불하신 금액을 입력하세요.");
			money = input.nextInt(); // 지불 금액 입력
			if (money > 0) {
				if (money >= price) {
					// 계산식 수행
					change = money - price; // 거스름돈은 지불가격-상품가격
					vat = (int) (price * 0.1); // 부가세=상품총액*0.1

					// 영수증 출력
					System.out.println("\n*받은 돈, 상품의 총액, 부가세, 거스름돈을 포함하는 \n영수증을 출력합니다.");
					System.out.println("\n= 영수증 =");
					System.out.println("받은 돈 : " + money + "원"); // 지불 금액
					System.out.println("상품의 총액 : " + price + "원");// 상품 총액
					System.out.println("부가세 : " + vat + "원"); // 부가세
					System.out.println("거스름돈 : " + change + "원");// 거스름돈
				} else {
					System.out.println("지불하신 돈이 상품의 가격보다 적게 지불됐습니다.");
				}

			} else {
				System.out.println("돈을 양수로 입력해주세요.");
			}
		} else {
			System.out.println("상품의 총액을 양수로 입력해주세요");
		}

	}

}
