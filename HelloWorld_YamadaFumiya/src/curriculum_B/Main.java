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

	}

}
