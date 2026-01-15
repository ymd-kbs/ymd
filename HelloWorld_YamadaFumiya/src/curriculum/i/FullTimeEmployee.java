package curriculum.i;

public class FullTimeEmployee extends Employee {
	// コンストラクタ
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	// 正社員用の計算
	@Override
	public int calculateDailyWage(int hoursWorked) {
		int hourlyRate = 1250;
		int overtime = Math.max(0, hoursWorked - 8);
		int regularHours = hoursWorked - overtime;
		// 基本給 + (残業 * 1.25倍)
		return (regularHours * hourlyRate) + (int) (overtime * hourlyRate * 1.25);
	}

}
