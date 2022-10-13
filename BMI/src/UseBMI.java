import java.util.Scanner;

public class UseBMI {

	public static void main(String[] args) {
		//스캐너
		Scanner input=new Scanner(System.in);
		Scanner inputString=new Scanner(System.in);
		
		//변수 선언
		String name;
		int age;
		double weight;
		double height;
		double bmi;
		String statusBody;
		
		//클래스 선언
		BMI useBmi;
		
		System.out.println("이 프로그램은 bmi를 계산해냅니다.");
		System.out.println("이름을 입력하세요");
		name=inputString.nextLine();
		System.out.println("나이를 입력하세요");
		age=input.nextInt();
		System.out.println("몸무게를 입력하세요");
		weight=input.nextDouble();
		System.out.println("키를 입력하세요");
		height=input.nextDouble();
		
		//useBmi라는 이름의 BMI객체를 생성
		useBmi=new BMI(name, age, weight, height);
		
		bmi=useBmi.clacBMI();
		
		System.out.println(useBmi);
	}

}
