package curriculum_D;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Question_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder log = new StringBuilder();

		try {
			// キャラクター作成
			System.out.print("Playerの名前を入力してください: ");
			Player p = new Player(sc.nextLine());
			Daemon d = Daemon.loadDaemon("daemon_status.txt");
			// ステータスを表示
			p.showStatus();
			d.showStatus();
			// ログに記録
			log.append("ステータス\n");
			log.append(String.format("%s [HP:%d AT:%d SP:%d]\n", p.getName(), p.getHp(), p.getAt(), p.getSp()));
			log.append(String.format("%s [HP:%d AT:%d SP:%d]\n", d.getName(), d.getHp(), d.getAt(), d.getSp()));
			// 先行を決める
			Character first, second;
			if (p.getSp() > d.getSp()) {
				first = p;
				second = d;
			} else if (d.getSp() > p.getSp()) {
				first = d;
				second = p;
			} else {
				// 同速ならランダムに決める
				if (new Random().nextBoolean()) {
					first = p;
					second = d;
				} else {
					first = d;
					second = p;
				}
			}
			// どちらかのHPが0になるまで繰り返す
			int turn = 1;
			while (p.isAlive() && d.isAlive()) {
				log.append("--- Turn ").append(turn).append(" ---\n");
				// 攻撃
				attack(first, second, log);
				if (second.isAlive()) {
					attack(second, first, log);
				}
				turn++;
			}
			// 結果
			String winner = p.isAlive() ? p.getName() : d.getName();
			String result = "\n勝者: " + winner + " !!";
			System.out.println(result);
			log.append(result);
			// ログをファイル出力
			try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("battle_log.txt")))) {
				pw.print(log.toString());
				System.out.println("\nログを battle_log.txt に保存しました。");
			}
			// エラー処理
		} catch (IOException e) {
			System.err.println("エラーが発生しました: " + e.getMessage());
		} finally {
			// Scanner を閉じる
			if (sc != null) {
				sc.close();
			}
		}
	}

	// アタック処理
	private static void attack(Character attacker, Character defender, StringBuilder log) {
		int damage = attacker.getAt();
		defender.receiveDamage(damage);
		String msg = String.format("%sの攻撃！ %sに %d のダメージ！ (残りHP: %d)\n",
				attacker.getName(), defender.getName(), damage, defender.getHp());
		System.out.print(msg);
		log.append(msg);
	}
}
