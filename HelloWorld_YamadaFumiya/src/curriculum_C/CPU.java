package curriculum_C;

import java.util.Random;

public class CPU {
	private Random rand = new Random();

	// ランダムに0〜2を返すメソッド
	public int getHand() {
		return rand.nextInt(3);
	}

	// 手の名前を文字列で返すメソッド
	public String getHandName(int hand) {
		String[] names = { "グー", "チョキ", "パー" };
		return names[hand];
	}
}
