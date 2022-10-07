package practiceProblem;

import java.util.Scanner;

public class GreatCommonDivisior {

	public static void main(String[] args) {
		// 최대 공약수를 찾기
		
		Scanner input=new Scanner(System.in);
		
		//변수
		int num1;
		int num2;
		
		int d=1; //공약수
		int maxD=2; //최대 공약수
		
		
		System.out.println("숫자 1 입력");
		num1=input.nextInt();
		System.out.println("숫자 2 입력");
		num2=input.nextInt();
		
		while ((d<=num1)&&(d<=num2)) {
			if ((num1%d==0)&&(num2%d==0)) {
				maxD=d;
			}
			d++;
		}
		
		System.out.println(num1+"과 "+num2+"의 최대공약수는 "+maxD+"입니다.");
	}

}
