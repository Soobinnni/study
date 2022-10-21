
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import student.*;

public class StudentMain {

	static Scanner input = new Scanner(System.in);
	static Scanner input2 = new Scanner(System.in);

	// 학생정보객체배열 --ArrayList의 Student객체
	static ArrayList<Student> infoStudent = new ArrayList<>();
	static Student[] info = new Student[30];

	// 메인 메소드
	public static void main(String[] args) {

		// 변수
		int choice; // 1~5번 중의 정수를 택해 메뉴를 넘기기 위한 변수
		Student inputData = null;
		boolean isAdded = false;

		// 객체들을 생성 -info객체배열의 크기(30)만큼 객체를 생성한다.
		for (int i = 0; i < info.length; i++) {
			info[i] = new Student();
		}

		do {
			showMenu();
			choice = input.nextInt();

			switch (choice) {
			case 1:
				// Student inputDatea = new Student(name, address, tel, grade)
				inputData = inputInfo();
				isAdded = infoStudent.add(inputData);
				if (isAdded == true) {
					System.out.println("\n데이터 입력이 완료됐습니다.");
				} else {
					System.out.println("데이터 입력이 저장되지 못했습니다.");
				}
				break;
			case 2:
				nameInput();
				break;
			case 3:
				deleteInfo();
				break;
			case 4:
				infoList();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("프로그램 번호는 1~5번 중에 선택할 수 있습니다.\n");
				return;

			}
		} while (true);

	}

	// 메뉴 메소드
	public static void showMenu() {
		System.out.println("학생정보등록프로그램");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 이름으로 검색");
		System.out.println("3. 학생 이름으로 삭제");
		System.out.println("4. 전체 학생 목록");
		System.out.println("5. 프로그램종료");
		System.out.println("선택");
	}

	// 1. 학생 정보 입력 메소드
	public static Student inputInfo() {
		// 입력받는 변수
		String name;
		String address;
		String tel;
		String grade;

		System.out.println("이름 : ");
		name = input.next();
		System.out.println("주소 : ");
		address = input2.nextLine();
		System.out.println("전화번호 : ");
		tel = input.next();
		System.out.println("학년 : ");
		grade = input2.nextLine();

		return new Student(name, address, tel, grade);
	}

	// 2. 학생 이름 검색 메소드
	//2-1. 검색어(이름)받기
	public static void nameInput() {
		String inputName; //사용자에게 입력받을 검색어(이름)
		Student info; //검색어로 찾아온 학생정보
		System.out.println("이름으로 학생정보를 불러옵니다.");
		System.out.println("이름을 입력하세요 : ");
		inputName=input.next();
		
		info = searchInfo(inputName);
		if (info==null) {
			System.out.println("해당하는 데이터가 존재하지 않습니다.");
		} else {
			System.out.println("검색된 학생 정보");
			info.showStudentInfo();
			System.out.println("데이터 검색이 완료됐습니다.\n");
			
		}
	}
	//2-2. 검색어로 학생정보 불러오기
	public static Student searchInfo(String name) {
		Iterator<Student> itr = infoStudent.iterator(); // iterator()메소드 :토큰 또는 객체별로 인덱스 순 나열
		//.hasNext()는 boolean 값을 반환
		while(itr.hasNext()) {
			Student right = itr.next();
			if (name.compareTo(right.getName())==0) {
				return right;
			}
		}
		return null;
	}


	// 3. 학생 이름 삭제 메소드
	public static void deleteInfo() {
		String deleteName; // 삭제할 이름

		System.out.println("데이터 삭제를 시작합니다.");

		System.out.println("\n이름 : ");
		deleteName = input.next();

		// 반복기 생성
		Iterator<Student> itr = infoStudent.iterator();
		while(itr.hasNext()) {
			Student a = itr.next();
			if (deleteName.compareTo(a.getName())==0) {
				itr.remove(); //반드시 .next()메소드와 함께 쓰이는데, next()에서 가져온 값을 컬렉션에서 삭제한다.
				System.out.println("데이터를 삭제합니다.");
				return;//해당 메소드 종료. 찾았으니까
			} 
		}
		System.out.println("해당 데이터가 없습니다.");

	}

	// 4. 전체 학생 목록
	public static void infoList() {
		for (Student student : infoStudent) {
			System.out.println(student+"\n");
		}
	}
}
