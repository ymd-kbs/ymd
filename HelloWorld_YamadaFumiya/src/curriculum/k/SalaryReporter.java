package curriculum.k;

// 計算結果を表示する
public class SalaryReporter {
	public void report(Payable p) {
		System.out.println(p.getName() + " の給料は " + p.calculateSalary() + " 円");
	}

}
