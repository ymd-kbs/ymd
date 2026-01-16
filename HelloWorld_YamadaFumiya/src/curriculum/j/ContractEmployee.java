package curriculum.j;

public class ContractEmployee extends Employee {
	// 給与の定数
	private static final int HOURLY_RATE = 1000;

	public ContractEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int costForDay(int hoursWorked) {
		// 0制限
		int hours = Math.max(0, hoursWorked);

		return hours * HOURLY_RATE;
	}
}