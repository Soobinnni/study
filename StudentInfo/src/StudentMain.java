import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import student.Student2;

import student.Student2;

public class StudentMain {
	static int choice;
	// 객체배열리스트
	static ArrayList<Student2> studentList = new ArrayList<>();
	// 객체배열
	static Student2[] infoInput = new Student2[30];
	// 스캐너
	static Scanner input1 = new Scanner(System.in);
	static Scanner input2 = new Scanner(System.in);

	public static void main(String[] args) {
		// 변수
		Student2 getInfo;

		for (int j = 0; j < infoInput.length; j++) {
			infoInput[j] = new Student2();
		}

		System.out.println("학생 정보 등록 프로그램\n");
		do {
			// 메뉴 메소드 호출
			menu();
			switch (choice) {
			case 1:
				// 정보 입력요구
				getInfo = inputInfo();
				if (studentList.add(getInfo) == true) {
					System.out.println("데이터 입력이 완료됐습니다.");
				} else {
					System.out.println("데이터가 저장되지 않았습니다.");
				}
				break;
			case 2:
				// 학생이름으로 검색
				search();
				break;
			case 3:
				// 학생 이름으로 삭제
				break;
			case 4:
				// 전체 학생 목록
				for (Student2 student2 : infoInput) {
					System.out.println(student2);
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				System.out.println("프로그램은 1~6번으로 선택해야합니다.");
			}
		} while (true);
	}

	// 메뉴 메소드
	public static void menu() {
		System.out.println("선택하세요...");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 이름으로 검색");
		System.out.println("3. 학생 이름으로 삭제");
		System.out.println("4. 전체 학생 목록");
		System.out.println("5. 프로그램 종료");
		System.out.println("선택 : ");
		choice = input1.nextInt();
	}

	// switch 1 : 정보 입력
	public static Student2 inputInfo() {
		String name;
		String address;
		String tel;
		String grade;

		System.out.println("이름: ");
		name = input1.next();
		System.out.println("주소: ");
		address = input2.nextLine();
		System.out.println("전화번호: ");
		tel = input1.next();
		System.out.println("학년: ");
		grade = input2.nextLine();

		Student2 a = new Student2(name, address, tel, grade);
		return a;
	}

	// switch 2. 학생 이름검색
	public static void search() {
		System.out.println("찾으려는 이름을 입력하세요 : ");
		String name = input1.next();
		data(name);

	}

	// switch 2-1. 학생 이름 검색으로 객체 내용 불러오기
	public static void data(String name) {
		Iterator<Student2> itr = studentList.iterator();
		while (itr.hasNext()) {
			Student2 compare = itr.next();
			if (name.compareTo(compare.getName()) == 0) {
				System.out.println("검색된 학생 정보\n");
				compare.giveAList();
				return;
			} else {
				System.out.println("입력한 데이터가 존재하지 않습니다.");
				return;
			}
		}
	}
}