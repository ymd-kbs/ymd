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
		// scanner を閉じる
		scanner.close();
		// 改行
		System.out.println();

		/*
		 * [課題Q7] 2次元配列 int[][] array = {{1, 2}, {3, 4}, {5, 6}}; を用意する。配列の すべての要素を表示する。
		 */
		// int型の2次元配列を宣言し、初期化
		int[][] array = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		// 外側のループで 行 を処理( array.length の行数は 3 )
		for (int i = 0; i < array.length; i++) {
			// 内側のループで 列 を処理( array[i].length の要素数は 2 )
			for (int j = 0; j < array[i].length; j++) {
				// 全要素を順番に出力
				System.out.print(array[i][j] + " ");
			}
			// 列の表示が終わったら改行
			System.out.println();
		}
		// 改行
		System.out.println();

		/*
		 * [課題Q8] 2次元配列 int[][] array = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}; を用意する。配列の すべての要素の合計値を表示する。
		 */
		// int型の2次元配列を宣言し、初期化
		int[][] array2 = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		// 合計値を格納する変数
		int total = 0;
		// 外側のループで 行 を処理( array2.length の行数は 3 )
		for (int k = 0; k < array2.length; k++) {
			// 内側のループで 列 を処理( array2[k].length の要素数は 3 )
			for (int l = 0; l < array2[k].length; l++) {
				// total に全要素を順番に加算していく
				total += array2[k][l];
			}
		}
		// total を出力
		System.out.println(total);
		// 改行
		System.out.println();

		/*
		 * [課題Q9] 2次元配列 int[][] array = {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}}; を用意する。配列内の 最大値と最小値 を求めて表示する。
		 */
		// int型の2次元配列を宣言し、初期化
		int[][] array3 = { { 12, 15, 8 }, { 6, 19, 25 }, { 30, 2, 10 } };
		// 最大値と最小値を配列の最初の要素で初期化（ 12 ）
		int maximum = array3[0][0];
		int minimum = array3[0][0];
		// 外側のループで 行 を処理( array3.length の行数は 3 )
		for (int m = 0; m < array3.length; m++) {
			// 内側のループで 列 を処理( array3[m].length の要素数は 3 )
			for (int n = 0; n < array3[m].length; n++) {
				int o = array3[m][n];
				// 最大値を更新
				if (o > maximum) {
					maximum = o;
				}
				// 最小値を更新
				if (o < minimum) {
					minimum = o;
				}
			}
		}
		// 最大値、最大値をそれぞれ出力
		System.out.println("最大値:" + maximum);
		System.out.println("最小値:" + minimum);
		// 改行
		System.out.println();

		/*
		 * [課題Q10] 3次元配列 int[][][] array = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}}; を用意する。配列内のすべての要素を表示する。
		 */
		// int型の3次元配列を宣言し、初期化
		int[][][] array4 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
		// 外側のループで ブロック を処理( array4.length のブロック数は 2 )
		for (int p = 0; p < array4.length; p++) {
			System.out.println("ブロック[" + p + "]");
			// 中央のループで 行 を処理( array4.length の行数は 2 )
			for (int q = 0; q < array4[p].length; q++) {
				System.out.print("行[" + q + "]");
				// 内側のループで 列 を処理( array4.length の要素数は 2 )
				for (int r = 0; r < array4[p][q].length; r++) {
					System.out.print(array4[p][q][r] + " ");
				}
				// 改行
				System.out.println();
			}
		}

	}

}
