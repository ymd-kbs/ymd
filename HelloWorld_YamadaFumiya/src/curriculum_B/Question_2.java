package curriculum_B;

import java.util.Scanner;

public class Question_2 {

	public static void main(String[] args) {

		/*
		 * [課題Q1] int 型変数 score に 75 を代入する。
		 *     　　 score が 60 以上なら "合格です！" と表示する。
		 */
		// int型の変数 score に 75 を代入
		int score = 75;
		// score が 60 以上か判定し、 true の場合 "合格です！" を出力
		if ( score >= 60 ); { System.out.println( "合格です！" );}
		// 改行を出力
		System.out.println();
		
		/*
		 * [課題Q2] int 型変数 age に 25 を代入する。
		 *        　age が 20 以上 30 以下なら "適正年齢です" と表示する。
		 *   　     それ以外場合 "対象外です" と表示する。
		 */
		// int型の変数 age に 25 を代入
		int age = 25;
		// age が 20 以上 30 以下か判定し、 true の場合 "適正年齢です" を出力
		if ( age >= 20 && age <= 30) { System.out.println( "適正年齢です" ); }
		// false　の場合 "対象外です" と出力
		else { System.out.println( "対象外です" ); }
		// 改行を出力
		System.out.println();
		
		/*
		 * [課題Q3] int 型変数 age に 18 を代入する。
		 *      　　age が 20 以上なら "成人です" と表示する。
		 *      　　age が 13 以上 19 以下なら "ティーンエイジャーです" と表示する。
		 *     　　 age が 12 以下なら "子供です" と表示する。
		 */
		// int型の変数 age に 18 を代入
		int age2 = 18;
		// age が 20 以上か判定し、 true なら "成人です" と出力
		if ( age2 >= 20 ) { System.out.println( "成人です" ); }
		// age が 13 以上 19 以下か判定し、 true なら ™ティーンエイジャーです™ と出力
		else if ( age2 >= 13 && age2 <= 19 ) { System.out.println( "ティーンエイジャーです" ); }
		// age が 12 以下か判定し、 true なら "子供です" と出力
		else if ( age2 <= 12 ) { System.out.println( "子供です" ); }
		// 改行を出力
		System.out.println();
		
		/*
		 * [課題Q4] int 型変数 x, y, z に 30, 15, 50 を代入する。
		 * 　　　　　一番大きい数値を判定して表示する。
		 */
		// int型の変数 x に 30 を代入
		int x = 30;
		// int型の変数 y に 15 を代入
		int y = 15;
		// int型の変数 z に 50 を代入
		int z = 50;
		// 一番大きい数値を格納する変数
		int v;
		// x の数値が y と z 以上なら v = x を出力
		if ( x >= y && x >= z ) { System.out.println( v = x ); }
		// y の数値が x と z 以上なら v = y を出力
		else if ( y >= x && y >= z ) { System.out.println( v = y ); }
		// どちらでもなければ v = z を出力
		else { System.out.println( v = z ); }
		// 改行を出力
		System.out.println();
		
		/*
		 * [課題Q5] int 型変数 num を用意し、コンソール入力でいずれか値を代入する。
		 * 　　　　　num 値が 0 より大きければ "正数です" と表示する。
		 * 　　　　　num 値が 0 なら "0 です" と表示する。
		 *　　　　　 num 値が 0 より小さければ "負数です" と表示する。
		 */
		// scannerオブジェクトを作成
		Scanner number = new Scanner(System.in);
		// コンソール入力を受け付ける
		System.out.println( "int型の数値を入力してください: " );
		// int型の変数 num にコンソールの値を代入
		int num = number.nextInt();
		// num の値が 0 より大きければ "正数です" と出力
		if ( num > 0 ) { System.out.println( "正数です" ); }
		// num の値が 0 なら "0です" と出力
		else if ( num == 0 ) { System.out.println( "0です" ); }
		// どちらでもなければ "負数です" と出力
		else { System.out.println( "負数です" ); }
		// 改行を出力
		System.out.println();
		
		/*
		 * [課題Q6] int 型変数 value を用意し、コンソール入力でいずれか値を代入する。
		 *         value が 偶数 なら "偶数です" と表示する。
		 *         value が 奇数 なら "奇数です" と表示する。
		 */
		// scannerオブジェクトを作成
		Scanner number2 = new Scanner(System.in);
		// コンソール入力を受け付ける
		System.out.println( "int型の数値を入力してください: " );
		// int型の変数 value にコンソールの値を代入
		int value = number2.nextInt();
		// value の値が偶数なら "偶数です" と出力
		if ( value % 2 == 0 ) { System.out.println( "偶数です" ); }
		// value の値が奇数なら "奇数です" と出力
		else { System.out.println( "奇数です" ); }
		// 改行を出力
		System.out.println();
		
		/* 
		 * [課題Q7] int 型変数 score にコンソール入力で 0 から 100 いずれか数値を代入し、
		 * 　　　　　90 以上なら "優"  
		 * 　　　　　70 以上なら "良" 
		 * 　　　　　50 以上なら "可" 
		 * 　　　　　50 未満なら "不可" を表示する。
		 */
		// scannerオブジェクトを作成
		Scanner number3 = new Scanner(System.in);
		// コンソール入力を受け付ける
		System.out.println( "0 から 100 の数値を入力してください:" );
		// int型の変数 score2 にコンソールの値を代入
		int score2 = number3.nextInt();
		// score2 の値が 90 以上なら "優" を出力
		if ( score2 >= 90 ) { System.out.println( "優" ); }
		// score2 の値が 70 以上なら "良" を出力
		else if ( score2 >= 70 ) { System.out.println( "良" ); }
		// score2 の値が 50 以上なら "可" を出力
		else if ( score2 >= 50 ) { System.out.println( "可" ); }
		// score2 の値がそれ以外なら "不可" を出力
		else { System.out.println( "不可" ); }
		// 改行を出力
		System.out.println();
		
		/*
		 * [課題Q8] コンソール入力が null また空文字（""）ときに「入力が無効です」と表示する処理を作成する
		 */
		// scannerオブジェクトを作成
		Scanner scanner = new Scanner(System.in);
		// コンソール入力を受け付ける
		System.out.print( "文字を入力してください:" );
		// String型の変数 deta にコンソールの文字列を代入
		String deta = scanner.nextLine();
		// deta が null か 空文字の場合 "入力が無効です" を出力
		if ( deta == null || deta.isEmpty() ) { System.out.println( "入力が無効です" ); }
		// それ以外は "入力が有効です:" + deta を出力
		else { System.out.println( "入力が有効です:" + deta ); }
		// 改行を出力
		System.out.println();
		
		/*
		 * [課題Q9] int 型変数 day を用意する。（コンソール入力で1～7 いずれか数値を代入する）
		 *         day 値に応じて曜日を表示する。
		 *         1 → "月曜日"
		 *         2 → "火曜日"
		 *         3 → "水曜日"
		 *         4 → "木曜日"
		 *         5 → "金曜日"
		 *         6 → "土曜日"
		 *         7 → "日曜日"
		 *      　 それ以外値なら "無効な入力です" と表示する。
		 */
		// Scanner オブジェクトを作成
		Scanner number4 = new Scanner (System.in);
		// コンソール入力を受け付ける
		System.out.println( "1 ~ 7 の数値を入力してください:");
		// int型の変数 day にコンソールの値を代入
		int day = number4.nextInt();
		// day の値によって曜日を出力する
		switch ( day ) {
		// 1 の場合 "月曜日" を出力
		case 1 : System.out.println( "月曜日" ); 
		break;
		// 2 の場合 "火曜日" を出力
		case 2 : System.out.println( "火曜日" );
		break;
		// 3 の場合 "水曜日" を出力
		case 3 : System.out.println( "水曜日" );
		break;
		// 4 の場合 "木曜日" を出力
		case 4 : System.out.println( "木曜日" );
		break;
		// 5 の場合 "金曜日" を出力
		case 5 : System.out.println( "金曜日" );
		break;
		// 6 の場合 "土曜日" を出力
		case 6 : System.out.println( "土曜日" );
		break;
		// 7 の場合 "日曜日" を出力
		case 7 : System.out.println( "日曜日" );
		break;
		// それ以外の場合 "無効な入力です" を出力
		default : System.out.println( "無効な入力です" );
		}
		// 改行を出力
		System.out.println();
		
		/*
		 * [課題Q10] int 型変数 month を用意する。（コンソール入力で1～12 いずれか数値を代入する）
		 *　　       month 値に応じて季節を表示する。
		 *　　       12, 1, 2 → "冬"
		 *　　       3, 4, 5 → "春"
		 * 　　      6, 7, 8 → "夏"
		 * 　　      9, 10, 11 → "秋"
		 * 　　　    それ以外値なら "無効な月です" と表示する。
		 */
		// Scanner オブジェクトを作成
		Scanner number5 = new Scanner (System.in);
		// コンソール入力を受け付ける
		System.out.println( "1～12 いずれか数値を入力してください:" );
		// int型の変数 month にコンソールの値を代入
		int month = number5.nextInt();
		// month の値によって季節を出力する
		switch ( month ) {
		// 12,1,2 の場合 "冬" を出力
		case 12 :
		case 1 :
		case 2 : System.out.println( "冬" );
		break;
		// 3,4,5 の場合 "春" を出力
		case 3 :
		case 4 :
		case 5 : System.out.println( "春" );
		break;
		// 6,7,8 の場合 "夏" を出力
		case 6 :
		case 7 :
		case 8 : System.out.println( "夏" );
		break;
		// 9,10,11 の場合 "春" を出力
		case 9 :
		case 10 :
		case 11 : System.out.println( "秋" );
		break;
		// それ以外の場合 "無効な月です" を出力
		default : System.out.println( "無効な月です" );
		}
		// 改行を出力
		System.out.println();
		

	}

}
