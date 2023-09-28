package im.study;

public class DemonThread implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("데몬쓰레드가 실행중입니다.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}
	public static void main(String[] args) {
		Thread th = new Thread(new DemonThread());
		th.setDaemon(true);
		th.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("메인쓰레드가 종료됩니다.");
	}
}
