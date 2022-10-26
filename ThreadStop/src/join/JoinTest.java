package join;

public class JoinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JoinDemo t = new JoinDemo();
		t.start();
		try {
			t.join();
			System.out.println("스레드 t가 끝날 때까지 대기....");
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("총합 : "+t.total); //JoinDemo를 종료하기 전에 메인스레드를 실행시켰기 떄문에 총합이 0.
	}

}
