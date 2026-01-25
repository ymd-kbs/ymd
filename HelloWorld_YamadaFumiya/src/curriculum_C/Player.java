package curriculum_C;

import java.util.Scanner;

public class Player {

	private Scanner sc;

	// コンストラクタで Main から Scanner をもらう
	public Player(Scanner sc) {
		this.sc = sc;
	}

	// 入力を受け付ける
	public int getHand() {
		while (true) {
			System.out.print("グー(0), チョキ(1), パー(2) を入力: ");
			if (!sc.hasNextInt()) {
				System.out.println("エラー: 数値を入力してください。");
				sc.next();
				continue;
			}
			int hand = sc.nextInt();
			if (hand >= 0 && hand <= 2) {
				return hand;
			} else {
				System.out.println("エラー: 0, 1, 2 のいずれかを入力してください。");
			}
		}

	}

}
