package curriculum.i;

public class ContractEmployee extends Employee {
	// 給与の定数
	private static final int HOURLY_RATE = 1000;

	// コンストラクタ
	public ContractEmployee(String id, String name) {
		super(id, name);
	}

	// 契約社員用の計算
	@Override
	public int calculateDailyWage(int hoursWorked) {
		// 0制限
		int hours = Math.max(0, hoursWorked);
		// 時給計算
		return hours * HOURLY_RATE;
	}
}
