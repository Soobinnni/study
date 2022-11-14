import controller.*;
import model.*;
import view.*;

public class UniversityRegisterCoursesMain {
	//메인 메서드	
	public static void main(String[] args) {
		mainMenu();
	}
	//메인메뉴 메서드
	public static void mainMenu() {
		int choiceNum;
		while (true) {
			try {
				MenuViewer.mainMenuView();
				choiceNum = MenuViewer.choice.nextInt();
				MenuViewer.choice.nextLine();
				
				//메뉴 선택
				switch (choiceNum) {
				case MENU_CHOICE.SUBJECT: //학과
					subjectMenu();
					break;
				case MENU_CHOICE.STUDENT: //학생
					studentMenu();
					break;
				case MENU_CHOICE.LESSON: //과목
					lessonMenu();
					break;
				case MENU_CHOICE.TRAINEE: //수강
					traineeMenu();
					break;
				case MENU_CHOICE.EXIT:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("해당 메뉴 번호만 입력하세요.");
					break;
				}
			} catch (Exception e) {
				System.out.println("\n입력에 오류가 있습니다.\n프로그램을 다시 시작하세요");
				return;
			}
		}
	}
	//1. 학과 메뉴 메서드
	public static void subjectMenu() throws Exception{
		int choice;
		
		SubjectRegisterManager subjectManager = new SubjectRegisterManager();
		MenuViewer.subjectMenu();
		choice = MenuViewer.choice.nextInt();
		MenuViewer.choice.nextLine();
		
		switch (choice) {
		case SUBJECT_CHOICE.LIST:
			System.out.println("");
			subjectManager.subjectList();
			break;
		case SUBJECT_CHOICE.INSERT:
			System.out.println("");
			subjectManager.subjectRegister();
			break;
		case SUBJECT_CHOICE.UPDATE:
			System.out.println("");
			subjectManager.subjectUpdate();
			break;
		case SUBJECT_CHOICE.DELETE:
			System.out.println("");
			subjectManager.subjectDelete();
			break;
		case SUBJECT_CHOICE.MAIN:
			return;
		default:
			System.out.println("해당 메뉴 번호만 입력하세요.");
			break;
		}
	}
	//2. 학생 메뉴 메서드
	public static void studentMenu()throws Exception {
		int choice;
		
		StudentRegisterManager studentManager = new StudentRegisterManager();
		MenuViewer.studentMenu();
		choice = MenuViewer.choice.nextInt();
		MenuViewer.choice.nextLine();
		
		switch (choice) {
		case STUDENT_CHOICE.INSERT:
			System.out.println("");
			studentManager.studentRegister();
			break;
		case STUDENT_CHOICE.UPDATE:
			System.out.println("");
			studentManager.studentUpdate();
			break;
		case STUDENT_CHOICE.LIST:
			System.out.println("");
			studentManager.studentTotalList();
			break;
		case STUDENT_CHOICE.MAIN:
			return;
		default:
			System.out.println("해당 메뉴 번호만 입력하세요.");
			break;
		}
	}
	//3. 과목 메뉴 메서드
	public static void lessonMenu() throws Exception{
		int choice;
		
		LessonRegisterManager lessonManager = new LessonRegisterManager();
		MenuViewer.lessonMenu();
		choice = MenuViewer.choice.nextInt();
		MenuViewer.choice.nextLine();

		switch (choice) {
		case LESSON_CHOICE.LIST:
			System.out.println("");
			lessonManager.lessonList();
			break;
		case LESSON_CHOICE.INSERT:
			System.out.println("");
			lessonManager.lessonRegister();
			break;
		case LESSON_CHOICE.UPDATE:
			System.out.println("");
			lessonManager.lessonUpdate();
			break;
		case LESSON_CHOICE.DELETE:
			System.out.println("");
			lessonManager.lessonDelete();
			break;
		case LESSON_CHOICE.MAIN:
			return;
		default:
			System.out.println("해당 메뉴 번호만 입력하세요.");
			break;
		}
	}
	//4. 수강신청메뉴 메서드
	public static void traineeMenu() throws Exception{
		int choice;

		TraineeRegisterManager traineeManager = new TraineeRegisterManager();
		MenuViewer.traineeMenu();
		choice = MenuViewer.choice.nextInt();
		MenuViewer.choice.nextLine();
		
		switch (choice) {
		case TRAINEE_CHOICE.LIST:
			System.out.println("");
			traineeManager.traineeList();
			break;
		case TRAINEE_CHOICE.INSERT:
			System.out.println("");
			traineeManager.traineeRegister();
			break;
		case TRAINEE_CHOICE.UPDATE:
			System.out.println("");
			traineeManager.traineeDelete();
			break;
		case TRAINEE_CHOICE.MAIN:
			return;
		default:
			System.out.println("해당 메뉴 번호만 입력하세요.");
			break;
		}
	}
}
