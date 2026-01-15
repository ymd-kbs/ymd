package curriculum.g;

public class Main {

	public static void main(String[] args) {
		/*
		 * [課題③] カプセル化　
		 */
		// Employee オブジェクトを生成
		Employee emp = new Employee();
		// set メソッドを使って値を設定
		emp.setEmployeeId("E002");
		emp.setName("田中花子");
		// get メソッドを使って値を取得し、出力
		System.out.println("社員ID: " + emp.getEmployeeId() + ", 名前: " + emp.getName());

	}

}
