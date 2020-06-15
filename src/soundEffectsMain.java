import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class soundEffectsMain {

	public static void main(String[] args) {
		new soundEffectsMain().mp3();						// dit werkt nog niet

	}
	
	void mp3() {
		File mp3 = new File("ACDC - Dirty Deeds.mp3");
		PlaySound(mp3);
	}
	

	void bad() {
		File bad = new File("wahwah.wav");
		PlaySound(bad);
	}

	void good() {
		File good = new File("owin31.wav");
		PlaySound(good);
	}

	static void PlaySound(File Sound) {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Sound));
			clip.start();

			Thread.sleep(clip.getMicrosecondLength() / 1000);

		} catch (Exception e) {
		}
	}

}
