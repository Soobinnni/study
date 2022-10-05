package sec02;

import java.util.Scanner;

public class MultiIfDemo {

	public static void main(String[] args) {
		// 다중 if문을 이용한 점수 구간 별 학점 부여

		// 학점을 입력받을 스캐너
		Scanner input = new Scanner(System.in);

		// 점수 변수 설정
		int score;
		String grade;

		// 점수를 입력받음
		System.out.println("이 프로그램은 입력한 점수를 학점으로 환산해주는 프로그램입니다.\n");
		System.out.println("점수를 입력해주세요 : ");
		score = input.nextInt();

		// 점수를 조건에 따라 학점으로 변환 :
		// 조건식 1) score>=0 그리고 score<=100 T일 때 조건식 3로 넘어감
		// 조건식 2) score>=0 그리고 score<=100 F일 때 데이터 재입력 요구
		// 조건식 3) score>=90-A score>=80-B score>=70-C score>=60-D score 50이하-F
		if ((score >= 0) && (score <= 100)) {
			if (score >= 90) {
				grade = "A";
			} else if (score >= 80) {
				grade = "B";
			} else if (score >= 70) {
				grade = "C";
			} else if (score >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}
			System.out.println("당신의 학점은 " + grade + "입니다."); // (score>=0)&&(score<=100)조건식의 T의 최종 출력값
		} else {
			System.out.println("점수를 0~100 내에서 입력해주세요."); // (score>=0)&&(score<=100)조건식의 F의 최종 출력값
		}

	}
}
