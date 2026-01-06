package curriculum.f;

public class Main {

	public static void main(String[] args) {
		/*
		 * [課題②] クラスとオブジェクト
		 */
		Employee emp = new Employee();
		// 2. フィールドに値を設定
		emp.employeeId = "E001";
		emp.name = "佐藤太郎";
		// 3. メソッドを呼び出して出力
		emp.showInfo();

	}

}
