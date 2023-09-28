package im.study;

public class MusicBox {
	public void  playMusicA() {
		for(int i=0;i<10;i++) {
			System.out.print("신나는 음악!!!  ");
			try {
				Thread.sleep((int)(Math.random()*1000));
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void playMusicB() {
		for(int i=0;i<10;i++) {
			System.out.print("조용한 음악!!!  ");
			try {
				Thread.sleep((int)(Math.random()*1000));
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public synchronized void playMusicC() {
		for(int i=0;i<10;i++) {
			System.out.print("슬픈 음악!!!  ");
			try {
				Thread.sleep((int)(Math.random()*1000));
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
