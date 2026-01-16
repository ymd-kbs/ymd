package curriculum.j;

public abstract class Employee implements Billable {
	protected String id;
	protected String name;

	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public abstract int costForDay(int hoursWorked);

	@Override
	public String toString() {
		return "名前: " + this.name;
	}

}
