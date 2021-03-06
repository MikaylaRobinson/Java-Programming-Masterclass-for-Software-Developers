import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    // This code is recycled in other projects from this section
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        locations.put(0, new Location(0, "computer"));
        locations.put(1, new Location(1, "road"));
        locations.put(2, new Location(2, "hill"));
        locations.put(3, new Location(3, "well house"));
        locations.put(4, new Location(4, "stream"));
        locations.put(5, new Location(5, "forest"));

        locations.get(1).addExit("W", 2);
        locations.get(1).addExit("WEST", 2);
        locations.get(1).addExit("E", 3);
        locations.get(1).addExit("EAST", 3);
        locations.get(1).addExit("S", 4);
        locations.get(1).addExit("SOUTH", 4);
        locations.get(1).addExit("N", 5);
        locations.get(1).addExit("NORTH", 5);

        locations.get(2).addExit("N", 5);
        locations.get(2).addExit("NORTH", 5);

        locations.get(3).addExit("W", 2);
        locations.get(3).addExit("WEST", 2);


        locations.get(4).addExit("N", 5);
        locations.get(4).addExit("NORTH", 5);
        locations.get(4).addExit("W", 2);
        locations.get(4).addExit("WEST", 2);


        locations.get(5).addExit("S", 4);
        locations.get(5).addExit("SOUTH", 4);
        locations.get(5).addExit("W", 2);
        locations.get(5).addExit("WEST", 2);


        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit: exits.keySet()) {
                if (exit.length() == 1) {
                    System.out.print(exit + ", ");
                }
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            String [] splitDirection = direction.split(" ");
            for ( String word : splitDirection) {
                if (exits.containsKey(word)) {
                    direction = word;
                    break;
                }
            }
            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }
    }
}
