import Book.*;

public class RentalService {

	public static void main(String[] args) {
		Novel n = new Novel();
		Poet p = new Poet();
		SceinceFiction s = new SceinceFiction();
		System.out.println("소설 연체료 : "+n.getLateFees(3));
		System.out.println("시집 연체료 : "+p.getLateFees(5));
		System.out.println("공상과학소설 연체료 : "+s.getLateFees(8));
	}

}
