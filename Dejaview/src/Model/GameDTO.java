package Model;

public class GameDTO {

	private String id;
	private String pw;
	
	private int gold;
	private int hp;
	private int day;
	
	

	public GameDTO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	
	
	public int getGold() {
		return gold;
	}



	public void setGold(int gold) {
		this.gold = gold;
	}



	public int getHp() {
		return hp;
	}



	public void setHp(int hp) {
		this.hp = hp;
	}



	public int getDay() {
		return day;
	}



	public void setDay(int day) {
		this.day = day;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

}
