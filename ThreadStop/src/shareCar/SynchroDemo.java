package shareCar;

public class SynchroDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShareCar car = new ShareCar();
		new CarThread("김수빈", car, "서울").start();
		new CarThread("김구빈", car, "부산").start();
		new CarThread("김용구", car, "울산").start();
	}

}
