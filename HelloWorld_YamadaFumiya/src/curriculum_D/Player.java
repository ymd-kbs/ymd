package curriculum_D;

class Player extends Character {
    public Player(String name) {
        // ステータスをランダム設定（HP: 30-80, AT: 5-25, SP: 1-10）
        super(name, 
            new java.util.Random().nextInt(51) + 30, 
            new java.util.Random().nextInt(21) + 5, 
            new java.util.Random().nextInt(10) + 1);
    }
}