package Controller;
import java.util.ArrayList;

import Model.BgmDTO;
import javazoom.jl.player.MP3Player;

public class BgmController {

	ArrayList<BgmDTO> musicList = new ArrayList<>();

	MP3Player mp3 = new MP3Player();

	public BgmController() {
		musicList.add(new BgmDTO("시작 BGM", 197, "Music/시작 BGM.mp3"));
		musicList.add(new BgmDTO("로비 BGM", 122, "Music/로비 BGM.mp3"));
		musicList.add(new BgmDTO("도박장 BGM", 89, "Music/도박장 BGM.mp3"));
		musicList.add(new BgmDTO("사냥터 BGM", 262, "Music/사냥터 BGM.mp3"));
		musicList.add(new BgmDTO("골든벨 BGM", 69, "Music/골든벨 BGM.mp3"));
		musicList.add(new BgmDTO("끝 BGM", 296, "Music/끝 BGM.mp3"));
	}

	int index = 0;

	// 재생
	public void play(int n) {

		if (mp3.isPlaying()) {
			mp3.stop();
		}
		index = n;
		mp3.play(musicList.get(index).getMusicpath());
	}

	// 정지
	public void stop() {
		mp3.stop();
	}
}
