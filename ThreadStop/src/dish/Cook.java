package dish;

public class Cook implements Runnable {
	private final Dish dish;

	public Cook(Dish dish) {
		this.dish = dish;
	}

	private void cook(int i) throws InterruptedException {
		synchronized (dish) {
			while (!dish.isEmpty()) {
				dish.wait();
			}
			dish.setEmpty(false);
			System.out.println(i + "번째 음식이 준비되었습니다.");
			dish.notify();
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				cook(i+1);
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
}
