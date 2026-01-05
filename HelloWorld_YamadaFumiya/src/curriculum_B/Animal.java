package curriculum_B;

public class Animal {
	// 課題Q5のフィールド
	private String name;
	private double length;
	private int speed;

	// 動物名のgetterとsetter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		// thisを使ってフィールドに引数の値を代入
		this.name = name;
	}

	// 体長のgetterとsetter
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		// thisを使ってフィールドに引数の値を代入
		this.length = length;
	}

	// 速度のgetterとsetter
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		// thisを使ってフィールドに引数の値を代入
		this.speed = speed;
	}
}
