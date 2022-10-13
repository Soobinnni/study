import java.util.Scanner;

public class BoxStatus {

	public static void main(String[] args) {
		//스캐너
		Scanner input=new Scanner(System.in);
		Scanner inputString=new Scanner(System.in);
		
		//변수 설정
		double height; //높이 
		double width; //너비
		double length; //폭
		String answer;
		boolean empty;//빈 여부 true일떄 비어있고, false일때 차 있다
		
		//객체 생성을 위한 빈공간 생성
		Box myBox;
		
		System.out.println("이 프로그램은 상자의 너비를 구하는 프로그램입니다.");
		System.out.println("높이를 입력해주세요 : ");
		height=input.nextDouble();
		System.out.println("너비를 입력해주세요 : ");
		width=input.nextDouble();
		System.out.println("폭을 입력해주세요 : ");
		length=input.nextDouble();
		System.out.println("상자가 비어있습니까? (y나 Y를 입력하면 비어있습니다 / 아니면 차 있습니다.)");
		answer=inputString.nextLine();
		empty=((answer.charAt(0)=='y')||(answer.charAt(0)=='Y'));
		answer=empty?"비어있습니다.":"차 있습니다.";
		
		myBox=new Box();
		
		myBox.setHeight(height);
		myBox.setWidth(width);
		myBox.setLength(length);
		myBox.setEmpty(empty);
		
		System.out.println(myBox);
		
	}

}
