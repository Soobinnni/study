import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		
		
		//스캐너 변환
		 Scanner input=new Scanner(System.in);
		 
		//변수선언 
		int inputMoney;
		
		//변수초기화
		System.out.println("　　");
		System.out.println("　　　　　　　　　　★음료 자판기★");
		System.out.println("　　");
		System.out.println("　1. 코카콜라(1000원)	2. 환타(800원)");
		// System.out.println(" 2. 환타(800원)");//
		System.out.println("　3. 콜라체리맛(1100원)	4. 환타포도맛(800원)");
		// System.out.println(" 4. 환타포도맛(800원)");//
		System.out.println("　5. 칠성사이다(700원)	6. 스프라이트(700원)");
		// System.out.println(" 6. 스프라이트(700원)");//
		System.out.println("　7. 코코팜(600원)		8. 제주삼다수(300원)");
		// System.out.println(" 8. 제주삼다수(300원)");//
		System.out.println("　");
		
		//출력
		System.out.println("　금액을 투입하세요 : ");
		System.out.print("당신이 투입한 금액은 : ");
		inputMoney=input.nextInt();
		//탭 키 두 번 누르는 것 같은 명령어-> \t\t(띄어쓰기 필요 없음)//
		
		//System.out.println("띄어쓰기\t\t필요없음");//
	}

}
