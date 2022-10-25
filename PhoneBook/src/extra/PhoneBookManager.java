package extra;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;

import selectInterface.*;

import phoneBookClass.*;

public class PhoneBookManager {
	// <필드>
	// 저장할 파일명
	private final File dateFile = new File("PhoneBook.dat");
	// 컬렉션 생성 -- 컬렉션은 데이터 군을 저장하는 클래스들을 표준화한 설계며 컬렉션은 객체만 담을 수 있다. PhoneInfo객체들의 데이터
	// 군
	HashSet<PhoneInfo> infoStorage = new HashSet<>();

	static PhoneBookManager inst = null;
	PhoneInfo info = new PhoneInfo();

	// 객체가 하나만 생성되도록 함. null값이면 새로 생성하고 null이 아니면 inst를 반환하라
	public static PhoneBookManager createManagerInst() {
		if (inst == null) {
			inst = new PhoneBookManager();
		}
		return inst;
	}

	// 생성자
	private PhoneBookManager() {
		readFromFile(); // 저장된 파일
	}

	// 메서드
	private PhoneInfo readFriendInfo() {
		System.out.println("이름 : ");
		String name = MenuViewer.keyboard.next();
		System.out.println("전화번호 : ");
		String tel = MenuViewer.input.nextLine();
		PhoneInfo a = new PhoneInfo(name, tel);
		return a;
	}

	private PhoneInfo readUnivFriendInfo() {
		System.out.println("이름 : ");
		String name = MenuViewer.keyboard.next();
		System.out.println("전화번호 : ");
		String tel = MenuViewer.input.nextLine();
		System.out.println("학과 : ");
		String major = MenuViewer.keyboard.next();
		System.out.println("학년 : ");
		int year = MenuViewer.input.nextInt();
		PhoneInfo a = new PhoneUnivInfo(name, tel, major, year);
		return a;
	}

	private PhoneInfo readCompanyFriendInfo() {
		System.out.println("이름 : ");
		String name = MenuViewer.keyboard.next();
		System.out.println("전화번호 : ");
		String tel = MenuViewer.inputKeyboard.nextLine();
		System.out.println("회사명 : ");
		String company = MenuViewer.input.nextLine();
		PhoneInfo a = new PhoneCompanyInfo(name, tel, company);
		return a;
	}

	// 정보 입력메서드--입력에서 오류가 나면 MenuChoiceException으로 예외를 던짐
	public void inputData() throws MenuChoiceException {
		int choice; // 번호 선택
		boolean isAdded; // 입력한 데이터 저장 확인
		System.out.println("데이터 입력을 시작합니다.");
		System.out.println("============================");
		System.out.println("1. 일반   2.대학   3.회사");
		System.out.println("============================");
		System.out.println("선택 : ");
		choice = MenuViewer.keyboard.nextInt();

		// 번호가 1~3번에서 벗어나면 MenuChoiceException으로 던짐
//		public MenuChoiceException(int choice) {
//			super("잘못된 선택이 이뤄졌습니다"); //Exception 을 따름
//			wrongChoice = choice;
//		}
		if ((Select.NORMAL > choice) || (Select.COMPANY < choice)) {
			throw new MenuChoiceException(choice);
		}

		switch (choice) { // PhoneInfo info = new PhoneInfo(); & readFriend~Info에는 PhoneInfo참조변수
		case Select.NORMAL:
			info = readFriendInfo();
			break;
		case Select.UNI:
			info = readUnivFriendInfo();
			break;
		case Select.COMPANY: 
			info = readCompanyFriendInfo();
			break;
		}

		// private final File dateFile = new File("PhoneBook.dat");
		// HashSet<PhoneInfo> infoStorage = new HashSet<>();
		isAdded = infoStorage.add(info);
		if (isAdded) {
			System.out.println("데이터 입력이 완료됐습니다.\n");
		} else {
			System.out.println("이미 저장된 데이터입니다.\n"); // Set유형이므로
		}
	}
	//이름으로 검색
	public void searchData() {
		String name;
		System.out.println("이름을 입력하세요 : ");
		name=MenuViewer.input.next();
		
		PhoneInfo info = search(name);
		if (info == null) {
			System.out.println("해당하는 데이터가 존재하지 않습니다.\n");
		} else {
			info.showPhoneInfo();
			System.out.println("데이터 검색이 완료되었습니다.");
		}
	}
	// 이름으로 삭제하는 메소드
	public void deleteData() {
		String name;
		System.out.println("데이터 삭제를 시작합니다..");
		System.out.println("이름 : ");
		name = MenuViewer.keyboard.next();

		Iterator<PhoneInfo> itr = infoStorage.iterator();
		while (itr.hasNext()) {
			PhoneInfo curInfo = (PhoneInfo) itr.next();
			if (curInfo.getName().compareTo(name) == 0) {
				itr.remove();
				System.out.println("데이터 삭제가 완료됐습니다.\n");
				return; // 함수를 종료한다.
			}
		}
		//while함수를 다 돌았는데도 curInfo의 name과 일치하지 않는다면, 해당 데이터가 없는것
		System.out.println("일치하는 데이터가 존재하지 않습니다.");
	}
	
	//검색된 이름의 전체 정보 전달
	// PhoneInfo = 학생, 회사의 부모
	public PhoneInfo search(String name) {
		Iterator<PhoneInfo> itr = infoStorage.iterator();
		while (itr.hasNext()) {
			PhoneInfo curInfo = itr.next();
			if (curInfo.getName().compareTo(name)==0) {
				return curInfo;
			}
		}
		//일치하는 값이 없으니 PhoneInfo의 값을 null로 반환
		return null;
	}
	
	//입력정보를 파일에 저장하는 메소드
	public void storeToFile() {
		try { //private final File dateFile = new File("PhoneBook.dat");
			FileOutputStream file = new FileOutputStream(dateFile);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			Iterator<PhoneInfo> itr = infoStorage.iterator();
			while (itr.hasNext()) {
				out.writeObject(itr.next());
			}
			out.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
	//파일에서 데이터를 읽어오는 메소드
	public void readFromFile() {
		try {
			FileInputStream file = new FileInputStream(dateFile);
			ObjectInputStream in = new ObjectInputStream(file);
			
			while(true) {
				PhoneInfo info = (PhoneInfo) in.readObject();
				if (info == null) {
					break; //메소드를 종료
				}
				infoStorage.add(info);
			}
			in.close();
		} catch (IOException e) {
			return;
		} catch (ClassNotFoundException e) {
			return;
		}
	}
}
