package understandingIncrease;

import java.util.Scanner;

public class SemesterAverage2 {

	public static void main(String[] args) {
		// 각 과목의 점수를 입력하면, 해당 학기의 총점과 평균을 출력하는 프로그램

		// 각 과목의 점수를 입력받는 스캐너
		Scanner input = new Scanner(System.in);
		Scanner inputReset= new Scanner(System.in);

		int subjectScore;
		int totalScore; // 총점 변수
		double average; // 평균 변수
		
		String subject; //과목 명
		String subject1="";
		String subject2="";
		String subject3="";
		String subject4="";
		String subject5="";
		
		int subjectNum=0; //과목의 수
		int subjectScore1=0;
		int subjectScore2=0;
		int subjectScore3=0;
		int subjectScore4=0;
		int subjectScore5=0;
		
		
		String reset; //리셋버튼
		

		// 각 과목들의 점수를 입력받음
		System.out.println("이 프로그램은 점수의 총합과 평균을 구합니다. \n최대 5개까지 과목의 점수를 입력할 수 있습니다.\n");
		System.out.println("(조건) : 단, 모든 과목은 정수으로 입력하며 0과 같거나 크고 100과 같거나 작게 입력해주세요(예:80)");
		
		do {
			for(subjectNum=1;subjectNum<=5;subjectNum++) {
				
					System.out.println(subjectNum+"번째 과목명을 입력해주세요 ");
					subject=inputReset.nextLine();
					
				do {
					System.out.println("해당 과목의 점수를 입력해주세요 : ");
					subjectScore=input.nextInt();
					if(subjectScore<0){
						System.out.println("점수를 0이상으로 입력해주세요");
					} else if(subjectScore>100){
						System.out.println("점수를 100점 이하로 입력해주세요");
					} else {
						break;
					}
				}while(true);
				
				switch (subjectNum) {
				case 1:
					subject1=subject;
					subjectScore1=subjectScore;
					break;
				case 2:
					subject2=subject;
					subjectScore2=subjectScore;
					break;
				case 3:
					subject3=subject;
					subjectScore3=subjectScore;
					break;
				case 4:
					subject4=subject;
					subjectScore4=subjectScore;
					break;
				case 5:
					subject5=subject;
					subjectScore5=subjectScore;
					
					//계산식 수행
					totalScore=subjectScore1+subjectScore2+subjectScore3+subjectScore4+subjectScore5;
					average=(double)totalScore/subjectNum;
					
					//결과 출력
					System.out.println(subject1+" : "+subjectScore1+"점");
					System.out.println(subject2+" : "+subjectScore2+"점");
					System.out.println(subject3+" : "+subjectScore3+"점");
					System.out.println(subject4+" : "+subjectScore4+"점");
					System.out.println(subject5+" : "+subjectScore5+"점");
					System.out.println();
					System.out.println("총점 : "+totalScore+"점 평균 : "+average+"점");
					break;
				}
			}
			// 결과 출력 종료의 여부를 물음
			System.out.println("계속하여 프로그램을 사용하시겠습니까? (Y/y)");
			reset = inputReset.nextLine();
	} while (('y' == reset.charAt(0)) || ('Y' == reset.charAt(0)));
					
	System.out.println("\n\n~~~~~~프로그램을 종료합니다~~~~~~");
		
		

	}

}
