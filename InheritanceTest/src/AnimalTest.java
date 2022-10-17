
public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//독수리
		Eagle e=new Eagle("2개", "1개", "활공");
		System.out.println(e);
		e.setMouth("부리");
		System.out.println(e);
		
		//호랑이
		Tiger t=new Tiger("2개","옹졸","4개");
		System.out.println("\n"+t);
		t.setMouth("왕 큼");
		System.out.println(t);
		
		//금붕어
		Goldfish g=new Goldfish("눈알", "뻐끔", "미끌");
		System.out.println("\n"+g);
		g.setFin("비닐");
		System.out.println(g);
	}

}
