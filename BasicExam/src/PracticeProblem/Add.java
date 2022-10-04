package PracticeProblem;
import java.util.Scanner;

public class Add {

	public static void main(String[] args) {

		// 사용자로부터 입력을 받기 위해 Scanner를 생성한다.
		Scanner input = new Scanner(System.in);

		// 숫자 두 개(정수)를 받고, 합을 저장하기 위해 변수를 설정한다.
		int firstNumber; // 첫번째 숫자
		int secondNumber; // 두번째 숫자
		int sum; // 합

		// 두 수의 합을 출력하는 프로그램
		System.out.println("두 수의 합을 구하는 프로그램\n");

		// 첫, 두 번째 정수 입력 칸
		System.out.println("첫 번째 숫자(정수)를 입력하시오: ");
		firstNumber = input.nextInt();
		System.out.println("두 번째 숫자(정수)를 입력하시오: ");
		secondNumber = input.nextInt();

		// 두 수를 더한다.
		sum = firstNumber + secondNumber;

		// 두 수의 합을 보여준다.
		System.out.print("두 수의 합 계산 : ");
		System.out.println(firstNumber + "+" + secondNumber + "=" + sum);

	}

}
