package 복습;

public class 카운트1 extends Thread {
	
	@Override
	public void run() {
		for (int i = 500; i > 0; i--) {
			System.out.println("카운트: " + i);
			
			try {
				Thread.sleep(1000); // 1초 재우기
			} catch (Exception e) {
				System.out.println("cpu 연결에 문제가 생겼습니다.");
			}
		}
	}
	
}
