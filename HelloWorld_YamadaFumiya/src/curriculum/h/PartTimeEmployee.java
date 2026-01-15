package curriculum.h;

public class PartTimeEmployee extends Employee {
	// 定数（時給 1000円）
	private static final int HOURLY_RATE = 1000;

	// コンストラクタ
	public PartTimeEmployee(String id, String name) {
		super(id, name);
	}

	// 給与計算の実装
	@Override
	public int calculateDailyWage(int hoursWorked) {
		return hoursWorked * HOURLY_RATE;
	}
}
