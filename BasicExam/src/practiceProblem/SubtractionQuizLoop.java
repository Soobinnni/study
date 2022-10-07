package practiceProblem;

import java.util.Scanner;

public class SubtractionQuizLoop {

	public static void main(String[] args) {
		// 정답
		Scanner input=new Scanner(System.in);
		
		//변수
		int randomNum;
		int userAnswer;
		int num=0; //맞춘 회수
		
		randomNum=(int)(Math.random()*101);
		
		System.out.println("숫자를 맞춥니다.");
		
		
		while(true) {
			System.out.println("숫자를 입력하세요 : ");
			
			userAnswer=input.nextInt();
			
			num += 1;
			
			if (randomNum==userAnswer) {
				System.out.println(num+"번에 맞췄습니다.");
				break;
			} else if(randomNum>userAnswer) {
				System.out.println("입력한 답변이 퀴즈의 숫자보다 작습니다.");
			} else {
				System.out.println("입력한 답변이 퀴즈의 숫자보다 큽니다.");
				}
				System.out.println(num+"번 실패");
			}
		}

	}

