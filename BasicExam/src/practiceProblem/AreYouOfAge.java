package practiceProblem;

import java.util.Scanner;

public class AreYouOfAge {

	public static void main(String[] args) {
		// 입력한 나이가 성년인지, 미성년인지 판단하는 프로그램
		
		//나이를 입력받는 스캐너
		Scanner input=new Scanner(System.in);
		
		//나이 변수 설정
		int age;
		
		//나이를 입력받는다.
		System.out.println("이 프로그램은 나이를 입력받고, 해당 나이가 성년인지 판단합니다.\n나이를 입력하세요 : ");
		age=input.nextInt();
		
		
		//if else문 age>=가 t일 때 성년 출력, f일 때 미성년 출력
		if(age>=19) {
			System.out.println("성년입니다.");
		}else {
			System.out.println("미성년입니다.");
		}

	}

}
