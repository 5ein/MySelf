package 복습;

import java.util.Date;

public class 타이머1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			Date date = new Date();
			System.out.println("타이머: " + date);
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println("cpu 연결에 문제가 생겼습니다.");
			}
			
		}
	}
}
