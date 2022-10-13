import java.util.Scanner;

public class CellPhoneTest {

	public static void main(String[] args) {
		//핸드폰의 상태를 출력하는 프로그램. 전원이 꺼지면 핸드폰의 상태를 출력하지 못한다.
		
		//스캐너
		Scanner input=new Scanner(System.in);
		Scanner inputString=new Scanner(System.in);
		
		//변수 설정
		String modelName; //모델명
		String manufactureCompany; //제조회사
		String color; //색상
		String power; //전원
		String camera; //카메라 여부
		
		//객체를 생성하기 위한 빈공간
		CellPhone myCellPhone;
		
		//myCellphone이라는 이름을 가진 CellPhone객체 생성
		myCellPhone=new CellPhone();
		
		System.out.println("이 프로그램은 핸드폰의 정보를 출력합니다.");
		//on을 입력할 때까지 반복
		do {
			System.out.println("on을 입력해 전원을 켜주세요.");
			power = input.nextLine();
			switch (power) {
			case "on" : 
				System.out.println(myCellPhone.on());
				break;			
				default : 
					System.out.println(myCellPhone.off());
			}
		}while(!(power.equals("on")));
		
		System.out.println("핸드폰 모델명을 입력해주세요 : ");
		modelName=inputString.nextLine(); //핸드폰 모델명 입력
		System.out.println("핸드폰 제조사를 입력해주세요 : ");
		manufactureCompany=inputString.nextLine(); //
		System.out.println("핸드폰 색상을 입력해주세요 : ");
		color=inputString.nextLine();
		do {
			System.out.println("카메라가 장착되어 있습니까? (y/n)=있다/없다라는 뜻입니다.");
			camera=inputString.nextLine();
			switch (camera) {
			case "y" :
			case "Y" : 
				camera="카메라 있음";
				break;
			case "n" :
			case "N" :
				camera="카메라 없음";
				break;
				default : 
					System.out.println("y와 n 중 택하여 입력해주세요");
				}
		}while(!((camera.equals("카메라 있음"))||(camera.equals("카메라 없음"))));
	
		//set을 이용하여 CellPhone객체의 필드 값(입력받은 값으로)을 설정
		myCellPhone.setModelName(modelName);
		myCellPhone.setManufactureCompany(manufactureCompany);
		myCellPhone.setColor(color);
		myCellPhone.setPower(power);
		myCellPhone.setCamera(camera);
		
		System.out.println(myCellPhone);
		
	}

}
