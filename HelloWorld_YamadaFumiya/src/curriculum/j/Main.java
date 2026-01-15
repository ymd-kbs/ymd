package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Billable型のリストを作成
		List<Billable> billableList = new ArrayList<>();
		// リストに社員を追加
		billableList.add(new FullTimeEmployee("F001", "新木優子"));
		billableList.add(new ContractEmployee("C001", "小松菜奈"));
		billableList.add(new FullTimeEmployee("F002", "三吉彩花"));
		// Billable型としてループ処理
		int workHours = 10;
		for (Billable b : billableList) {
			// 正社員か契約社員に応じて計算
			int pay = b.costForDay(workHours);
			System.out.println(b + " / 日給: " + pay + "円");
		}
	}
}
