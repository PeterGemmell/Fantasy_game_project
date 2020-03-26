package Enemy;

public abstract class Enemy {

    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int takeDamage(int damage){
        return this.health -= damage;


    }

}
