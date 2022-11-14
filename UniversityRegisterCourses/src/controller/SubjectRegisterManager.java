package controller;

import java.sql.SQLException;
import java.util.Scanner;

import model.SubjectVO;

public class SubjectRegisterManager {
	// 학과 목록
	public void subjectList() throws Exception {
		SubjectDAO sd = new SubjectDAO();
		System.out.println("학과 전체 리스트");
		sd.getSubjectTotalList();
		System.out.println();
	}

	// 학과 등록 관리
	public void subjectRegister() throws Exception {
		Scanner input = new Scanner(System.in);

		SubjectDAO sd = new SubjectDAO();
		SubjectVO svo = new SubjectVO();

		String s_num; // 학과 번호
		String s_name; // 학과명

		System.out.println("학과 전체 리스트");
		sd.getSubjectTotalList();// 전체 리스트를 보여줌
		System.out.println();

		System.out.println("==학과 정보 입력==");
		System.out.print("학과 번호 : ");
		s_num = input.nextLine();
		System.out.println();
		System.out.print("학과명 : ");
		s_name = input.nextLine();
		System.out.println();

		svo.setS_num(s_num);
		svo.setS_name(s_name);

		sd.setSubjectRegiste(svo);
		System.out.println("\n학과 전체 리스트");
		sd.getSubjectTotalList();
		System.out.println();
	}

	public void subjectUpdate() throws Exception {
		// 스캐너와 변수 선언
		Scanner inputA = new Scanner(System.in);
		Scanner inputB = new Scanner(System.in);

		SubjectVO svo = new SubjectVO();
		SubjectDAO sd = new SubjectDAO();

		int no; // 일련번호
		String s_num; // 학과 번호
		String s_name; // 학과 이름

		// 학과 전체 리스트 & 입력요청 & set
		System.out.println("학과 전체 리스트");
		sd.getSubjectTotalList();
		System.out.println();

		System.out.println("수정할 학과 일련번호 입력");
		System.out.print("일련번호 : ");
		no = inputA.nextInt();
		System.out.println("\n새로운 정보를 모두 입력");
		System.out.print("학과 번호 : ");
		s_num = inputB.nextLine();
		System.out.print("학과명 : ");
		s_name = inputB.nextLine();
		
		svo.setNo(no);
		svo.setS_num(s_num);
		svo.setS_name(s_name);
		
		//set한 값을 SubjectDAO의 setSubjectUpdate()메서드를 호출하여 sql문 수행
		sd.setSubjectUpdate(svo);
		
		//변경된 결과의 리스트를 보여준다.
		System.out.println();
		System.out.println("학과 전체 리스트");
		sd.getSubjectTotalList();
		System.out.println();
	}

	public void subjectDelete() throws Exception {
		Scanner input = new Scanner(System.in); 
		
		SubjectVO svo = new SubjectVO();
		SubjectDAO sd = new SubjectDAO();
		
		int no; //일련번호
		
		System.out.println("학과 전체 리스트");
		sd.getSubjectTotalList();
		System.out.println();
		
		System.out.println("삭제할 학과 일련번호 입력");
		System.out.print("일련번호 : ");
		no = input.nextInt();
		
		svo.setNo(no);
		sd.setSubjectDelete(svo);
		
		//변경된 결과의 리스트를 보여준다.
		System.out.println();
		System.out.println("학과 전체 리스트");
		sd.getSubjectTotalList();
		System.out.println();
	}

}
