import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class RetangleArea {
	public static void main(String[] args) {
		Retangle myRetangle = new Retangle();

		// 스캐너
		Scanner input = new Scanner(System.in);

		// 변수설정
		int width; // 가로변수
		int height; // 세로변수

		System.out.println("이 프로그램은 가로와 세로를 입력받아, 사각형의 넓이를 계산합니다.");

		do {
			System.out.println("가로를 입력하세요");
			width = input.nextInt(); // 가로 입력
		} while (width < 0);

		do {
			System.out.println("세로를 입력하세요");
			height = input.nextInt(); // 세로입력
		} while (height < 0);

		myRetangle.setWidth(width); // 정확한 값이 들어왔을 떄 set한다.
		myRetangle.setHeight(height);

		System.out.println("넓이는 : " + myRetangle.calcArea());

	}
}
