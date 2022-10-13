import java.util.Scanner;

public class EmployeeInfo {
	
	public static void main(String[] args) {
		//스캐너
		Scanner inputString=new Scanner(System.in);
		Scanner input=new Scanner(System.in);
		
		//객체이름
		Employee myEmployee=new Employee();
		
		//변수 설정
		String name; //직원 이름
		String tel; // 직원 전화번호
		int salary; //직원 연봉
		
		System.out.println("직원의 이름, 전화번호, 연봉을 입력하는 프로그램입니다.");
		
		System.out.println("이름을 입력하세요");
		name=inputString.nextLine();
		myEmployee.setName(name);
		
	
			System.out.println("전화번호를 입력하세요");
			tel=inputString.nextLine();
		
		
		myEmployee.setTelephone(tel);
		System.out.println("연봉을 입력하세요");
		salary=input.nextInt();
		myEmployee.setSalary(salary);
		
		System.out.println(myEmployee.getName()+" 0"+myEmployee.getTelephone()+" "+myEmployee.getSalary());
	}
}
