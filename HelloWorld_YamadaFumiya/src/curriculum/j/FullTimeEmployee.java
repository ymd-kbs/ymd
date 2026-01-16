package curriculum.j;

public class FullTimeEmployee extends Employee {
	// 給与の定数
	private static final int HOURLY_RATE = 1250; // 時給
	private static final double OVERTIME_RATIO = 1.25; // 残業倍率
	private static final int REGULAR_HOURS_LIMIT = 8; // 定時時間

	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int costForDay(int hoursWorked) {
		// 0制限
		int hours = Math.max(0, hoursWorked);

		// 残業時間の計算
		int overtime = Math.max(0, hours - REGULAR_HOURS_LIMIT);
		// 定時内の勤務時間
		int regularHours = hours - overtime;

		return (regularHours * HOURLY_RATE) + (int) (overtime * HOURLY_RATE * OVERTIME_RATIO);
	}

}