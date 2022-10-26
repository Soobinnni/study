package car;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {
	private JLabel lb1Car1;
	private JLabel lb1Car2;
	private JLabel lb1Car3;

	int x1 = 100;
	int x2 = 100;
	int x3 = 100;

	// 이너 클래스
	class MyThread extends Thread {

		@Override
		public void run() {
			for (int i = 0; i < 120; i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				// 0.1초에 한 번씩 자동차의 x위치를 변경한다.
				x1 += (int) (Math.random() * 10);
				lb1Car1.setBounds(x1, 0, 100, 100);
				x2 += (int) (Math.random()*10);
				lb1Car2.setBounds(x2, 50, 100, 100);
				x3 += (int) (Math.random()*10);
				lb1Car3.setBounds(x3, 100, 100, 100);
			}
		}
	}
	
	//생성자
	public CarGame() {
		setTitle("CarRace");
		setSize(900, 250);//윈도우 프레임 크기
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		lb1Car1 = new JLabel("질풍");
		lb1Car1.setIcon(new ImageIcon("C:\\JavaProject\\workspace\\Car\\car1.gif"));
		lb1Car2 = new JLabel("번개");
		lb1Car2.setIcon(new ImageIcon("C:\\JavaProject\\workspace\\Car\\car2.gif"));
		lb1Car3 = new JLabel("용구");
		lb1Car3.setIcon(new ImageIcon("C:\\JavaProject\\workspace\\Car\\yongu.gif"));
		add(lb1Car1);
		add(lb1Car2);
		add(lb1Car3);
		lb1Car1.setBounds(100,0,100,100);
		lb1Car2.setBounds(100,50,100,100);
		lb1Car3.setBounds(100,100,100,100);
		(new MyThread()).start();
		setVisible(true);
		
	}
}
