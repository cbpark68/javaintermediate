package im.study;

public class MusicPlayer extends Thread {
	int type = 0;
	MusicBox mb;
	
	public MusicPlayer(int type,MusicBox mb) {
		this.type = type;
		this.mb = mb;
	}

	@Override
	public void run() {
		switch (type) {
		case 1:
			mb.playMusicA();
			break;
		case 2:
			mb.playMusicB();
			break;
		case 3:
			mb.playMusicC();
			break;
		default:
			break;
		}
	}
	

}
