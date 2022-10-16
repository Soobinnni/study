import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) {
		// 최대값을 찾고, 그 최대값의 개수를 찾는 프로그램
		//스캐너
		Scanner input=new Scanner(System.in);
		
		//변수 설정
		final int TOTAL_NUM=6;
		int max=0; //최댓값
		int count=0;
		//배열
		int num[]=new int[TOTAL_NUM];
		
		System.out.println("이 프로그램은 6개의 정수를 입력받아 그 수 중 최댓값과 최댓값의 개수를 찾는 프로그램입니다.");
		
		for(int i=0;i<TOTAL_NUM;i++) {
			System.out.println((i+1)+"번째 정수를 입력하세요 : ");
			num[i]=input.nextInt();
		}
		
		//최대값을 구한다.
		max=num[0];
		for (int i = 1; i < TOTAL_NUM; i++) {
			if(max<num[i]) {
				max=num[i];
			}
		}
		
		//최대값의 개수를 구한다.
		for (int i = 0; i < TOTAL_NUM; i++) {
			if(max == num[i]) {
				count++;
			}
		}
		
		//결과를 출력한다.
		for (int i = 0; i < TOTAL_NUM; i++) {
			System.out.println((i+1)+"번째 정수 : "+num[i]);
		}
		System.out.println("\n최대값 : "+max);
		System.out.println("최대값의 개수 : "+count);
		

	}

}
