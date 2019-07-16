import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "computer", tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 2);
        tempExit.put("WEST", 2);
        tempExit.put("E", 3);
        tempExit.put("EAST", 3);
        tempExit.put("S", 4);
        tempExit.put("SOUTH", 4);
        tempExit.put("N", 5);
        tempExit.put("NORTH", 5);
        locations.put(1, new Location(1, "road",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
        tempExit.put("NORTH", 5);
        locations.put(2, new Location(2, "hill",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 2);
        tempExit.put("WEST", 2);
        locations.put(3, new Location(3, "well house",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
        tempExit.put("NORTH", 5);
        tempExit.put("W", 2);
        tempExit.put("WEST", 2);
        locations.put(4, new Location(4, "stream",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 4);
        tempExit.put("SOUTH", 4);
        tempExit.put("W", 2);
        tempExit.put("WEST", 2);
        locations.put(5, new Location(5, "forest",tempExit));


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
