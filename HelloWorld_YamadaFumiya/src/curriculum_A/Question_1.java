package curriculum_A;

public class Question_1 {

	public static void main(String[] args) {
		
		/*
		 * [課題Q1] 各型の変数を宣言し、初期値を設定する
		 */
		// byte型の変数 byteNum を宣言
		byte byteNum;
		// short型の変数 shortNum を宣言
		short shortNum;
		// int型の変数 intNum を宣言
		int intNum;
		// lonng型の変数 longNum を宣言
		long longNum;
		// float型の変数 floatNum を宣言
		float floatNum;
		// double型の変数 doubleNUm を宣言
		double doubleNum;
		// char型の変数 letter を宣言
		char letter;
		// String型の変数 letters を宣言
		String letters;
		// boolean型の変数 Boolean を宣言
		boolean isBoolean;
		
		/*
		 * [課題Q2] 1で宣言した各型の変数に指定された値を代入する
		 */
		// 変数 byteNum に 10 を代入
		byteNum = 10;
		// 変数　shortNum に 100 を代入
		shortNum = 100;
		// 変数 intNum に 1000 を代入
		intNum = 1000;
		// 変数 longNum に 10000 を代入
		longNum = 10000;
		// 変数 floatNum に 9.5 を代入
		floatNum = (float) 9.5;
		// 変数 doubleNum に 10.5 を代入
		doubleNum = 10.5;
		// 変数 letter に 'a' を代入
		letter = 'a';
		// 変数 letters に "ハロー" を代入
		letters = "ハロー";
		// 変数 isBoolean に true を代入
		isBoolean = true;
		
		/*
		 * [課題Q3] 値を代入した変数を用いて出力する
		 */
		// 11110 を出力
		System.out.println( byteNum + shortNum + intNum + longNum );
		// 20 を出力
		System.out.println( byteNum + byteNum );
		// aハローtrue を出力
		System.out.println( letter + letters + isBoolean );
		// 数字を全て足して出力
		System.out.println( byteNum + shortNum + intNum + longNum + floatNum + doubleNum );
		// 小数点以外の数字を全てかけて出力
		System.out.println( byteNum * shortNum * intNum * longNum );
		// 10.5 割る 100 をして出力
		System.out.println( doubleNum / shortNum );
		// 10 引く 100 をして出力
		System.out.println( byteNum - shortNum );
		// 改行を出力
		System.out.println();
		
		/*
		 * [課題Q4] name という String型の変数 を宣言し、その変数に "山田太郎" という値を代入する。
		 * 　　　　　そのname変数を使用してコンソールに こんにちは、山田太郎さん！ と表示する。
		 */
		// String型の変数 name に初期値 "山田太郎" を宣言
		String name = "山田太郎";
		// こんにちは、山田太郎さん！ を出力
		System.out.println( "こんにちは" + name + "さん！" );
		// 改行を出力
		System.out.println();
		
		/*
		 * [課題Q5] age という int型の変数 を宣言しその変数に 25 を代入する。
		 * age変数を使用してコンソールに  年齢: 25歳 という表示する。
		 */
		// int型の変数 age に初期値 "25" 宣言
		int age = 25;
		// "年齢:" + age を出力
		System.out.println( "年齢:" + age );
		// 改行を出力
		System.out.println();
		
		/*
		 * [課題Q6] num1 という int型の変数 を宣言し、10 を代入する。
		 * 　　　　　num2 という int型の変数 を宣言し、5 を代入する。
		 * 　　　　　num1 と num2 を足した結果を sum という変数に代入し、コンソールに表示する。
		 */
		// int型の変数 num1 に初期値 10 を宣言
		int num1 = 10;
		// int型の変数 num2 に初期値 5 を宣言
		int num2 = 5;
		// int型の変数 sum に初期値  num1 + num2 を宣言
		int sum = num1 + num2 ;
		// 変数 sum を出力
		System.out.println( sum );
		// 改行を出力
		System.out.println();
		
		/*
		 * [課題Q7] score という int型の変数を宣言し、80 を代入する。
		 * 　　　　　score に 20 を加えて、更新する。
		 *         最終スコア: 100  を score を使用してコンソールに表示する。
		 */
		// int型の変数 score に初期値 80 を宣言
		int score = 80;
		// int型の変数 score の初期値に 20 を加える
		    score += 20;
		// "最終スコア:" + score を出力
		System.out.println( "最終スコア:" + score );
		// 改行を出力
		System.out.println();
		
	}

}
