package practiceProblem;
import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		/* 원의 면적 구하기 프로그램 김수빈 
		   원의 넓이는 원주율(3.14)에 반지름의 제곱을 곱하여 얻을 수 있다.*/
		
		//원의 반지름을 사용자에게 받기 위한 스캐너
		Scanner input=new Scanner(System.in);
		
		//변수 설정
		double radius; //원의 반지름
		double area;   //원의 면적
		
		//출력
		System.out.println("원의 면적을 계산하는 프로그램\n"
				+ "");
		System.out.println("원의 반지름을 입력해주세요 : ");
		radius=input.nextDouble(); //사용자에게 반지름을 입력받는다.
		area=radius*radius*3.14; //면적을 계산한다.
		
		//원의 면적과 반지름의 길이를 출력한다.
		System.out.println("원의 면적은 "+area+"입니다.\n"+"★참고★ 입력하신 반지름의 값은 "+radius+"입니다.");
		
		
	
		
		

	}

}
