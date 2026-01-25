package curriculum_C;

import java.util.Scanner;

public class Question_6 {
	public static void main(String[] args) {
		// Scanner を生成
		Scanner sc = new Scanner(System.in);
		// Player に Scanner を渡す
		Player player = new Player(sc);
		CPU cpu = new CPU();
		
		try {
			while (true) {
				int pHand = player.getHand();
				int cHand = cpu.getHand();

				// 手の表示
				System.out.println("あなたの手: " + HandUtil.getHandName(pHand));
				System.out.println("CPUの手: " + HandUtil.getHandName(cHand));

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
		} finally {
			// Scanner を閉じる
			sc.close();
			System.out.println("ゲームを終了しました。");
		}
	}
}
