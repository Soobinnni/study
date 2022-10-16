import java.util.Scanner;

public class AssignGrade {

	public static void main(String[] args) {
		// 학생들의 점수를 읽어 성적을 저장하는 프로그램
		// 스캐너
		Scanner input = new Scanner(System.in);

		// 변수
		int studentNumber;
		int best = 0; // 최고 점수
		char grade = ' '; // 학점
		String printGrade = "";

		System.out.println("이 프로그램은 학생들의 점수를 받아 성적을 저장하는 프로그램입니다.");

		System.out.println("학생 수를 입력하세요 : ");
		studentNumber = input.nextInt();

		// 배열
		int studentScore[] = new int[studentNumber];

		// 학생점수 입력, 최고 점수 찾기
		for (int i = 0; i < studentNumber; i++) {
			System.out.println((i + 1) + "번 학생의 점수를 입력해주세요 : ");
			studentScore[i] = input.nextInt();// 학생점수 입력

			// 최고 점수 찾기
			if (best < studentScore[i]) {
				best = studentScore[i];
			}
		}

		// 점수를 토대로 학점 부여
		for (int i = 0; i < studentScore.length ; i++) {
			if (studentScore[i] > best - 10) {
				grade = 'A';
			} else if (studentScore[i] > best - 20) {
				grade = 'B';
			} else if (studentScore[i] > best - 30) {
				grade = 'C';
			} else if (studentScore[i] > best - 40) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			printGrade=(i + 1) + "번 학생의 점수 : " + studentScore[i] + "\n학점 : " + grade;
			
			// 결과
			System.out.println(printGrade);
		}
		
	}

}
