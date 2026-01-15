package curriculum.k;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Payable型のリストを作成
		List<Payable> employees = new ArrayList<>();
		// リストに社員を追加
		employees.add(new FullTimeEmployee("新木優子", 160));
		employees.add(new ContractEmployee("小松菜奈", 140));

		SalaryReporter reporter = new SalaryReporter();
		// 正社員か契約社員に応じて計算
		for (Payable p : employees) {
			reporter.report(p);
		}
	}

}
