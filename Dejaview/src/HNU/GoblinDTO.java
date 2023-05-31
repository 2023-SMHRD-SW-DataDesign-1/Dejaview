package HNU;

public class GoblinDTO {
	
	private String name;
	private int hp;
	private int att;
	private int gold;
	
	public GoblinDTO(String name, int hp, int att, int gold) {
		super();
		this.name = name;
		this.hp = hp;
		this.att = att;
		this.gold = gold;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtt() {
		return att;
	}

	public void setAtt(int att) {
		this.att = att;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

}
