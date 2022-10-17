import java.util.Scanner;

public class Draw {
	public static void main(String[] args) {

		// 스캐너
		Scanner input = new Scanner(System.in);

		// 사각형은 점을 기준으로 가로길이와 세로길이로 뻗어있는 도형이다.
		// 사각형의 기준점
		Point standardPoint = new Point(1, 2);
		// 사각형의 가로. 세로
		double width;// 가로
		double height;// 세로
		System.out.println("사각형의 가로 길이를 입력하세요 : ");
		width = input.nextDouble();
		System.out.println("사각형의 세로 길이를 입력하세요 : ");
		height = input.nextDouble();
		// 사각형
		Rectangle r = new Rectangle(standardPoint, width, height);
		System.out.println(r);

		// 삼각형은 꼭지점을 기준으로 가로와 높이를 가진 도형이다.
		// 꼭지점
		Point vertex = new Point(2, 3);
		// 삼각형 가로, 높이
		double garo;// 가로
		double saero;// 세로
		System.out.println("삼각형이 가로길이를 입력하세요 : ");
		garo = input.nextDouble();
		System.out.println("삼각형의 높이 길이를 입력하세요 : ");
		saero = input.nextDouble();
		Triangle t = new Triangle(vertex, garo, saero);
		System.out.println(t);

		// 원은 중심점을 기준으로 일정한 길이(반지름)로 뻗은 점을 이은 도형이다.
		// 원의 중심점
		Point centerPoint = new Point(1, 1);
		// 원의 반지름
		double radius; // 반지름 변수
		System.out.println("반지름을 입력하세요 : ");
		radius = input.nextDouble();

		Circle c = new Circle(centerPoint, radius);
		System.out.println(c);
	}
}
