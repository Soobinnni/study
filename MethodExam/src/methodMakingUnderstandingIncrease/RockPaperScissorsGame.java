package methodMakingUnderstandingIncrease;

import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		// 가위바위보 게임

		Scanner inputCard = new Scanner(System.in);// 사용자가 자신의 패를 입력
		Scanner inputNameReset = new Scanner(System.in); // 사용자 이름, 게임 리셋버튼

		// 변수 입력
		String userName; // 사용자 이름
		int scissor = 0; // 가위
		int rock = 1; // 바위
		int paper = 2; // 보

		int gameNum = 0; // 총 게임 횟수
		int inGameNum = 1; // 게임이 반복되기 전까지의 실행 횟수

		int userCard = 0; // 사용자의 패
		int computerCard = 0;

		int userVictory; // 사용자 승리
		int computerVictory = 0; // 컴퓨터 승리
		int draw = 0; // 무승부
		String textResult = ""; // 게임의 결과 출력을 위한 문자열

		String reset; // 게임 리셋 버튼

		// 사용자 이름 입력
		System.out.println("이 게임은 사용자가 2번 이기기 전까지 \n컴퓨터와 가위바위보를 하는 게임입니다.");
		System.out.println("\n\n사용자의 이름을 입력해주세요 : ");
		userName = inputNameReset.nextLine();

		// 게임시작, 사용자가 가위바위보 중 하나의 패를 입력한다.
		System.out.println("\n<보기> \n가위=0, 바위-1, 보-2");
		System.out.println("보기와 같이 가위 바위 보는 숫자로 표현합니다.");

		do {
			// 게임을 새로 시작하면서 사용자 승리는 0으로, 총 게임 회수는 더해가고, 승리 시도 inGameNum은 1으로 초기화된다.
			userVictory = 0;
			draw=0;
			computerVictory=0;
			inGameNum = 1;
			gameNum++;

			// 사용자가 패를 입력한다. do while을 이용하여 사용자가 2번 승리할 때까지 게임을 반복한다.
			do {
				// 사용자는 0,1,2 중 하나를 입력하지 않으면 재입력을 요구받는다.
				do {
					System.out.println();
					System.out.println(userName + "님의 패를 입력해주세요 : ");
					userCard = inputCard.nextInt();

					switch (userCard) {
					// 사용자의 패와 가위, 바위, 보를 연결시킨다.
					case 0:
						userCard = scissor;
						break;
					case 1:
						userCard = rock;
						break;
					case 2:
						userCard = paper;
						break;
					default:
						System.out.println("<보기> 가위=0, 바위=1, 보=2");
						System.out.println("보기와 같이 가위 바위 보는 0또는 \n1또는 2 중 하나로 표현합니다.");
						break;
					}
				} while (!((userCard == 0) || (userCard == 1) || (userCard == 2)));

				// 컴퓨터의 패도 연결시킴.
				computerCard = (int) (Math.random() * 2.1);
				if (computerCard == 0) {
					computerCard = scissor;
				} else if (computerCard == 1) {
					computerCard = rock;
				} else if (computerCard == 2) {
					computerCard = paper;
				}

				// 게임의 승패 정리
				if (computerCard == scissor) {
					if (userCard == scissor) {
						draw = draw + 1;
						textResult = "무승부!";
					} else if (userCard == rock) {
						userVictory = userVictory + 1;
						textResult = userName + "님의 승리";
					} else {
						computerVictory = computerVictory + 1;
						textResult = userName + "님의 패배ㅠㅠ";
					}
				} else if (computerCard == rock) {
					if (userCard == scissor) {
						computerVictory = computerVictory + 1;
						textResult = userName + "님의 패배ㅠㅠ";
					} else if (userCard == rock) {
						draw = draw + 1;
						textResult = "무승부!";
					} else {
						userVictory = userVictory + 1;
						textResult = userName + "님의 승리";
					}
				} else {
					if (userCard == scissor) {
						userVictory = userVictory + 1;
						textResult = userName + "님의 승리";
					} else if (userCard == rock) {
						computerVictory = computerVictory + 1;
						textResult = userName + "님의 패배ㅠㅠ";
					} else {
						draw = draw + 1;
						textResult = "무승부!";
					}
				}

				// 게임의 결과 출력
				System.out.println("-----------------------------");
				System.out.println("\t   [" + gameNum + "-" + inGameNum + "회 결과]\n\t   " + textResult);
				System.out.println(
						"\n\t   |현재 스코어!|\n\t컴퓨터 : " + computerVictory + " " + userName + "님 : " + userVictory);
				System.out.println("\n   *참고* 비긴 횟수는 " + draw + "회 입니다.");
				System.out.println("-----------------------------");
				inGameNum++;

			} while (userVictory <= 1);

			// 게임의 리셋 버튼
			System.out.println("\n게임을 다시 시작하시겠습니까? (y/Y/예)입력\n\n\n");
			reset = inputNameReset.nextLine();
		} while (reset.charAt(0) == 'Y' || reset.charAt(0) == 'y' || reset.charAt(0) == '예');
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("      ◝(⁰▿⁰)◜안녕! 게임 종료");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	}

}
