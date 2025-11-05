package curriculum_A;

public class Question_1 {

	public static void main(String[] args) {
		
		/*
		 * [課題Q1] 各型の変数を宣言し、初期値を設定する
		 */
		// byte型の変数 byteNum を宣言
		byte byteNum = 0;
		// short型の変数 shortNum を宣言
		short shortNum = 0;
		// int型の変数 intNum を宣言
		int intNum = 0;
		// lonng型の変数 longNum を宣言
		long longNum = 0L;
		// float型の変数 floatNum を宣言
		float floatNum = 0.0f;
		// double型の変数 doubleNUm を宣言
		double doubleNum = 0.0;
		// char型の変数 letter を宣言
		char letter = '\u0000';
		// String型の変数 letters を宣言
		String letters = null;
		// boolean型の変数 Boolean を宣言
		boolean isBoolean = false;
		
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
		 *      　　age変数を使用してコンソールに  年齢: 25歳 という表示する。
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
		
		/*
		 * [課題Q8] price という double型の変数 を宣言し、99.99 を代入する。
		 *         double型の変数 price を int型 に変換し、整数価格: 99 とコンソールに表示する。
		 */
		// double型の変数 price に初期値 99.99 を宣言
		double price = 99.99;
		// price を double型からint型に変換
		int rePrice = ( int ) price;
		// "整数価格:" + rePrice を出力
		System.out.println( "整数価格:" + rePrice );
		// 改行を出力
		System.out.println();
		
		/*
		 * [課題Q9] String 型の変数 numStr に "123" を代入する。
		 *   　　　 numStr を int 型に変換し、変換後の値: の後ろにnumStr + 10 した結果をコンソールに表示する。
		 */
		// String型の変数 numStr に初期値 "123" を宣言
		String numStr = "123";
		// numStr を String型からint型に変換
		int numStr2 = Integer.parseInt( numStr );
		// "変換後の値" + ( numStr2 + 10 ) を出力
		System.out.println( "変換後の値:" + ( numStr2  + 10 ) );
		// 改行を出力
		System.out.println();
		
		/*
		 * [課題Q10] int 型の変数 num に 50 を代入する。
		 * 　　　　　 num を String 型に変換し、"得点: 50点" の形で表示する。
		 */
		// int型の変数 num に初期値 50 を宣言
		int num = 50;
		// num を int型からString型に変換
		String str = String.valueOf( num );
		// "得点:" + str + "点" を出力
		System.out.println( "得点:" + str + "点" );
		// 改行を出力
		System.out.println();
		
		/*
		 * [課題Q11] 次の条件を満たすプログラムを条件演算子を使用して作成する。
		 * 　　　    int 型の変数 a に 10 を代入する。
		 * 　　　    int 型の変数 b に 20 を代入する。
		 *　　　     a が b より小さいかどうかを boolean 変数 result に代入する。
		 *　　　     result の値を表示する。
		 */
		// int型の変数 a に初期値 10 宣言
		int a = 10;
		// int型の変数 b に初期値 20 を宣言
		int b = 20;
		// result に a が b より小さいかどうかを代入
		boolean result = ( a < b );
		// boolean result = ( a < b ); の結果を出力
		System.out.println( result );
		// 改行を出力
		System.out.println();
		
		/*
		 * [課題Q12] 条件演算子を使う。int 型の変数 x に 15 を代入する。
		 *  　　　  　x が 10 以上なら "OK"、そうでなければ "NG" を表示する。
		 */
		// int型の変数 x に初期値 15 を宣言
		int x = 15;
		// 条件演算子を使用して "OK" または "NG" を決定する。
		String x2 = ( x >= 10 ) ? "OK" : "NG";
		// 結果を出力する。
		System.out.println( x2 );
		// 改行を出力
		System.out.println();
		
		/*
		 * [課題Q13] String text = "私はJavaが好きです。Javaは楽しい！";
		 *          という文章の中にある 「Java」 を 「Python」 に置き換えて表示させてください。
		 */
		// String型の変数 text に "私はJavaが好きです。Javaは楽しい！"
		String text = "私はJavaが好きです。Javaは楽しい！";
		// 
		String text2 = text.replace ( "Java" , "python" );
		// 
		System.out.println( text2 );
		
	}

}
