package im.study;

public class JoinExam {

	public static void main(String[] args) {
		MyThread5 th1 = new MyThread5();
		th1.start();
		System.out.println("쓰레드 시작!!");
		try {
			th1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("쓰레드 종료!!");
	}

}
