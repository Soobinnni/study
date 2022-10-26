package test;

public class MyRunnable implements Runnable {
	public void run() {
	for (int i =0;i<5;i++) {
		System.out.println("잘가.");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
	}
}
