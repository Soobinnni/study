package shareCar;

public class CarThread extends Thread{
	private String who;
	private ShareCar car;
	private String where;
	public CarThread(String who, ShareCar car, String where) {
		this.who = who;
		this.car = car;
		this.where = where;
	}
	
	@Override
	public void run() {
		car.drive(who, where);
	}
	
	
}
