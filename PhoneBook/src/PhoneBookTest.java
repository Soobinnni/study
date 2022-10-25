import phoneBookClass.*;
import selectInterface.*;
import extra.*;

public class PhoneBookTest {

	public static void main(String[] args) {
		// PhoneBookManager 생성자
		// private PhoneBookManager() {
		// readFromFile(); // 저장된 파일
		//
		// public static PhoneBookManager createManagerInst() {
		// if (inst == null) {
		// inst = new PhoneBookManager();
		// }
		// return inst;
		// }
		PhoneBookManager manager = PhoneBookManager.createManagerInst();

		int choice;

		while (true) {
			try {
				MenuViewer.showMenu();
				choice = MenuViewer.keyboard.nextInt();

				if ((choice < Menu.INPUT) || (choice > Menu.END)) {
					throw new MenuChoiceException(choice);
				}
				switch (choice) {
				case Menu.INPUT:
					manager.inputData();
					System.out.println();
					break;
				case Menu.SEARCH:
					manager.searchData();
					System.out.println();
					break;
				case Menu.DELETE:
					manager.deleteData();
					System.out.println();
					break;
				case Menu.END:
					manager.storeToFile();
					System.out.println("프로그램을 종료합니다.");
					System.out.println();
					return;
				}
			} catch (MenuChoiceException e) {
				e.showWrongChoice();
				System.out.println("메뉴 선택을 처음부터 다시 진행합니다.\n");
			}
		}

	}

}
