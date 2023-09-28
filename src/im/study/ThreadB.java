package im.study;

public class ThreadB extends Thread {
	int total = 0;

	@Override
	public void run() {
		synchronized (this) {
			for(int i=0;i<5;i++) {
				System.out.println(i+"를 더합니다.");
				total += 500;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			notify();
		}
	}
	
	
}
