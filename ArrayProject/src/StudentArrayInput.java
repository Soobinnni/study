import java.util.Scanner;

public class StudentArrayInput {

	public static void main(String[] args) {
		// 국어 성적 입력과 평균을 구하는 프로그램

		// 스캐너
		Scanner input = new Scanner(System.in);

		// 변수 설정
		final int STUDENT = 10;// 학생수
		int total = 0; // 총점
		// 배열 설정
		int score[] = new int[STUDENT];

		System.out.println("각 학생의 국어점수를 입력받고 총점과 평균을 구합니다.");

		for (int i = 0; i < STUDENT; i++) {
			System.out.println((i + 1) + "번 학생의 점수를 입력하세요 : ");
			score[i] = input.nextInt(); // 각 학생의 점수 입력
			total += score[i]; // 총점 계산
		}

		// 결과 출력
		for (int i = 0; i < STUDENT; i++) {
			System.out.println((i + 1) + "번 학생 국어 점수 : " + score[i]);
		}
		System.out.println("\n학생들의 총점 : " + total + "점");
		System.out.println("학생들의 평균 : " + (total / STUDENT));

	}

}
