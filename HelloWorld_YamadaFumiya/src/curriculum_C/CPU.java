package curriculum_C;

import java.util.Random;

public class CPU {
	private Random rand = new Random();

	// ランダムに0〜2を返すメソッド
	public int getHand() {
		return rand.nextInt(3);
	}

}
