package curriculum.i;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Employee型のリストを作成
		List<Employee> employeeList = new ArrayList<>();
		// リストに社員を追加
		employeeList.add(new FullTimeEmployee("F001", "新木優子"));
		employeeList.add(new ContractEmployee("C001", "小松菜奈"));
		employeeList.add(new FullTimeEmployee("F002", "三吉彩花"));
		employeeList.add(new ContractEmployee("C002", "多部未華子"));
		// 共通の Employee 型として処理
		int workHours = 10;
		for (Employee emp : employeeList) {
			int wage = emp.calculateDailyWage(workHours);
			System.out.println("名前: " + emp.name + " / 給与: " + wage + "円");
		}
	}
}
