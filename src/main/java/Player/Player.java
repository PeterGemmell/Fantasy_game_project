package Player;

public abstract class Player {

    // instance variables
    private String name;
    private int health;

    // constructor
    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }
}
