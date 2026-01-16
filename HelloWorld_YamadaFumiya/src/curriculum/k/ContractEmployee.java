package curriculum.k;

// 契約社員用の計算
public class ContractEmployee extends Employee {
	// 給与の定数
	private static final int HOURLY_RATE = 1000;

	public ContractEmployee(String name, int hours) {
		super(name, hours);
	}

	@Override
	public int calculateSalary() {
		return getHours() * HOURLY_RATE;
	}

}
