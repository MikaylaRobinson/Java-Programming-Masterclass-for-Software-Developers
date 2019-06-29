public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Mikayla";
//        player.health = 20;
//        player.weapon = "Crossbow";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//
//    }

        EnhancedPlayer player = new EnhancedPlayer("Mikayla", 50, "Crossbow");
        System.out.println("Initial health is " + player.getHealth());
    }
}

