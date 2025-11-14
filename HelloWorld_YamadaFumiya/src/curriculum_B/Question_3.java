package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Question_3 {
	private static final int MAX_STOCK_VALUE = 11;

	public static void main(String[] args) {

		/*
		 * [課題Q1] for 文を使って 1 から 10 までの数字を 1 つずつ表示する。
		 */
		// int型の変数 a の初期値を 1 と宣言し、 a の値が 10 になるまで a++ を実行する
		for (int a = 1; a <= 10; a++) {
			System.out.println(a);
		}
		// 改行を出力
		System.out.println();

		/*
		 * [課題Q2] for 文を使って 2 から 20 までの 偶数 を 1 つずつ表示する
		 */
		// int型の変数 b の初期値を 2 と宣言し、 b の値が 20 になるまで b += 2 を実行する
		for (int b = 2; b <= 20; b += 2) {
			System.out.println(b);
		}
		// 改行を出力
		System.out.println();

		/*
		 * [課題Q3] for 文を使って 10 から 1 まで カウントダウンして表示
		 */
		// int型の変数 c の初期値を 10 と宣言し、 c の値が 1 になるまで c-- を実行する
		for (int c = 10; c >= 1; c--) {
			System.out.println(c);
		}
		// 改行を出力
		System.out.println();

		/*
		 * [課題Q4] for 文を使って 1 から 100 までの合計 を表示する
		 */
		// int型の変数 z に初期値 0 を宣言
		int z = 0;
		// int型の変数 d の初期値を 1 と宣言し、 d の値が 100 になるまで d++ を実行し、 d の値を z に加算する
		for (int d = 1; d <= 100; d++) {
			z += d;
		}
		// z を出力する
		System.out.println(z);
		// 改行を出力
		System.out.println();

		/*
		 * [課題Q5] for 文を使って 以下のような三角形を出力
		 *  　　    *
		 *  　　    **
		 *  　　    ***
		 *  　　    ****
		 *  　　    *****
		 */
		// int型の変数 height の初期値 5 を宣言
		int height = 5;
		// int型の変数 e の初期値を 1 と宣言し、 e の値が height と同じ値になるまで e++ を実行する
		for (int e = 1; e <= height; e++)
		// int型の変数 f の初期値を 1 と宣言し、 f の値が e と同じ値になるまで f++ を実行し、 "*" を出力する
		{
			for (int f = 1; f <= e; f++) {
				System.out.print("*");
			}
			// 1ループで改行されるようにする
			System.out.println();
		}
		// 改行を出力する
		System.out.println();

		/*
		 * [課題Q6] while 文を使って 1 から 10 まで を 1 つずつ表示する。
		 */
		// int型の変数 g の初期値 1 を宣言
		int g = 1;
		// g が 10 以下の時 g を出力して g を 1 ずつ増やす
		while (g <= 10) {
			System.out.println(g);
			g++;
		}
		// 改行を出力
		System.out.println();

		/*
		 * [課題Q7] while 文を使って 2 から 20 までの偶数 を 1 つずつ表示する。
		 */
		// int型の変数 h の初期値 2 を宣言
		int h = 2;
		// h が 20 以下の時 h を出力し, h を 2 づつ増やす
		while (h <= 20) {
			System.out.println(h);
			h += 2;
		}
		// 改行を出力
		System.out.println();

		/*
		 * [課題Q8] while 文を使って 10 から 1 まで のカウントダウンを表示する。
		 */
		// int型の変数 i の初期値 10 を宣言
		int i = 10;
		//  i が 1 以上の時 i を出力し, 1 を 1 づつ減らす
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
		// 改行を出力
		System.out.println();

		/*
		 * [課題Q9] while 文を使って 1 から 100 までの合計 を表示
		 */
		// int型の変数 j の初期値 1 を宣言
		int j = 1;
		// int型の変数 k の初期値 0 を宣言
		int k = 0;
		// j が 100 以下の時 k に j を値を足し、 j を 1 づつ増やす
		while (j <= 100) {
			k += j;
			j++;
		}
		// k を出力
		System.out.println(k);
		// 改行を出力
		System.out.println();

		/*
		 * [課題Q10] ユーザーから 数値をコンソール入力 してもらう。
		 *   　　    入力が 0 になるまで 何度でも入力を受け付ける。
		 *    　　   0が入力されたら「終了しました」と表示する。
		 */
		// scannerオブジェクトを作成
		Scanner scanner = new Scanner(System.in);
		// コンソール入力を受け付ける
		System.out.println("数値を入れてください:");
		// 無限ループを開始
		while (true)
		// 入力された値が正数か確認
		{
			if (scanner.hasNextInt())
			// 入力された値が 0 の場合 "終了しました" を出力し、ループを終了
			{
				int l = scanner.nextInt();
				if (l == 0) {
					System.out.println("終了しました");
					break;
					// 入力された値が 0 以外なら l を出力
				}
				System.out.println(l);
				// 入力された値が正数以外だった場合、 "無効な入力です" を出力
			} else {
				String m = scanner.next();
				System.out.println("無効な入力です");
			}
		}
		scanner.nextLine();
		// 改行を出力
		System.out.println();

		/*
		 * [課題Q11] for文を使用して下記の通りに出力してください。 (九九を表示する)
		 */
		// n (かけられる側) が 9 になるまで 1 ずつ増やす
		for (int n = 1; n <= 9; n++) {
			// o (かける側) が 9 になるまで 1 ずつ増やす
			for (int o = 1; o <= 9; o++) {
				int result = n * o;
				// n x o = result を最低二桁で出力
				String p = String.format("%02d * %02d = %02d", n, o, result);
				// p の間に || を改行せずに出力
				System.out.print(p + "||");
			}
			// 段ごとの改行
			System.out.println();
		}
		// 改行を出力
		System.out.println();

		/*
		 * [課題Q12] 入力した商品の残り台数が出力されるシステムを作成する。
		 */
		// 入力を受け付ける
		System.out.println("商品を入力してください。複数の場合は （、）で区切ってください。");
		// 受け付けた値を x に代入
		String x = scanner.nextLine();
		// 、の前後で文字を識別し、 name に格納
		String[] name = x.split("、\\s*");
		// Random オブジェクトを作成
		Random random = new Random();
		// テレビとディスプレイの合計最大在庫数を設定
		int tvStock = random.nextInt(MAX_STOCK_VALUE + 1);
		// 拡張for文を使用して、 name の配列を順番に処理
		for (String product : name) {
			// 出力用の変数 output を宣言
			String output;
			// 入力された文字によってランダムな値を出力
			switch (product) {
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				int stock = random.nextInt(MAX_STOCK_VALUE + 1);
				output = String.format("%sの残り台数は%d台です", product, stock);
				break;
			case "テレビ":
			case "ディスプレイ":
				// 入力された文字によって、条件演算子で台数を決定 (合計は常に11)
				int finalStock = product.equals("テレビ")
						// "テレビ" の場合
						? tvStock
						// "ディスプレイ" の場合
						: MAX_STOCK_VALUE - tvStock;
				output = String.format("%sの残り台数は%d台です", product, finalStock);
				break;
			// 指定の商品ではない場合
			default:
				output = String.format("『 %s 』は指定の商品ではありません", product);
				break;
			}
			// 結果を出力
			System.out.println(output);
		}
		// Scannerを閉じる
		scanner.close();

	}

}
