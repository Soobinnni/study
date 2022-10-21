import beverage.Beer;
import beverage.Boricah;
import cup.*;
public class GenericClassDemo {

	public static void main(String[] args) {
		Cup <Beer> c= new Cup<>();
		
		c.setBeverage(new Beer());
		Beer b1 = c.getBeverage();
		
		
	}

}
