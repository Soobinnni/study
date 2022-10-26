package Priority;

public class Counter extends Thread {
	private int count = 0;

	public Counter(String name) {
		setName(name); // Thread 클래스에서 상속받은 메서드로, 스레드 이름을 설정한다.
	}

	@Override
	public void run() {
		while (count++<5) {
			System.out.println(getName()+"->");
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}

}
