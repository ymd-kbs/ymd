package curriculum.h;

public abstract class Employee {

	// フィールド
	private String employeeId;
	private String name;

	// コンストラクタ
	public Employee(String employeeId, String name) {
		this.employeeId = employeeId;
		this.name = name;
	}

	// Getterメソッド
	public String getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	// 抽象メソッド
	public abstract int calculateDailyWage(int hoursWorked);

}
