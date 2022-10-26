package waitNotify;

public class WaitNotifyDemo {

	public static void main(String[] args) {
		TotalThread t = new TotalThread();
		t.start();
		synchronized (t) {
			try {
				System.out.println("스레드 t가 끝날 때까지 대기");
				t.wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		System.out.println("총합 : "+t.total);
	}

}
