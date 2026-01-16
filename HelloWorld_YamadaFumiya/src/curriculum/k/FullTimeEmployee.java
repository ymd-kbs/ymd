package curriculum.k;

// 正社員用の計算
public class FullTimeEmployee extends Employee {
	// 給与の定数
	private static final int HOURLY_RATE = 1200;

	public FullTimeEmployee(String name, int hours) {
		super(name, hours);
	}

	@Override
	public int calculateSalary() {
		return getHours() * HOURLY_RATE;
	}

}
