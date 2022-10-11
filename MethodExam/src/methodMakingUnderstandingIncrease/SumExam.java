package methodMakingUnderstandingIncrease;

import java.util.Scanner;

public class SumExam {
	
	public static void main(String[] args) {
		// 점수 입력
		int score;
		String msn;
		Scanner input=new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		score=input.nextInt();
		
		// 점수 판단 *판단의 변수(판단할 변수); 리턴할 값을 입력? . msn=는 반환할 때만 필요. void를 쓰면 없애야함.
		msn=just(score);
		
		// 점수 출력
		System.out.println(msn);
	}

	public static String just(int score) {
		        //반환타입 메서드이름(매개 변수 목록)
		String message;
		
		if((score>=0)&&(score<=100)) {
			message="점수가 정상적으로 입력됐습니다.";
		} else {
			message="점수가 범위 내에 입력되지 않았습니다.";
		}
		
		return message;
	}

}
