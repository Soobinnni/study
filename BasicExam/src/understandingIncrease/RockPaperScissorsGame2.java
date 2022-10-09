package understandingIncrease;

import java.util.Scanner;

public class RockPaperScissorsGame2 {

	public static void main(String[] args) {
		// 가위바위보 게임

		Scanner inputCard = new Scanner(System.in);// 사용자가 자신의 패를 입력
		Scanner inputNameReset = new Scanner(System.in); // 사용자 이름, 게임 리셋버튼

		// 변수 입력
		String userName; // 사용자 이름
		int scissor = 0; // 가위
		int rock = 1; // 바위
		int papper = 2; // 보

		int gameNum; // 총 게임 회수
		int inGameNum; // 총 게임 회수 안의 회수

		int userCard = 0; // 사용자의 패
		
		int gameResult = 0;
		int userVictory = 0; // 사용자 승리
		int computerVictory = 0; // 컴퓨터 승리
		int draw = 0; // 무승부
		String textResult=""; // 게임의 결과 출력을 위한 문자열

		String reset; // 게임 리셋 버튼

		// 사용자 이름 입력
		System.out.println("이 게임은 사용자가 2번 이기기 전까지 컴퓨터와 가위바위보를 하는 게임입니다.");
		System.out.println("사용자의 이름을 입력해주세요 : ");
		userName = inputNameReset.nextLine();

		// 게임
		do {
			// 게임시작, 사용자가 가위바위보 중 하나의 패를 입력한다.
			System.out.println("<보기> 가위=0, 바위-1, 보-2");
			System.out.println("보기와 같이 가위 바위 보는 숫자로 표현합니다.");

			// 사용자가 패를 입력한다.
			do {
				System.out.println(userName + "님의 패를 입력해주세요 : ");
				userCard = inputCard.nextInt();
				
				int computerCard = (int) (Math.random() * 2.1); // 컴퓨터의 패

				// 게임의 승패 정리
				switch (computerCard) {
				case 0:
					switch (userCard) {
					case 0:
						gameResult = draw; // 무승부
						textResult = "무승부!";
						break;
					case 1:
						gameResult = userVictory; // 사용자 승리
						textResult = userName + "님의 승리";
						break;
					case 2:
						gameResult = computerVictory; // 사용자 패배
						textResult = userName + "님의 패배ㅠㅠ";
						break;
					}
				case 1:
					switch (userCard) {
					case 0:
						gameResult = computerVictory; // 사용자 패배
						textResult = userName + "님의 패배ㅠㅠ";
						break;
					case 1:
						gameResult = draw; // 무승부
						textResult = "무승부!";
						break;
					case 2:
						gameResult = userVictory; // 사용자 승리
						textResult = userName + "님의 승리";
						break;
					}
				case 2:
					switch (userCard) {
					case 0:
						gameResult = userVictory; // 사용자 승리
						textResult = userName + "님의 승리";
						break;
					case 1:
						gameResult = computerVictory; // 사용자 패배
						textResult = userName + "님의 패배ㅠㅠ";
						break;
					case 2:
						gameResult = draw; // 무승부
						textResult = "무승부!";
						break;
					}

					// 게임 결과를 누적한다.
					if (gameResult == userVictory) {
						userVictory += userVictory;
					} else if (gameResult == computerVictory) {
						computerVictory += computerVictory;
					}
					
					System.out.println("게임 결과 : "+textResult);

				}

			} while (userVictory <= 2);

			// 게임의 리셋 버튼
			System.out.println("게임을 다시 시작하시겠습니까? (y/Y/예)입력");
			reset = inputNameReset.nextLine();
		} while (reset.charAt(0) == 'Y' || reset.charAt(0) == 'y' || reset.charAt(0) == '예');

	}

}
