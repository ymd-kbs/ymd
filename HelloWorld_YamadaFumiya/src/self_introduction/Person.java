package self_introduction;

public class Person {
	// インスタンスフィールド
	public String name;
	public int age;
	public double height;
	public double weight;

	// クラスフィールド
	public static int count = 0;

	// コンストラクタを定義
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// インスタンスが作られるたびに合計数を増やす
		Person.count++;
	}

	// BMIを計算して返すメソッド
	public double bmi() {
		return this.weight / (this.height * this.height);
	}

	// 自己紹介を出力するメソッド
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		double bmiValue = Math.round(this.bmi() * 100.0) / 100.0;
		System.out.println("BMIは" + bmiValue + "です");
	}
}
