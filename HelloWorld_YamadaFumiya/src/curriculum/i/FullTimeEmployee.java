package curriculum.i;

public class FullTimeEmployee extends Employee {
	// 給与の定数
	private static final int HOURLY_RATE = 1250;      // 時給
    private static final double OVERTIME_RATIO = 1.25; // 残業倍率
    private static final int REGULAR_HOURS_LIMIT = 8; // 定時時間
	// コンストラクタ
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}
	// 正社員用の計算
	@Override
	public int calculateDailyWage(int hoursWorked) {
		// 0制限
		int hours = Math.max(0, hoursWorked);
		int overtime = Math.max(0, hours - REGULAR_HOURS_LIMIT);
		int regularHours = hours - overtime;
		// 基本給 + (残業 * 1.25倍)
		return (regularHours * HOURLY_RATE) + (int) (overtime * HOURLY_RATE * 1.25);
	}

}
