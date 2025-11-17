package curriculum_B;

import java.util.Scanner;

public class Question_4 {

	public static void main(String[] args) {

		/*
		 * [課題Q1] int 型の配列 を作成し、1, 2, 3, 4, 5 を格納する。配列の全要素を 順番に表示する。
		 */
		// サイズ 5 のint型の配列を宣言
		int[] num = new int[5];
		// 値を一つずつ格納
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		// a が 4 以下の場合、 a++ して num[a] を出力
		for (int a = 0; a <= 4; a++)
			System.out.println(num[a]);
		// 改行
		System.out.println();

		/*
		 * [課題Q2] int 型の配列 {10, 20, 30, 40, 50} を用意する。配列の要素を 逆順 に表示する。
		 */
		// int型の配列を宣言し、初期化
		int[] num2 = { 10, 20, 30, 40, 50 };
		// 配列 b の末尾の値が 0 以下になるまで b-- し、 num[b] を出力
		for (int b = num2.length - 1; b >= 0; b--)
			System.out.println(num2[b]);
		// 改行
		System.out.println();

		/*
		 * [課題Q3] int 型の配列 {3, 5, 7, 9, 11} を用意する。配列の全要素の 合計値 を計算し、表示する。
		 */
		// int型の配列を宣言し、初期化
		int[] num3 = { 3, 5, 7, 9, 11 };
		// 合計値を格納する変数を 0 で初期化
		int c = 0;
		// 拡張for文で num3 の各要素の値を c に加算
		for (int number : num3) {
			c = c + number;
		}
		// 全要素を加算した値を出力
		System.out.println(c);
		// 改行
		System.out.println();

		/*
		 * [課題Q4] int 型の配列 {12, 7, 9, 21, 5, 18} を用意する。配列の 最大値と最小値 を求めて表示する。
		 */
		// int型の配列を宣言し、初期化
		int[] num4 = { 12, 7, 9, 21, 5, 18 };
		// num4 の最初の要素で最大値と最小値を初期化
		int max = num4[0];
		int min = num4[0];
		// 拡張for文で num4 の全要素をループ処理
		for (int d : num4) {
			// 各要素を比べて最大値を更新
			if (d > max) {
				max = d;
			}
			// 各要素を比べて最小値を更新
			if (d < min) {
				min = d;
			}
		}
		// 最大値を出力
		System.out.println("最大値:" + max);
		// 最小値を出力
		System.out.println("最小値:" + min);
		// 改行
		System.out.println();

		/*
		 * [課題Q5] int 型の配列 {1, 2, 3, 4, 5} を用意する。
		 * 　　　　　配列のすべての要素を 2 倍 し、結果を表示する。
		 */
		// int型の配列を宣言し、初期化
		int[] num5 = { 1, 2, 3, 4, 5 };
		// 拡張for文で num5 の全要素をループ処理
		for (int e : num5) {
			// 各要素をそれぞれ *2 して出力
			int f = e * 2;
			System.out.println(f);
		}
		// 改行
		System.out.println();

		/*
		 * [課題Q6] int 型の配列 {4, 7, 10, 15, 20} を用意する。
		 *　　　　　 ユーザーがコンソール入力した数が 配列に含まれているか を判定し、結果を表示する。
		 *　　　　   結果： （”入力した値”は配列に含まれています／含まれていません）
		 */
		// int型の配列を宣言し、初期化
		int[] num6 = { 4, 7, 10, 15, 20 };
		// Scanner オブジェクトを作成
		Scanner scanner = new Scanner(System.in);
		// 入力を受け付ける
		System.out.println("数値を入力してください:");
		// 入力された値を g に代入
		int g = scanner.nextInt();
		// boolean型の変数 found の初期値を false と宣言
		boolean found = false;
		// 拡張for文で num6 の全要素をループ処理
		for (int h : num6) {
			// 入力された値 g と一致する要素があったら true にし、ループを終了
			if (g == h) {
				found = true;
				break;
			}
		}
		// 結果出力用の変数
		String output;
		// found が true の場合の出力
		if (found) {
			output = g + "は配列に含まれています";
		// found が true では無い場合
		} else {
			output = g + "は配列に含まれていません";
		}
		// 結果を出力
		System.out.println(output);
		// 改行
		System.out.println();
		

	}

}
