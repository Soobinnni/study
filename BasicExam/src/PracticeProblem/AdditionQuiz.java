package PracticeProblem;

import java.util.Scanner;

public class AdditionQuiz {

	public static void main(String[] args) {
		// 임의의 수를 컴퓨터가 생성하여 간단한 덧셈을 연습하는 프로그램 김수빈
		
		// 사용자가 연산한 값을 받기 위한 스캐너
		Scanner input=new Scanner(System.in);
		
		//변수 입력
		int randomNumber1;
		int randomNumber2;
		int answer;
		
		/*임의의 숫자 두 개를 생성
		 * currentTimeMillis() 메소드는
		 * 1970년 1월 1일 00:00:00 GMT 시간으로부터 경과된
		 * 밀리세컨트(1/1000초)
		 */
		randomNumber1= (int)(System.currentTimeMillis()%100);
		randomNumber2= (int)(System.currentTimeMillis()*7%100);
		
		//두 개의 값을 더함
		System.out.println("두 수의 합을 구하시오.");
		System.out.println(randomNumber1+"+"+randomNumber2+"="+" ?");
		answer=input.nextInt();

		//제출한 답과 정답 비교
		System.out.println("제출한 답 : "+answer);
		System.out.println("정답 : "+(randomNumber1+randomNumber2)+'\n');
		System.out.println("당신이 제출한 답은 "+answer+"이고, \n"+"이 문제의 답은 "+(randomNumber1+randomNumber2)+"이므로\n"+(answer==(randomNumber1+randomNumber2)?"정답입니다.":"오답입니다."));
	}

}
