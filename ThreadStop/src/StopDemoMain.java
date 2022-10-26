public class StopDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StopThread t = new StopThread();
		
		t.start();
		
		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		t.stop = true;

	}

}
