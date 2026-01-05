package curriculum_B;

public class Main {

	public static void main(String[] args) {
		/*                                                                                                     
		 * [課題Q4] 次の2つのクラスを作成し、Main クラスから Greeting クラスのメソッドを呼び出す ようにしてください。                                    
		           Greeting.java (別のクラス)                                                                       
		           sayHello() メソッドを持ち、"こんにちは！" を表示                                                             
		           Main.java                                                                                   
		           Greeting クラスをインポートして sayHello() を実行                                                         
		 */
		// Greetingクラスのインスタンスを作成
		Greeting greeting = new Greeting();
		// Greetingクラスのメソッドを呼び出す
		greeting.sayHello();
		// 改行
		System.out.println();

		/*
		 * [課題Q5] 次の2つのクラスを作成し、下記がコンソールに出力されるように作成してください。
		           ※thisとsetterとgetterとフィールドを使ってください
		           動物名：ライオン
		           体長：2.1m
		           速度：80km/h
		           Animal .java (別のクラス)
		           動物名、体長、速度の変数を持ち各変数のgetterとsetterを作成
		           Main.java
		           変数の中身を設定し、出力の処理を行う
		 */
		// Animalクラスのインスタンスを作成
		Animal lion = new Animal();
		// setterを使って値をセット
		lion.setName("ライオン");
		lion.setLength(2.1);
		lion.setSpeed(80);
		// getterを使って値を取り出し、コンソールに出力
		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getLength() + "m");
		System.out.println("速度：" + lion.getSpeed() + "km/h");
		//改行
		System.out.println();

	}

}
