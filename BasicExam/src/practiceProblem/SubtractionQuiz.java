package practiceProblem;

import java.util.Scanner;

public class SubtractionQuiz {

	public static void main(String[] args) {
		// 임의의 수를 생성하여 간단한 뺄셈 연습을 하는 프로그램 예제
		
		// 사용자에게 계산한 값을 받아내는 스캐너
		Scanner input=new Scanner(System.in);
		
		//변수 설정
		int randomNumber1;
		int randomNumber2;
		int answer;
		
		//랜덤한 숫자 2개를 받아냄
		randomNumber1=(int)(Math.random()*101);
		randomNumber2=(int)(Math.random()*101);
		
		//뺄셈의 결과는 양수여야 하므로, 먼저오는 수 randomNumber1>randomNumber2여야 함.
		//if문을 활용하여, randomNumber1<randomNumber2일 경우에 두 수를 바꿔줌
		if(randomNumber1<randomNumber2) {
			int change;
			change=randomNumber1;
			randomNumber1=randomNumber2;
			randomNumber2=change;
		} 
		
		//사용자에게 뺄셈 연산의 답을 받아낸다.
		System.out.println("이 프로그램은 랜덤한 숫자 2개의 차를 맞추는 프로그램입니다.\n");
		System.out.println(randomNumber1+"-"+randomNumber2+"= ? ");
		System.out.println("정답은 무엇입니까?");
		answer=input.nextInt(); //사용자의 정답 입력
		
		//정답 또는 오답체크 출력
		System.out.println("식 : "+randomNumber1+"-"+randomNumber2+"의 답은 "+(randomNumber1-randomNumber2)+"입니다.");
		System.out.println("입력하신 답은 "+answer+"이므로 "+(randomNumber1-randomNumber2)+(((randomNumber1-randomNumber2)==answer)?"과(와) 일치하여 정답입니다.":"과(와) 불일치하여 오답입니다."));

	}

}
