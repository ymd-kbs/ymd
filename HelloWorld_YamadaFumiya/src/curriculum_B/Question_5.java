package curriculum_B;

public class Question_5 {
	// 課題Q1のメソッド定義
	public static void helloWorld() {
		System.out.println("Hellow,World!");
	}

	// 課題Q2のメソッド定義
	public static int doubleValue(int num) {
		return num * 2;
	}

	// 課題Q3のメソッド定義
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}

	public static void result(int num) {
		if (isEven(num)) {
			System.out.println(num + " は偶数です。");
		} else {
			System.out.println(num + " は奇数です。");
		}
	}

	public static void main(String[] args) {

		/*                                                               
		 * [課題Q1] 次の条件を満たす メソッド helloWorld を作成してください。                    
			　　    引数なし                                                   
			　　    戻り値なし                                                  
			　　    "Hello, World!" を表示する。                                  
			　　    実行例 Hello, World!                                      
		 */
		// "Hello,World!" を出力
		helloWorld();
		// 改行
		System.out.println();

		/*
		 * [課題Q2] 次の条件を満たす メソッド doubleValue を作成してください。
		　　　      引数：整数 (int num)
		　　　      戻り値：整数（引数の2倍の値）
		　　　      戻り値をもとに実行例のように表示する。
		　　　      実行例 10 を 2 倍すると 20 です。
		 */
		// 実行例のように出力
		int input = 10;
		int result = doubleValue(input);
		System.out.println(input + " を 2 倍すると " + result + " です。");
		// 改行
		System.out.println();

		/*
		 * [課題Q3] 次の条件を満たす メソッド isEven を作成してください。
		           引数：整数 (int num)
		           戻り値：true（偶数なら）、false（奇数なら）
		           num1に7,num2に10を設定し以下の実行例になるように表示
		           実行例
		           10 は偶数です。
		           7 は奇数です。
		 */
		int num1 = 7;
		int num2 = 10;
		// 実行例のように出力
		result(num2);
		result(num1);
		//改行
		System.out.println();

	}

}
