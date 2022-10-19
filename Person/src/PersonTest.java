import java.util.Scanner;

import person.*;

public class PersonTest {

	public static void main(String[] args) {
		
		//스캐너
		Scanner input = new Scanner(System.in);
		Scanner inputString = new Scanner(System.in);
		Scanner input3= new Scanner(System.in);
		
		//변수선언
		
		//객체 생성
		Student s = new Student();
		Staff st = new Staff();
		Faculty f = new Faculty();
		MyDate employmentDate = new MyDate();
		
		System.out.println("학교 구성원에 대한 정보를 출력하는 프로그램입니다.");
		System.out.println();
		
		System.out.println("학생 정보를 입력합니다.\n");
		//학생 정보 입력 (이름, 주소, 전화번호, 메일주소, 학년)
		System.out.println("이름을 입력해주세요");
		s.setName(inputString.nextLine());
		System.out.println("주소를 입력하세요 : ");
		s.setAddress(input.nextLine());
		System.out.println("전화번호를 입력하세요 : ");
		s.setTel(inputString.nextLine());
		System.out.println("메일주소를 입력하세요 : ");
		s.seteMail(input.nextLine());
		System.out.println("학년을 입력하세요 : ");
		s.setGrade(input.nextInt());
		//학생정보 출력
		System.out.println(s);
		
		//직원 정보 입력 이름. 주소. 전화번호. 메일주소. 사무실. 봉급. 고용날짜. 직위
		System.out.println("직원 정보를 입력합니다.\n");
		System.out.println("이름을 입력하세요");
		st.setName(inputString.nextLine());
		System.out.println("<고용날짜를 입력합니다>");
		System.out.println("연도를 입력하세요 : ");
		employmentDate.setYear(input.nextInt());
		System.out.println("월을 입력하세요 : ");
		employmentDate.setMonth(input.nextInt());
		System.out.println("일을 입력하세요 : ");
		employmentDate.setDay(input.nextInt());
		st.setEmploymentDate(employmentDate);
		System.out.println("주소를 입력하세요 : ");
		st.setAddress(inputString.nextLine());
		System.out.println("전화번호를 입력하세요 : ");
		st.setTel(input.next());
		System.out.println("메일주소를 입력하세요 : ");
		st.seteMail(inputString.nextLine());		
		System.out.println("부서명을 입력하세요 : ");
		st.setOffice(input.next());
		System.out.println("봉급을 입력하세요 : ");
		st.setSalary(inputString.nextInt());
		System.out.println("직위를 입력하세요 : ");
		st.setSpot(input.nextLine());
		//직원정보 출력
		System.out.println(st);
		
		//교수 정보 입력 이름. 주소. 전화번호. 메일주소. 사무실. 봉급. 고용날짜. 상담시간, 순위
		System.out.println("교수 정보를 입력합니다.\n");
		System.out.println("이름을 입력하세요");
		f.setName(input.nextLine());
		System.out.println("<고용날짜를 입력합니다>");
		System.out.println("연도를 입력하세요 : ");
		employmentDate.setYear(inputString.nextInt());
		System.out.println("월을 입력하세요 : ");
		employmentDate.setMonth(input.nextInt());
		System.out.println("일을 입력하세요 : ");
		employmentDate.setDay(input.nextInt());
		f.setEmploymentDate(employmentDate);
		System.out.println("주소를 입력하세요 : ");
		f.setAddress(inputString.next());
		System.out.println("전화번호를 입력하세요 : ");
		f.setTel(input3.nextLine());
		System.out.println("메일주소를 입력하세요 : ");
		f.seteMail(inputString.next());
		System.out.println("부서명을 입력하세요 : ");
		f.setOffice(input.next());
		System.out.println("봉급을 입력하세요 : ");
		f.setSalary(input3.nextInt());
		System.out.println("상담시간을 입력하세요 :");
		f.setConsultationTime(inputString.next());
		System.out.println("순위를 입력하세요 : ");
		f.setGrade(input3.nextInt());
		//교수정보 출력
		System.out.println(f);
		
	}
	

}
