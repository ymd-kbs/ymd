package self_introduction;

public class Main {
	public static void main(String[] args) {

		Person person1 = new Person("山田郁也", 25, 1.7, 56.0);

		// メソッドを呼び出して出力
		person1.print();

		// 合計人数を出力
		System.out.println("合計" + Person.count + "人です");
	}
}
