package curriculum_B;

public class Question_3 {

	public static void main(String[] args) {
		
		/*
		 * [課題Q1] for 文を使って 1 から 10 までの数字を 1 つずつ表示する。
		 */
		// int型の変数 a の初期値を 1 と宣言し、 a の値が 10 になるまで a++ を実行する
		for ( int a = 1; a <= 10; a++ ) { System.out.println( a ); }
		// 改行を出力
		System.out.println();
		
		/*
		 * [課題Q2] for 文を使って 2 から 20 までの 偶数 を 1 つずつ表示する
		 */
		// int型の変数 b の初期値を 2 と宣言し、 b の値が 20 になるまで b += 2 を実行する
		for ( int b = 2; b <= 20; b += 2 ) { System.out.println( b ); }
		// 改行を出力
		System.out.println();
		
		/*
		 * [課題Q3] for 文を使って 10 から 1 まで カウントダウンして表示
		 */
		// int型の変数 c の初期値を 10 と宣言し、 c の値が 1 になるまで c-- を実行する
		for ( int c = 10; c >= 1; c-- ) { System.out.println( c ); }
		// 改行を出力
		System.out.println();
		
		/*
		 * [課題Q4] for 文を使って 1 から 100 までの合計 を表示する
		 */
		// int型の変数 z に初期値 0 を宣言
		int z = 0;
		// int型の変数 d の初期値を 1 と宣言し、 d の値が 100 になるまで d++ を実行し、 d の値を z に加算する
		for ( int d = 1; d <= 100; d++ ) { z += d; }
		// z を出力する
		System.out.println( z );
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
		for ( int e = 1; e <= height; e++ ) 
		// int型の変数 f の初期値を 1 と宣言し、 f の値が e と同じ値になるまで f++ を実行し、 "*" を出力する
		{ for ( int f = 1; f <= e; f++ ) { System.out.print( "*" ); }
		// 1ループで改行されるようにする
		System.out.println(); }
		// 改行を出力する
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		

	}

}
