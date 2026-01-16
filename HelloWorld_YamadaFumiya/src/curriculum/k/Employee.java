package curriculum.k;

// 社員データ
public abstract class Employee implements Payable {
	private String name;
	private int hours;

	public Employee(String name, int hours) {
		this.name = name;
		// 0制限
		this.hours = Math.max(0, hours);
	}

	public String getName() {
		return name;
	}

	public int getHours() {
		return hours;
	}

}
