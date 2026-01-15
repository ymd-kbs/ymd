package curriculum.i;

public class ContractEmployee extends Employee {
	// コンストラクタ
	public ContractEmployee(String id, String name) {
		super(id, name);
	}

	// 契約社員用の計算
	@Override
	public int calculateDailyWage(int hoursWorked) {
		int hourlyRate = 1000;
		// 時給計算
		return hoursWorked * hourlyRate;
	}
}
