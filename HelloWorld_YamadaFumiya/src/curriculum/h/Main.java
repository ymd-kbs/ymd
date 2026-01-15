package curriculum.h;

public class Main {

	public static void main(String[] args) {
		/*
		 * [課題④] 継承
		 */
		// 各クラスのインスタンスを生成
		FullTimeEmployee ft = new FullTimeEmployee("F001", "正社員");
		PartTimeEmployee pt = new PartTimeEmployee("P001", "パート");
		// 9時間勤務時の給与を計算
		int hours = 9;
		int wageFt = ft.calculateDailyWage(hours);
		int wagePt = pt.calculateDailyWage(hours);
		// 出力
		System.out.println("正社員の給与: " + wageFt + " 円");
		System.out.println("パート社員の給与: " + wagePt + " 円");

	}

}
