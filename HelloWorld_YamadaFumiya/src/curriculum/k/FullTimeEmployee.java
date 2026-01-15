package curriculum.k;

// 正社員用の計算
public class FullTimeEmployee extends Employee {
	public FullTimeEmployee(String name, int hours) {
		super(name, hours);
	}

	@Override
	public int calculateSalary() {
		return getHours() * 1200;
	}

}
