import java.util.Scanner;

public class VendingMachineQuestion {

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
		int inputMoney; //사용자의 투입 금액
		int selectProductPrice; //사용자가 선택한 상품의 가격
		int selectProductNumber; //사용자가 선택한 상품의 번호
		String selectProductName; //사용자가 선택한 상품의 이름

		
		// 사용자가 보는 자판기의 모습
		System.out.println("　　");
		System.out.println("　　　　　　　　　　★음료 자판기★");
		System.out.println("　　");
		System.out.println("　1. 코카콜라(1000원)\t2. 환타(800원)");
		System.out.println("　3. 콜라체리맛(1100원)\t4. 환타포도맛(800원)");
		System.out.println("　5. 칠성사이다(700원)\t6. 스프라이트(700원)");
		System.out.println("　7. 코코팜(600원)\t\t8. 제주삼다수(300원)");
		System.out.println("\n\n\n");

		//사용자가 금액을 투입(사용자의 투입금액)
		System.out.println("금액을 투입하세요 : \n");
		inputMoney=input.nextInt();
		
		
		//사용자가 투입한 금액을 기준으로 조건문 작성
		//투입가격>=300 관계연산식이 true일 때
		if(inputMoney>=300) {
			//투입가격>=300 관계연산식이 true일 때 실행문
			System.out.println("상품 번호를 입력하세요 : ");
			selectProductNumber=input.nextInt();
			
			//입력한 선택상품번호==n(n=1,2,3,4,5,6,7,8)이 t일 경우 선택상품번호에 해당되는 금액과 상품명의 값을 초기화
			if (selectProductNumber==1) {
				selectProductPrice=cokeOriginalPrice; 
				selectProductName=cokeOriginal;
			} else if(selectProductNumber==2) {
				selectProductPrice=fantaOriginalPrice;
				selectProductName=fantaOriginal;
			} else if (selectProductNumber==3) {
				selectProductPrice=cokeCherryPrice;
				selectProductName=cokeCherry;
			} else if (selectProductNumber==4) {
				selectProductPrice=fantaGrpaePrice;
				selectProductName=fantaGrpae;
			} else if (selectProductNumber==5) {
				selectProductPrice=chilsungCiderPrice;
				selectProductName=chilsungCider;
			} else if (selectProductNumber==6) {
				selectProductPrice=spritePrice;
				selectProductName=sprite;
			} else if (selectProductNumber==7) {
				selectProductPrice=cocophamPrice;
				selectProductName=cocopham;
			} else if (selectProductNumber==8) {
				selectProductPrice=jejuSamdasuPrice;
				selectProductName=jejuSamdasu;
				
				//else if 속에 중첩하여 if와 else를 사용했는데 출력이 안 되는 이유?
				if (inputMoney>=selectProductPrice) {
					System.out.println("상품 배출 : "+selectProductName);
					System.out.println("잔금 배출 : "+(inputMoney-selectProductPrice));
				} else {
					System.out.println("상품의 가격보다 투입한 금액이 적습니다.");
				}
				
				
			} else { //입력한 선택상품번호==n(n=1,2,3,4,5,6,7,8)이 false일 경우
				System.out.println("입력하신 번호는 없는 번호입니다. 1~8까지의 숫자를 입력해주세요.");
			}
		} else { //투입가격>=300 관계연산식이 false일 때 실행문
			System.out.println("금액을 더 투입해주세요. 최소 금액은 300원입니다.");
		}
	}

}