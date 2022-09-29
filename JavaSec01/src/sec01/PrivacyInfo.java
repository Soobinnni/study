package sec01;

import java.util.Scanner;

public class PrivacyInfo {

	public static void main(String[] args) {
		//개인정보출력 프로그램 버전 0.0.1     --해당 프로그램, 버전, 제작자 등 필요정보 넣기
		
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		
		// 변수선언
		String name;     //이름  -- 주석 다는 습관 들이기
		int age;         //나이
		String address;  //주소
		String tel;      //전화번호

		// 변수 초기화
		System.out.print("이름을 입력하세요 : ");
		name = input.nextLine();
		System.out.print("나이를 입력하세요 : ");
		age=input1.nextInt();
		System.out.print("주소를 입력하세요 : ");
		address=input.nextLine();
		System.out.print("전화번호를 입력하세요 : ");
		tel = input.nextLine();

		// 출력
		System.out.println("\n개인신상정보\n"); //=("개인신상정보"+'\n')
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("주소 : " + address);
		System.out.println("전화번호 : " + tel);
		
		//모든 코드 입력 후 ctrl+shift+f 보기 좋게 정렬
	}

}
