import java.util.Scanner;

public class ScoreInput {

	public static void main(String[] args) {
		// 점수 이름받기

		// 스캐너
		Scanner input = new Scanner(System.in);

		// 2차원 배열 - [학생수][과목수]
		int[][] scores = new int[3][5];
		
		
		//입력
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.println("성적을 입력하세요 : ");
				scores[j][i] = input.nextInt();

			}
		}
		
		//출력
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < 5; i++) {
				System.out.print(scores[j][i] + "\t");

			}
			System.out.println();
		}

	}

}
