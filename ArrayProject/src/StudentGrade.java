import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {
		// 스캐너
		Scanner input = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);

		// 변수 입력
		int studentNum;
		int subjectNum;
		String name[];
		String subjectName[];
		int score[][];
		int total[];

		System.out.println("이 프로그램은 학생별 과목의 점수를 입력하고, 총점과 평균을 계산합니다.");

		// 학생 수를 받고 그에 따라 배열의 크기를 정하고 학생 이름을 받는다.
		System.out.println("학생 수를 입력하세요 : "); // 학생 수 입력
		studentNum = input.nextInt();

		// 과목 수를 받고 그에 따라 배열의 크기를 정하고 과목명을 받는다.
		System.out.println("과목수를 입력하세요 : "); // 과목 수 입력
		subjectNum = input.nextInt();

		// 배열의 크기를 정한다.
		name = new String[studentNum];
		score = new int[studentNum][subjectNum];
		total = new int[studentNum];
		subjectName = new String[subjectNum];

		// 학생 이름, 과목 입력
		for (int i = 0; i < studentNum; i++) {
			System.out.println((i + 1) + "번째 학생 이름을 입력하세요 : ");
			name[i] = inputString.nextLine();
		}

		for (int i = 0; i < subjectNum; i++) {
			System.out.println((i + 1) + "번째 과목명을 입력하세요 : ");
			subjectName[i] = inputString.nextLine();
		}

		// 이름, 과목 별로 과목 점수를 받는다.
		for (int i = 0; i < studentNum; i++) {
			for (int j = 0; j < subjectNum; j++) {
				do {
					System.out.println(name[i] + "학생의 " + subjectName[j] + " 점수를 입력하세요 : ");
					score[i][j] = input.nextInt();
					if ((score[i][j] < 0) || (score[i][j] > 100)) {
						System.out.println("점수의 범위는 0점 이상 100점 이하입니다.");
					} else {
						break;
					}
				} while (true);
			}
		}

		// 합 구하기
		for (int i = 0; i < studentNum; i++) {
			for (int j = 0; j < subjectNum; j++) {
				total[i] += score[i][j];
			}
		}

		// 출력
		System.out.print("학생명\t");
		for (int i = 0; i < subjectNum; i++) {
			System.out.print(subjectName[i] + "\t");
		}
		System.out.print("총점\t평균");
		System.out.println();
		for (int i = 0; i < studentNum; i++) {
			System.out.print(name[i] + "\t");
			for (int j = 0; j < subjectNum; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(total[i] + "\t" + ((double)total[i] / subjectNum));
			System.out.println();
		}

	}

}
