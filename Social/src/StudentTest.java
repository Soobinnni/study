
public class StudentTest {

	public static void main(String[] args) {
		// 학생
		Student s = new Student();
		System.out.println("\t[디폴트 값 출력]" + s);
		// 학생 정보를 수정함.
		s.setAge(2);
		s.setMajor("F");
		s.setName("김용구");
		System.out.println("\n\t[수정한 값 출력]" + s);

	}

}
