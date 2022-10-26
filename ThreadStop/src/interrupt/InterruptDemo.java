package interrupt;

public class InterruptDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable task = () -> {
			try {
				while(true) {
					System.out.println("실행 중...");
					Thread.sleep(1);
				}
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			System.out.println("정상 종료");
		};
		
		Thread t = new Thread(task);
		t.start();
		
		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		t.interrupt();
	}

}
