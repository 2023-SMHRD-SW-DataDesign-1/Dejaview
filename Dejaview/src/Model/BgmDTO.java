package Model;

public class BgmDTO {
	
	private String name;
	private int playtime;
	private String musicpath;
	
	public BgmDTO(String name, int playtime, String musicpath) {
		super();
		this.name = name;
		this.playtime = playtime;
		this.musicpath = musicpath;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPlaytime() {
		return playtime;
	}

	public void setPlaytime(int playtime) {
		this.playtime = playtime;
	}

	public String getMusicpath() {
		return musicpath;
	}

	public void setMusicpath(String musicpath) {
		this.musicpath = musicpath;
	}

}
