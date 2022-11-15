package controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.StudentVO;

public class StudentRegisterManager {

	// 학생등록
	public void studentRegister() throws Exception {
		Scanner input = new Scanner(System.in);

		StudentVO stvo = new StudentVO();
		StudentDAO std = new StudentDAO();
		SubjectDAO sjd = new SubjectDAO();

		String sd_num;// 학번
		String sd_name;// 이름
		String sd_id;// 아이디
		String sd_passwd;// 패스워드
		String s_num;// 학과번호/FK
		String sd_birthday;// 생년월일
		String sd_phone;// 핸드폰번호
		String sd_address;// 주소
		String sd_email;// 이메일

		boolean id_check;
		String year;

		System.out.println("학생 정보 입력");
		System.out.print("성명 : ");
		sd_name = input.nextLine();
		do {
			System.out.print("\n아이디(8자 이상 12자 이내) : ");
			sd_id = input.nextLine();
			id_check = std.getStudentIdOverlap(sd_id);
			if (id_check) {
				System.out.println("중복된 아이디가 존재합니다. 다시 입력하세요."); // 다시 반복
			}
		} while (id_check);
		System.out.print("\n비밀번호 (12자 이내) : ");
		sd_passwd = input.nextLine();

		// 학과를 보여줌으로써 학과번호를 선택하게 해준다.
		sjd.getSubjectTotalList();
		System.out.print("\n학과번호 : ");
		s_num = input.nextLine();

		// 학생번호는 8자리로 생성한다.(연도2자리+학과2자리+일련번호)
		SimpleDateFormat f = new SimpleDateFormat("yy");
		year = f.format(new Date());

		sd_num = year + s_num + std.getStudentCount(s_num);

		System.out.print("\n생년월일(8자리) : ");
		sd_birthday = input.nextLine();
		System.out.print("\n전화번호 : ");
		sd_phone = input.nextLine();
		System.out.print("\n도로명 주소 : ");
		sd_address = input.nextLine();
		System.out.print("\n이메일 : ");
		sd_email = input.nextLine();

		stvo.setSd_num(sd_num);
		stvo.setSd_name(sd_name);
		stvo.setSd_id(sd_id);
		stvo.setSd_passwd(sd_passwd);
		stvo.setS_num(s_num);
		stvo.setSd_birthday(sd_birthday);
		stvo.setSd_phone(sd_phone);
		stvo.setSd_address(sd_address);
		stvo.setSd_email(sd_email);

		std.setStudentRegiste(stvo);

		System.out.println("\n등록 학생 정보");
		std.getStudent(stvo.getSd_id(), stvo.getSd_passwd());
	}

	// 학생정보수정
	public void studentUpdate() throws Exception {
		Scanner inputA = new Scanner(System.in);
		Scanner inputB = new Scanner(System.in);

		StudentVO sdvo = new StudentVO();
		StudentDAO sdao = new StudentDAO();

		String id; // 아이디
		String pw; // 입력 비밀번호
		boolean success; // 로그인 성공 여부

		String sd_num;// 학번
		String sd_passwd;// 수정비밀번호
		String sd_phone;// 수정 전화번호
		String sd_address;// 수정 주소
		String sd_email;// 수정 이메일

		String reset;
		int count = 0;

		System.out.println("학생 정보 수정");
		// 로그인 접속
		do {
			System.out.println("로그인 시도 가능 회수(" + count + "/3)");

			count++;
			System.out.print("아이디 : ");
			id = inputA.nextLine();
			System.out.print("\n비밀번호 : ");
			pw = inputA.nextLine();
			success = sdao.setStudentLogin(id, pw);
			if (!success) {
				if (count == 3) {
					System.out.println("로그인 시도 회수 초과로 메인화면으로 돌아갑니다.\n");
					return;
				}
				System.out.println("\n일치하는 아이디 혹은 비밀번호가 없습니다. 다시 입력하시겠습니까 ? (y/n)");
				reset = inputB.nextLine();
				if ('n' == reset.charAt(0) || 'N' == reset.charAt(0)) {
					return;
				}
			}
		} while (!success);

		// 수정 시작
		sd_num = sdao.getStudentNum(id, pw);

		System.out.println("수정할 학생의 학생번호 : " + sd_num);

		System.out.print("비밀번호 (12자 이내) : ");
		sd_passwd = inputA.nextLine();
		System.out.print("\n전화번호 : ");
		sd_phone = inputA.nextLine();
		System.out.print("\n도로명 주소 : ");
		sd_address = inputA.nextLine();
		System.out.print("\n이메일 : ");
		sd_email = inputA.nextLine();

		// 입력값 set
		sdvo.setSd_num(sd_num);
		sdvo.setSd_passwd(sd_passwd);
		sdvo.setSd_phone(sd_phone);
		sdvo.setSd_address(sd_address);
		sdvo.setSd_email(sd_email);

		// sql문 실행으로 수정
		sdao.setStudentUpdate(sdvo);

		System.out.println();
		// 학생정보 출력
		sdao.getStudent(id, sdvo.getSd_passwd());
		System.out.println();
	}

	// 학생목록
	public void studentTotalList() throws Exception {
		Scanner input = new Scanner(System.in);
		Scanner inputA = new Scanner(System.in);
		StudentDAO sdao = new StudentDAO();

		String pw;
		String reset;
		int count = 0;
		System.out.println("학생 정보 전체 목록");

		do {
			System.out.println("\n로그인 시도 가능 회수(" + count + "/3)");

			count++;
			System.out.print("관리자 비밀번호 : ");
			pw = input.nextLine();
			if (pw.equals("soobin0617")) {
				// sql문 실행
				sdao.getStudentTotalList();
			} else {
				if (count == 3) {
					System.out.println("로그인 시도 회수 초과로 메인화면으로 돌아갑니다.\n");
					return;
				}
				System.out.println("\n관리자 비밀번호가 틀립니다.");
				System.out.println("다시 입력하시겠습니까 ? (y/n)");
				reset = input.nextLine();
				if ('n' == reset.charAt(0) || 'N' == reset.charAt(0)) {
					return;
				}
			}
		} while (!(pw.equals("soobin0617")));

	}
}
