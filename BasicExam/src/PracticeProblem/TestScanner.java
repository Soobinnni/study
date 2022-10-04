package PracticeProblem;
import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		//다양한 데이터 입력 예제 김수빈
		
		
		//스캐너 두 개 새로 설정
		Scanner input=new Scanner(System.in);
		Scanner input1=new Scanner(System.in);

		//변수 설정
		int intValue;
		int intValue1;
		int intValue2;  //변수 정수 
		
		double doubleValue; //실수
		
		String string;
		String stringline;  //문자열
		
		System.out.println("다양한 입력 형식 에제");
		
		//정수입력
		System.out.println("정수 입력: \n");
		
		//1. intValue의 값 입력
		intValue=input.nextInt();
		System.out.println("입력한 정수 : "+intValue);
		
		//2. inValue1, inValue 값 입력
		System.out.println("첫 번째, 두 번째 정수 입력 : ");
		intValue1=input.nextInt();
		intValue2=input.nextInt();
		System.out.println("첫 번째 입력한 정수 : "+intValue1);
		System.out.println("두 번째 입력한 정수 : "+intValue2);
		
		//실수 입력
		System.out.println("실수 입력: ");
		doubleValue=input1.nextDouble();
		System.out.println("입력한 실수 : "+doubleValue);
		
		//문자열 입력
		System.out.println("문자열 입력 : \n");
		//공백 없는 문자열
		string=input.next();
		System.out.println("입력한 문자열 : "+string);
		//공백 있는 문자열
		stringline=input1.nextLine();
		System.out.println("입력한 문자열 : "+stringline);
		
		
		
	}

}
