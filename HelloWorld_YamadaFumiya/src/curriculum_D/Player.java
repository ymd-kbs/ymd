package curriculum_D;

class Player extends Character {
	private static final java.util.Random RANDOM = new java.util.Random();
    public Player(String name) {
        // ステータスをランダム設定（HP: 30-80, AT: 5-25, SP: 1-10）
        super(name, 
            RANDOM.nextInt(51) + 30, 
            RANDOM.nextInt(21) + 5, 
            RANDOM.nextInt(10) + 1);
    }
}