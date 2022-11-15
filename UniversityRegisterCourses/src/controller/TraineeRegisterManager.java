package controller;

import java.util.Scanner;

import model.TraineeVO;

public class TraineeRegisterManager {

	TraineeDAO tdao = null;
	//수강신청 목록
	public void traineeList() throws Exception {
		Scanner input = new Scanner(System.in);
		Scanner inputA = new Scanner(System.in);
		
		StudentDAO sdao = new StudentDAO();
		TraineeDAO tdat = new TraineeDAO();
		
		String id;
		String pw;
		boolean success = false;
		String sd_num;
		
		int count = 0; 
		String reset;

		do {
			System.out.println("로그인 시도 가능 회수("+count+"/3)");

			count++;
			System.out.print("아이디 : ");
			id = input.nextLine();
			System.out.print("\n비밀번호 : ");
			pw = input.nextLine();
			success = sdao.setStudentLogin(id, pw);
			if (!success) {
				if (count==3) {
					System.out.println("로그인 시도 회수 초과로 메인화면으로 돌아갑니다.\n");
					return;
				}
				System.out.println("\n일치하는 아이디 혹은 비밀번호가 없습니다. 다시 입력하시겠습니까 ? (y/n)");
				reset = inputA.nextLine();
				if ('n'==reset.charAt(0)||'N'==reset.charAt(0)) {
					return;
				} 
			}	
		} while (!success);
		//로그인 내용을 이용하여 학번을 가져온다.
		sd_num=sdao.getStudentNum(id, pw);
		//학번을 토대로 수강신청 이력을 보여준다.
		System.out.println("\n====수강신청한 리스트====");
		tdat.getTraineeTotalList(sd_num);
		System.out.println();
	}
	//수강신청
	public void traineeRegister() throws Exception {
		// 스캐너
		Scanner input = new Scanner(System.in);
		Scanner inputA = new Scanner(System.in);

		// 변수 선언 no, sd_num, l_abbre, t_section, t_date
		tdao = new TraineeDAO();
		StudentDAO sdao = new StudentDAO();
		LessonDAO lsdao = new LessonDAO();
		
		String id;
		String pw;
		boolean success;
		
		int count = 0;
		String reset;
		
		String sd_num; // 학생번호 StudentVO FK
		String l_abbre; // 과목 약어 LessonVO FK
		String t_section;// 과목 구분
		
		System.out.println("수강 가능 과목 전체 리스트");
		//과목목록을 보여준다.
		lsdao.getLessonTotalList();
		System.out.println();

		System.out.println("수강신청을 위한 정보 입력");
		// 로그인 접속
			do {
				System.out.println("로그인 시도 가능 회수("+count+"/3)");

				count++;
				System.out.print("아이디 : ");
				id = input.nextLine();
				System.out.print("\n비밀번호 : ");
				pw = input.nextLine();
				success = sdao.setStudentLogin(id, pw);
				if (!success) {
					if (count==3) {
						System.out.println("로그인 시도 회수 초과로 메인화면으로 돌아갑니다.\n");
						return;
					}
					System.out.println("\n일치하는 아이디 혹은 비밀번호가 없습니다. 다시 입력하시겠습니까 ? (y/n)");
					reset = inputA.nextLine();
					if ('n'==reset.charAt(0)||'N'==reset.charAt(0)) {
						return;
					} 
				}
			} while (!success);
		
		//로그인 한 정보로 학생번호 가져오기
		sd_num=sdao.getStudentNum(id, pw);
		System.out.println("학번 : "+sd_num);
		
		//입력
		System.out.println("수강신청 정보 입력");

		System.out.print("과목 약어 입력 : ");
		l_abbre = input.nextLine();
		System.out.print("\n과목 구분 입력(전공, 부전공, 교양 중 택1)");
		t_section = input.nextLine();
		System.out.println();
		
		//입력받은 값 set하기
		TraineeVO tvo = new TraineeVO();
		tvo.setSd_num(sd_num);
		tvo.setL_abbre(l_abbre);
		tvo.setT_section(t_section);
		
		// 등록 sql실행			
		tdao.TraineeRegister(tvo);
		
		//등록 완료 목록 보여주기
		System.out.println("\n수강신청한 리스트");
		//신청 해당 학생의 목록만 보여주는 sql문 실행
		tdao.getTraineeTotalList(tvo.getSd_num());
		System.out.println();
	}
	//수강신청 취소
	public void traineeDelete() throws Exception {
		Scanner input = new Scanner(System.in);
		Scanner inputA = new Scanner(System.in);
		
		TraineeDAO tdao = new TraineeDAO();
		StudentDAO sdao = new StudentDAO();
		
		int no;
		String sd_num; //학번
		String id;
		String pw;
		boolean success=false;
		int count = 0; 
		String reset;

		
		System.out.println("수강취소를 위한 정보 입력");
		// 로그인 접속
		do {
			System.out.println("로그인 시도 가능 회수("+count+"/3)");

			count++;
			System.out.print("아이디 : ");
			id = input.nextLine();
			System.out.print("\n비밀번호 : ");
			pw = input.nextLine();
			success = sdao.setStudentLogin(id, pw);
			if (!success) {
				if (count==3) {
					System.out.println("로그인 시도 회수 초과로 메인화면으로 돌아갑니다.\n");
					return;
				}
				System.out.println("\n일치하는 아이디 혹은 비밀번호가 없습니다. 다시 입력하시겠습니까 ? (y/n)");
				reset = inputA.nextLine();
				if ('n'==reset.charAt(0)||'N'==reset.charAt(0)) {
					return;
				} 
			}
		} while ((!success));
		//학번 가져오기
		sd_num = sdao.getStudentNum(id, pw);
		
		System.out.println();
		System.out.println("수강신청한 리스트");
		//학번으로 sql조건 완성하고 해당하는 학생의 수강신청 리스트 가져오기
		tdao.getTraineeTotalList(sd_num);
		
		System.out.println("취소할 수강신청 일련번호 입력");
		System.out.print("일련번호 : ");
		no = input.nextInt();
		
		//일련번호로 sql문 실행
		tdao.TraineeDelete(no);
		
		System.out.println("\n수강 취소 후 리스트");
		tdao.getTraineeTotalList(sd_num);
		System.out.println();
	}

}
