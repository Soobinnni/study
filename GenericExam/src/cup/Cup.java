
package cup;
import beverage.*;

public class Cup<T> {
	private T beverage;

	public Cup() {
		super();
	}

	public Cup(T beverage) {
		super();
		this.beverage = beverage;
	}

	public T getBeverage() {
		return beverage;
	}

	public void setBeverage(T beverage) {
		this.beverage = beverage;
	}
	

}
