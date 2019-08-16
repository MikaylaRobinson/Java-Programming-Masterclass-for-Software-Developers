public class EnhancedPlayer {

    // Encapsulation is when fields/variables are only able to be accessed by methods
    // of their class. These fields set to private can only be accessed through the public
    // methods below.
    private String name;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives left for player
        }
    }

    public int getHealth() {
        return health;
    }
}
