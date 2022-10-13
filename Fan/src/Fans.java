import java.util.Scanner;

public class Fans {

	public static void main(String[] args) {
		//스캐너
		Scanner input=new Scanner(System.in);
		Scanner inputString=new Scanner(System.in);
		
		//변수 설정
		int speed; //속도 : 상수로 표현한다.
		boolean move;//작동 여부
		double radius; //반지름으로 선풍기의 크기
		String color; //선풍기의 크기
		
		//Fan객체의 빈공간 생성
		Fan myFan=new Fan(Fan.SPEED_FAST,true,10, "yellow"); 
		Fan yourFan=new Fan(Fan.SPEED_MEDIUM,false,5,"blue");
		
		//각 객체에 입력값으로 초기화
		System.out.println(myFan);
		System.out.println(yourFan);
		
	}

}
