package curriculum.j;

public class FullTimeEmployee extends Employee {

	public FullTimeEmployee(String id, String name) {
		super(id, name);
	}

	@Override
	public int costForDay(int hoursWorked) {
		// 時給1250円
		int hourlyRate = 1250;

		if (hoursWorked <= 8) {
			return hoursWorked * hourlyRate;
		} else {
			// 8時間分
			int base = 8 * hourlyRate;
			// 超過分 (1.25倍)
			int overtimeHours = hoursWorked - 8;
			int overtimePay = (int) (overtimeHours * hourlyRate * 1.25);

			return base + overtimePay;
		}
	}

}
