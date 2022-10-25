package extra;

import phoneBookClass.*;
public class MenuChoiceException extends Exception {
	int wrongChoice; // 잘못 입력한 번호
	
	//생성자
	public MenuChoiceException(int choice) {
		super("잘못된 선택이 이뤄졌습니다"); //Exception 을 따름
		wrongChoice = choice;
	}
	
	//오류 메세지
	public void showWrongChoice() {
		System.out.println(wrongChoice + "에 해당하는 선택은 존재하지 않습니다.");
	}
}
