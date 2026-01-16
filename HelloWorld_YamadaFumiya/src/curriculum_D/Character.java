package curriculum_D;

public abstract class Character {
	
	protected String name;
	protected int hp;
	protected int at;
	protected int sp;

	public Character(String name, int hp, int at, int sp) {
		this.name = name;
		this.hp = hp;
		this.at = at;
		this.sp = sp;
	}

	public void showStatus() {
	    System.out.println("【" + this.name + " のステータス】");
	    System.out.println("  HP: " + this.hp);
	    System.out.println("  AT: " + this.at);
	    System.out.println("  SP: " + this.sp);
	}
	
	public boolean isAlive() {
		return hp > 0;
	}

	public void receiveDamage(int damage) {
		this.hp -= damage;
		if (this.hp < 0)
			this.hp = 0;
	}

	// Getter
	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getAt() {
		return at;
	}

	public int getSp() {
		return sp;
	}
}