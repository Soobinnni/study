import student.*;

public class Test {
	public static void main(String[] args) {
		// 학부생 객체 생성
		Undergraduate u = new Undergraduate();
		System.out.println(u + "\n");
		// 학부생 객체 생성2
		Undergraduate g = new Undergraduate("김용빈", 13001014, "호텔조리학과", 3, 120, "댄스동아리");
		System.out.println(g);

		System.out.println("\n\n");
		// 대학원생 객체 생성
		Postgraduate p = new Postgraduate();
		System.out.println(p + "\n");
		// 대학원생 객체 생성2
		Postgraduate d = new Postgraduate("김동글", 22001014, "경영학과", 2, 60, "연구보조", 0.4);
		System.out.println(d);
	}
}