package controller;

import java.util.Scanner;

import model.LessonVO;

public class LessonRegisterManager {
	// 과목 리스트
	public void lessonList() throws Exception {
		LessonDAO ld = new LessonDAO();
		System.out.println("과목 전체 리스트");
		ld.getLessonTotalList();
		System.out.println();
	}

	// 과목 등록
	public void lessonRegister() throws Exception {
		// 스캐너
		Scanner input = new Scanner(System.in);

		// 변수 선언
		String l_abbre;// 과목약어
		String l_name;// 과목이름
		LessonDAO ld = new LessonDAO();
		LessonVO lvo = new LessonVO();

		System.out.println("과목 전체 리스트");
		ld.getLessonTotalList();// 전체 리스트를 보여줌
		System.out.println();

		System.out.println("==과목 정보 입력==");
		System.out.print("과목 약어 : ");
		l_abbre = input.nextLine();
		System.out.println();
		System.out.print("과목명 : ");
		l_name = input.nextLine();
		System.out.println();

		lvo.setL_abbre(l_abbre);
		lvo.setL_name(l_name);

		ld.setLessonRegiste(lvo);
		System.out.println("\n학과 전체 리스트");
		ld.getLessonTotalList();
		System.out.println();
	}

	// 과목 수정
	public void lessonUpdate() throws Exception {
		// 스캐너
		Scanner inputA = new Scanner(System.in);
		Scanner inputB = new Scanner(System.in);

		// 변수 선언
		String l_abbre;// 과목약어
		String l_name;// 과목이름
		int no; // 일련번호
		LessonDAO ld = new LessonDAO();
		LessonVO lvo = new LessonVO();

		System.out.println("과목 전체 리스트");
		ld.getLessonTotalList();// 전체 리스트를 보여줌
		System.out.println();

		// 수정
		System.out.println("수정할 과목 일련번호 입력");
		System.out.print("일련번호 : ");
		no = inputA.nextInt();
		System.out.println("\n새로운 정보를 모두 입력");
		System.out.print("과목약어 : ");
		l_abbre = inputB.nextLine();
		System.out.print("과목명 : ");
		l_name = inputB.nextLine();

		// 수정 내용 set
		lvo.setNo(no);
		lvo.setL_abbre(l_abbre);
		lvo.setL_name(l_name);

		// set한 값을 LessonDAO의 setLessonUpdate()메서드를 호출하여 sql문 수행
		ld.setLessonUpdate(lvo);

		// 변경된 결과의 리스트를 보여준다.
		System.out.println();
		System.out.println("과목 전체 리스트");
		ld.getLessonTotalList();
		System.out.println();
	}

	// 과목 삭제
	public void lessonDelete() throws Exception {
		// 스캐너
		Scanner input = new Scanner(System.in);

		// 변수 선언
		int no; // 일련번호
		LessonDAO ld = new LessonDAO();
		LessonVO lvo = new LessonVO();

		System.out.println("과목 전체 리스트");
		ld.getLessonTotalList();// 전체 리스트를 보여줌
		System.out.println();

		System.out.println("삭제할 과목 일련번호 입력");
		System.out.print("일련번호 : ");
		no = input.nextInt();

		lvo.setNo(no);
		ld.setLessonDelete(lvo);

		// 변경된 결과의 리스트를 보여준다.
		System.out.println();
		System.out.println("학과 전체 리스트");
		ld.getLessonTotalList();
		System.out.println();
	}

}
