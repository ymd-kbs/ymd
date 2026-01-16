package curriculum_C;

import java.util.Scanner;

public class Player {
	private Scanner sc = new Scanner(System.in);

	// 入力を受け付ける
	public int getHand() {
		System.out.print("グー(0), チョキ(1), パー(2) を入力: ");
		return sc.nextInt();
	}

	// 手の名前を文字列で返すメソッド
	public String getHandName(int hand) {
		String[] names = { "グー", "チョキ", "パー" };
		return names[hand];
	}
}
