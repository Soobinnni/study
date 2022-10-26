

public class StopThread extends Thread {
	public boolean stop;
	
	@Override
	public void run() {
		while(!stop) {
			System.out.println("실행 중...");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
		}
		System.out.println("정상 종료");
	}
}
