package understandingIncrease;

import java.util.Scanner;

public class FindTheArea {

	public static void main(String[] args) {
		// 사각형 또는 삼각형 또는 원의 면적 구하는 프로그램
		//R-사각형 면적 T-삼각형 면적 C-원 면적
		
		//스캐너 
		Scanner inputNum=new Scanner(System.in);
		Scanner inputString=new Scanner(System.in);
		
		//변수설정
		String alphabet; //R, T, C를 입력받을 변수
		double squareWidth; //사각형의 가로길이
		double squarHeight; //사각형의 세로길이
		double triangleWidth; //삼각형의 밑변길이
		double triangleHeight; //삼각형의 높이
		double radius; //원의 반지름
		
		final double PI=3.14; //원주율
		
		double area;
		
		//사용자에게 R, T, C 중 하나의 문자를 입력받음
		System.out.println("R을 입력하면 사각형의 면적을 구하고 T를 입력하면 삼각형의 면적을 구하고 C를 입력하면 원의 면적을 구합니다.");
		System.out.println("R, T, C 중 하나의 문자만 입력해주세요.");
		alphabet=inputString.nextLine();
		
		//입력한 문자에 따라 다른 계산을 수행
		switch (alphabet.charAt(0)) { 
		case 'R': //입력 문자가 R일때
		case 'r':
			System.out.println("사각형의 면적을 구하려면 사각형의 가로와 세로의 길이 입력이 필요합니다.\n");
			System.out.println("가로의 길이(양수입력)를 입력해주세요");
			squareWidth=inputNum.nextDouble(); //가로 길이 입력
			if (squareWidth>0) { 
				System.out.println("세로의 길이(양수입력)를 입력해주세요 : "); //가로 길이가 0보다 크다가 True일때
				squarHeight=inputNum.nextDouble(); //세로 길이 입력
				if (squarHeight>0) { //가로 길이 0보다 크다 T이고, 세로길이가 0보다 크다가 T일 때
					area=squareWidth*squarHeight; //면적=세로*가로
					//사각형 넓이 출력
					System.out.println("세로 "+squarHeight+"와 가로 "+squareWidth+"일때 면적은 "+area+"입니다.");
							
				} else {//가로 길이 0보다 크다 T이고, 세로길이가 0보다 크다가 F일 때 
					System.out.println("세로의 길이가 음수로 입력됐습니다. 다시 입력해주세요.");
				}
			} else { //가로 길이가 0보다 크다가 False일때
				System.out.println("가로의 길이가 음수로 입력됐습니다. 다시 입력해주세요.");
			}
			break;
		case 'T': //입력 문자가 T일때
		case 't':
			System.out.println("삼각형의 면적을 구하려면 삼각형의 밑변길이와 높이의 입력이 필요합니다.\n");
			System.out.println("삼각형의 높이(양수 입력)를 입력하세요 : ");
			triangleHeight=inputNum.nextDouble(); //높이 입력
			if (triangleHeight>0) {
				System.out.println("밑변의 길이(양수입력)를 입력해주세요 : "); //높이가 0보다 크다가 T일 때
				triangleWidth=inputNum.nextDouble(); //밑변의 길이 입력
				if (triangleWidth>0) { //밑변의 길이가 0보다 클 때가 T일때
					area=triangleHeight*triangleWidth*0.5; //면적=밑변길이*높이*0.5
					//삼각형 면적 출력
					System.out.println("높이 "+triangleHeight+"와 밑변의 길이 "+triangleWidth+"일때 면적은 "+area+"입니다.");
				} else { //밑변의 길이가 0보다 클 때가 F일때
					System.out.println("밑변의 길이가 음수로 입력됐습니다. 다시 입력해주세요.");
				}
				
			} else { //높이가 0보다 크다가 F일 때
				System.out.println("높이가 음수로 입력됐습니다. 다시 입력해주세요.");
			}
			
			break;
		case 'C': //입력 문자가 C일때
		case 'c':
			System.out.println("원의 면적을 구하려면 반지름의 입력이 필요합니다.\n");
			System.out.println("반지름(양수)을 입력하세요 : ");
			radius=inputNum.nextDouble(); //반지름 입력
			if (radius>0) {//반지름이 0보다 크다가 T일 때
				area=PI*(Math.pow(radius, 2)); //면적=원주율*(반지름^2)
				//원의 면적 출력
				System.out.println("반지름 "+radius+"일때 면적은 "+area+"입니다.");
			} else {//반지름이 0보다 크다가 F일 때
				System.out.println("반지름이 음수로 입력됐습니다. 다시 입력해주세요.");
			}
			break;

		default: //사용자가 T,R,C를 제외한 알파벳을 입력했을 때
			System.out.println("입력하신 알파벳에 해당되는 도형이 없습니다. R, T, C 중에 입력해주세요.");
			break;
		}
		

	}

	/* 입력한 답변이 퀴즈의 숫자보다 작습니다. */

}
