package understandingIncrease;

import java.util.Scanner;

public class Receipt {

	public static void main(String[] args) {
		// 상품가격, 지불금액, 거스름돈, 부가세를 나타내는 영수증을 출력하는 프로그램

		// 변수 설정
		int price; // 상품의 총액
		int money; // 받은 돈(고객이 지불한 금액)
		int change; // 거스름돈
		int vat; // 부가세

		
		
		// 상품가격과 지불금액을 입력받기 위한 스캐너
		Scanner input = new Scanner(System.in);

		
		
		// 상품의 총액과 받은 돈을 입력받습니다.
		System.out.println("이 프로그램은 영수증을 출력하는 프로그램입니다. \n" + "영수증은 받은 돈, 상품의 총액, 부가세, 거스름돈을 출력합니다.");
		System.out.println("\n상품의 총액을 입력하세요."); 
		price = input.nextInt(); // 총액 입력

		System.out.println("지불하신 금액을 입력하세요."); 
		money = input.nextInt(); // 지불 금액 입력

		
		
		// (price>0)&&(money>0)&&(money>price)이 t이면 계산식과 해결과 함께 영수증을 출력하고 f일 경우 정정을 요구합니다.
		if ((price > 0) && (money > 0) && (money >= price)) {
			change = money - price;          // 거스름돈은 지불가격-상품가격
			vat = (int) (price * 0.1);       // 부가세=상품총액*0.1
			// 영수증 출력
			System.out.println("\n*받은 돈, 상품의 총액, 부가세, 거스름돈을 포함하는 \n영수증을 출력합니다.");
			System.out.println("\n= 영수증 =");
			System.out.println("받은 돈 : " + money + "원"); // 지불 금액
			System.out.println("상품의 총액 : " + price + "원");// 상품 총액
			System.out.println("부가세 : " + vat + "원"); // 부가세
			System.out.println("거스름돈 : " + change + "원");// 거스름돈

		} else {
			System.out.println("\n다음과 같은 상황으로 오류가 발생했습니다. 정정해서 입력하면 영수증이 정상 출력됩니다.");
			System.out.println("\n1. 받은 돈이나 상품의 총액이 음수로 입력됐습니다.");
			System.out.println("2. 받은 돈보다 상품의 가격이 큽니다.");
		}

	}

}
