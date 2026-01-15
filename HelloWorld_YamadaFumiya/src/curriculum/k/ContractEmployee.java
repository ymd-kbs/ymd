package curriculum.k;

// 契約社員用の計算
public class ContractEmployee extends Employee {
	public ContractEmployee(String name, int hours) {
		super(name, hours);
	}

	@Override
	public int calculateSalary() {
		return getHours() * 1000;
	}

}
