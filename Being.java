public abstract class Being {

    protected int health;
    protected int[] att = new int[2];
    protected int  def;
    protected int attackValue;

    protected Being(int health, int[] att, int def, int attackValue){
        this.health = health;
        this.att = att;
        this.def = def;
        this.attackValue = attackValue;
    }

    public void attack(Being enemy) {
        int x = 1;
        int m = attackValue - enemy.def + 1;
        for(int i = 1; i <= m; i++) {
            int y = (int) (Math.random() * 7);
            if(y > x){x = y;}
        }
        int y = (int) (Math.random()*(this.att[1]-this.att[0]+1)+this.att[0]);
        y -= enemy.def;
        if(x >= 5 && y <= 0){
            enemy.health--;
        }
        else if(x >= 5){
            enemy.health -= (y + 1);
        }
        if(enemy.health <= 0) {
            System.out.println(enemy.getClass() + " мертв.");
        }
    }
}
