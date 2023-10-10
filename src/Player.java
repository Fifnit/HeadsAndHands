public class Player extends Being {

    private int numHealing = 4;
    private final int maxHealth;

    protected Player(int health, int[] att, int def) {
        super(health, att, def, 20);
        maxHealth = health;
    }

    public void healing() {
        if(this.numHealing > 0) {
            health = health + (maxHealth * 3) / 10;
            if(health > maxHealth) {
                health = maxHealth;
            }
            this.numHealing--;
        }
        else {
            System.out.println("Исцеление недоступно");
        }
    }


}