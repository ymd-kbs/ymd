package curriculum_D;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Daemon extends Character {
	public Daemon(String name, int hp, int at, int sp) {
		super(name, hp, at, sp);
	}

	// ファイルからDaemonを読み込む
	public static Daemon loadDaemon(String filePath) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String name = br.readLine();
			int hp = Integer.parseInt(br.readLine());
			int at = Integer.parseInt(br.readLine());
			int sp = Integer.parseInt(br.readLine());
			return new Daemon(name, hp, at, sp);
		}
	}
}
