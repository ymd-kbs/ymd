package curriculum.i;

public abstract class Employee {

	// フィールド
	protected String id;
	protected String name;

	// コンストラクタ
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	// 抽象メソッド
	public abstract int calculateDailyWage(int hoursWorked);
}
