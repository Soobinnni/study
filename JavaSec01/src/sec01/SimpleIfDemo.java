package sec01;

import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args) {
		// 입력한 값이 짝수인지 홀수인지 결과를 출력하는 프로그램
		
		// 판단할 값 입력
		Scanner input=new Scanner(System.in);
		
		//변수 설정
		int isItEven;
		
		//변수 입력
		System.out.println("짝수인지, 홀수인지 판단하기 위해 정수의 숫자를 입력해주세요.");
		isItEven=input.nextInt();
		
		// 조건문
		//단순 if문. True일 때만 실행되는 실행문. 
		if(isItEven%2==0) {
			System.out.println("짝수!");
		}
		//단순 if문. True일 때만 실행되는 실행문
		if(isItEven%2==1) {
			System.out.println("홀수!");
		}
		
		System.out.println("종료"); //무조건 실행하는 실행문

	}

}
