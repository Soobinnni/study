package n220930Understanding;

import java.util.Scanner;

public class Receipt2 {

	public static void main(String[] args) {
		// 상품가격, 지불금액, 거스름돈, 부가세를 나타내는 영수증을 출력하는 프로그램
		// 상품의 총액보다 받은 돈이 적을 경우, 추가 지불을 요구합니다.
		
		
		//변수 설정
		int price;  //상품의 총액
		int money;  //받은 돈(고객이 지불한 금액)
		int change;  // 거스름돈
		int vat; //부가세
		
		/* 두 가지 상황을 설정합니다. 받은 금액>=상품 총액일 경우 계산이 완료되고 영수증이 출력됩니다. 
		                      받은 금액<상품 총액일 경우, 추가 금액을 요구합니다.*/
		
		String receipt; // 받은 금액>=상품 총액으로 계산이 완료되었을 때, 영수증의 문자열을 출력하기 위한 변수
		boolean lack; // 받은 금액<상품 총액일 경우 추가 금액을 요구받기 위해 설정한 변수
		
		
		
		
		
		//상품가격과 지불금액을 입력받기 위한 스캐너
		Scanner input=new Scanner(System.in);
		
		//상품의 총액과 받은 돈을 입력받습니다.
		System.out.println("이 프로그램은 영수증을 출력하는 프로그램입니다. \n"+"영수증은 받은 돈, 상품의 총액, 부가세, 거스름돈을 출력합니다."); //사용자 가이드
		
		System.out.println("\n상품의 총액을 입력하세요 : "); //사용자 가이드
		price=input.nextInt(); //사용자에게 총액을 입력받음
		
	    System.out.println("지불하신 금액을 입력하세요 : "); //사용자 가이드
		money=input.nextInt(); //사용자에게 받은 돈을 입력받음
		
		
		
		
		//거스름돈과 부가세 계산
		change=money-price; //거스름돈 = 지불가격-상품가격
		vat=(int)(price*0.1); // 부가세=상품총액*0.1
		
		
		
		
		/*영수증 출력
		  : 조건연산자를 활용하여 관계식에서 true일 경우와 false일 경우 다르게 출력합니다. */
		
		lack=(money<price); //부족한 경우(받은 돈<상품총액)를 true로, 그렇지 못한 경우(받은 돈>=상품총액)를 false로 둡니다.
		
		//1. false일 경우 출력할 영수증내용(receipt) 문자열을 초기화합니다.(영수증 내용=받은 돈, 상품총액, 가격, 부가세 순)
		receipt=("\n= 영수증 ="+'\n'+"받은 돈 : "+money+"원"+'\n'+"상품의 총액 : "+price+"원"+'\n'+"부가세 : "+vat+"원"+'\n'+"거스름돈 : "+change+"원");
        
		//2. true일 경우 금액을 요구하고 그렇지 않은 경우는 초기화했던 1.을 출력합니다.
		System.out.println((lack?"금액이 부족합니다. 더 지불해주세요.":receipt)); //true의 상황에서는 지불을 요구하고 false의 상황에서는 영수증을 출력합니다.
		
		

	}

}
