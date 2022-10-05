import java.util.Scanner;

public class VendingMachine {

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
		int inputMoney;
		int selectProductNumber;

		
		// 노출되는 자판기 모습 출력
		System.out.println("　　");
		System.out.println("　　　　　　　　　　★음료 자판기★");
		System.out.println("　　");
		System.out.println("　1. 코카콜라(1000원)\t2. 환타(800원)");
		System.out.println("　3. 콜라체리맛(1100원)\t4. 환타포도맛(800원)");
		System.out.println("　5. 칠성사이다(700원)\t6. 스프라이트(700원)");
		System.out.println("　7. 코코팜(600원)\t\t8. 제주삼다수(300원)");

		
		
		// 상품 출력 과정
		System.out.println("\n\n\t금액을 투입하세요");

		System.out.print("\t투입 금액 : ");
		inputMoney = input.nextInt(); // 투입금액 입력

		System.out.println("\t상품 번호를 입력하세요");
		selectProductNumber = input.nextInt(); // 상품 번호 입력

		
		
		// 상품 배출(출력)
		System.out.println("\n상품 배출 : " + fantaOriginal); // 배출된 상품 출력
		System.out.println("남은 금액 : " + (inputMoney - fantaOriginalPrice)); // 남은돈=투입한 금액-선택한 상품가격

	}

}
