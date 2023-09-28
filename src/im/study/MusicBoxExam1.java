package im.study;

public class MusicBoxExam1 {

	public static void main(String[] args) {
		MusicBox mb = new MusicBox();
		MusicPlayer park = new MusicPlayer(1, mb);
		MusicPlayer kim = new MusicPlayer(2, mb);
		MusicPlayer lee = new MusicPlayer(3, mb);
		
		kim.run();
		lee.run();
		park.run();
	}

}
