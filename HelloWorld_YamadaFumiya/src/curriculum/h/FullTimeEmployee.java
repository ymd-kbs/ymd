package curriculum.h;

public class FullTimeEmployee extends Employee {
	// 定数（時給 1200円）
	private static final int HOURLY_RATE = 1200;

	// コンストラクタ
	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	// 給与計算
	@Override
	public int calculateDailyWage(int hoursWorked) {
		if (hoursWorked <= 8) {
			// 8時間以内なら定時のみ
			return hoursWorked * HOURLY_RATE;
		} else {
			// 8時間を超えた場合
			int basePay = 8 * HOURLY_RATE;
			int overtimeHours = hoursWorked - 8;
			// 残業分は1.25倍 
			int overtimePay = (int) (overtimeHours * HOURLY_RATE * 1.25);

			return basePay + overtimePay;
		}
	}
}
