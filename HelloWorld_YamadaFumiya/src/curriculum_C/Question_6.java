package curriculum_C;

public class Question_6 {
	public static void main(String[] args) {
		Player player = new Player();
		CPU cpu = new CPU();

		while (true) {
			int pHand = player.getHand();
			int cHand = cpu.getHand();

			// 手の表示
			System.out.println("あなたの手: " + player.getHandName(pHand));
			System.out.println("CPUの手: " + cpu.getHandName(cHand));

			// 勝敗判定
			if (pHand == cHand) {
				System.out.println("あいこです。");
			} else if ((pHand == 0 && cHand == 1) || (pHand == 1 && cHand == 2) || (pHand == 2 && cHand == 0)) {
				System.out.println("あなたの勝ち！");
				break;
			} else {
				System.out.println("あなたの負け。");
			}
			System.out.println();
		}
	}
}
