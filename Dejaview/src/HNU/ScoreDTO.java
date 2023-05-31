package HNU;

public class ScoreDTO {
	
	private int gold;
	private int score = (gold - 400);
	
	public ScoreDTO(int gold, int score) {
		super();
		this.gold = gold;
		this.score = score;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	
	
	

}
