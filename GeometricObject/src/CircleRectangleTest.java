
public class CircleRectangleTest {

	public static void main(String[] args) {
		//원
		Circle c=new Circle();
		System.out.println("디폴트값 출력"+"\n"+c);
		c.setColor("yellow");
		c.setFilled(true);
		c.setRadius(1);
		System.out.println("변경된 값 출력 "+"\n"+c);
		
		//사각형
		Rectangle r=new Rectangle();
		System.out.println("디폴트값 출력"+"\n"+r);
		r.setColor("pink");
		r.setWidth(3);
		System.out.println("변경된 값 출력 "+"\n"+c);
	}

}
